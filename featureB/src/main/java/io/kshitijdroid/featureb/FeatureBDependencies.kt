package io.kshitijdroid.featureb

import io.kshitijdroid.featurea.api.FeatureANavigationProvider

interface FeatureBDependencies {
    fun featureANavigationProvider(): FeatureANavigationProvider
}