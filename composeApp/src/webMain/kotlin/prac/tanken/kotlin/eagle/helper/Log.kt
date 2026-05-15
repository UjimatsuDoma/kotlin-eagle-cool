@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle.helper

import prac.tanken.kotlin.eagle.executeWithEagle
import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny

fun eagleLogD(obj: JsAny) = executeWithEagle {
    log.debug(obj)
}

fun eagleLogI(obj: JsAny) = executeWithEagle {
    log.info(obj)
}

fun eagleLogW(obj: JsAny) = executeWithEagle {
    log.warn(obj)
}

fun eagleLogE(obj: JsAny) = executeWithEagle {
    log.error(obj)
}