package io.kshitijdroid.modularisationdemo

import android.app.Application
import io.kshitijdroid.featurea.FeatureADependencies
import io.kshitijdroid.featureb.FeatureBDependencies

class BaseApplication : Application(), DependenciesProvider {

    private lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.create()
    }

    override fun featureADependencies(): FeatureADependencies {
        return applicationComponent
    }

    override fun featureBDependencies(): FeatureBDependencies {
        return applicationComponent
    }

}