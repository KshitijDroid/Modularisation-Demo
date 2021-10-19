package io.kshitijdroid.featurea

import io.kshitijdroid.featurea.api.FeatureANavigationProvider
import io.kshitijdroid.featurea.api.NavigationProviderImpl

object FeatureAModule {

    fun providesNavigationProvider(): FeatureANavigationProvider = NavigationProviderImpl()

}