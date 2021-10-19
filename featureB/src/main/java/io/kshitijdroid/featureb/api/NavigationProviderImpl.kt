package io.kshitijdroid.featureb.api

import android.content.Context
import android.content.Intent
import io.kshitijdroid.featureb.api.models.RandomData
import io.kshitijdroid.featureb.ui.FeatureBActivity

class NavigationProviderImpl : FeatureBNavigationProvider {

    override fun navigateToFeatureB(context: Context, data: RandomData) {
        context.startActivity(
            Intent(context, FeatureBActivity::class.java)
        )
    }

}