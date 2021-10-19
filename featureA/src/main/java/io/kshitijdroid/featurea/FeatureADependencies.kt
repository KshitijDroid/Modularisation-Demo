package io.kshitijdroid.featurea

import io.kshitijdroid.featurea.api.FeatureANavigationProvider

interface FeatureADependencies {
    fun featureBNavigationProvider(): FeatureANavigationProvider
}