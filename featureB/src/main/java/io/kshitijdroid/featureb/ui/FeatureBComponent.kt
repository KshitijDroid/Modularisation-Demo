package io.kshitijdroid.featureb.ui

import dagger.Component
import io.kshitijdroid.featureb.FeatureBDependencies

@Component(
    dependencies = [
        FeatureBDependencies::class
    ]
)
interface FeatureBComponent {

    @Component.Factory
    interface Factory {
        fun create(
            dependencies: FeatureBDependencies
        ): FeatureBComponent
    }

    fun inject(activity: FeatureBActivity)

}