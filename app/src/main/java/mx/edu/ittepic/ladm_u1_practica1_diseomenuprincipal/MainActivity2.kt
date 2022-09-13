package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain2Binding
import java.io.OutputStreamWriter

class MainActivity2 : AppCompatActivity() {
    lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sopa.setOnClickListener{
            guardarenarchivo("Sopa Azteca Total a pagar $80")
        }
        binding.ensalada.setOnClickListener{
            guardarenarchivo("Ensalada Total a pagar $75")
        }
        binding.guacamole.setOnClickListener{
            guardarenarchivo("Guacamole Total a pagar $65")
        }
        binding.cremaelote.setOnClickListener{
            guardarenarchivo("Crema de Elote Total a pagar $85")
        }
        binding.patecamaron.setOnClickListener{
            guardarenarchivo("Pate de Camaron Total a pagar $60")
        }
        binding.pescar.setOnClickListener{
            guardarenarchivo("Tiradito de Pescado Total a pagar $90")
        }

        binding.rollosdejamon.setOnClickListener{
            guardarenarchivo("Rollos de Jamon Total a pagar $50")
        }
        binding.pan.setOnClickListener{
            guardarenarchivo("Pan Total a pagar $50")
        }
        binding.verorden.setOnClickListener {
            var activityveroreden=Intent(this,MainActivity7::class.java)
            startActivity(activityveroreden)
        }
    }

    fun guardarenarchivo(mensaje:String){
        try {
            var archivo=OutputStreamWriter(openFileOutput("datos.txt", MODE_PRIVATE))
            archivo.write(mensaje)
            archivo.flush()
            archivo.close()
            Toast.makeText(this,"Se guardo tu compra, ve al carrito",Toast.LENGTH_LONG).show()
        }catch (e:Exception){
            Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
        }

    }
}