import com.kinetik.runtime.compose.ComposeAnimationSpec

internal data class ComposeAnimationCommand(
    val tag: String,
    val spec: ComposeAnimationSpec
)