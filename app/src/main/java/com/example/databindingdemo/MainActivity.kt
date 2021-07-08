package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var person1: Person = Person("Ali", "123456", "ali@mail.com", "123 Jalan ABC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData = person1
        binding.btnupdate.setOnClickListener(){
            person1.email = "xxx@gmail.com"
            person1.address = "123 Jalan xyz"

            binding.apply { invalidateAll() }
        }

        /*binding.tvname.text = person1.name
        binding.tvnric.text = person1.ic
        binding.tvemail.text = person1.email
        binding.tvaddress.text = person1.address*/
    }
}