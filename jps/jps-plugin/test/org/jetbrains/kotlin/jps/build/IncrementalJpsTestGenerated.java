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

package org.jetbrains.kotlin.jps.build;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.InnerTestClasses;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({IncrementalJpsTestGenerated.MultiModule.class, IncrementalJpsTestGenerated.PureKotlin.class, IncrementalJpsTestGenerated.WithJava.class})
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalJpsTestGenerated extends AbstractIncrementalJpsTest {
    @TestMetadata("jps-plugin/testData/incremental/multiModule")
    @TestDataPath("$PROJECT_ROOT")
    @InnerTestClasses({})
    @RunWith(JUnit3RunnerWithInners.class)
    public static class MultiModule extends AbstractIncrementalJpsTest {
        public void testAllFilesPresentInMultiModule() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/multiModule"), Pattern.compile("^([^\\.]+)$"), true);
        }

        @TestMetadata("circularDependencyClasses")
        public void testCircularDependencyClasses() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiModule/circularDependencyClasses/");
            doTest(fileName);
        }

        @TestMetadata("circularDependencyTopLevelFunctions")
        public void testCircularDependencyTopLevelFunctions() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiModule/circularDependencyTopLevelFunctions/");
            doTest(fileName);
        }

        @TestMetadata("constantValueChanged")
        public void testConstantValueChanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiModule/constantValueChanged/");
            doTest(fileName);
        }

        @TestMetadata("inlineFunctionChanged")
        public void testInlineFunctionChanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiModule/inlineFunctionChanged/");
            doTest(fileName);
        }

        @TestMetadata("inlineFunctionInlined")
        public void testInlineFunctionInlined() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiModule/inlineFunctionInlined/");
            doTest(fileName);
        }

        @TestMetadata("simpleDependency")
        public void testSimpleDependency() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiModule/simpleDependency/");
            doTest(fileName);
        }

        @TestMetadata("simpleDependencyUnchanged")
        public void testSimpleDependencyUnchanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiModule/simpleDependencyUnchanged/");
            doTest(fileName);
        }

        @TestMetadata("transitiveDependency")
        public void testTransitiveDependency() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiModule/transitiveDependency/");
            doTest(fileName);
        }

        @TestMetadata("transitiveInlining")
        public void testTransitiveInlining() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiModule/transitiveInlining/");
            doTest(fileName);
        }

        @TestMetadata("twoDependants")
        public void testTwoDependants() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/multiModule/twoDependants/");
            doTest(fileName);
        }

    }

    @TestMetadata("jps-plugin/testData/incremental/pureKotlin")
    @TestDataPath("$PROJECT_ROOT")
    @InnerTestClasses({})
    @RunWith(JUnit3RunnerWithInners.class)
    public static class PureKotlin extends AbstractIncrementalJpsTest {
        @TestMetadata("accessingFunctionsViaPackagePart")
        public void testAccessingFunctionsViaPackagePart() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/accessingFunctionsViaPackagePart/");
            doTest(fileName);
        }

        @TestMetadata("accessingPropertiesViaField")
        public void testAccessingPropertiesViaField() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/accessingPropertiesViaField/");
            doTest(fileName);
        }

        @TestMetadata("allConstants")
        public void testAllConstants() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/allConstants/");
            doTest(fileName);
        }

        public void testAllFilesPresentInPureKotlin() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/pureKotlin"), Pattern.compile("^([^\\.]+)$"), true);
        }

        @TestMetadata("annotations")
        public void testAnnotations() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/annotations/");
            doTest(fileName);
        }

        @TestMetadata("classInlineFunctionChanged")
        public void testClassInlineFunctionChanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/classInlineFunctionChanged/");
            doTest(fileName);
        }

        @TestMetadata("classObjectConstantChanged")
        public void testClassObjectConstantChanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/classObjectConstantChanged/");
            doTest(fileName);
        }

        @TestMetadata("classRecreated")
        public void testClassRecreated() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/classRecreated/");
            doTest(fileName);
        }

        @TestMetadata("classRedeclaration")
        public void testClassRedeclaration() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/classRedeclaration/");
            doTest(fileName);
        }

        @TestMetadata("classSignatureChanged")
        public void testClassSignatureChanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/classSignatureChanged/");
            doTest(fileName);
        }

        @TestMetadata("classSignatureUnchanged")
        public void testClassSignatureUnchanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/classSignatureUnchanged/");
            doTest(fileName);
        }

        @TestMetadata("compilationErrorThenFixedOtherPackage")
        public void testCompilationErrorThenFixedOtherPackage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/compilationErrorThenFixedOtherPackage/");
            doTest(fileName);
        }

        @TestMetadata("compilationErrorThenFixedSamePackage")
        public void testCompilationErrorThenFixedSamePackage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/compilationErrorThenFixedSamePackage/");
            doTest(fileName);
        }

        @TestMetadata("compilationErrorThenFixedWithPhantomPart")
        public void testCompilationErrorThenFixedWithPhantomPart() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/compilationErrorThenFixedWithPhantomPart/");
            doTest(fileName);
        }

        @TestMetadata("compilationErrorThenFixedWithPhantomPart2")
        public void testCompilationErrorThenFixedWithPhantomPart2() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/compilationErrorThenFixedWithPhantomPart2/");
            doTest(fileName);
        }

        @TestMetadata("conflictingPlatformDeclarations")
        public void testConflictingPlatformDeclarations() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/conflictingPlatformDeclarations/");
            doTest(fileName);
        }

        @TestMetadata("constantRemoved")
        public void testConstantRemoved() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/constantRemoved/");
            doTest(fileName);
        }

        @TestMetadata("constantsUnchanged")
        public void testConstantsUnchanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/constantsUnchanged/");
            doTest(fileName);
        }

        @TestMetadata("defaultArguments")
        public void testDefaultArguments() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/defaultArguments/");
            doTest(fileName);
        }

        @TestMetadata("dependencyClassReferenced")
        public void testDependencyClassReferenced() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/dependencyClassReferenced/");
            doTest(fileName);
        }

        @TestMetadata("fileWithConstantRemoved")
        public void testFileWithConstantRemoved() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/fileWithConstantRemoved/");
            doTest(fileName);
        }

        @TestMetadata("fileWithInlineFunctionRemoved")
        public void testFileWithInlineFunctionRemoved() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/fileWithInlineFunctionRemoved/");
            doTest(fileName);
        }

        @TestMetadata("filesExchangePackages")
        public void testFilesExchangePackages() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/filesExchangePackages/");
            doTest(fileName);
        }

        @TestMetadata("funRedeclaration")
        public void testFunRedeclaration() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/funRedeclaration/");
            doTest(fileName);
        }

        @TestMetadata("functionBecameInline")
        public void testFunctionBecameInline() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/functionBecameInline/");
            doTest(fileName);
        }

        @TestMetadata("independentClasses")
        public void testIndependentClasses() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/independentClasses/");
            doTest(fileName);
        }

        @TestMetadata("inlineFunctionRemoved")
        public void testInlineFunctionRemoved() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/inlineFunctionRemoved/");
            doTest(fileName);
        }

        @TestMetadata("inlineFunctionsCircularDependency")
        public void testInlineFunctionsCircularDependency() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/inlineFunctionsCircularDependency/");
            doTest(fileName);
        }

        @TestMetadata("inlineFunctionsUnchanged")
        public void testInlineFunctionsUnchanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/inlineFunctionsUnchanged/");
            doTest(fileName);
        }

        @TestMetadata("multiplePackagesModified")
        public void testMultiplePackagesModified() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/multiplePackagesModified/");
            doTest(fileName);
        }

        @TestMetadata("objectConstantChanged")
        public void testObjectConstantChanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/objectConstantChanged/");
            doTest(fileName);
        }

        @TestMetadata("ourClassReferenced")
        public void testOurClassReferenced() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/ourClassReferenced/");
            doTest(fileName);
        }

        @TestMetadata("packageConstantChanged")
        public void testPackageConstantChanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageConstantChanged/");
            doTest(fileName);
        }

        @TestMetadata("packageFileAdded")
        public void testPackageFileAdded() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageFileAdded/");
            doTest(fileName);
        }

        @TestMetadata("packageFileChangedPackage")
        public void testPackageFileChangedPackage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageFileChangedPackage/");
            doTest(fileName);
        }

        @TestMetadata("packageFileChangedThenOtherRemoved")
        public void testPackageFileChangedThenOtherRemoved() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageFileChangedThenOtherRemoved/");
            doTest(fileName);
        }

        @TestMetadata("packageFileRemoved")
        public void testPackageFileRemoved() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageFileRemoved/");
            doTest(fileName);
        }

        @TestMetadata("packageFilesChangedInTurn")
        public void testPackageFilesChangedInTurn() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageFilesChangedInTurn/");
            doTest(fileName);
        }

        @TestMetadata("packageInlineFunctionAccessingField")
        public void testPackageInlineFunctionAccessingField() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageInlineFunctionAccessingField/");
            doTest(fileName);
        }

        @TestMetadata("packageInlineFunctionChanged")
        public void testPackageInlineFunctionChanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageInlineFunctionChanged/");
            doTest(fileName);
        }

        @TestMetadata("packageInlineFunctionFromOurPackage")
        public void testPackageInlineFunctionFromOurPackage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageInlineFunctionFromOurPackage/");
            doTest(fileName);
        }

        @TestMetadata("packageRecreated")
        public void testPackageRecreated() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageRecreated/");
            doTest(fileName);
        }

        @TestMetadata("packageRecreatedAfterRenaming")
        public void testPackageRecreatedAfterRenaming() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageRecreatedAfterRenaming/");
            doTest(fileName);
        }

        @TestMetadata("packageRemoved")
        public void testPackageRemoved() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/packageRemoved/");
            doTest(fileName);
        }

        @TestMetadata("propertyRedeclaration")
        public void testPropertyRedeclaration() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/propertyRedeclaration/");
            doTest(fileName);
        }

        @TestMetadata("returnTypeChanged")
        public void testReturnTypeChanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/returnTypeChanged/");
            doTest(fileName);
        }

        @TestMetadata("simpleClassDependency")
        public void testSimpleClassDependency() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/simpleClassDependency/");
            doTest(fileName);
        }

        @TestMetadata("soleFileChangesPackage")
        public void testSoleFileChangesPackage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/soleFileChangesPackage/");
            doTest(fileName);
        }

        @TestMetadata("subpackage")
        public void testSubpackage() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/subpackage/");
            doTest(fileName);
        }

        @TestMetadata("topLevelFunctionSameSignature")
        public void testTopLevelFunctionSameSignature() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/topLevelFunctionSameSignature/");
            doTest(fileName);
        }

        @TestMetadata("topLevelMembersInTwoFiles")
        public void testTopLevelMembersInTwoFiles() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/topLevelMembersInTwoFiles/");
            doTest(fileName);
        }

        @TestMetadata("traitClassObjectConstantChanged")
        public void testTraitClassObjectConstantChanged() throws Exception {
            String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/pureKotlin/traitClassObjectConstantChanged/");
            doTest(fileName);
        }

    }

    @TestMetadata("jps-plugin/testData/incremental/withJava")
    @TestDataPath("$PROJECT_ROOT")
    @InnerTestClasses({WithJava.ConvertBetweenJavaAndKotlin.class, WithJava.JavaUsedInKotlin.class, WithJava.KotlinUsedInJava.class})
    @RunWith(JUnit3RunnerWithInners.class)
    public static class WithJava extends AbstractIncrementalJpsTest {
        public void testAllFilesPresentInWithJava() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/withJava"), Pattern.compile("^([^\\.]+)$"), true);
        }

        @TestMetadata("jps-plugin/testData/incremental/withJava/convertBetweenJavaAndKotlin")
        @TestDataPath("$PROJECT_ROOT")
        @InnerTestClasses({})
        @RunWith(JUnit3RunnerWithInners.class)
        public static class ConvertBetweenJavaAndKotlin extends AbstractIncrementalJpsTest {
            public void testAllFilesPresentInConvertBetweenJavaAndKotlin() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/withJava/convertBetweenJavaAndKotlin"), Pattern.compile("^([^\\.]+)$"), true);
            }

            @TestMetadata("javaToKotlin")
            public void testJavaToKotlin() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/convertBetweenJavaAndKotlin/javaToKotlin/");
                doTest(fileName);
            }

            @TestMetadata("kotlinToJava")
            public void testKotlinToJava() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/convertBetweenJavaAndKotlin/kotlinToJava/");
                doTest(fileName);
            }

        }

        @TestMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin")
        @TestDataPath("$PROJECT_ROOT")
        @InnerTestClasses({JavaUsedInKotlin.SamConversions.class})
        @RunWith(JUnit3RunnerWithInners.class)
        public static class JavaUsedInKotlin extends AbstractIncrementalJpsTest {
            public void testAllFilesPresentInJavaUsedInKotlin() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/withJava/javaUsedInKotlin"), Pattern.compile("^([^\\.]+)$"), true);
            }

            @TestMetadata("changeNotUsedSignature")
            public void testChangeNotUsedSignature() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/changeNotUsedSignature/");
                doTest(fileName);
            }

            @TestMetadata("changeSignature")
            public void testChangeSignature() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/changeSignature/");
                doTest(fileName);
            }

            @TestMetadata("constantChanged")
            public void testConstantChanged() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/constantChanged/");
                doTest(fileName);
            }

            @TestMetadata("constantUnchanged")
            public void testConstantUnchanged() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/constantUnchanged/");
                doTest(fileName);
            }

            @TestMetadata("javaAndKotlinChangedSimultaneously")
            public void testJavaAndKotlinChangedSimultaneously() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/javaAndKotlinChangedSimultaneously/");
                doTest(fileName);
            }

            @TestMetadata("methodAddedInSuper")
            public void testMethodAddedInSuper() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/methodAddedInSuper/");
                doTest(fileName);
            }

            @TestMetadata("methodRenamed")
            public void testMethodRenamed() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/methodRenamed/");
                doTest(fileName);
            }

            @TestMetadata("notChangeSignature")
            public void testNotChangeSignature() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/notChangeSignature/");
                doTest(fileName);
            }

            @TestMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/samConversions")
            @TestDataPath("$PROJECT_ROOT")
            @InnerTestClasses({})
            @RunWith(JUnit3RunnerWithInners.class)
            public static class SamConversions extends AbstractIncrementalJpsTest {
                public void testAllFilesPresentInSamConversions() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/samConversions"), Pattern.compile("^([^\\.]+)$"), true);
                }

                @TestMetadata("methodAdded")
                public void testMethodAdded() throws Exception {
                    String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/samConversions/methodAdded/");
                    doTest(fileName);
                }

                @TestMetadata("methodSignatureChanged")
                public void testMethodSignatureChanged() throws Exception {
                    String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/javaUsedInKotlin/samConversions/methodSignatureChanged/");
                    doTest(fileName);
                }

            }
        }

        @TestMetadata("jps-plugin/testData/incremental/withJava/kotlinUsedInJava")
        @TestDataPath("$PROJECT_ROOT")
        @InnerTestClasses({})
        @RunWith(JUnit3RunnerWithInners.class)
        public static class KotlinUsedInJava extends AbstractIncrementalJpsTest {
            public void testAllFilesPresentInKotlinUsedInJava() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/withJava/kotlinUsedInJava"), Pattern.compile("^([^\\.]+)$"), true);
            }

            @TestMetadata("changeNotUsedSignature")
            public void testChangeNotUsedSignature() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/kotlinUsedInJava/changeNotUsedSignature/");
                doTest(fileName);
            }

            @TestMetadata("changeSignature")
            public void testChangeSignature() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/kotlinUsedInJava/changeSignature/");
                doTest(fileName);
            }

            @TestMetadata("constantChanged")
            public void testConstantChanged() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/kotlinUsedInJava/constantChanged/");
                doTest(fileName);
            }

            @TestMetadata("constantUnchanged")
            public void testConstantUnchanged() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/kotlinUsedInJava/constantUnchanged/");
                doTest(fileName);
            }

            @TestMetadata("funRenamed")
            public void testFunRenamed() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/kotlinUsedInJava/funRenamed/");
                doTest(fileName);
            }

            @TestMetadata("methodAddedInSuper")
            public void testMethodAddedInSuper() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/kotlinUsedInJava/methodAddedInSuper/");
                doTest(fileName);
            }

            @TestMetadata("notChangeSignature")
            public void testNotChangeSignature() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/kotlinUsedInJava/notChangeSignature/");
                doTest(fileName);
            }

            @TestMetadata("onlyTopLevelFunctionInFileRemoved")
            public void testOnlyTopLevelFunctionInFileRemoved() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/kotlinUsedInJava/onlyTopLevelFunctionInFileRemoved/");
                doTest(fileName);
            }

            @TestMetadata("propertyRenamed")
            public void testPropertyRenamed() throws Exception {
                String fileName = JetTestUtils.navigationMetadata("jps-plugin/testData/incremental/withJava/kotlinUsedInJava/propertyRenamed/");
                doTest(fileName);
            }

        }
    }
}
