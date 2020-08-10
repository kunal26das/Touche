package io.github.kunal26das.touche.ui

import androidx.essentials.core.Activity
import io.github.kunal26das.touche.R

class MainActivity : Activity() {

    override val layout = R.layout.activity_main
    override val viewModel by viewModel<MainViewModel>()

}
