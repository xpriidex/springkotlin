package com.felipe.springkotlin.core.usecase

import org.springframework.stereotype.Service

@Service
class HarmonicService(private val numberService: NumberService) {

    fun calculateHarmonic() = numberService.allNumber().reduce { t: Int, u: Int -> t + (1 / u) }


}