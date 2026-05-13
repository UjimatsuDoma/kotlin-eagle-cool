@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.Promise

external interface EagleDrag : JsAny {
    fun startDrag(filePaths: JsAny): Promise<JsAny>
}
