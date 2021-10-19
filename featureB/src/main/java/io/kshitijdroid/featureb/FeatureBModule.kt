package io.kshitijdroid.featureb

import io.kshitijdroid.featureb.api.FeatureBNavigationProvider
import io.kshitijdroid.featureb.api.NavigationProviderImpl

object FeatureBModule {

    fun providesNavigationProvider(): FeatureBNavigationProvider = NavigationProviderImpl()

}