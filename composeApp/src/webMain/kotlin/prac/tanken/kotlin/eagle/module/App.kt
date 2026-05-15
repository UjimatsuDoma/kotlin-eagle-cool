@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle.module

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.JsBoolean
import kotlin.js.JsString
import kotlin.js.Promise

external interface EagleApp : JsAny {
    val version: String
    val build: Int
    val locale: String
    val arch: String
    val platform: String
    val env: JsAny
    val execPath: String
    val pid: Int
    val isWindows: Boolean
    val isMac: Boolean
    val runningUnderARM64Translation: Boolean
    val theme: String
    val userDataPath: String

    fun isDarkColors(): Boolean
    fun getPath(name: String): Promise<JsString>
    fun getFileIcon(path: String): Promise<JsAny>
    fun getFileIcon(path: String, options: JsAny): Promise<JsAny>
    fun createThumbnailFromPath(path: String, maxSize: JsAny): Promise<JsAny>
    fun show(): Promise<JsBoolean>
}
