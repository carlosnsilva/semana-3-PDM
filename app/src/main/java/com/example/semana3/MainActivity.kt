package com.example.semana3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import java.util.*;


class MainActivity : AppCompatActivity() {
    private lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.botao = findViewById(R.id.btCliqueAqui)
        /*
        this.botao.setOnClickListener({
            var aleatorio = Random()
            this.botao.text = aleatorio.nextInt(60).toString()
        })

         */
        this.botao.setOnClickListener({Clique(it)})
    }



    fun Clique(view: View){
        var aleatorio = Random()
        val numeroList: List<String> = mutableListOf<String>()


        for (i in 1..6){
            aleatorio.nextInt(60).toString()

            if(numeroList.isEmpty()){
                numeroList.toMutableList().add(aleatorio.toString())
            }else{
                if (numeroList.toMutableList().contains(aleatorio.toString())){
                    aleatorio.nextInt(60).toString()
                    numeroList.toMutableList().add(aleatorio.toString())
                }
                else{
                    numeroList.toMutableList().add(aleatorio.toString())
                }

            }

        }
        Log.i("Valores ->", numeroList.toString())
    }

}




