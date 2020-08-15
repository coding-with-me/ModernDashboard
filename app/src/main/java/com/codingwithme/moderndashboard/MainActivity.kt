package com.codingwithme.moderndashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cv_work.setOnClickListener{
            Toast.makeText(applicationContext,"Work",Toast.LENGTH_SHORT).show()
        }

        cv_education.setOnClickListener{
            Toast.makeText(applicationContext,"Education",Toast.LENGTH_SHORT).show()
        }

        cv_fitness.setOnClickListener{
            Toast.makeText(applicationContext,"Fitness",Toast.LENGTH_SHORT).show()
        }

        cv_gaming.setOnClickListener{
            Toast.makeText(applicationContext,"Gaming",Toast.LENGTH_SHORT).show()
        }

        cv_medical.setOnClickListener{
            Toast.makeText(applicationContext,"Medical",Toast.LENGTH_SHORT).show()
        }

        cv_setting.setOnClickListener{
            Toast.makeText(applicationContext,"Settings",Toast.LENGTH_SHORT).show()
        }

        cv_start_up.setOnClickListener{
            Toast.makeText(applicationContext,"Start Up",Toast.LENGTH_SHORT).show()
        }

        cv_travel.setOnClickListener{
            Toast.makeText(applicationContext,"Travel",Toast.LENGTH_SHORT).show()
        }
    }
}