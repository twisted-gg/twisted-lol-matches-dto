package com.twisted.dto.summoner

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetMultipleSummoner(
    val users: List<SummonerDocument>
)
