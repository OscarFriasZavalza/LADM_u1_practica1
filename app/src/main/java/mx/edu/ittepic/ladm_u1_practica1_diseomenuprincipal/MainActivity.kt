package mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import mx.edu.ittepic.ladm_u1_practica1_diseomenuprincipal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iniciarSesion.setOnClickListener {
            var activityDeListas=Intent(this,MainActivity6::class.java)
            startActivity(activityDeListas)
        }

        binding.crearcuenta.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Crear Cuenta")
                .setMessage("Funcion No Disponible")
                .setNeutralButton("ok"){d,i->d.dismiss()}
                .setNegativeButton("salir"){d,i ->d.cancel()}
                .show()
        }
    }
}