package luis.leyva.peliculas.ui.notifications

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
import luis.leyva.peliculas.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {
    var listaPeliculas: ArrayList<Pelicula> = ArrayList()


    private lateinit var notificationsViewModel: NotificationsViewModel
    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        Agregar_favoritos()

        val tv_peliculas: ListView = root.findViewById(R.id.list_view_favorites)

        val adaptador = AdaptadorPeliculas(root.context, listaPeliculas)

        tv_peliculas.adapter = adaptador

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun Agregar_favoritos(){
        var peli11 = Pelicula(11,"Riverdale","La vida tranquila y convencional de los estudiantes de Riverdale da un giro cuando el alumno más popular del instituto aparece asesinado.",R.drawable.riverdale)
        listaPeliculas.add(peli11)
        var peli12 = Pelicula(12,"See","Un virus ha acabado con la población de todo el mundo y los únicos supervivientes han quedado ciegos.",R.drawable.see)
        listaPeliculas.add(peli12)
        var peli14 = Pelicula(14,"Intrusion","Sospecha que quienes la rodean podrían no ser lo que parecen.",R.drawable.intrusion)
        listaPeliculas.add(peli14)
        var peli15 = Pelicula(15,"beirut","Agentes de la cia negocian un rescate de un testigo importante.",R.drawable.beirut)
        listaPeliculas.add(peli15)
    }
}