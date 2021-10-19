package io.kshitijdroid.featurea.api

import android.content.Context
import android.content.Intent
import io.kshitijdroid.featurea.ui.FeatureAActivity

class NavigationProviderImpl : FeatureANavigationProvider {

    override fun navigateToFeatureA(context: Context) {
        context.startActivity(
            Intent(context, FeatureAActivity::class.java)
        )
    }

}