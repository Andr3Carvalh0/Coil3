package pt.andrecoil

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil3.request.crossfade
import coil3.load as load3
import coil.load as load2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<ImageView>(R.id.noanimation2)
            .load2(R.drawable.cover) { crossfade(false) }

        findViewById<ImageView>(R.id.crossfade2)
            .load2(R.drawable.cover) { crossfade(true) }

        findViewById<ImageView>(R.id.noanimation3)
            .load3(R.drawable.cover) { crossfade(false) }

        findViewById<ImageView>(R.id.crossfade3)
            .load3(R.drawable.cover) { crossfade(true) }
    }
}