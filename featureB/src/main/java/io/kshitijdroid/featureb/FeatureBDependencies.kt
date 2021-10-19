package io.kshitijdroid.featureb

import io.kshitijdroid.featurea.api.FeatureANavigationProvider
import io.kshitijdroid.featureb.api.FeatureBNavigationProvider

interface FeatureBDependencies {
    fun featureANavigationProvider(): FeatureANavigationProvider

    fun featureBNavigationProvider(): FeatureBNavigationProvider
}