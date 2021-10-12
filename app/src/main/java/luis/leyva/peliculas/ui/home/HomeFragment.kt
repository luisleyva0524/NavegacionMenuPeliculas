package luis.leyva.peliculas.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import luis.leyva.peliculas.AdaptadorPeliculas
import luis.leyva.peliculas.Pelicula
import luis.leyva.peliculas.R
import luis.leyva.peliculas.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    var listaPeliculas: ArrayList<Pelicula> = ArrayList()

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Agregar_peliculas()

        val tv_peliculas: ListView = root.findViewById(R.id.list_view_peliculas)

        val adaptador = AdaptadorPeliculas(root.context, listaPeliculas)

        tv_peliculas.adapter = adaptador

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
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