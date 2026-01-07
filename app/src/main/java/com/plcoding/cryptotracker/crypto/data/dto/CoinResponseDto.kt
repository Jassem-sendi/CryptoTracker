package com.plcoding.cryptotracker.crypto.data.dto

import com.plcoding.cryptotracker.crypto.domain.Coin
import kotlinx.serialization.Serializable

@Serializable
class CoinResponseDto {
    val data: List<CoinDto>? = null
}