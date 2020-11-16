package com.namjackson.lottoapp.data.remote

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


class LottoResponseTest {

    @DisplayName("Lotto 정보를 가진 Json을 LottoResponse로 정상적으로 변환한다. ")
    @Test
    fun parsingTestLottoResponse() {
        val response = Json.decodeFromString<LottoResponse>(lotto861Json)
        assertThat(response.drwNo).isEqualTo(861)
    }

    private val lotto861Json = "{\n" +
            "\t\"totSellamnt\": 81032551000,\n" +
            "\t\"returnValue\": \"success\",\n" +
            "\t\"drwNoDate\": \"2019-06-01\",\n" +
            "\t\"firstWinamnt\": 4872108844,\n" +
            "\t\"drwtNo6\": 25,\n" +
            "\t\"drwtNo4\": 21,\n" +
            "\t\"firstPrzwnerCo\": 4,\n" +
            "\t\"drwtNo5\": 22,\n" +
            "\t\"bnusNo\": 24,\n" +
            "\t\"firstAccumamnt\": 19488435376,\n" +
            "\t\"drwNo\": 861,\n" +
            "\t\"drwtNo2\": 17,\n" +
            "\t\"drwtNo3\": 19,\n" +
            "\t\"drwtNo1\": 11\n" +
            "}"
}