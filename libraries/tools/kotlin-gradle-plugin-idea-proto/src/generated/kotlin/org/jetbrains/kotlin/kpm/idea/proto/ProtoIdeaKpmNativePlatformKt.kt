//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: proto_idea_kpm.proto

package org.jetbrains.kotlin.kpm.idea.proto;

@kotlin.jvm.JvmSynthetic
internal inline fun protoIdeaKpmNativePlatform(block: org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatformKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatform =
  org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatformKt.Dsl._create(org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatform.newBuilder()).apply { block() }._build()
internal object ProtoIdeaKpmNativePlatformKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  internal class Dsl private constructor(
    private val _builder: org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatform.Builder
  ) {
    internal companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatform.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatform = _builder.build()

    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras extras = 1;</code>
     */
    internal var extras: org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras
      @JvmName("getExtras")
      get() = _builder.getExtras()
      @JvmName("setExtras")
      set(value) {
        _builder.setExtras(value)
      }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras extras = 1;</code>
     */
    internal fun clearExtras() {
      _builder.clearExtras()
    }
    /**
     * <code>optional .org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmExtras extras = 1;</code>
     * @return Whether the extras field is set.
     */
    internal fun hasExtras(): kotlin.Boolean {
      return _builder.hasExtras()
    }

    /**
     * <code>optional string konan_target = 2;</code>
     */
    internal var konanTarget: kotlin.String
      @JvmName("getKonanTarget")
      get() = _builder.getKonanTarget()
      @JvmName("setKonanTarget")
      set(value) {
        _builder.setKonanTarget(value)
      }
    /**
     * <code>optional string konan_target = 2;</code>
     */
    internal fun clearKonanTarget() {
      _builder.clearKonanTarget()
    }
    /**
     * <code>optional string konan_target = 2;</code>
     * @return Whether the konanTarget field is set.
     */
    internal fun hasKonanTarget(): kotlin.Boolean {
      return _builder.hasKonanTarget()
    }
  }
}
@kotlin.jvm.JvmSynthetic
internal inline fun org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatform.copy(block: org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatformKt.Dsl.() -> kotlin.Unit): org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatform =
  org.jetbrains.kotlin.kpm.idea.proto.ProtoIdeaKpmNativePlatformKt.Dsl._create(this.toBuilder()).apply { block() }._build()
