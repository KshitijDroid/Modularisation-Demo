package io.kshitijdroid.featureb.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.kshitijdroid.featureb.FeatureBDependencies
import io.kshitijdroid.featureb.R
import javax.inject.Inject

class FeatureBActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: FeatureBViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_bactivity)

        DaggerFeatureBComponent.factory()
            .create(applicationContext as FeatureBDependencies)
            .inject(this)
    }

    fun navigateToFeatureA(view: View) {
        viewModel.navigateToFeatureA(view.context)
    }

    fun navigateToFeatureB(view: View) {
        viewModel.navigateToFeatureB(view.context)
    }
}