/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.test;

import com.intellij.codeInsight.CodeInsightTestCase;
import com.intellij.openapi.vfs.newvfs.impl.VfsRootAccess;
import org.jetbrains.kotlin.test.KotlinTestUtils;

import static org.jetbrains.kotlin.test.MuteWithDatabaseKt.isIgnoredInDatabaseWithLog;

/**
 * Please use KotlinLightCodeInsightFixtureTestCase as the base class for all new tests.
 */
@Deprecated
public abstract class KotlinCodeInsightTestCase extends CodeInsightTestCase {
    @Override
    protected void setUp() throws Exception {
        VfsRootAccess.allowRootAccess(TestUtilsKt.getKotlinIdeRoot());
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        VfsRootAccess.disallowRootAccess(TestUtilsKt.getKotlinIdeRoot());
    }

    @Override
    protected boolean shouldRunTest() {
        return super.shouldRunTest() && !isIgnoredInDatabaseWithLog(this);
    }
}
