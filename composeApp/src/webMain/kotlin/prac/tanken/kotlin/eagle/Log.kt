@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny

external interface Log {
    fun debug(obj: JsAny)
    fun info(obj: JsAny)
    fun warn(obj: JsAny)
    fun error(obj: JsAny)
}