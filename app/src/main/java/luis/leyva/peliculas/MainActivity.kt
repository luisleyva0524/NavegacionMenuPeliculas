package luis.leyva.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var listaPeliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Agregar_peliculas()

        val adaptador: AdaptadorPeliculas = AdaptadorPeliculas(this, listaPeliculas)

        val listview: ListView = findViewById(R.id.listview)

        listview.adapter = adaptador

    }

    fun Agregar_peliculas(){
        var peli1 = Pelicula(1,"Juego del Calamar","Dentro les esperan un tentador premio y desafíos letales.",R.drawable.juegodelcalamar)
        listaPeliculas.add(peli1)
        var peli2 = Pelicula(2,"Extinct","Tiernos y divertidos.",R.drawable.extinct)
        listaPeliculas.add(peli2)
        var peli3 = Pelicula(3,"Manos Arriba","Un policia y tres ladrones.", R.drawable.manosarriba)
        listaPeliculas.add(peli3)
        var peli4 = Pelicula(4,"Intrusion","Sospecha que quienes la rodean podrían no ser lo que parecen.",R.drawable.intrusion)
        listaPeliculas.add(peli4)
        var peli5 = Pelicula(5,"beirut","Agentes de la cia negocian un rescate de un testigo importante.",R.drawable.beirut)
        listaPeliculas.add(peli5)

    }
}