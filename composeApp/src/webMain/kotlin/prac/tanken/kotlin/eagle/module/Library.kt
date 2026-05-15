@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle.module

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.Promise

external interface EagleLibrary : JsAny {
    val name: String
    val path: String
    val modificationTime: Double

    fun info(): Promise<JsAny>
    fun history(): Promise<JsAny>
    fun switch(path: String): Promise<JsAny>
    fun icon(): Promise<JsAny>
}
