package com.hugogames.projectarnol.xxczcsc
import com.mvffg.btwolib.BTwoLib
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class Jusuhshuxygcgdf : AppCompatActivity() {

    lateinit var hshusuhijxjizc: BTwoLib
    val epwlpwlp: SharedPreferences by inject(named("SharedPreferences"))



    private fun yywuwuwiwij(): String {
        val hhxcjnxjs = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val wowkokskokoskoksjixcji = epwlpwlp.getString("link", null)
        hhxcjnxjs.edit().putString("SAVED_URL", wowkokskokoskoksjixcji).apply()
        return hhxcjnxjs.getString("SAVED_URL", wowkokskokoskoksjixcji).toString()
    }


    override fun onActivityResult(hxzcisidjis: Int, iwiowokkosd: Int, gkokokocx: Intent?) {
        super.onActivityResult(hxzcisidjis, iwiowokkosd, gkokokocx)
        if (gkokokocx != null) {
            hshusuhijxjizc.onActivityResult(hxzcisidjis, iwiowokkosd, gkokokocx)
        }
    }


    override fun onBackPressed() {
        if (!hshusuhijxjizc.onBackPressed()) {
            return
        }
        super.onBackPressed()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hshusuhijxjizc = BTwoLib(this@Jusuhshuxygcgdf)
        setContentView(hshusuhijxjizc)
        hshusuhijxjizc.profiter(yywuwuwiwij())
    }


}