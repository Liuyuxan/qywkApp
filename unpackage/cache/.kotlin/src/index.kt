package uni.UNIB7338A2;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.unicloud.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.appframe.AppConfig;
import io.dcloud.uniapp.vue.createSSRApp;
import io.dcloud.uniapp.extapi.exit as uni_exit;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
var firstBackTime: Number = 0;
open class GenApp : BaseApp {
    constructor(instance: ComponentInternalInstance) : super(instance) {
        onLaunch(fun(_: OnLaunchOptions) {
            console.log("App Launch", " at App.uvue:5");
        }
        , instance);
        onAppShow(fun(_: OnShowOptions) {
            console.log("App Show", " at App.uvue:8");
        }
        , instance);
        onHide(fun() {
            console.log("App Hide", " at App.uvue:11");
        }
        , instance);
        onLastPageBackPress(fun() {
            console.log("App LastPageBackPress", " at App.uvue:15");
            if (firstBackTime == 0) {
                uni_showToast(ShowToastOptions(title = "再按一次退出应用", position = "bottom"));
                firstBackTime = Date.now();
                setTimeout(fun(){
                    firstBackTime = 0;
                }, 2000);
            } else if (Date.now() - firstBackTime < 2000) {
                firstBackTime = Date.now();
                uni_exit(null);
            }
        }
        , instance);
        onExit(fun() {
            console.log("App Exit", " at App.uvue:32");
        }
        , instance);
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0,
                    styles1,
                    styles2
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("iconfont" to padStyleMapOf(utsMapOf("fontFamily" to "iconfont")), "view" to padStyleMapOf(utsMapOf("fontSize" to "28rpx", "lineHeight" to 1.8, "color" to "#0E151D")), "text" to padStyleMapOf(utsMapOf("fontSize" to "28rpx", "lineHeight" to 1.8, "color" to "#0E151D")), "row" to padStyleMapOf(utsMapOf("marginRight" to "-20rpx", "marginLeft" to "-20rpx", "flexWrap" to "wrap", "flexDirection" to "row")), "col-1" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "62.5rpx")), "col-2" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "125rpx")), "col-3" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "187.5rpx")), "col-4" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "250rpx")), "col-5" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "312.5rpx")), "col-6" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "375rpx")), "col-7" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "437.5rpx")), "col-8" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "500rpx")), "col-9" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "562.5rpx")), "col-10" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "625rpx")), "col-11" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "687.5rpx")), "col-12" to padStyleMapOf(utsMapOf("position" to "relative", "paddingRight" to "20rpx", "paddingLeft" to "20rpx", "width" to "750rpx")), "col-offset-12" to padStyleMapOf(utsMapOf("marginLeft" to "750rpx")), "col-offset-11" to padStyleMapOf(utsMapOf("marginLeft" to "687.5rpx")), "col-offset-10" to padStyleMapOf(utsMapOf("marginLeft" to "625rpx")), "col-offset-9" to padStyleMapOf(utsMapOf("marginLeft" to "562.5rpx")), "col-offset-8" to padStyleMapOf(utsMapOf("marginLeft" to "500rpx")), "col-offset-7" to padStyleMapOf(utsMapOf("marginLeft" to "437.5rpx")), "col-offset-6" to padStyleMapOf(utsMapOf("marginLeft" to "375rpx")), "col-offset-5" to padStyleMapOf(utsMapOf("marginLeft" to "312.5rpx")), "col-offset-4" to padStyleMapOf(utsMapOf("marginLeft" to "250rpx")), "col-offset-3" to padStyleMapOf(utsMapOf("marginLeft" to "187.5rpx")), "col-offset-2" to padStyleMapOf(utsMapOf("marginLeft" to "125rpx")), "col-offset-1" to padStyleMapOf(utsMapOf("marginLeft" to "62.5rpx")), "col-offset-0" to padStyleMapOf(utsMapOf("marginLeft" to 0)), "flex" to padStyleMapOf(utsMapOf("!flexDirection" to "row")), "flex-row" to padStyleMapOf(utsMapOf("!flexDirection" to "row")), "flex-column" to padStyleMapOf(utsMapOf("!flexDirection" to "column")), "flex-row-reverse" to padStyleMapOf(utsMapOf("!flexDirection" to "row-reverse")), "flex-column-reverse" to padStyleMapOf(utsMapOf("!flexDirection" to "column-reverse")), "flex-wrap" to padStyleMapOf(utsMapOf("flexWrap" to "wrap")), "flex-nowrap" to padStyleMapOf(utsMapOf("flexWrap" to "nowrap")), "justify-start" to padStyleMapOf(utsMapOf("justifyContent" to "flex-start")), "justify-end" to padStyleMapOf(utsMapOf("justifyContent" to "flex-end")), "justify-between" to padStyleMapOf(utsMapOf("justifyContent" to "space-between")), "justify-center" to padStyleMapOf(utsMapOf("justifyContent" to "center")), "align-center" to padStyleMapOf(utsMapOf("!alignItems" to "center")), "align-stretch" to padStyleMapOf(utsMapOf("alignItems" to "stretch")), "align-start" to padStyleMapOf(utsMapOf("alignItems" to "flex-start")), "align-end" to padStyleMapOf(utsMapOf("alignItems" to "flex-end")), "flex-1" to padStyleMapOf(utsMapOf("!flex" to 1)), "flex-2" to padStyleMapOf(utsMapOf("flex" to 2)), "flex-3" to padStyleMapOf(utsMapOf("flex" to 3)), "flex-4" to padStyleMapOf(utsMapOf("flex" to 4)), "flex-5" to padStyleMapOf(utsMapOf("flex" to 5)), "container" to padStyleMapOf(utsMapOf("paddingRight" to "20rpx", "paddingLeft" to "20rpx")), "m-0" to padStyleMapOf(utsMapOf("margin" to 0)), "m-1" to padStyleMapOf(utsMapOf("margin" to "10rpx")), "m-2" to padStyleMapOf(utsMapOf("margin" to "20rpx")), "m-3" to padStyleMapOf(utsMapOf("margin" to "30rpx")), "m-4" to padStyleMapOf(utsMapOf("margin" to "40rpx")), "m-5" to padStyleMapOf(utsMapOf("margin" to "50rpx")), "mt-0" to padStyleMapOf(utsMapOf("marginTop" to 0)), "mt-1" to padStyleMapOf(utsMapOf("marginTop" to "10rpx")), "mt-2" to padStyleMapOf(utsMapOf("marginTop" to "20rpx")), "mt-3" to padStyleMapOf(utsMapOf("marginTop" to "30rpx")), "mt-4" to padStyleMapOf(utsMapOf("marginTop" to "40rpx")), "mt-5" to padStyleMapOf(utsMapOf("marginTop" to "50rpx")), "mb-0" to padStyleMapOf(utsMapOf("marginBottom" to 0)), "mb-1" to padStyleMapOf(utsMapOf("marginBottom" to "10rpx")), "mb-2" to padStyleMapOf(utsMapOf("marginBottom" to "20rpx")), "mb-3" to padStyleMapOf(utsMapOf("marginBottom" to "30rpx")), "mb-4" to padStyleMapOf(utsMapOf("marginBottom" to "40rpx")), "mb-5" to padStyleMapOf(utsMapOf("marginBottom" to "50rpx")), "ml-0" to padStyleMapOf(utsMapOf("marginLeft" to 0)), "ml-1" to padStyleMapOf(utsMapOf("marginLeft" to "10rpx")), "ml-2" to padStyleMapOf(utsMapOf("marginLeft" to "20rpx")), "ml-3" to padStyleMapOf(utsMapOf("marginLeft" to "30rpx")), "ml-4" to padStyleMapOf(utsMapOf("marginLeft" to "40rpx")), "ml-5" to padStyleMapOf(utsMapOf("marginLeft" to "50rpx")), "mr-0" to padStyleMapOf(utsMapOf("marginRight" to 0)), "mr-1" to padStyleMapOf(utsMapOf("marginRight" to "10rpx")), "mr-2" to padStyleMapOf(utsMapOf("marginRight" to "20rpx")), "mr-3" to padStyleMapOf(utsMapOf("marginRight" to "30rpx")), "mr-4" to padStyleMapOf(utsMapOf("marginRight" to "40rpx")), "mr-5" to padStyleMapOf(utsMapOf("marginRight" to "50rpx")), "my-0" to padStyleMapOf(utsMapOf("marginTop" to 0, "marginBottom" to 0)), "my-1" to padStyleMapOf(utsMapOf("marginTop" to "10rpx", "marginBottom" to "10rpx")), "my-2" to padStyleMapOf(utsMapOf("marginTop" to "20rpx", "marginBottom" to "20rpx")), "my-3" to padStyleMapOf(utsMapOf("marginTop" to "30rpx", "marginBottom" to "30rpx")), "my-4" to padStyleMapOf(utsMapOf("marginTop" to "40rpx", "marginBottom" to "40rpx")), "my-5" to padStyleMapOf(utsMapOf("marginTop" to "50rpx", "marginBottom" to "50rpx")), "mx-0" to padStyleMapOf(utsMapOf("marginLeft" to 0, "marginRight" to 0)), "mx-1" to padStyleMapOf(utsMapOf("marginLeft" to "10rpx", "marginRight" to "10rpx")), "mx-2" to padStyleMapOf(utsMapOf("marginLeft" to "20rpx", "marginRight" to "20rpx")), "mx-3" to padStyleMapOf(utsMapOf("marginLeft" to "30rpx", "marginRight" to "30rpx")), "mx-4" to padStyleMapOf(utsMapOf("marginLeft" to "40rpx", "marginRight" to "40rpx")), "mx-5" to padStyleMapOf(utsMapOf("marginLeft" to "50rpx", "marginRight" to "50rpx")), "p-0" to padStyleMapOf(utsMapOf("padding" to 0)), "p" to padStyleMapOf(utsMapOf("padding" to "5rpx")), "p-1" to padStyleMapOf(utsMapOf("padding" to "10rpx")), "p-2" to padStyleMapOf(utsMapOf("padding" to "20rpx")), "p-3" to padStyleMapOf(utsMapOf("padding" to "30rpx")), "p-4" to padStyleMapOf(utsMapOf("padding" to "40rpx")), "p-5" to padStyleMapOf(utsMapOf("padding" to "50rpx")), "pt-0" to padStyleMapOf(utsMapOf("paddingTop" to 0)));
            }
        val styles1: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("pt" to padStyleMapOf(utsMapOf("paddingTop" to "5rpx")), "pt-1" to padStyleMapOf(utsMapOf("paddingTop" to "10rpx")), "pt-2" to padStyleMapOf(utsMapOf("paddingTop" to "20rpx")), "pt-3" to padStyleMapOf(utsMapOf("paddingTop" to "30rpx")), "pt-4" to padStyleMapOf(utsMapOf("paddingTop" to "40rpx")), "pt-5" to padStyleMapOf(utsMapOf("paddingTop" to "50rpx")), "pb-0" to padStyleMapOf(utsMapOf("paddingBottom" to 0)), "pb-1" to padStyleMapOf(utsMapOf("paddingBottom" to "10rpx")), "pb" to padStyleMapOf(utsMapOf("paddingBottom" to "5rpx")), "pb-2" to padStyleMapOf(utsMapOf("paddingBottom" to "20rpx")), "pb-3" to padStyleMapOf(utsMapOf("paddingBottom" to "30rpx")), "pb-4" to padStyleMapOf(utsMapOf("paddingBottom" to "40rpx")), "pb-5" to padStyleMapOf(utsMapOf("paddingBottom" to "50rpx")), "pl-0" to padStyleMapOf(utsMapOf("paddingLeft" to 0)), "pl" to padStyleMapOf(utsMapOf("paddingLeft" to "5rpx")), "pl-1" to padStyleMapOf(utsMapOf("paddingLeft" to "10rpx")), "pl-2" to padStyleMapOf(utsMapOf("paddingLeft" to "20rpx")), "pl-3" to padStyleMapOf(utsMapOf("paddingLeft" to "30rpx")), "pl-4" to padStyleMapOf(utsMapOf("paddingLeft" to "40rpx")), "pl-5" to padStyleMapOf(utsMapOf("paddingLeft" to "50rpx")), "pr-0" to padStyleMapOf(utsMapOf("paddingRight" to 0)), "pr" to padStyleMapOf(utsMapOf("paddingRight" to "5rpx")), "pr-1" to padStyleMapOf(utsMapOf("paddingRight" to "10rpx")), "pr-2" to padStyleMapOf(utsMapOf("paddingRight" to "20rpx")), "pr-3" to padStyleMapOf(utsMapOf("paddingRight" to "30rpx")), "pr-4" to padStyleMapOf(utsMapOf("paddingRight" to "40rpx")), "pr-5" to padStyleMapOf(utsMapOf("paddingRight" to "50rpx")), "py-0" to padStyleMapOf(utsMapOf("paddingTop" to 0, "paddingBottom" to 0)), "py" to padStyleMapOf(utsMapOf("paddingTop" to "5rpx", "paddingBottom" to "5rpx")), "py-1" to padStyleMapOf(utsMapOf("paddingTop" to "10rpx", "paddingBottom" to "10rpx")), "py-2" to padStyleMapOf(utsMapOf("paddingTop" to "20rpx", "paddingBottom" to "20rpx")), "py-3" to padStyleMapOf(utsMapOf("paddingTop" to "30rpx", "paddingBottom" to "30rpx")), "py-4" to padStyleMapOf(utsMapOf("paddingTop" to "40rpx", "paddingBottom" to "40rpx")), "py-5" to padStyleMapOf(utsMapOf("paddingTop" to "50rpx", "paddingBottom" to "50rpx")), "px-0" to padStyleMapOf(utsMapOf("paddingLeft" to 0, "paddingRight" to 0)), "px-1" to padStyleMapOf(utsMapOf("paddingLeft" to "10rpx", "paddingRight" to "10rpx")), "px" to padStyleMapOf(utsMapOf("paddingLeft" to "5rpx", "paddingRight" to "5rpx")), "px-2" to padStyleMapOf(utsMapOf("paddingLeft" to "20rpx", "paddingRight" to "20rpx")), "px-3" to padStyleMapOf(utsMapOf("paddingLeft" to "30rpx", "paddingRight" to "30rpx")), "px-4" to padStyleMapOf(utsMapOf("paddingLeft" to "40rpx", "paddingRight" to "40rpx")), "px-5" to padStyleMapOf(utsMapOf("paddingLeft" to "50rpx", "paddingRight" to "50rpx")), "font-smaller" to padStyleMapOf(utsMapOf("fontSize" to "15rpx")), "font-small" to padStyleMapOf(utsMapOf("fontSize" to "20rpx")), "font-sm" to padStyleMapOf(utsMapOf("fontSize" to "25rpx")), "font" to padStyleMapOf(utsMapOf("!fontSize" to "30rpx")), "font-md" to padStyleMapOf(utsMapOf("!fontSize" to "35rpx")), "font-lg" to padStyleMapOf(utsMapOf("fontSize" to "40rpx")), "h1" to padStyleMapOf(utsMapOf("fontSize" to "80rpx", "lineHeight" to 1.8)), "h2" to padStyleMapOf(utsMapOf("fontSize" to "60rpx", "lineHeight" to 1.8)), "h3" to padStyleMapOf(utsMapOf("fontSize" to "45rpx", "lineHeight" to 1.8)), "h4" to padStyleMapOf(utsMapOf("fontSize" to "32rpx", "lineHeight" to 1.8)), "h5" to padStyleMapOf(utsMapOf("fontSize" to "30rpx", "lineHeight" to 1.8)), "h6" to padStyleMapOf(utsMapOf("fontSize" to "28rpx", "lineHeight" to 1.8)), "text-left" to padStyleMapOf(utsMapOf("textAlign" to "left")), "text-right" to padStyleMapOf(utsMapOf("textAlign" to "right")), "text-center" to padStyleMapOf(utsMapOf("textAlign" to "center")), "text-ellipsis" to padStyleMapOf(utsMapOf("lines" to 1)), "font-weight-normal" to padStyleMapOf(utsMapOf("fontWeight" to "normal")), "font-weight-bold" to padStyleMapOf(utsMapOf("fontWeight" to "bold")), "font-weight-bolder" to padStyleMapOf(utsMapOf("fontWeight" to "400")), "font-italic" to padStyleMapOf(utsMapOf("fontStyle" to "italic")), "text-white" to padStyleMapOf(utsMapOf("color" to "#ffffff")), "text-primary" to padStyleMapOf(utsMapOf("color" to "#007bff")), "text-hover-primary" to padStyleMapOf(utsMapOf("color" to "#0056b3")), "text-secondary" to padStyleMapOf(utsMapOf("color" to "#6c757d")), "text-hover-secondary" to padStyleMapOf(utsMapOf("color" to "#494f54")), "text-success" to padStyleMapOf(utsMapOf("color" to "#28a745")), "text-hover-success" to padStyleMapOf(utsMapOf("color" to "#19692c")), "text-info" to padStyleMapOf(utsMapOf("color" to "#17a2b8")), "text-hover-info" to padStyleMapOf(utsMapOf("color" to "#0f6674")), "text-warning" to padStyleMapOf(utsMapOf("color" to "#ffc107")), "text-hover-warning" to padStyleMapOf(utsMapOf("color" to "#ba8b00")), "text-danger" to padStyleMapOf(utsMapOf("color" to "#dc3545")), "text-hover-danger" to padStyleMapOf(utsMapOf("color" to "#a71d2a")), "text-light" to padStyleMapOf(utsMapOf("color" to "#f8f9fa")), "text-hover-light" to padStyleMapOf(utsMapOf("color" to "#cbd3da")), "text-dark" to padStyleMapOf(utsMapOf("color" to "#343a40")), "text-hover-dark" to padStyleMapOf(utsMapOf("color" to "#121416")), "text-body" to padStyleMapOf(utsMapOf("color" to "#212529")), "text-muted" to padStyleMapOf(utsMapOf("color" to "#6c757d")), "text-light-muted" to padStyleMapOf(utsMapOf("color" to "#A9A5A0")), "text-light-black" to padStyleMapOf(utsMapOf("color" to "rgba(0,0,0,0.5)")), "text-light-white" to padStyleMapOf(utsMapOf("color" to "rgba(255,255,255,0.5)")), "bg-primary" to padStyleMapOf(utsMapOf("backgroundColor" to "#007bff")), "bg-hover-primary" to padStyleMapOf(utsMapOf("backgroundColor:hover" to "#0062cc")), "bg-secondary" to padStyleMapOf(utsMapOf("backgroundColor" to "#6c757d")), "bg-hover-secondary" to padStyleMapOf(utsMapOf("backgroundColor:hover" to "#545b62")), "bg-success" to padStyleMapOf(utsMapOf("backgroundColor" to "#28a745")), "bg-hover-success" to padStyleMapOf(utsMapOf("backgroundColor" to "#1e7e34")), "bg-info" to padStyleMapOf(utsMapOf("backgroundColor" to "#17a2b8")), "bg-hover-info" to padStyleMapOf(utsMapOf("backgroundColor" to "#117a8b")), "bg-warning" to padStyleMapOf(utsMapOf("backgroundColor" to "#ffc107")), "bg-hover-warning" to padStyleMapOf(utsMapOf("backgroundColor" to "#d39e00")), "bg-danger" to padStyleMapOf(utsMapOf("backgroundColor" to "#dc3545")), "bg-hover-danger" to padStyleMapOf(utsMapOf("backgroundColor" to "#bd2130")), "bg-white" to padStyleMapOf(utsMapOf("backgroundColor" to "#ffffff")), "bg-light" to padStyleMapOf(utsMapOf("backgroundColor" to "#f8f9fa")), "bg-hover-light" to padStyleMapOf(utsMapOf("backgroundColor" to "#dae0e5")), "bg-dark" to padStyleMapOf(utsMapOf("backgroundColor" to "#343a40")), "bg-hover-dark" to padStyleMapOf(utsMapOf("backgroundColor" to "#1d2124")));
            }
        val styles2: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("bg-transparent" to padStyleMapOf(utsMapOf("backgroundColor" to "rgba(0,0,0,0)")), "border" to padStyleMapOf(utsMapOf("borderWidth" to "1rpx", "borderStyle" to "solid", "borderColor" to "#dee2e6")), "border-top" to padStyleMapOf(utsMapOf("borderTopWidth" to "1rpx", "borderTopStyle" to "solid", "borderTopColor" to "#dee2e6")), "border-right" to padStyleMapOf(utsMapOf("borderRightWidth" to "1rpx", "borderRightStyle" to "solid", "borderRightColor" to "#dee2e6")), "border-bottom" to padStyleMapOf(utsMapOf("borderBottomWidth" to "1rpx", "borderBottomStyle" to "solid", "borderBottomColor" to "#dee2e6")), "border-left" to padStyleMapOf(utsMapOf("borderLeftWidth" to "1rpx", "borderLeftStyle" to "solid", "borderLeftColor" to "#dee2e6")), "border-0" to padStyleMapOf(utsMapOf("!borderWidth" to 0)), "border-top-0" to padStyleMapOf(utsMapOf("!borderTopWidth" to 0)), "border-right-0" to padStyleMapOf(utsMapOf("!borderRightWidth" to 0)), "border-bottom-0" to padStyleMapOf(utsMapOf("!borderBottomWidth" to 0)), "border-left-0" to padStyleMapOf(utsMapOf("!borderLeftWidth" to 0)), "border-primary" to padStyleMapOf(utsMapOf("borderColor" to "#007bff")), "border-secondary" to padStyleMapOf(utsMapOf("borderColor" to "#6c757d")), "border-light-secondary" to padStyleMapOf(utsMapOf("borderColor" to "#E9E8E5")), "border-success" to padStyleMapOf(utsMapOf("borderColor" to "#28a745")), "border-info" to padStyleMapOf(utsMapOf("borderColor" to "#17a2b8")), "border-warning" to padStyleMapOf(utsMapOf("borderColor" to "#ffc107")), "border-danger" to padStyleMapOf(utsMapOf("borderColor" to "#dc3545")), "border-light" to padStyleMapOf(utsMapOf("borderColor" to "#f8f9fa")), "border-dark" to padStyleMapOf(utsMapOf("borderColor" to "#343a40")), "border-white" to padStyleMapOf(utsMapOf("borderColor" to "#FFFFFF")), "rounded" to padStyleMapOf(utsMapOf("borderRadius" to "8rpx")), "rounded-lg" to padStyleMapOf(utsMapOf("borderRadius" to "14rpx")), "rounded-top" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to "8rpx", "borderTopRightRadius" to "8rpx")), "rounded-top-lg" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to "14rpx", "borderTopRightRadius" to "14rpx")), "rounded-right" to padStyleMapOf(utsMapOf("borderTopRightRadius" to "8rpx", "borderBottomRightRadius" to "8rpx")), "rounded-bottom" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to "8rpx", "borderBottomLeftRadius" to "8rpx")), "rounded-bottom-lg" to padStyleMapOf(utsMapOf("borderBottomRightRadius" to "14rpx", "borderBottomLeftRadius" to "14rpx")), "rounded-left" to padStyleMapOf(utsMapOf("borderTopLeftRadius" to "8rpx", "borderBottomLeftRadius" to "8rpx")), "rounded-circle" to padStyleMapOf(utsMapOf("borderRadius" to "100rpx")), "rounded-0" to padStyleMapOf(utsMapOf("borderRadius" to 0)), "overflow-hidden" to padStyleMapOf(utsMapOf("overflow" to "hidden")), "position-relative" to padStyleMapOf(utsMapOf("position" to "relative")), "position-absolute" to padStyleMapOf(utsMapOf("position" to "absolute")), "position-fixed" to padStyleMapOf(utsMapOf("position" to "fixed")), "fixed-top" to padStyleMapOf(utsMapOf("position" to "fixed", "top" to 0, "right" to 0, "left" to 0, "zIndex" to 1030)), "fixed-bottom" to padStyleMapOf(utsMapOf("position" to "fixed", "right" to 0, "bottom" to 0, "left" to 0, "zIndex" to 1030)), "top-0" to padStyleMapOf(utsMapOf("top" to 0)), "left-0" to padStyleMapOf(utsMapOf("left" to 0)), "right-0" to padStyleMapOf(utsMapOf("right" to 0)), "bottom-0" to padStyleMapOf(utsMapOf("bottom" to 0)), "mask" to padStyleMapOf(utsMapOf("position" to "fixed", "left" to 0, "right" to 0, "top" to 0, "bottom" to 0, "zIndex" to 100)));
            }
    }
}
val GenAppClass = CreateVueAppComponent(GenApp::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = "", inheritAttrs = true, inject = Map(), props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = Map(), styles = GenApp.styles);
}
, fun(instance): GenApp {
    return GenApp(instance);
}
);
val `default` = "/static/iconfont.ttf";
val GenComponentsUIconUIconClass = CreateVueComponent(GenComponentsUIconUIcon::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = GenComponentsUIconUIcon.name, inheritAttrs = GenComponentsUIconUIcon.inheritAttrs, inject = GenComponentsUIconUIcon.inject, props = GenComponentsUIconUIcon.props, propsNeedCastKeys = GenComponentsUIconUIcon.propsNeedCastKeys, emits = GenComponentsUIconUIcon.emits, components = GenComponentsUIconUIcon.components, styles = GenComponentsUIconUIcon.styles);
}
, fun(instance): GenComponentsUIconUIcon {
    return GenComponentsUIconUIcon(instance);
}
);
val GenPagesIndexIndexClass = CreateVueComponent(GenPagesIndexIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = "", inheritAttrs = GenPagesIndexIndex.inheritAttrs, inject = GenPagesIndexIndex.inject, props = GenPagesIndexIndex.props, propsNeedCastKeys = GenPagesIndexIndex.propsNeedCastKeys, emits = GenPagesIndexIndex.emits, components = GenPagesIndexIndex.components, styles = GenPagesIndexIndex.styles);
}
, fun(instance): GenPagesIndexIndex {
    return GenPagesIndexIndex(instance);
}
);
val GenPagesLoginLoginClass = CreateVueComponent(GenPagesLoginLogin::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = "", inheritAttrs = GenPagesLoginLogin.inheritAttrs, inject = GenPagesLoginLogin.inject, props = GenPagesLoginLogin.props, propsNeedCastKeys = GenPagesLoginLogin.propsNeedCastKeys, emits = GenPagesLoginLogin.emits, components = GenPagesLoginLogin.components, styles = GenPagesLoginLogin.styles);
}
, fun(instance): GenPagesLoginLogin {
    return GenPagesLoginLogin(instance);
}
);
val GenPagesCommunityCommunityClass = CreateVueComponent(GenPagesCommunityCommunity::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = "", inheritAttrs = GenPagesCommunityCommunity.inheritAttrs, inject = GenPagesCommunityCommunity.inject, props = GenPagesCommunityCommunity.props, propsNeedCastKeys = GenPagesCommunityCommunity.propsNeedCastKeys, emits = GenPagesCommunityCommunity.emits, components = GenPagesCommunityCommunity.components, styles = GenPagesCommunityCommunity.styles);
}
, fun(instance): GenPagesCommunityCommunity {
    return GenPagesCommunityCommunity(instance);
}
);
val GenPagesMessageMessageClass = CreateVueComponent(GenPagesMessageMessage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = "", inheritAttrs = GenPagesMessageMessage.inheritAttrs, inject = GenPagesMessageMessage.inject, props = GenPagesMessageMessage.props, propsNeedCastKeys = GenPagesMessageMessage.propsNeedCastKeys, emits = GenPagesMessageMessage.emits, components = GenPagesMessageMessage.components, styles = GenPagesMessageMessage.styles);
}
, fun(instance): GenPagesMessageMessage {
    return GenPagesMessageMessage(instance);
}
);
val GenPagesMyPageMyPageClass = CreateVueComponent(GenPagesMyPageMyPage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(name = "", inheritAttrs = GenPagesMyPageMyPage.inheritAttrs, inject = GenPagesMyPageMyPage.inject, props = GenPagesMyPageMyPage.props, propsNeedCastKeys = GenPagesMyPageMyPage.propsNeedCastKeys, emits = GenPagesMyPageMyPage.emits, components = GenPagesMyPageMyPage.components, styles = GenPagesMyPageMyPage.styles);
}
, fun(instance): GenPagesMyPageMyPage {
    return GenPagesMyPageMyPage(instance);
}
);
fun createApp(): UTSJSONObject {
    val app = createSSRApp(GenAppClass);
    return object : UTSJSONObject() {
        var app = app
    };
}
fun main(app: IApp) {
    definePageRoutes();
    defineAppConfig();
    (createApp()["app"] as VueApp).mount(app);
}
open class UniAppConfig : AppConfig {
    override var name: String = "轻氧问康";
    override var appid: String = "__UNI__B7338A2";
    override var versionName: String = "1.0.0";
    override var versionCode: String = "1";
    override var uniCompileVersion: String = "3.99";
    constructor(){}
}
fun definePageRoutes() {
    __uniRoutes.push(PageRoute(path = "pages/index/index", component = GenPagesIndexIndexClass, meta = PageMeta(isQuit = true), style = utsMapOf("navigationBarTitleText" to "首页")));
    __uniRoutes.push(PageRoute(path = "pages/login/login", component = GenPagesLoginLoginClass, meta = PageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "")));
    __uniRoutes.push(PageRoute(path = "pages/community/community", component = GenPagesCommunityCommunityClass, meta = PageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "", "enablePullDownRefresh" to false)));
    __uniRoutes.push(PageRoute(path = "pages/message/message", component = GenPagesMessageMessageClass, meta = PageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "", "enablePullDownRefresh" to false)));
    __uniRoutes.push(PageRoute(path = "pages/myPage/myPage", component = GenPagesMyPageMyPageClass, meta = PageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "", "enablePullDownRefresh" to false)));
}
val __uniTabBar: Map<String, Any?>? = utsMapOf("color" to "#323232", "selectedColor" to "#69d4c8", "backgroundColor" to "#fff", "borderStyle" to "#fff", "list" to utsArrayOf(
    utsMapOf("pagePath" to "pages/index/index", "text" to "植物"),
    utsMapOf("pagePath" to "pages/community/community", "text" to "小岛"),
    utsMapOf("pagePath" to "pages/message/message", "text" to "消息"),
    utsMapOf("pagePath" to "pages/myPage/myPage", "text" to "我的")
));
val __uniLaunchPage: Map<String, Any?> = utsMapOf("url" to "pages/index/index", "style" to utsMapOf("navigationBarTitleText" to "首页"));
@Suppress("UNCHECKED_CAST")
fun defineAppConfig() {
    __uniConfig.entryPagePath = "/pages/index/index";
    __uniConfig.globalStyle = utsMapOf("navigationBarTextStyle" to "black", "navigationBarTitleText" to "uni-app x", "navigationBarBackgroundColor" to "#F8F8F8", "backgroundColor" to "#F8F8F8");
    __uniConfig.tabBar = __uniTabBar as Map<String, Any>?;
    __uniConfig.conditionUrl = "";
    __uniConfig.uniIdRouter = utsMapOf();
    __uniConfig.ready = true;
}
fun getApp(): GenApp {
    return getBaseApp() as GenApp;
}
