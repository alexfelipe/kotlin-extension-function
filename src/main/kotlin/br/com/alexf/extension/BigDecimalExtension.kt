package br.com.alexf.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

fun BigDecimal.formatForBrazilianCurrency(): String {
    val formatoBrasileiro = DecimalFormat
            .getCurrencyInstance(Locale("pt", "br"))
    return formatoBrasileiro.format(this)
}
