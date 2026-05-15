@file:OptIn(ExperimentalWasmJsInterop::class)

package prac.tanken.kotlin.eagle.module

import kotlin.js.ExperimentalWasmJsInterop
import kotlin.js.JsAny
import kotlin.js.JsBoolean
import kotlin.js.Promise

external interface EagleWindow : JsAny {
    fun show(): Promise<JsAny>
    fun showInactive(): Promise<JsAny>
    fun hide(): Promise<JsAny>
    fun focus(): Promise<JsAny>
    fun minimize(): Promise<JsAny>
    fun isMinimized(): Promise<JsBoolean>
    fun restore(): Promise<JsAny>
    fun maximize(): Promise<JsAny>
    fun unmaximize(): Promise<JsAny>
    fun isMaximized(): Promise<JsBoolean>
    fun setFullScreen(flag: Boolean): Promise<JsAny>
    fun isFullScreen(): Promise<JsBoolean>
    fun setAspectRatio(aspectRatio: Double): Promise<JsAny>
    fun setBackgroundColor(backgroundColor: String): Promise<JsAny>
    fun setSize(width: Int, height: Int): Promise<JsAny>
    fun getSize(): Promise<JsAny>
    fun setBounds(bounds: JsAny): Promise<JsAny>
    fun getBounds(): Promise<JsAny>
    fun setResizable(resizable: Boolean): Promise<JsAny>
    fun isResizable(): Promise<JsBoolean>
    fun setAlwaysOnTop(flag: Boolean): Promise<JsAny>
    fun isAlwaysOnTop(): Promise<JsBoolean>
    fun setPosition(x: Int, y: Int): Promise<JsAny>
    fun getPosition(): Promise<JsAny>
    fun setOpacity(opacity: Double): Promise<JsAny>
    fun getOpacity(): Promise<JsAny>
    fun flashFrame(flag: Boolean): Promise<JsAny>
    fun setIgnoreMouseEvents(ignore: Boolean): Promise<JsAny>
    fun capturePage(): Promise<JsAny>
    fun capturePage(rect: JsAny): Promise<JsAny>
    fun setReferer(url: String)
}
