package com.felipe.springkotlin.core.usecase

import com.felipe.springkotlin.periphery.data.NumberRepository
import org.springframework.stereotype.Service

@Service
class NumberService(private val numberRepository: NumberRepository) {
    fun allNumber() = numberRepository.allNumber()
}