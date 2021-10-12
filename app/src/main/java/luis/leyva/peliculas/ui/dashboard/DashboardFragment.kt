package luis.leyva.peliculas.ui.dashboard

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
import luis.leyva.peliculas.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    var listaPeliculas: ArrayList<Pelicula> = ArrayList()

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Agregar_series()

        val tv_peliculas: ListView = root.findViewById(R.id.list_view_series)

        val adaptador = AdaptadorPeliculas(root.context, listaPeliculas)

        tv_peliculas.adapter = adaptador


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun Agregar_series(){
        var peli2 = Pelicula(7,"See","Un virus ha acabado con la población de todo el mundo y los únicos supervivientes han quedado ciegos.",R.drawable.see)
        listaPeliculas.add(peli2)
        var peli3 = Pelicula(8,"Foundation","Foundation gira en torno a un grupo de exiliados en el ocaso del Imperio Galáctico.", R.drawable.fundation)
        listaPeliculas.add(peli3)
        var peli5 = Pelicula(9,"Legends","Después de haber visto el futuro, el viajero del tiempo Rip Hunter tratará desesperadamente de evitarlo.",R.drawable.legends)
        listaPeliculas.add(peli5)
        var peli4 = Pelicula(10,"Debris","Dos agentes investigan los restos de un objeto sobrenatural que cayó del cielo.",R.drawable.debris)
        listaPeliculas.add(peli4)


    }
}