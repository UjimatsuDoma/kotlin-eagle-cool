@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle.module

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.Promise

external interface EaglePreferences : JsAny {
    fun show(): Promise<JsAny>
}
