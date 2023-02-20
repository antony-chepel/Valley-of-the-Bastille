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
import com.mvffg.btwolib.decrypt
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


class Zoskasjijwhuhusdhu : Fragment() {
    val ggdy = SecretKeySpec("x/A?D(G+KbPeShVmYq3t6w9y\$B&E)H@M".toByteArray(), "AES")
    val roekkoekowkokow: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var nncnxjxijcxijjidhuhufhu: String
    val qpqowkowkowkoowjisjixijcjizjizxhu by activityViewModel<Wwsoaijxijcsa>(named("MainModel"))
    val hxhxhxbxbhxzuhcgysgydtfdft = "AES/CBC/PKCS5Padding"
    lateinit var sgtwuuw: String
    lateinit var gsgsggsuxhxchu: String
    val sijijjijisdji = IvParameterSpec(ByteArray(16))
    private lateinit var xijzjicjizxcji: Context

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        qpqowkowkowkoowjisjixijcjizjizxhu.hxhzcuzxbnczx.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                roekkoekowkokow.edit().putString("mainId", main).apply()
            }
        }

        qpqowkowkowkoowjisjixijcjizjizxhu.xchbxczhbjnzxnj.observe(viewLifecycleOwner) {
            if (it != null) {
                sgtwuuw = it.vb_gqoqowis
                nncnxjxijcxijjidhuhufhu = it.vb_aspspspwoksdjwhu
                gsgsggsuxhxchu = it.vb_vnjdidijsuhe
                val sijdjiajsdi = decrypt(hxhxhxbxbhxzuhcgysgydtfdft, sgtwuuw, ggdy, sijijjijisdji)
                val ijdsji = decrypt(hxhxhxbxbhxzuhcgysgydtfdft, gsgsggsuxhxchu, ggdy, sijijjijisdji)

                roekkoekowkokow.edit().putString("countryDev", sijdjiajsdi).apply()
                roekkoekowkokow.edit().putString("apps", nncnxjxijcxijjidhuhufhu).apply()
                roekkoekowkokow.edit().putString("wv", ijdsji).apply()

                findNavController().navigate(R.id.mmxkxkzixjycgd)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        xijzjicjizxcji = context
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.nncncjxjugygfyds, container, false)
    }

}