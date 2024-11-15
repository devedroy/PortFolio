@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package portfolio.composeapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.InternalResourceApi

private object CommonMainDrawable0 {
  public val compose_multiplatform: DrawableResource by 
      lazy { init_compose_multiplatform() }

  public val pass_pic: DrawableResource by 
      lazy { init_pass_pic() }
}

@InternalResourceApi
internal fun _collectCommonMainDrawable0Resources(map: MutableMap<String, DrawableResource>) {
  map.put("compose_multiplatform", CommonMainDrawable0.compose_multiplatform)
  map.put("pass_pic", CommonMainDrawable0.pass_pic)
}

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

internal val Res.drawable.pass_pic: DrawableResource
  get() = CommonMainDrawable0.pass_pic

private fun init_pass_pic(): DrawableResource = org.jetbrains.compose.resources.DrawableResource(
  "drawable:pass_pic",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/portfolio.composeapp.generated.resources/drawable/pass-pic.jpg", -1, -1),
    )
)
