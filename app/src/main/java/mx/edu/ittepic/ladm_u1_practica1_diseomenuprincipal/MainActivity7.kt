package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain7Binding
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity7 : AppCompatActivity() {
    lateinit var binding: ActivityMain7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain7Binding.inflate((layoutInflater))

        setContentView(binding.root)

        binding.regresar.setOnClickListener {
            finish()
        }

        binding.abrir.setOnClickListener {
            abrirContenidoArchivo()
        }
    }

    fun abrirContenidoArchivo(){
        try {
            var archivos=BufferedReader(InputStreamReader(openFileInput("datos.txt")))
            binding.resultado.setText(archivos.readLine())
            archivos.close()
        }catch (e:Exception){

        }
    }
}