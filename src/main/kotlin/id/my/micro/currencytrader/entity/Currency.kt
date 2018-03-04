package id.my.micro.currencytrader.entity

import javax.persistence.*

@Entity
open class Currency (
        @Id var id: Int = 0,
        @Column(name = "currency_from") var from: String = "",
        @Column(name = "currency_to") var to: String = "",
        var conversionMultiple: Double = 0.0,
        var port: Int = 0
)
