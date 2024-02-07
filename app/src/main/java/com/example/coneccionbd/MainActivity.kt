package com.example.coneccionbd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.coneccionbd.Modem.ManangerDb
import com.example.coneccionbd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btnInsertar.setOnClickListener {
            val code = binding.editTextCodigo.text.toString()
            val ciudad = binding.editTextCiudad.text.toString()
            val codep = binding.editTextCodep.text.toString()

            // Suponiendo que ManangerDb tiene una función insertData definida como se mostró arriba
            val manager = ManangerDb(this)
            manager.inserData(code.toInt(), ciudad, 0, 0, "", "")
        }
    }
}
