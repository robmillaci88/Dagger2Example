package com.example.robmillaci.dagger2practice.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor(block: Block,cylinders: Cylinders,sparkPlug: SparkPlug) : Engine {
    override fun start() {
        Log.d(TAG,"pertrol engine started")
    }
}