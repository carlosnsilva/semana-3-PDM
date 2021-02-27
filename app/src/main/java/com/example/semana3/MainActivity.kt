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
        var numeroList: MutableList<String> = mutableListOf<String>()


        for (i in 1..6){
           var sup:Int
            sup = aleatorio.nextInt(60)

            if(numeroList.isEmpty()){
                numeroList.add(sup.toString())
            }else{
                if (numeroList.contains(sup.toString())){
                   sup = aleatorio.nextInt(60)
                    numeroList.add(sup.toString())
                }
                else{
                    numeroList.add(sup.toString())
                }

            }

        }
        Log.i("Valores ->", numeroList.toString())

    }

}




