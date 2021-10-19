package io.kshitijdroid.featureb.api

import android.content.Context
import io.kshitijdroid.featureb.api.models.RandomData

interface FeatureBNavigationProvider {

    fun navigateToFeatureB(context: Context, data: RandomData)

}