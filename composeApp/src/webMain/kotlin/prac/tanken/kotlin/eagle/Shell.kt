@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.Promise

external interface EagleShell : JsAny {
    fun beep(): Promise<JsAny>
    fun openExternal(url: String): Promise<JsAny>
    fun openPath(path: String): Promise<JsAny>
    fun showItemInFolder(path: String): Promise<JsAny>
}
