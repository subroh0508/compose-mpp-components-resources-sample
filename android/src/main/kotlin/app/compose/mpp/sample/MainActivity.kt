package app.compose.mpp.sample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import compose.mpp.sample.module1.Module1Text
// import compose.mpp.sample.module2.Module2Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column {
                Module1Text()
                // Module2Text()
            }
        }
    }
}
