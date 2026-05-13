@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.JsBoolean
import kotlin.js.Promise
import kotlin.js.unsafeCast

val ffmpeg: EagleFfmpeg = eagle?.extraModule?.unsafeCast<dynamic>().ffmpeg.unsafeCast()

external interface EagleFfmpeg : JsAny {
    suspend fun install(): Promise<JsAny>
    suspend fun isInstalled(): Promise<JsBoolean>
    suspend fun getPaths(): Promise<EagleFfmpegPaths>
}

external interface EagleFfmpegPaths : JsAny {
    val ffmpeg: String
    val ffprobe: String
}