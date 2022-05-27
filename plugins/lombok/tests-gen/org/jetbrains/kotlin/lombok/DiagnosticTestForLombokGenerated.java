/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.lombok;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/lombok/testData/diagnostics")
@TestDataPath("$PROJECT_ROOT")
public class DiagnosticTestForLombokGenerated extends AbstractDiagnosticTestForLombok {
    @Test
    @TestMetadata("accessorsStripPrefixCombined.kt")
    public void testAccessorsStripPrefixCombined() throws Exception {
        runTest("plugins/lombok/testData/diagnostics/accessorsStripPrefixCombined.kt");
    }

    @Test
    public void testAllFilesPresentInDiagnostics() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/lombok/testData/diagnostics"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("annotationTypes.kt")
    public void testAnnotationTypes() throws Exception {
        runTest("plugins/lombok/testData/diagnostics/annotationTypes.kt");
    }

    @Test
    @TestMetadata("clashAccessors.kt")
    public void testClashAccessors() throws Exception {
        runTest("plugins/lombok/testData/diagnostics/clashAccessors.kt");
    }

    @Test
    @TestMetadata("getters.kt")
    public void testGetters() throws Exception {
        runTest("plugins/lombok/testData/diagnostics/getters.kt");
    }

    @Test
    @TestMetadata("gettersClassLevel.kt")
    public void testGettersClassLevel() throws Exception {
        runTest("plugins/lombok/testData/diagnostics/gettersClassLevel.kt");
    }

    @Test
    @TestMetadata("setters.kt")
    public void testSetters() throws Exception {
        runTest("plugins/lombok/testData/diagnostics/setters.kt");
    }

    @Test
    @TestMetadata("settersClassLevel.kt")
    public void testSettersClassLevel() throws Exception {
        runTest("plugins/lombok/testData/diagnostics/settersClassLevel.kt");
    }
}
