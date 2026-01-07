package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.crypto.presentation.models.CoinUi

sealed class CoinListEvent {
    data class OnCoinClicked(val coinUi: CoinUi) : CoinListEvent()
}