package com.felipe.springkotlin.periphery.web

import com.felipe.springkotlin.core.usecase.NumberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class NumberController (private val numberService: NumberService){
    @GetMapping("/number")
    fun number() = numberService.allNumber()

}