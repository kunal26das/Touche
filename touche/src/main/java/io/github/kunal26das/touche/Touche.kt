package io.github.kunal26das.touche

import android.content.Context
import androidx.essentials.firebase.FirebaseApplication
import io.github.kunal26das.touche.ui.MainViewModel

class Touche : FirebaseApplication() {

    override val sharedPreferences get() = getSharedPreferences(packageName, Context.MODE_PRIVATE)!!

    override fun onCreate() {
        super.onCreate()
        initViewModels()
    }

    private fun initViewModels() {
        single { MainViewModel() }
    }

}