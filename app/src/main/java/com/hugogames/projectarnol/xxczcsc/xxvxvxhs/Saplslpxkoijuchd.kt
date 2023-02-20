package com.hugogames.projectarnol.xxczcsc.xxvxvxhs

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hugogames.projectarnol.R


class Saplslpxkoijuchd : Fragment() {

    private lateinit var gyxygzcusijjid: Context






    override fun onAttach(context: Context) {
        super.onAttach(context)
        gyxygzcusijjid=context
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bbybbuvhhuvfd, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        findNavController().navigate(R.id.ookxkokockosa)

    }


}