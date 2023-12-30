import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import compose.mpp.sample.module1.Module1Text
import compose.mpp.sample.module2.Module2Text

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        Column {
            Module1Text()
            Module2Text()
        }
    }
}
