@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny

external interface EagleCallbacks {
    fun onPluginCreate(callback: JsAny)
    fun onPluginRun(callback: JsAny)
    fun onPluginBeforeExit(callback: JsAny)
    fun onPluginShow(callback: JsAny)
    fun onPluginHide(callback: JsAny)
    fun onLibraryChanged(callback: JsAny)
    fun onThemeChanged(callback: JsAny)
}
