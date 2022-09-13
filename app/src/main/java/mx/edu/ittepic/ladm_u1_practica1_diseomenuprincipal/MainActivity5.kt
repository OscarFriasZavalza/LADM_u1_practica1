package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain2Binding
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain5Binding
import java.io.OutputStreamWriter

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityMain5Binding
        super.onCreate(savedInstanceState)
        binding=ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.whisky.setOnClickListener{
            guardarenarchivo("Whisky Total a pagar $60")
        }
        binding.vodka.setOnClickListener{
            guardarenarchivo("Vodka Total a pagar $120")
        }
        binding.clericot.setOnClickListener{
            guardarenarchivo("Clericot Total a pagar $60")
        }
        binding.vino.setOnClickListener{
            guardarenarchivo("Vino tinto Total a pagar $200")
        }
        binding.mojito.setOnClickListener{
            guardarenarchivo("Mojito Total a pagar $50")
        }
        binding.limonada.setOnClickListener{
            guardarenarchivo("Limonada Total a pagar $30")
        }

        binding.cerveza.setOnClickListener{
            guardarenarchivo("Cerveza Total a pagar $30")
        }
        binding.refresco.setOnClickListener{
            guardarenarchivo("Refresco Total a pagar $20")
        }

        binding.orden2.setOnClickListener {
            var activityorden2= Intent(this,MainActivity7::class.java)
            startActivity(activityorden2)
        }
    }

    fun guardarenarchivo(mensaje:String){
        try {
            var archivo= OutputStreamWriter(openFileOutput("datos.txt", MODE_PRIVATE))
            archivo.write(mensaje)
            archivo.flush()
            archivo.close()
            Toast.makeText(this,"Se guardo tu compra, ve al carrito", Toast.LENGTH_LONG).show()
        }catch (e:Exception){
            Toast.makeText(this,e.message, Toast.LENGTH_LONG).show()
        }

    }
}