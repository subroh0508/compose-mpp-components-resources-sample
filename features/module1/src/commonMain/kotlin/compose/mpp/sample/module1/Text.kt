package compose.mpp.sample.module1

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import features.module1.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Module1Text() = Text(stringResource(Res.string.module1_text))
