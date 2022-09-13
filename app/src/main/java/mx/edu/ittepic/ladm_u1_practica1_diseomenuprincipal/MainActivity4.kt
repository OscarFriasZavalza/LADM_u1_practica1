package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain4Binding
import java.io.OutputStreamWriter

class MainActivity4 : AppCompatActivity() {
    lateinit var binding:ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.crepas.setOnClickListener{
            guardarenarchivo("Crepas Total a pagar $130")
        }
        binding.wafles.setOnClickListener{
            guardarenarchivo("Wafles Total a pagar $120")
        }
        binding.cremedulce.setOnClickListener{
            guardarenarchivo("Wafles Total a pagar $120")
        }
        binding.gelatina.setOnClickListener{
            guardarenarchivo("Gelatina Total a pagar $100")
        }
        binding.cupcake.setOnClickListener{
            guardarenarchivo("Cupcakes 3pz Total a pagar $80")
        }
        binding.rebanadapay.setOnClickListener{
            guardarenarchivo("Rebanada pay 3pz Total a pagar $40")
        }
        binding.helado.setOnClickListener{
            guardarenarchivo("Helado Total a pagar $50")
        }
        binding.flan.setOnClickListener{
            guardarenarchivo("Flan Total a pagar $45")
        }
        binding.ordenar.setOnClickListener {
            var activityorden= Intent(this,MainActivity7::class.java)
            startActivity(activityorden)
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