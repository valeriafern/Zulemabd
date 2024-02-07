package com.example.coneccionbd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.coneccionbd.Modem.BdHelper
import com.example.coneccionbd.Modem.ManangerDb

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
////        val bdHelper = BdHelper(this)
////        val db = bdHelper.writableDatabase// abro mi bd en mode escritura
////        Toast.makeText(this, "base de datos creada", Toast.LENGTH_SHORT).show()
////        db.close()//cierro la base de datos
//
//        val manager = ManangerDb(this)
//        manager.inserData()
//    }
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val manager = ManangerDb(this)
            manager.inserData()
        }
    }
