package com.hugogames.projectarnol.xxczcsc.xxvxvxhs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hugogames.projectarnol.databinding.ActivityFdosokksojixuhzcsBinding

class Nosooskoxjichuygyf : AppCompatActivity() {
    private lateinit var swiijwjis : ActivityFdosokksojixuhzcsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        swiijwjis = ActivityFdosokksojixuhzcsBinding.inflate(layoutInflater)
        setContentView(swiijwjis.root)
        ijsaijdiasij()
    }


    private fun ijsaijdiasij() = with(swiijwjis){
        yggysadhji.setOnClickListener {
            startActivity(Intent(this@Nosooskoxjichuygyf,Gooowpqpkxijxuhzc::class.java)
                .putExtra("vb_fx_hero",1)
            )
        }

        jzxncjnjn.setOnClickListener {
            startActivity(Intent(this@Nosooskoxjichuygyf,Gooowpqpkxijxuhzc::class.java)
                .putExtra("vb_fx_hero",2)
            )
        }
    }
}