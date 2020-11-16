package com.namjackson.lottoapp.data.remote

import kotlinx.serialization.Serializable

@Serializable
class LottoResponse(
    val returnValue: String,
    val drwNoDate: String,
    val drwNo: Int,
    val drwtNo1: Int,
    val drwtNo2: Int,
    val drwtNo3: Int,
    val drwtNo4: Int,
    val drwtNo5: Int,
    val drwtNo6: Int,
    val bnusNo: Int,
    val totSellamnt: Long,      //총상금액
    val firstWinamnt: Long,     //1등 상금
    val firstPrzwnerCo: Int,    //1등 당첨 인원
    val firstAccumamnt: Long    //1등 당첨금 총액
)
