package com.example.recycleviewlola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var miRecycleView : RecyclerView
    private val miAdaptador : RecyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MontandoelRecyleView()
    }

    private fun MontandoelRecyleView(){
        miRecycleView = findViewById(R.id.lista) as RecyclerView
        miRecycleView.setHasFixedSize(true)
        miRecycleView.layoutManager = LinearLayoutManager(this)
        miAdaptador.RecyclerAdapter(getBiciletas(), this)
        miRecycleView.adapter = miAdaptador
    }







    }