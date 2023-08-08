package com.shruti.activitydatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.shruti.activitydatabinding.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.name ="Shruti"
        binding.number = "1223"
        binding.mainactivity = this
        binding.show = true


    }
    fun ButtonClick(){
        Toast.makeText(this,"Click", Toast.LENGTH_SHORT).show()
        binding.show = !(binding.show?:false)
    }
}