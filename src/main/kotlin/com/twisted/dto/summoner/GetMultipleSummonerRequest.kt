package com.twisted.dto.summoner

import com.twisted.enum.common.ListRegions

data class GetMultipleSummonerRequest(
    val summonerName: List<String>,
    val accountID: String = "",
    val region: ListRegions
)
