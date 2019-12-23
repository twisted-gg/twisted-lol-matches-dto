package com.twisted.dto.summoner

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class SummonerDocument(
    val _id: String,
    val name: String,
    val profileIconId: Int,
    val summonerLevel: Int,
    val puuid: String,
    val accountId: String,
    val loading: Boolean,
    val bot: Boolean,
    val region: String
)
