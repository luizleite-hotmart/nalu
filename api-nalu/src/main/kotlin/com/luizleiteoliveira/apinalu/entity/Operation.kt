package com.luizleite.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

class Operation(var stockName: String, var operationDate: Date,
                var count: Long, var value: Double, var taxes: Double,
                var broker: String) {
    var total: Double = calcTotal()

    var id: String = UUID.randomUUID().toString()
    constructor(stockName: String, operationDate: Date, count: Long, value: Double, broker: String) :
            this(
                    stockName = stockName,
                    operationDate = operationDate,
                    count = count,
                    value = value,
                    taxes = 0.0,
                    broker = broker
            )

    fun calcTotal(): Double {
        return (count*value).plus(taxes)
    }
}
