package io.kshitijdroid.modularisationdemo

import android.app.Application
import io.kshitijdroid.featurea.api.FeatureANavigationProvider
import io.kshitijdroid.featureb.api.FeatureBNavigationProvider

class BaseApplication : Application(), DependenciesProvider {

    private lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.create()
    }

    override fun featureBNavigationProvider(): FeatureBNavigationProvider {
        return applicationComponent.featureBNavigationProvider()
    }

    override fun featureANavigationProvider(): FeatureANavigationProvider {
        return applicationComponent.featureANavigationProvider()
    }

}