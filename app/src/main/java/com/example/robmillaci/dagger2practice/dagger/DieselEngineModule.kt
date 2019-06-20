package com.example.robmillaci.dagger2practice.dagger

import com.example.robmillaci.dagger2practice.car.DieselEngine
import com.example.robmillaci.dagger2practice.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract
class DieselEngineModule {
    @Binds
    abstract
    fun bindEngine(engine: DieselEngine)
            : Engine

}