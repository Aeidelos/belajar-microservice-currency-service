package id.my.micro.currencytrader.repository

import id.my.micro.currencytrader.entity.Currency
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
open interface CurrencyRepository : CrudRepository<Currency, Int> {
    fun findOneByFromAndTo(from: String, to: String) : Currency
}
