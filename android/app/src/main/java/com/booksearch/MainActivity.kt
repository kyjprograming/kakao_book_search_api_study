package com.booksearch

import android.os.Bundle
import android.os.PersistableBundle
import com.facebook.react.ReactActivity


class MainActivity : ReactActivity() {
    /**
     * Returns the name of the main component registered from JavaScript. This is used to schedule
     * rendering of the component.
     */

    override fun getMainComponentName(): String {
        return "bookSearch"
    }
}