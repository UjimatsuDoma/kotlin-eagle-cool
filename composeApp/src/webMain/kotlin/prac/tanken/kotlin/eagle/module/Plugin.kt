@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle.module

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny

external interface EaglePlugin : JsAny {
    val manifest: EaglePluginManifest
    val path: String
    val icon: String
    val types: JsAny
    val args: JsAny
}

external interface EaglePluginManifest : JsAny {
    val id: String
    val name: String
    val version: String
    val logo: String
    val platform: String
    val arch: String
    val keywords: JsAny
    val devTools: Boolean
    val main: JsAny
}
