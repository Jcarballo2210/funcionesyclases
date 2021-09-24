package com.example.funcionesyclases

class Estudiante (val nombre:String,var edad:Int, val lenguajes:Array<programacion>,
                  val amigo:Array<Estudiante>?=null) {

    enum class programacion{
        KOTLIN,
        PHP,
        JAVA,
        JAVASCRIPT,
        PYTHON
    }

    fun codigo(){
        for(lenguaje:programacion in lenguajes){
            println("Conosco este lenguaje de programacion $lenguaje")
        }
    }
}