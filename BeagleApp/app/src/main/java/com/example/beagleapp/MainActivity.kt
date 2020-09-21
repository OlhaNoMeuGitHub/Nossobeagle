package com.example.beagleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.beagle.android.utils.newServerDrivenIntent
import br.com.zup.beagle.android.view.ScreenRequest
import com.example.beagleapp.beagle.AppBeagleActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val intent = this.newServerDrivenIntent<AppBeagleActivity>(ScreenRequest("/screen"))
        startActivity(intent)
        finish()

    }
}