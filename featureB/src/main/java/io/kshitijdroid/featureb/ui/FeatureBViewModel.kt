package io.kshitijdroid.featureb.ui

import android.content.Context
import io.kshitijdroid.featurea.api.FeatureANavigationProvider
import io.kshitijdroid.featureb.api.FeatureBNavigationProvider
import io.kshitijdroid.featureb.api.models.RandomData
import javax.inject.Inject

class FeatureBViewModel @Inject constructor(
    private val featureANavigationProvider: FeatureANavigationProvider,
    private val featureBNavigationProvider: FeatureBNavigationProvider
) {

    fun navigateToFeatureA(context: Context) {
        featureANavigationProvider.navigateToFeatureA(context)
    }

    fun navigateToFeatureB(context: Context) {
        featureBNavigationProvider.navigateToFeatureB(context, RandomData("John Does", 26))
    }

}
