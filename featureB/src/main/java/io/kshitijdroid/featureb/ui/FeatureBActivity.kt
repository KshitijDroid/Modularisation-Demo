package io.kshitijdroid.featureb.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.kshitijdroid.featureb.R

class FeatureBActivity : AppCompatActivity() {

    private lateinit var viewModel: FeatureBViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_bactivity)
    }

    fun navigateToFeatureA(view: View) {
        viewModel.navigateToFeatureA(view.context)
    }

    fun navigateToFeatureB(view: View) {
        viewModel.navigateToFeatureB(view.context)
    }
}