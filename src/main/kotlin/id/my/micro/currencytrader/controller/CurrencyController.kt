package id.my.micro.currencytrader.controller

import id.my.micro.currencytrader.entity.Currency
import id.my.micro.currencytrader.repository.CurrencyRepository
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable

@RestController
open class CurrencyController(val currencyRepository: CurrencyRepository, val environment: Environment){
    @GetMapping("/")
    @ResponseBody fun findAll() : List<Currency> = currencyRepository.findAll() as List<Currency>

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    fun retrieveExchangeValue(@PathVariable from: String, @PathVariable to: String): Currency {
        val exchangeValue : Currency = currencyRepository.findOneByFromAndTo(from, to)
        exchangeValue.port = Integer.parseInt(environment.getProperty("local.server.port"))
        return exchangeValue
    }
}