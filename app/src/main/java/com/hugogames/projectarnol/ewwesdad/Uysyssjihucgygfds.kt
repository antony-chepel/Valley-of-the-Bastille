package com.hugogames.projectarnol.ewwesdad

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hugogames.projectarnol.R
import com.hugogames.projectarnol.ewwesdad.Wwsoaijxijcsa
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Uysyssjihucgygfds : Fragment() {
    val ysysusuuhdhud by activityViewModel<Wwsoaijxijcsa>(named("MainModel"))

    private lateinit var ncncncxcmmxcmjd: Context
    lateinit var hxhxhxizjjicshuuhd: String

    val qopqokoks: SharedPreferences by inject(named("SharedPreferences"))



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ysysusuuhdhud.wpwwlplspld.observe(viewLifecycleOwner) {
            if (it!=null) {
                hxhxhxizjjicshuuhd = it.cou
                qopqokoks.edit().putString("country", hxhxhxizjjicshuuhd).apply()
                findNavController().navigate(R.id.coxokcjiuvhhds)
            }
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.zxuhxijxjsgydgyw, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        ncncncxcmmxcmjd = context
    }


}