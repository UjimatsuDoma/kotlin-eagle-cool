@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle.module

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.Promise

external interface EagleScreen : JsAny {
    fun getCursorScreenPoint(): Promise<EagleScreenPoint>
    fun getPrimaryDisplay(): Promise<JsAny>
    fun getAllDisplays(): Promise<JsAny>
    fun getDisplayNearestPoint(point: EagleScreenPoint): Promise<JsAny>
}

external interface EagleScreenPoint : JsAny {
    val x: Int
    val y: Int
}
