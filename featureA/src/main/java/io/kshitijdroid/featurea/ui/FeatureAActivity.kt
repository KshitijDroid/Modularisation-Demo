package io.kshitijdroid.featurea.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.kshitijdroid.featurea.FeatureADependencies
import io.kshitijdroid.featurea.R
import javax.inject.Inject

class FeatureAActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: FeatureAViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_aactivity)

        DaggerFeatureAComponent.factory()
            .create(applicationContext as FeatureADependencies)
            .inject(this)
    }

    fun navigateToFeatureB(view: View) {
        viewModel.navigateToFeatureB(view.context)
    }

}