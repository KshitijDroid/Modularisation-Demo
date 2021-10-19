package io.kshitijdroid.featurea.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.kshitijdroid.featurea.R

class FeatureAActivity : AppCompatActivity() {

    private lateinit var viewModel: FeatureAViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_aactivity)
    }

    fun navigateToFeatureB(view: View) {
        viewModel.navigateToFeatureB(view.context)
    }

}