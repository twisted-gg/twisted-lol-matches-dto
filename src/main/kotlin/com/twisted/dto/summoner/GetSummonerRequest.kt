package com.twisted.dto.summoner

import com.twisted.enum.common.ListRegions

data class GetSummonerRequest(
    val summonerName: String,
    val accountID: String = "",
    val region: ListRegions
)
