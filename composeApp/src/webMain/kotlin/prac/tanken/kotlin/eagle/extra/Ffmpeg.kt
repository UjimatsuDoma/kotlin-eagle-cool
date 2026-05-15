@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle.extra

import prac.tanken.kotlin.eagle.eagle
import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.JsBoolean
import kotlin.js.Promise
import kotlin.js.unsafeCast

val ffmpeg = eagle?.extraModule?.let {
    return@let if (it is EagleExtraModuleWithFfmpeg) {
        it.ffmpeg
    } else null
}


external interface EagleFfmpeg : JsAny {
    fun install(): Promise<JsAny>
    fun isInstalled(): Promise<JsBoolean>
    fun getPaths(): Promise<EagleFfmpegPaths>
}

external interface EagleFfmpegPaths : JsAny {
    val ffmpeg: String
    val ffprobe: String
}