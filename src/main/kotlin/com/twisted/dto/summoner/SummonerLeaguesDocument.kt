package com.twisted.dto.summoner

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class SummonerLeaguesDocument(
    val queueId: Int,
    val mmr: Int
)
