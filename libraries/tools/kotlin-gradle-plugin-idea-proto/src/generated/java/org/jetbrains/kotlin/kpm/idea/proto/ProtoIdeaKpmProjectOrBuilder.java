// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

public interface ProtoIdeaKpmProjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmProject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras extras = 1;</code>
   * @return Whether the extras field is set.
   */
  boolean hasExtras();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras extras = 1;</code>
   * @return The extras.
   */
  org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras getExtras();
  /**
   * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras extras = 1;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtrasOrBuilder getExtrasOrBuilder();

  /**
   * <code>optional string gradle_plugin_version = 2;</code>
   * @return Whether the gradlePluginVersion field is set.
   */
  boolean hasGradlePluginVersion();
  /**
   * <code>optional string gradle_plugin_version = 2;</code>
   * @return The gradlePluginVersion.
   */
  java.lang.String getGradlePluginVersion();
  /**
   * <code>optional string gradle_plugin_version = 2;</code>
   * @return The bytes for gradlePluginVersion.
   */
  com.google.protobuf.ByteString
      getGradlePluginVersionBytes();

  /**
   * <code>optional string core_libraries_version = 3;</code>
   * @return Whether the coreLibrariesVersion field is set.
   */
  boolean hasCoreLibrariesVersion();
  /**
   * <code>optional string core_libraries_version = 3;</code>
   * @return The coreLibrariesVersion.
   */
  java.lang.String getCoreLibrariesVersion();
  /**
   * <code>optional string core_libraries_version = 3;</code>
   * @return The bytes for coreLibrariesVersion.
   */
  com.google.protobuf.ByteString
      getCoreLibrariesVersionBytes();

  /**
   * <code>optional string explicit_api_mode_cli_option = 4;</code>
   * @return Whether the explicitApiModeCliOption field is set.
   */
  boolean hasExplicitApiModeCliOption();
  /**
   * <code>optional string explicit_api_mode_cli_option = 4;</code>
   * @return The explicitApiModeCliOption.
   */
  java.lang.String getExplicitApiModeCliOption();
  /**
   * <code>optional string explicit_api_mode_cli_option = 4;</code>
   * @return The bytes for explicitApiModeCliOption.
   */
  com.google.protobuf.ByteString
      getExplicitApiModeCliOptionBytes();

  /**
   * <code>optional string kotlin_native_home = 5;</code>
   * @return Whether the kotlinNativeHome field is set.
   */
  boolean hasKotlinNativeHome();
  /**
   * <code>optional string kotlin_native_home = 5;</code>
   * @return The kotlinNativeHome.
   */
  java.lang.String getKotlinNativeHome();
  /**
   * <code>optional string kotlin_native_home = 5;</code>
   * @return The bytes for kotlinNativeHome.
   */
  com.google.protobuf.ByteString
      getKotlinNativeHomeBytes();

  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmModule modules = 6;</code>
   */
  java.util.List<org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmModule> 
      getModulesList();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmModule modules = 6;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmModule getModules(int index);
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmModule modules = 6;</code>
   */
  int getModulesCount();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmModule modules = 6;</code>
   */
  java.util.List<? extends org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmModuleOrBuilder> 
      getModulesOrBuilderList();
  /**
   * <code>repeated .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmModule modules = 6;</code>
   */
  org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmModuleOrBuilder getModulesOrBuilder(
      int index);
}
