package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain2Binding
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain3Binding
import java.io.OutputStreamWriter

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityMain3Binding
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.pizza.setOnClickListener{
            guardarenarchivo("Pizza Total a pagar $195")
        }
        binding.hamburguesa.setOnClickListener{
            guardarenarchivo("Hamburguesa Total a pagar $90")
        }
        binding.camarones.setOnClickListener{
            guardarenarchivo("Camarones al gusto Total a pagar $210")
        }
        binding.aguachile.setOnClickListener{
            guardarenarchivo("Aguachile Total a pagar $120")
        }
        binding.carne.setOnClickListener{
            guardarenarchivo("Rib Eye Total a pagar $250")
        }
        binding.pasta.setOnClickListener{
            guardarenarchivo("Pasta Total a pagar $115")
        }

        binding.pozole.setOnClickListener{
            guardarenarchivo("Pozole Total a pagar $120")
        }
        binding.enchiladas.setOnClickListener{
            guardarenarchivo("Enchiladas Total a pagar $100")
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