package io.kshitijdroid.modularisationdemo

import dagger.Component
import io.kshitijdroid.featurea.FeatureADependencies
import io.kshitijdroid.featurea.FeatureAModule
import io.kshitijdroid.featureb.FeatureBDependencies
import io.kshitijdroid.featureb.FeatureBModule


@Component(
    modules = [
        FeatureAModule::class,
        FeatureBModule::class
    ]
)
interface ApplicationComponent : FeatureADependencies, FeatureBDependencies