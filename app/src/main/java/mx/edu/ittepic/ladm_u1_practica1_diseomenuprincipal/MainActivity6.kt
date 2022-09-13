package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMain6Binding
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMainBinding

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
            var activityPlatoFuerte=Intent(this,MainActivity2::class.java)
            startActivity(activityPlatoFuerte)
        }

        binding.postre.setOnClickListener {
            var activityPostre=Intent(this,MainActivity4::class.java)
            startActivity(activityPostre)
        }

        binding.bebidas.setOnClickListener {
            var activityBebidas=Intent(this,MainActivity5::class.java)
            startActivity(activityBebidas)
        }

        binding.contacto.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Contactar a Restaurante Paola & Oscar")
                .setMessage(" para reservaciones 3111477764")
                .setNeutralButton("ok"){d,i->d.dismiss()}
                .setNegativeButton("salir"){d,i ->d.cancel()}
                .show()
        }
        }
    }
