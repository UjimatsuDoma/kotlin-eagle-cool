@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle.module

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny

external interface EagleOs : JsAny {
    fun tmpdir(): String
    fun version(): String
    fun type(): String
    fun release(): String
    fun hostname(): String
    fun homedir(): String
    fun arch(): String
}
