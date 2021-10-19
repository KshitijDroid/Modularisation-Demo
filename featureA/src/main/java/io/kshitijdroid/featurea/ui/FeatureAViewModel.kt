package io.kshitijdroid.featurea.ui

import android.content.Context
import io.kshitijdroid.featureb.api.FeatureBNavigationProvider
import io.kshitijdroid.featureb.api.models.RandomData

class FeatureAViewModel(
    private val featureBNavigationProvider: FeatureBNavigationProvider
) {

    fun navigateToFeatureB(context: Context) {
        featureBNavigationProvider.navigateToFeatureB(context, RandomData("John Does", 26))
    }

}