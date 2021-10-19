package io.kshitijdroid.featurea.ui

import dagger.Component
import io.kshitijdroid.featurea.FeatureADependencies

@Component(
    dependencies = [
        FeatureADependencies::class
    ]
)
interface FeatureAComponent {

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: FeatureADependencies
        ): FeatureAComponent
    }

    fun inject(activity: FeatureAActivity)

}