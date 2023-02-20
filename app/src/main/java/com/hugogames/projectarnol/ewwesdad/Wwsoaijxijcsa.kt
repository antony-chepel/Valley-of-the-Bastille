package com.hugogames.projectarnol.ewwesdad

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.hugogames.projectarnol.xxczcsc.xxvxvxhs.Gususjiajijixchuzuhzx
import com.hugogames.projectarnol.xxczcsc.xxvxvxhs.Vcopcxplxclpkodjhff
import com.hugogames.projectarnol.xxczcsc.xxvxvxhs.Tyuwuwwiisjixhuc
import com.hugogames.projectarnol.xxczcsc.xxvxvxhs.Booskkosjidjiuhchuvd
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Wwsoaijxijcsa (private val ywiwjwjis: Vcopcxplxclpkodjhff, private val jxjjncjnjnxhush: Tyuwuwwiisjixhuc, private val okrkorkorkodok: SharedPreferences, val xokxkodokoksdjif: Application): ViewModel(){

    init {
        viewModelScope.launch (Dispatchers.IO){
            vpcpcpllpvkodjijifudhf()
        }
        viewModelScope.launch (Dispatchers.Main){
            bbcbchcxhxcuijidji()
        }
    }


    private val bcbxbxcijvjidji = MutableLiveData<String>()
    val ksksisjdis: LiveData<String>
        get() = bcbxbxcijvjidji

    fun vpcpcpllpvkodjijifudhf() {
        val dlplpslplpskodjijicx = AdvertisingIdClient(xokxkodokoksdjif)
        dlplpslplpskodjijicx.start()
        val nncnncxjncvjvduh = dlplpslplpskodjijicx.info.id.toString()
        uuwiwioqkkoskod.postValue(nncnncxjncvjvduh)
    }

    private val uuwiwioqkkoskod = MutableLiveData<String?>()
    val hxhzcuzxbnczx: LiveData<String?>
        get() = uuwiwioqkkoskod


    fun cockckoxkoxckojivjiji(pwlqlpqlpqlpwkowkowkookd: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            pwlqlpqlpqlpwkowkowkookd
        ) { fkodfko: AppLinkData? ->
            fkodfko?.let {
                val vkockocvkobko = fkodfko.targetUri?.host.toString()
                okrkorkorkodok.edit().putString("deepSt", vkockocvkobko).apply()
            }
        }
    }

    private val epwpllpwlpslp = MutableLiveData<Booskkosjidjiuhchuvd>()
    val xchbxczhbjnzxnj: LiveData<Booskkosjidjiuhchuvd>
        get() = epwpllpwlpslp




    private val ggctcxijijidhuf = MutableLiveData<Gususjiajijixchuzuhzx>()
    val wpwwlplspld: LiveData<Gususjiajijixchuzuhzx>
        get() = ggctcxijijidhuf

    private val ccocoviijvhuydgygytwvttsd  = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(bcbxijduhuhuf: MutableMap<String, Any>?) {
            val ggdgdhdjiwijisjjid = bcbxijduhuhuf?.get("campaign").toString()
            qopqokokoskosdjijixjic.postValue(ggdgdhdjiwijisjjid)
        }
        override fun onConversionDataFail(error: String?) {
        }
        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }
        override fun onAttributionFailure(error: String?) {
        }
    }

    suspend fun bbcbchcxhxcuijidji() {
        ggctcxijijidhuf.postValue(ywiwjwjis.qpqllpwlpkoskodkijxc().body())
        rplelplpwlplsp()
    }
    private val qopqokokoskosdjijixjic = MutableLiveData<String>()
    val xmmxmxmzkkmcmzxkkcs: LiveData<String>
        get() = qopqokokoskosdjijixjic

    suspend fun rplelplpwlplsp() {
        try {
            epwpllpwlpslp.postValue(jxjjncjnjnxhush.ywiwiwoksokoda().body())
        } catch (e:java.lang.Exception) {
        }
    }

    fun ggttcuxuhhuijs(sodkosdk: Context) {
        AppsFlyerLib.getInstance()
            .init("cAhmXXLeuc8vHvc5J8SmXN", ccocoviijvhuydgygytwvttsd, xokxkodokoksdjif)
        AppsFlyerLib.getInstance().start(sodkosdk)
    }

}