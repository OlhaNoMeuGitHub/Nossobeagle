package com.example.beagleapp

import android.app.Application
import com.example.beagleapp.beagle.BeagleSetup

class AppApplication: Application() {
    override fun onCreate() {
        super.onCreate()
       BeagleSetup().init(this)
    }
}