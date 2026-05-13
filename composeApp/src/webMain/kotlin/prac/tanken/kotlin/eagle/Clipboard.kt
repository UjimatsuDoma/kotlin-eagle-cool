@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny

external interface EagleClipboard : JsAny {
    fun clear()
    fun has(format: String): Boolean
    fun writeText(text: String)
    fun readText(): String
    fun writeBuffer(format: String, buffer: JsAny)
    fun readBuffer(format: String): JsAny
    fun writeImage(image: JsAny)
    fun readImage(): JsAny
    fun writeHTML(markup: String)
    fun readHTML(): String
    fun copyFiles(paths: JsAny)
}
