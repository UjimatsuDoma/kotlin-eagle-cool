@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle

import js.undefined.undefinedOrNull
import prac.tanken.kotlin.eagle.extra.EagleExtraModule
import prac.tanken.kotlin.eagle.module.EagleApp
import prac.tanken.kotlin.eagle.module.EagleClipboard
import prac.tanken.kotlin.eagle.module.EagleDialog
import prac.tanken.kotlin.eagle.module.EagleDrag
import prac.tanken.kotlin.eagle.module.EagleLibrary
import prac.tanken.kotlin.eagle.module.EagleNotification
import prac.tanken.kotlin.eagle.module.EagleOs
import prac.tanken.kotlin.eagle.module.EaglePlugin
import prac.tanken.kotlin.eagle.module.EaglePreferences
import prac.tanken.kotlin.eagle.module.EagleScreen
import prac.tanken.kotlin.eagle.module.EagleShell
import prac.tanken.kotlin.eagle.module.EagleWindow
import prac.tanken.kotlin.eagle.module.Log
import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.JsName

external interface Eagle : EagleCallbacks {
    val app: EagleApp
    val clipboard: EagleClipboard
    val dialog: EagleDialog
    val drag: EagleDrag
    val library: EagleLibrary
    val notification: EagleNotification
    val os: EagleOs
    val plugin: EaglePlugin
    val preferences: EaglePreferences
    val screen: EagleScreen
    val shell: EagleShell
    val window: EagleWindow

    val extraModule: EagleExtraModule
    val log: Log

    val manifest: JsAny
    val contextMenu: JsAny
    val folder: JsAny
    val item: JsAny
    val smartFolder: JsAny
    val tag: JsAny
    val tagGroup: JsAny
    val toast: JsAny

    val isDev: Boolean
    fun guid(): String
}

@JsName("eagle")
external val eagle: Eagle?

val doesEagleExist = eagle != undefinedOrNull

fun executeWithEagle(block: Eagle.() -> Unit) {
    require(doesEagleExist) {
        "Eagle does not exist."
    }

    eagle?.let { block.invoke(it) } ?: run {
        throw IllegalArgumentException("Eagle does not exist.")
    }
}
