package io.kshitijdroid.featurea

import dagger.Module
import dagger.Provides
import io.kshitijdroid.featurea.api.FeatureANavigationProvider
import io.kshitijdroid.featurea.api.NavigationProviderImpl

@Module
object FeatureAModule {

    @JvmStatic
    @Provides
    fun providesNavigationProvider(): FeatureANavigationProvider = NavigationProviderImpl()

}