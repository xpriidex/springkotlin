package com.felipe.springkotlin.configuration

import com.felipe.springkotlin.core.usecase.*
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.body
import org.springframework.web.reactive.function.server.router

@Configuration
class RoutingConfiguration {

    @Bean
    fun routerFunction(numberService: NumberService,
                       fizzBuzzService: FizzBuzzService,
                       negativeNumberService: NegativeNumberService,
                       mergeService: MergeService,
                       harmonicService: HarmonicService): RouterFunction<ServerResponse> = router {

        ("/reactive").nest {
            GET("/number") {
                ServerResponse.ok().body(numberService.allNumber().collectList())
            }
            GET("/fizzbuzz") {
                ServerResponse.ok().body(fizzBuzzService.calculateFizzBuzz().collectList())
            }

            GET("/negative") {
                ServerResponse.ok().body(negativeNumberService.calculateNegative().collectList())
            }

            GET("/merge") {
                ServerResponse.ok().body(mergeService.merge().collectList())
            }

            GET("/harmonic") {
                ServerResponse.ok().body(harmonicService.calculateHarmonic())
            }
        }
    }
}