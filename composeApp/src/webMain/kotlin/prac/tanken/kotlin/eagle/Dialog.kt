@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.Promise

external interface EagleDialog : JsAny {
    fun showOpenDialog(options: JsAny): Promise<EagleOpenDialogResult>
    fun showSaveDialog(options: JsAny): Promise<EagleSaveDialogResult>
    fun showMessageBox(options: JsAny): Promise<EagleMessageBoxResult>
    fun showErrorBox(title: String, content: String): Promise<JsAny>
}

external interface EagleOpenDialogResult : JsAny {
    val canceled: Boolean
    val filePaths: JsAny
}

external interface EagleSaveDialogResult : JsAny {
    val canceled: Boolean
    val filePath: String
}

external interface EagleMessageBoxResult : JsAny {
    val response: Int
}
