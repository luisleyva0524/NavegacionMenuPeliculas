package luis.leyva.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetallePelicula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_pelicula)

        val tv_nombre: TextView = findViewById(R.id.tv_nombre_detalle)
        val descripcionn: TextView = findViewById(R.id.tv_descripcion_detalle)
        val imagenn: ImageView = findViewById(R.id.img_detalle)

        val bundle = intent.extras

        if(bundle != null){
            var nombre: String? = bundle.getString("nombre")
            var descripcion: String? = bundle.getString("descripcion")
            var imagen = bundle.getInt("imagen")

            tv_nombre.setText(nombre)
            descripcionn.setText(descripcion)
            imagenn.setImageResource(imagen)
        }

    }
}