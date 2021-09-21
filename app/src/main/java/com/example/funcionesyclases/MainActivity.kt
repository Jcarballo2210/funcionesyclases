package com.example.funcionesyclases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //seguridadNula()
       // funciones()
        clases()

    }

    /*
    * Se estare viendo la seguridad contra nulos (null safety)
    * */
    fun seguridadNula(){
        var miString = "Programacion IV (16/09/2021)"
        //miString = null Esto nos dara un error
        println(miString)

        //Variable con seguridad nula (null safety)
        var miSeguridadNula: String? = "Valor de la variable nula"
        println(miSeguridadNula)
        miSeguridadNula = null
        println(miSeguridadNula)

       miSeguridadNula = "Le volvemos a dar un nuevo valor"
        println(miSeguridadNula)
/*
        if(miSeguridadNula != null){
            println(miSeguridadNula)
        }*/

        //llamadas seguras (safe call)
        println(miSeguridadNula?.length)
        miSeguridadNula?.let {
            println(it)
        }?:kotlin.run {
            println(miSeguridadNula)
        }

    }

    /*
    * Aqui estaremos hablando de las funciones
    * */

    fun funciones(){
        decirHola()
        decirHola()
        decirHola()

        decirNombre("Ronald")
        decirNombre("Joshua")
        decirNombre("Yesenia")

        decirNombreEdad("Fatima", 19)

        var resultadoSuma = sumarDosNumeros(6,7)
        println(resultadoSuma)

        println(sumarDosNumeros(9,8))

        println(sumarDosNumeros(3,sumarDosNumeros(7,5)))

    }

    //una funcion simple
    fun decirHola(){
        println("Hola! Alumnos/as de Programacion IV")
    }

    //la funcion que permite la entrada de un parametro
    fun decirNombre(nombre:String){
        println("Hola compañeros/as, mi nombre es $nombre")
    }

    fun decirNombreEdad(nombre:String, edad:Int){
        println("Hola compañeros/as, mi nombre es $nombre y mi edad es $edad")
    }

    //funciones que me retornen un valor
    fun sumarDosNumeros(pNumero:Int,sNumero:Int) :Int{
        val suma = pNumero + sNumero
        return suma
    }

    fun clases(){
        val alumno1 = Estudiante("Miguel",25, arrayOf("Java","PHP"))
        println(alumno1.nombre)
        alumno1.codigo()
    }

}