package id.my.micro.currencytrader

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
class CurrencyTraderApplication

fun main(args: Array<String>) {
    runApplication<CurrencyTraderApplication>(*args)
}
