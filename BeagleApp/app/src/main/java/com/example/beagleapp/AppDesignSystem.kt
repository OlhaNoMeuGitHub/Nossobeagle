package com.example.beagleapp


import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem


@BeagleComponent
class AppDesignSystem : DesignSystem() {

    fun theme(): Int = R.style.AppThemeServerDriven

    override fun textStyle(id: String): Int? {
        return when (id) {
//            "Title.Text.Orange" -> R.style.Title_Text_Orange
//            "Description.Text.Orange" -> R.style.Description_Text_Orange
            else -> R.style.Design_System_Text_Default
        }
    }
}