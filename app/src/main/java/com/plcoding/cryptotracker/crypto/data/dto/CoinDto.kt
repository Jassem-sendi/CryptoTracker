package com.plcoding.cryptotracker.crypto.data.dto

import com.plcoding.cryptotracker.crypto.domain.Coin
import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    val id: String,
    val name: String,
    val symbol: String,
    val rank : Int,
    val marketCapUsd : Double,
    val priceUsd : Double,
    val changePercent24h : Double,
){
    fun toCoin() = Coin(
        id = id,
        name = name,
        symbol = symbol,
        rank = rank,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24h,
    )
}