package com.nemanja.filipovic.showmovie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    lateinit var binding: Movie
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Movie(description = "Catch Me If You Can is a 2002 American biographical crime film directed and produced by Steven Spielberg from a screenplay by Jeff Nathanson. The film stars Leonardo DiCaprio, Tom Hanks, Christopher Walken, Martin Sheen, and Nathalie Baye. The film is based on the life of Frank Abagnale, who, before his 19th birthday, successfully performed cons worth millions of dollars by posing as a Pan American World Airways pilot, a Georgia doctor and a Louisiana parish prosecutor. His foremost crime was check fraud; he became so highly skilled that the FBI later turned to him for help catching other check forgers.\n" +
                "\n" +
                "Development for the film began in 1980 but dragged on until 1997, when Spielberg's DreamWorks bought the film rights to Abagnale's 1980 book of the same name. David Fincher, Gore Verbinski, Lasse Hallström, Miloš Forman, and Cameron Crowe were all considered to direct the film before Spielberg decided to direct it himself. Filming took place from February to May 2002.")
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textview_first).apply {
             text = binding.title
        }
        view.findViewById<RatingBar>(R.id.ratingBar).apply {
            rating = binding.rating
        }

        view.findViewById<TextView>(R.id.textView_creators).apply {
            text = "Creators: " + binding.creatorsAuthors
        }

        view.findViewById<TextView>(R.id.textView2_actors).apply {
            text = "Actors: " + binding.actors
        }

        view.findViewById<TextView>(R.id.textView3_description).apply {
            text = "Story \n " + binding.description
        }
      //  view.findViewById<Button>(R.id.button_first).setOnClickListener {
      //      findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
      //  }
    }
}