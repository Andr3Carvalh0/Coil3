package pt.andrecoil

import android.app.Application
import coil3.ImageLoader
import coil3.PlatformContext
import coil3.SingletonImageLoader
import coil3.util.DebugLogger

class Application : Application(), SingletonImageLoader.Factory  {

    override fun newImageLoader(context: PlatformContext): ImageLoader {
        return ImageLoader.Builder(context)
            .logger(DebugLogger())
            .build()
    }
}