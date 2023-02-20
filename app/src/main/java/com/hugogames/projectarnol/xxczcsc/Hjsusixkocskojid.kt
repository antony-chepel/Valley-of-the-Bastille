package com.hugogames.projectarnol.xxczcsc
import org.koin.android.ext.android.inject
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import com.hugogames.projectarnol.R
import android.content.Context
import android.content.SharedPreferences
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hugogames.projectarnol.ewwesdad.Wwsoaijxijcsa


class Hjsusixkocskojid : Fragment() {
    private lateinit var xkzcmkmzxcjisajiuhdhusdhu: Context

    val twuiwijsjidji by activityViewModel<Wwsoaijxijcsa>(named("MainModel"))

    lateinit var jxnczjnhusahu: String
    val owokqkoqko: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        xkzcmkmzxcjisajiuhdhusdhu = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val jxjizcjjiashuhuasdgy = owokqkoqko.getString("apps", null)
        val rokekoeko = owokqkoqko.getString("appCamp", null)

        if (jxjizcjjiashuhuasdgy=="1" && rokekoeko == null) {
            twuiwijsjidji.ggttcuxuhhuijs(xkzcmkmzxcjisajiuhdhusdhu)
            twuiwijsjidji.xmmxmxmzkkmcmzxkkcs.observe(viewLifecycleOwner) {
                if (it != null) {
                    jxnczjnhusahu = it.toString()
                    owokqkoqko.edit().putString("appCamp", jxnczjnhusahu).apply()
                    findNavController().navigate(R.id.nncmxmmxkvhugfygygygdtfw)
                }
            }
        } else {
            findNavController().navigate(R.id.nncmxmmxkvhugfygygygdtfw)
        }
    }


    override fun onStart() {
        super.onStart()

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.eokkokowjisdhuw, container, false)
    }





}