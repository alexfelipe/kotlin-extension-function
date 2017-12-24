package br.com.alexf

import br.com.alexf.model.Product
import br.com.alexf.extension.formatForBrazilianCurrency
import java.math.BigDecimal

fun main(args: Array<String>) {
    val products = allProducts()
    products.forEach {
        val brazilianCurrency = it.value.formatForBrazilianCurrency()
        println(brazilianCurrency)
    }
}

fun allProducts(): List<Product> {
    return listOf(
            Product(
                    name = "Computador",
                    value = BigDecimal("2150.99"),
                    quantity = 10
            ),
            Product(
                    name = "Smartphone",
                    value = BigDecimal("1699.99"),
                    quantity = 15
            ),
            Product(
                    name = "Caixa de som",
                    value = BigDecimal("799.99"),
                    quantity = 15
            ),
            Product(
                    name = "TV",
                    value = BigDecimal("1899.99"),
                    quantity = 15),
            Product(
                    name = "Videogame",
                    value = BigDecimal("1199.99"),
                    quantity = 15
            ))
}