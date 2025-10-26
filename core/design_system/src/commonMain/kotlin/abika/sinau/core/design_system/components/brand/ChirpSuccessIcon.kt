package abika.sinau.core.design_system.components.brand

import abika.sinau.core.design_system.theme.extended
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import chirp.core.design_system.generated.resources.Res
import chirp.core.design_system.generated.resources.success_checkmark
import org.jetbrains.compose.resources.vectorResource

@Composable
fun ChirpSuccessIcon(modifier: Modifier = Modifier) {
    Icon(
        imageVector = vectorResource(Res.drawable.success_checkmark),
        contentDescription = null,
        modifier = modifier,
        tint = MaterialTheme.colorScheme.extended.success
    )
}