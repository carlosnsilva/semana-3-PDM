package com.example.semana3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.random.Random


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
        aleatorio.nextInt(1,61).toString()
        var numeroList: List<String> = mutableListOf()

        for (i in 1..6){

            if(numeroList.isEmpty()){
                numeroList.add(aleatorio)
            }else{
                if (numeroList.contains(aleatorio)){
                    aleatorio.nextInt(1,61).toString()
                    numeroList.add(aleatorio)
                }
                else{
                    numeroList.add(aleatorio)
                }

            }

        }
        Log.i("Valores ->", numeroList.toString())
    }

}