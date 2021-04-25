package com.example.mad03_fragments_and_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.mad03_fragments_and_navigation.databinding.ActivityMainBinding
import android.util.Log

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        drawerLayout = binding.drawerLayout

        // get tha navController of our NavHostFragment
        navController = this.findNavController(R.id.navhostFragment)
        // setup the action bar/top menu with our navController
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)

        NavigationUI.setupWithNavController(binding.navView, navController)
    }

    override fun onStart() {
        super.onStart()

        Log.i("MainActivity", "I am in onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.i("MainActivity", "I am in onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.i("MainActivity", "I am in onPause")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("MainActivity", "I am in onDestroy")
    }

    override fun onStop() {
        super.onStop()

        Log.i("MainActivity", "I am in onStop")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i("MainActivity", "I am in onRestart")
    }



    // if you start the app, the method onCreate will be called at beginning, then onStart then onResume.
    // If you press backButton the method onDestroy is called
    // If you switch to landscape mode, the method onConfigurationChanged will be called  and from the default methods - onStop - onCreate and then onStart



    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}