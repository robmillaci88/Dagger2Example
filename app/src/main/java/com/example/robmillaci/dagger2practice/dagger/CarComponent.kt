package com.example.robmillaci.dagger2practice.dagger

import com.example.robmillaci.dagger2practice.MainActivity
import com.example.robmillaci.dagger2practice.car.Car
import dagger.Component
import javax.inject.Singleton


//A component that provides the dependencies for
// creating a car class (see DAG graph)
@Singleton
@Component(modules = [WheelsModule::class,
    DieselEngineModule::class])
interface CarComponent {
    fun getCar() : Car
    fun inject(mainActivity: MainActivity)
}