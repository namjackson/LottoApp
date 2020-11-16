package com.namjackson.lottoapp

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SampleTest {

    @Test
    fun test() {
        // given
        val sample: Sample = Sample()

        // when
        val hello = sample.hello()

        // then
        assertThat(hello).isEqualTo("Hello World")
    }
}