package io.kshitijdroid.featurea

import io.kshitijdroid.featureb.api.FeatureBNavigationProvider

interface FeatureADependencies {
    fun featureBNavigationProvider(): FeatureBNavigationProvider
}