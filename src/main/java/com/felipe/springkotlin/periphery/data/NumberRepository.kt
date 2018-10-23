package com.felipe.springkotlin.periphery.data

import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
class NumberRepository {
    fun allNumber(): Flux<Int> = Flux.range(1, 100)
}