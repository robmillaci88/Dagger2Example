package com.example.robmillaci.dagger2practice.car

import android.util.Log
import javax.inject.Inject

const val TAG = "Car"
class Car @Inject constructor (val driver: Driver, val engine : Engine, val wheels : Wheels) {

    fun drive(){
        engine.start()
        Log.d(TAG,"driving...")
    }

    @Inject
    fun enableRemote(remote : Remote){
        remote.setListener(this)
    }
}