package com.tepuntal.myintentapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDiaPhone: Button = findViewById(R.id.btn_dial_number)
        btnDiaPhone.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity-> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_data-> {
                val moveWithDataActivity = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataActivity.putExtra(MoveWithDataActivity.EXTRA_NAME, "Aditya Rahman")
                moveWithDataActivity.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                startActivity(moveWithDataActivity)
            }

            R.id.btn_dial_number-> {
                val phoneNumber = "081251722552"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}
