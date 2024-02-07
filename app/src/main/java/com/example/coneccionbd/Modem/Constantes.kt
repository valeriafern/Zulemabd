package com.example.coneccionbd.Modem

class Constantes {


    //sirve para que mis variables constantes sean globales
    companion object{

        const val NOM_BD ="BdAdso"
        const val VERSION_BD= 2

        const val TABLA = "Create table ciudad(cod int, nombre text ,coddep int )"

        const val TABLA2 ="Create table datos(cod int, nombre text, apellido text, telefono int,  direccion text," +
                "ciudad text)"
    }
}