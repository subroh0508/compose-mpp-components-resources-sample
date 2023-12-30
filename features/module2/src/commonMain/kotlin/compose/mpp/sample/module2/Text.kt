package compose.mpp.sample.module2

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import features.module2.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Module2Text() = Text(stringResource(Res.string.module2_text))
