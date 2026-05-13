@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle

import js.undefined.undefinedOrNull
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

    val extraModule: JsAny
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
        throw IllegalStateException("Eagle does not exist.")
    }
}
