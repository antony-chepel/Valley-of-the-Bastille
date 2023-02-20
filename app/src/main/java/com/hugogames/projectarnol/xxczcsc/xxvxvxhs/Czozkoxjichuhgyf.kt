package com.hugogames.projectarnol.xxczcsc.xxvxvxhs

import android.app.Application
import android.content.Context
import com.hugogames.projectarnol.ewwesdad.plzpllpzxkojiixjcji
import com.hugogames.projectarnol.ewwesdad.huxcokxkozkocsjiaji
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class Czozkoxjichuhgyf : Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId("d5be622a-0a0c-4a84-b22a-885bde32e3b9")
        MyTracker.initTracker("17441071013042593974", this)

        val hchcjjnxnjvduh = MyTracker.getTrackerConfig()
        hchcjjnxnjvduh.isTrackingLaunchEnabled = true
        val oeokpwllpwlpsdlp = MyTracker.getInstanceId(this)
        val cygcgyxujjvjijiijfjid = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        cygcgyxujjvjijiijfjid.edit().putString("instId", oeokpwllpwlpsdlp).apply()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Czozkoxjichuhgyf)
            modules(
                listOf(
                    huxcokxkozkocsjiaji, plzpllpzxkojiixjcji
                )
            )
        }
    }
}