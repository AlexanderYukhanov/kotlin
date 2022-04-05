/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.plugin.mpp.pm20

import org.gradle.api.Project
import org.gradle.api.artifacts.component.BuildIdentifier
import org.gradle.api.artifacts.result.ResolvedComponentResult
import org.gradle.api.artifacts.result.ResolvedDependencyResult
import org.gradle.api.internal.project.ProjectInternal
import org.gradle.internal.build.BuildState
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinSingleTargetExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinTarget
import org.jetbrains.kotlin.project.model.KotlinModule
import org.jetbrains.kotlin.project.model.LocalModuleIdentifier

val KotlinProjectExtension.targets: Iterable<KotlinTarget>
    get() = when (this) {
        is KotlinSingleTargetExtension -> listOf(this.target)
        is KotlinMultiplatformExtension -> targets
        else -> error("Unexpected 'kotlin' extension $this")
    }

fun KotlinModule.representsProject(project: Project): Boolean =
    moduleIdentifier.let { it is LocalModuleIdentifier && it.buildId == project.currentBuildId().name && it.projectId == project.path }

// FIXME internal API?
fun Project.currentBuildId(): BuildIdentifier =
    (project as ProjectInternal).services.get(BuildState::class.java).buildIdentifier

val ResolvedDependencyResult.resolvedDependencies: Iterable<ResolvedDependencyResult>
    get() = selected.getDependenciesForVariant(this.resolvedVariant).filterIsInstance<ResolvedDependencyResult>()

// TODO NOW: Sergey told that no usages of ResolvedComponentResult should be left. There's only one usage, in DependencyGraphResolver,
// for graphRoot. Is it OK? Can we construct a counter-example?
val ResolvedComponentResult.resolvedDependencies: Iterable<ResolvedDependencyResult>
    get() = dependencies.filterIsInstance<ResolvedDependencyResult>()
