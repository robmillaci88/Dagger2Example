package com.example.robmillaci.dagger2practice.dagger

import com.example.robmillaci.dagger2practice.car.Rims
import com.example.robmillaci.dagger2practice.car.Tires
import com.example.robmillaci.dagger2practice.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Module companion object {
        @JvmStatic @Provides
        fun provideRims(): Rims { return Rims() }

        @JvmStatic @Provides
        fun provideTires(): Tires {
            return Tires().also { it.inflate() }
        }

        @JvmStatic
        @Provides
        fun provideWheels(rims: Rims, tires: Tires): Wheels {
            return Wheels(rims, tires)
        }
    }
}