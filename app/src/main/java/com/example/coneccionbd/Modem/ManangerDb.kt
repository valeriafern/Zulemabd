package com.example.coneccionbd.Modem

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase


data class ManangerDb(val context: Context) {

    lateinit var bd:SQLiteDatabase

    val  bdHelper = BdHelper(context)//llamado a mi conexion

    //metodo para abrir bd en modo escritura
    fun openBdWr(){

        bd= bdHelper.writableDatabase
    }
    //abre base de datos modo lectura
    fun openBdRd(){

        bd=bdHelper.readableDatabase

    }

//    fun  inserData(code:Int,ciudad:String,codep:Int):Long{
//
//        openBdWr() // abrir bd en modo escritura
//
//        //creo contenedor de valores para insertar data
//        val  contenedor =ContentValues()
//        contenedor.put("cod",code)
//        contenedor.put("nombre",ciudad)
//        contenedor.put("coddep",codep
//        )
//        //llamo metodo insert
//
//        val resul = bd.insert("ciudad",null,contenedor)
//        return  resul
//
//
//
//    }

//        fun  inserData():Long{
//
//            openBdWr() // abrir bd en modo escritura
//
//            //creo contenedor de valores para insertar data
//            val  contenedor =ContentValues()
//            contenedor.put("cod",1)
//            contenedor.put("nombre","cali")
//            contenedor.put("coddep",25)
//            //llamo metodo insert
//
//            val resul = bd.insert("ciudad",null,contenedor)
//            return  resul
//
//
//
//        }

    fun inserData(codd:Int, nombred:String, apellidod: Int, telefonod:Int, direcciond:String, ciudadd:String): Long {
        openBdWr() // abrir bd en modo escritura

        //creo contenedor de valores para insertar data
        val contenedor = ContentValues()
        contenedor.put("codigo", codd)
        contenedor.put("nombre", nombred)
        contenedor.put("apellido", apellidod)
        contenedor.put("telefono", telefonod)
        contenedor.put("direccion", direcciond)
        contenedor.put("ciudad", ciudadd)

        //llamo metodo insert
        val resul = bd.insert("datos", null, contenedor)
        return resul
    }


}