package io.kshitijdroid.featureb

import dagger.Module
import dagger.Provides
import io.kshitijdroid.featureb.api.FeatureBNavigationProvider
import io.kshitijdroid.featureb.api.NavigationProviderImpl

@Module
object FeatureBModule {

    @JvmStatic
    @Provides
    fun providesNavigationProvider(): FeatureBNavigationProvider = NavigationProviderImpl()

}