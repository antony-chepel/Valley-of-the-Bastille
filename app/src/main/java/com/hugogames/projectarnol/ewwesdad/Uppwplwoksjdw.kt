package com.hugogames.projectarnol.ewwesdad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hugogames.projectarnol.R
import com.hugogames.projectarnol.databinding.ActivityUppwplwoksjdwBinding
import com.hugogames.projectarnol.xxczcsc.xxvxvxhs.Nosooskoxjichuygyf
import kotlin.random.Random

class Uppwplwoksjdw : AppCompatActivity() {
    private lateinit var kofdkofkoggkof : ActivityUppwplwoksjdwBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kofdkofkoggkof = ActivityUppwplwoksjdwBinding.inflate(layoutInflater)
        setContentView(kofdkofkoggkof.root)
        dsokfksdoko()
    }

    private fun dsokfksdoko() = with(kofdkofkoggkof){
        val infufh = intent.getIntExtra("vb_scr_fx",100)
        val ijdsuh = listOf(2,5,10)
        val ysfdw = listOf(R.drawable.vb_it_1,R.drawable.vb_it_5)
        cjivxcvjiji.setImageResource(ysfdw[Random.nextInt(2)])
        val fdjgfd = ijdsuh[Random.nextInt(3)]
        val total = infufh * fdjgfd
        osksakodokwkoqdji.text = "You got $total scores"
        hxhbhbcjsijid.setOnClickListener {
            startActivity(Intent(this@Uppwplwoksjdw, Nosooskoxjichuygyf::class.java))
        }

    }
}