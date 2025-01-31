@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package portfolio.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi

private object CommonMainDrawable0 {
  public val background: DrawableResource by 
      lazy { init_background() }

  public val compose_multiplatform: DrawableResource by 
      lazy { init_compose_multiplatform() }
}

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("background", CommonMainDrawable0.background)
  map.put("compose_multiplatform", CommonMainDrawable0.compose_multiplatform)
}

internal val Res.drawable.background: DrawableResource
  get() = CommonMainDrawable0.background

private fun init_background(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:background",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/portfolio.composeapp.generated.resources/drawable/background.webp", -1, -1),
    )
)

internal val Res.drawable.compose_multiplatform: DrawableResource
  get() = CommonMainDrawable0.compose_multiplatform

private fun init_compose_multiplatform(): DrawableResource =
    org.jetbrains.compose.resources.DrawableResource(
  "drawable:compose_multiplatform",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/portfolio.composeapp.generated.resources/drawable/compose-multiplatform.xml", -1, -1),
    )
)
