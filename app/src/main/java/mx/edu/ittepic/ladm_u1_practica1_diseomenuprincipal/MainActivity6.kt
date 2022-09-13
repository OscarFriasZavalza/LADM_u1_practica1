package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    lateinit var binding:ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.entradas.setOnClickListener {
            var activityEntrada=Intent(this,MainActivity2::class.java)
            startActivity(activityEntrada)
        }

        binding.platofuerte.setOnClickListener {
            var activityEntrada=Intent(this,MainActivity2::class.java)
            startActivity(activityEntrada)
        }

        binding.postre.setOnClickListener {
            var activityEntrada=Intent(this,MainActivity2::class.java)
            startActivity(activityEntrada)
        }

        binding.bebidas.setOnClickListener {
            var activityEntrada=Intent(this,MainActivity2::class.java)
            startActivity(activityEntrada)
        }
    }
}