package com.example.estudios_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    //estas son mis variables a nivel de componentes
    lateinit var mostrartext :TextView
    lateinit var mostrarTextoDos:TextView
    lateinit var textoIngresado:EditText
    lateinit var miBoton:Button
    lateinit var muchaslineas:TextView
    lateinit var multilineados:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        println("Hola esta es la version 1.1 de mi software de estudio bienvenido esta app solo prueba algunas funciones con botones y text view")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //instaciamos
        mostrartext = findViewById(R.id.Txtv_inicial)

        muchaslineas = findViewById(R.id.ETxTM_Textomultilinea)
        multilineados = findViewById(R.id.ETxTM_TextoMulDos)
        var textoejercuatro: TextView = findViewById(R.id.ETxTM_TextoEjerCuatro)
        var textoejerCinco: TextView = findViewById(R.id.ETxTM_TextoEjerCinco)


        //****************************************ejecución
        //ejercicios resultos 1:
        //conteo éstilo Nasa
        var variableConteoInicio: Int = 10
        var indice: Int= 1
        var lista:MutableList<String> = mutableListOf("ejercicio 1 : Inicio de conteo para el despegue :\n " +
                "conteo de ignicion en T- ")
        do {
            // salida por consola
            println("$variableConteoInicio")//println para consola
            variableConteoInicio -= 1
            lista.add( "$variableConteoInicio \n")
        }while (variableConteoInicio >= 1)
//        lista.removeLast()//remuevo el ultimo elemento -1 el cual es la salida del while
        lista.add("Ignición \n")
        muchaslineas.text= lista.toString()

        //************************ejercicios resultos 2:
        var listaNumeros:MutableList<Int> = mutableListOf()
        var i=0
        while (i<= 9){
            i++
            listaNumeros.add(i)
        }
        i=0
        var listaPares: MutableList<Int> = mutableListOf()
        while (i <= listaNumeros.last()){
            i++
            if(i % 2 == 0) listaPares.add(i)

        }
        mostrartext.text = "ejercicio 2 Num Pares ${listaPares}"

        //*************ejercicio3 platos
        var recorrido=""
        var textomultilinea = StringBuilder()
        var milistadePlatos: Array<String> = arrayOf("ejercicio 3 \n","pizza \n","hamburguesa \n","carne asada " +
            "con cebolla \n","pollo frito relleno \n", "cerdo relleno \n")
        //        varias formas segun lei de recorrer un arreglo
        //for ( i in .. 0 milistadePlatos.size -1 ){ esta es una

        for ( i in milistadePlatos.indices ){
            println(milistadePlatos[i])
            multilineados.append(milistadePlatos[i])
//            textomultilinea.append(milistadePlatos[i])
        }
//        multilineados.text = textomultilinea.toString()

        //*************ejercicio 4
        var conjuntoPizza = arrayOf(
            arrayOf("pizza",30000),
            arrayOf("hamburguesa",20000),
            arrayOf("arroz con pollo",40000),
            arrayOf("carne asada con cebolla",50000),
            arrayOf("pollo frito relleno",60000),
            arrayOf("cerdo relleno",70000),
        )
        textoejercuatro.append("ejercicio 4 \n")
        for (i in conjuntoPizza.indices){
            println("${conjuntoPizza[i][0]} - Precio: ${conjuntoPizza[i][1]}")
            textoejercuatro.append("${conjuntoPizza[i][0]} - Precio: ${conjuntoPizza[i][1]} \n")
        }
        //*************ejercicio 5
        var conjuntoPizzaIngredientes = arrayOf(
            arrayOf("pizza", 30000, arrayOf("peperoni", "salsa")),
            arrayOf("hamburguesa", 20000, arrayOf("pan", "cebolla", "tomate", "carne")),
            arrayOf("arroz con pollo", 40000, arrayOf("arroz", "verduras", "pollo")),
            arrayOf("carne asada con cebolla", 50000, arrayOf("carne", "cebolla")),
            arrayOf("pollo frito relleno", 60000, arrayOf("pollo", "papas fritas")),
            arrayOf("cerdo relleno", 70000, arrayOf("cerdo", "arroz con pollo"))
        )
        textoejerCinco.append("ejercicio 5 \n")
        for (i in conjuntoPizzaIngredientes.indices) {
            val nombrePlato = conjuntoPizzaIngredientes[i][0]
            val precioPlato = conjuntoPizzaIngredientes[i][1]
            val ingredientes = (conjuntoPizzaIngredientes[i][2] as Array<*>).joinToString(", ")

            val texto = "$nombrePlato - Precio: $precioPlato - Ingredientes: $ingredientes"
            println(texto)
            textoejerCinco.append("$texto\n")
        }



    }

}


















