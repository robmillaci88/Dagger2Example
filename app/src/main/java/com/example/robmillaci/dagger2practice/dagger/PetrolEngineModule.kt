package com.example.robmillaci.dagger2practice.dagger

import com.example.robmillaci.dagger2practice.car.Engine
import com.example.robmillaci.dagger2practice.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract
class PetrolEngineModule {
    @Binds
    abstract
    fun bindEngine(engine : PetrolEngine)
            : Engine

}