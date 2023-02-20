package com.hugogames.projectarnol.xxczcsc.xxvxvxhs

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.hugogames.projectarnol.R
import com.hugogames.projectarnol.databinding.ActivityGooowpqpkxijxuhzcBinding
import com.hugogames.projectarnol.ewwesdad.Uppwplwoksjdw
import kotlin.random.Random

class Gooowpqpkxijxuhzc : AppCompatActivity() {
    private var gokosdkokookd = 0
    var xcvijjixcv = 0
    val pasoskodkowjijisd = listOf(
        10,
        20,
        15,
        8,
        25,
        30
    )
    var jncxjnxvjnijsdji = 0
    private lateinit var nxnxzjuhsd : ActivityGooowpqpkxijxuhzcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nxnxzjuhsd = ActivityGooowpqpkxijxuhzcBinding.inflate(layoutInflater)
        setContentView(nxnxzjuhsd.root)
        nxnxzjuhsd.gokkosdokofkdosk.progress = gokosdkokookd
        val fodkdfok = intent.getIntExtra("vb_fx_hero",1)
        if(fodkdfok == 1){
            nxnxzjuhsd.siojadji.setImageResource(R.drawable.vb_it_1)
        } else {
            nxnxzjuhsd.siojadji.setImageResource(R.drawable.vb_it_5)
        }
        wowkqokosjiadjiasji()
    }


    @SuppressLint("ClickableViewAccessibility", "SetTextI18n")
    private fun wowkqokosjiadjiasji() = with(nxnxzjuhsd){
        val fokkookxoc = View.OnTouchListener(function = { gokvcko, eokwkokoqkoq->
            if(eokwkokoqkoq.action == MotionEvent.ACTION_MOVE){
                gokvcko.x = eokwkokoqkoq.rawX - gokvcko.width/2
                gokvcko.y = eokwkokoqkoq.rawY - gokvcko.height/2
                val fkocko = IntArray(2)
                val oksdkokodskojixzjic = IntArray(2)
                val hcbxbhvhbhxcjisdjihu = IntArray(2)
                val eokeko = IntArray(2)

                val gzgzuixjjaixij = IntArray(2)

                fjdfijidjickoxko.getLocationOnScreen(fkocko)
                nxznnjcs.getLocationOnScreen(oksdkokodskojixzjic)

                oqkwkookwkoskod.getLocationOnScreen(gzgzuixjjaixij)
                jxjnjnzcjijjidfj.getLocationOnScreen(hcbxbhvhbhxcjisdjihu)
                ygxgzygycgygygys.getLocationOnScreen(eokeko)

                val huxzhuchu = gokvcko.x.toInt()
                val sgyadgys = gokvcko.y.toInt()

                if(huxzhuchu == fkocko[0] || sgyadgys == fkocko[1] && fjdfijidjickoxko.visibility != View.GONE ){
                    xcvijjixcv +=1
                    val teksd = pasoskodkowjijisd[Random.nextInt(6)]
                    jncxjnxvjnijsdji += teksd
                    gokosdkokookd +=teksd
                    gokkosdokofkdosk.progress = gokosdkokookd
                    fjdfijidjickoxko.visibility = View.GONE


                }

                if(huxzhuchu == oksdkokodskojixzjic[0] || sgyadgys == oksdkokodskojixzjic[1] && nxznnjcs.visibility != View.GONE){
                    nxznnjcs.visibility = View.GONE
                    xcvijjixcv +=1
                    val teksd = pasoskodkowjijisd[Random.nextInt(6)]
                    jncxjnxvjnijsdji += teksd
                    gokosdkokookd +=teksd
                    gokkosdokofkdosk.progress = gokosdkokookd
                }

                if(huxzhuchu == gzgzuixjjaixij[0] || sgyadgys == gzgzuixjjaixij[1] && oqkwkookwkoskod.visibility != View.GONE ){
                    oqkwkookwkoskod.visibility = View.GONE
                    xcvijjixcv +=1
                    val teksd = pasoskodkowjijisd[Random.nextInt(6)]
                    jncxjnxvjnijsdji += teksd
                    gokosdkokookd +=teksd
                    gokkosdokofkdosk.progress = gokosdkokookd
                }

                if(huxzhuchu == hcbxbhvhbhxcjisdjihu[0] || sgyadgys == hcbxbhvhbhxcjisdjihu[1] && jxjnjnzcjijjidfj.visibility != View.GONE ){
                    jxjnjnzcjijjidfj.visibility = View.GONE
                    xcvijjixcv +=1
                    val teksd = pasoskodkowjijisd[Random.nextInt(6)]
                    jncxjnxvjnijsdji += teksd
                    gokosdkokookd +=teksd
                    gokkosdokofkdosk.progress = gokosdkokookd
                }


                if(huxzhuchu == eokeko[0] || sgyadgys == eokeko[1] && ygxgzygycgygygys.visibility != View.GONE ){
                    ygxgzygycgygygys.visibility = View.GONE
                    xcvijjixcv +=1
                    val teksd = pasoskodkowjijisd[Random.nextInt(6)]
                    jncxjnxvjnijsdji += teksd
                    gokosdkokookd +=teksd
                    gokkosdokofkdosk.progress = gokosdkokookd
                }


                if(xcvijjixcv >= 5){
                    startActivity(
                        Intent(this@Gooowpqpkxijxuhzc, Uppwplwoksjdw::class.java)
                            .putExtra("vb_scr_fx",jncxjnxvjnijsdji)
                    )
                }

            }

            true
        })
        siojadji.setOnTouchListener(fokkookxoc)
    }



}