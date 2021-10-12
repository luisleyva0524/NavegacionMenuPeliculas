package luis.leyva.peliculas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorPeliculas: BaseAdapter{
    lateinit var context: Context
    var peliculas: ArrayList<Pelicula> = ArrayList()


    constructor(context: Context, peliculas: ArrayList<Pelicula>){
        this.context = context
        this.peliculas = peliculas

    }

    override fun getCount(): Int {
        return peliculas.size
    }

    override fun getItem(p0: Int): Any {
        return peliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
        return peliculas[p0].id.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflador = LayoutInflater.from(context)
        val vista = inflador.inflate(R.layout.pelicula_view, null)

        val tv_nombre: TextView = vista.findViewById(R.id.tv_nombre)
        val tv_descripcion: TextView = vista.findViewById(R.id.tv_descripcion)
        val img: ImageView = vista.findViewById(R.id.img_pelicula)


        var pelicula: Pelicula = peliculas[p0]

        tv_nombre.setText(pelicula.nombre)
        tv_descripcion.setText(pelicula.descripcion)
        img.setImageResource(pelicula.img)

        vista.setOnClickListener{
            val intent: Intent = (Intent(context, DetallePelicula::class.java))
            intent.putExtra("nombre", pelicula.nombre)
            intent.putExtra("descripcion", pelicula.descripcion)
            intent.putExtra("imagen", pelicula.img)
            context.startActivity(intent)
        }

        return vista
    }


}