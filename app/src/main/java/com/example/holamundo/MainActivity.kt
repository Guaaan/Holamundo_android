package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variablesYConstantes()
        //tiposDeDatos()
        sentenciaIf()
    }
    private fun variablesYConstantes(){
        var myFirstVariable = "Bienvenidos a mi variable"
        print(myFirstVariable)
    }
    private fun tiposDeDatos() {
    }
    private fun sentenciaIf() {
        val myNumber = 12

        if (myNumber < 10){
            println("$myNumber es menor que 10")
        } else{
            println("$myNumber es mayor que 10")
        }
    }
}