/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.kpm.idea

import java.io.File
import java.io.Serializable

sealed interface IdeaKpmSourceDirectory : Serializable {
    val file: File
}

@InternalKotlinGradlePluginApi
data class IdeaKpmSourceDirectoryImpl(
    override val file: File,
) : IdeaKpmSourceDirectory {

    @InternalKotlinGradlePluginApi
    companion object {
        private const val serialVersionUID = 0L
    }
}
