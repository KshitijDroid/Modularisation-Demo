package io.kshitijdroid.modularisationdemo

import io.kshitijdroid.featurea.FeatureADependencies
import io.kshitijdroid.featureb.FeatureBDependencies

interface DependenciesProvider {
    fun featureADependencies(): FeatureADependencies
    fun featureBDependencies(): FeatureBDependencies
}