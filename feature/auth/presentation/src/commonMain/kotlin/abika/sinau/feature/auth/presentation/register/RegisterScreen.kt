package abika.sinau.feature.auth.presentation.register

import abika.sinau.core.design_system.theme.ChirpTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun RegisterRoot(viewModel: RegisterViewModel = viewModel()) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    RegisterScreen(
        state = state,
        onAction = viewModel::onAction
    )
}

@Composable
fun RegisterScreen(
    state: RegisterState,
    onAction: (RegisterAction) -> Unit,
) {

}

@Composable
@Preview
fun RegisterScreenPreview() {
    ChirpTheme {
        RegisterScreen(
            state = RegisterState(),
            onAction = {}
        )
    }
}