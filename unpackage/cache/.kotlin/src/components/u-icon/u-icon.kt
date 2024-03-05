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
import io.dcloud.uniapp.extapi.loadFontFace as uni_loadFontFace;
open class GenComponentsUIconUIcon : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {
        onMounted(fun() {
            uni_loadFontFace(LoadFontFaceOptions(global = false, source = `default`, family = "iconfont"));
        }
        , instance);
    }
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): VNode? {
        val _ctx = this;
        val _cache = this.`$`.renderCache;
        return createElementVNode("text", utsMapOf("class" to "iconfont", "style" to normalizeStyle(utsMapOf("color" to _ctx.color, "fontSize" to _ctx.size))), toDisplayString(_ctx.code), 5);
    }
    open var code: String by `$props`;
    open var color: String by `$props`;
    open var size: String by `$props`;
    companion object {
        var name = "u-icon";
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("iconfont" to padStyleMapOf(utsMapOf("fontFamily" to "iconfont")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("code" to utsMapOf("type" to "String", "required" to true), "color" to utsMapOf("type" to "String", "default" to "#000"), "size" to utsMapOf("type" to "String", "default" to "50rpx")));
        var propsNeedCastKeys = utsArrayOf(
            "color",
            "size"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
