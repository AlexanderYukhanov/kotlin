/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.blackboxtest;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/klibABI")
@TestDataPath("$PROJECT_ROOT")
public class KlibABITestGenerated extends AbstractNativeKlibABITest {
    @Test
    public void testAllFilesPresentInKlibABI() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klibABI"), Pattern.compile("^([^_](.+))$"), null, false);
    }

    @Test
    @TestMetadata("removeAbstractFunctionFromAbstractClass")
    public void testRemoveAbstractFunctionFromAbstractClass() throws Exception {
        runTest("compiler/testData/klibABI/removeAbstractFunctionFromAbstractClass/");
    }

    @Test
    @TestMetadata("removeAbstractFunctionFromInterface")
    public void testRemoveAbstractFunctionFromInterface() throws Exception {
        runTest("compiler/testData/klibABI/removeAbstractFunctionFromInterface/");
    }

    @Test
    @TestMetadata("removeAbstractPropertyFromAbstractClass")
    public void testRemoveAbstractPropertyFromAbstractClass() throws Exception {
        runTest("compiler/testData/klibABI/removeAbstractPropertyFromAbstractClass/");
    }

    @Test
    @TestMetadata("removeAbstractPropertyFromInterface")
    public void testRemoveAbstractPropertyFromInterface() throws Exception {
        runTest("compiler/testData/klibABI/removeAbstractPropertyFromInterface/");
    }

    @Test
    @TestMetadata("removeClassAsParameterType")
    public void testRemoveClassAsParameterType() throws Exception {
        runTest("compiler/testData/klibABI/removeClassAsParameterType/");
    }

    @Test
    @TestMetadata("removeClassAsReturnType")
    public void testRemoveClassAsReturnType() throws Exception {
        runTest("compiler/testData/klibABI/removeClassAsReturnType/");
    }

    @Test
    @TestMetadata("removeClassAsSuperTypeArgument")
    public void testRemoveClassAsSuperTypeArgument() throws Exception {
        runTest("compiler/testData/klibABI/removeClassAsSuperTypeArgument/");
    }

    @Test
    @TestMetadata("removeClassAsTypeArgument")
    public void testRemoveClassAsTypeArgument() throws Exception {
        runTest("compiler/testData/klibABI/removeClassAsTypeArgument/");
    }

    @Test
    @TestMetadata("removeFunction")
    public void testRemoveFunction() throws Exception {
        runTest("compiler/testData/klibABI/removeFunction/");
    }

    @Test
    @TestMetadata("removeProperty")
    public void testRemoveProperty() throws Exception {
        runTest("compiler/testData/klibABI/removeProperty/");
    }
}
