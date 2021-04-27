package com.example.quiz_expert

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.quiz_expert.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navHome -> startActivity(Intent(this, HomeActivity::class.java))
                R.id.navInvitations -> Toast.makeText(
                    applicationContext,
                    "Clicked Invitations", Toast.LENGTH_SHORT
                ).show()
                R.id.navFriends -> Toast.makeText(
                    applicationContext,
                    "Clicked Friends", Toast.LENGTH_SHORT
                ).show()
                R.id.navNotifications -> Toast.makeText(
                    applicationContext,
                    "Clicked Notifications", Toast.LENGTH_SHORT
                ).show()
                R.id.navProfile -> Toast.makeText(
                    applicationContext,
                    "Clicked Profile", Toast.LENGTH_SHORT
                ).show()
                R.id.navLogout -> startActivity(Intent(this, MainActivity::class.java))
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}