package io.sellmair.kompass.android.example

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import io.sellmair.kompass.android.example.Dependencies.router
import io.sellmair.kompass.android.example.viewmodel.MainViewModel
import io.sellmair.kompass.android.fragment.KompassFragmentActivity

class MainActivity : AppCompatActivity(), KompassFragmentActivity {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]
        if (savedInstanceState == null) {
            viewModel.checkIfLoggedIn()
        }

        Log.d("Example", "MainActivity.onCreate($savedInstanceState)")
        router.setup(savedInstanceState, R.id.container)
    }


    override fun onBackPressed() {
        router.popRetainRootImmediateOrFinish()
    }

}

