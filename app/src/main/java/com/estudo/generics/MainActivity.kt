package com.estudo.generics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.estudo.generics.model.Profile
import com.estudo.generics.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = BaseAdapter { view ->
            ProfileView(view)
        }.apply {
            items = mutableListOf(
                //User("Wemerson", "wemerson@gmail.com"),
                //User("Wemerson F", "wemersonf@gmail.com")
                Profile("Wemerson"),
                Profile("Wemerson F.")
            )
        }
    }
}