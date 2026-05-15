@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle.extra

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny

external interface EagleExtraModule : JsAny

external interface EagleExtraModuleWithFfmpeg : JsAny {
    val ffmpeg: EagleFfmpeg
}