package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result

interface CoinRepository {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}