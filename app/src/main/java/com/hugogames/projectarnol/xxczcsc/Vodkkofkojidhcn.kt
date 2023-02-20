package com.hugogames.projectarnol.xxczcsc.xxvxvxhs

import androidx.annotation.Keep
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET

interface Deowoowoplslpplsdkoxijciz {
    @GET("go.php?to=1&")
    suspend fun bnxcnnvxidjids(): Response<Booskkosjidjiuhchuvd>
}

class Vcopcxplxclpkodjhff(private val fpfflplpcokijcv: Hywiiwwuwhhushud) {
    suspend fun qpqllpwlpkoskodkijxc() = fpfflplpcokijcv.xxoxoxozkcjishudh()
}
data class Booskkosjidjiuhchuvd(
    @JsonClass(generateAdapter = true)
    @Json(name = "vb_gqoqowis")
    val vb_gqoqowis: String,
    @Json(name = "vb_vnjdidijsuhe")
    val vb_vnjdidijsuhe: String,
    @Json(name = "vb_aspspspwoksdjwhu")
    val vb_aspspspwoksdjwhu: String
)
interface Hywiiwwuwhhushud {
    @GET("json/?key=ZSSz86ONagSoYRv")
    suspend fun xxoxoxozkcjishudh(): Response<Gususjiajijixchuzuhzx>
}


class Tyuwuwwiisjixhuc(private val ncncnnxvijdjihufhu: Deowoowoplslpplsdkoxijciz) {
    suspend fun ywiwiwoksokoda() = ncncnnxvijdjihufhu.bnxcnnvxidjids()
}

@Keep
data class Gususjiajijixchuzuhzx(
    @JsonClass(generateAdapter = true)
    @field:Json(name = "countryCode")
    val cou: String,
)






