package com.example.funcionesyclases

class Estudiante (val nombre:String,val Edad:Int, val lenguajes:Array<String>) {

    fun codigo(){
        for(lenguaje:String in lenguajes){
            println("Conosco este lenguaje de programacion $lenguaje")
        }
    }
}