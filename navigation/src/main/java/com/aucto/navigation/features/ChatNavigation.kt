package com.aucto.navigation.features

import android.content.Intent
import com.aucto.navigation.loadIntentOrNull

object ChatNavigation : DynamicFeature<Intent> {

    private const val CHAT_HOME = "com.chat.MainActivity"

    override val dynamicStart: Intent?
        get() = CHAT_HOME.loadIntentOrNull()
}