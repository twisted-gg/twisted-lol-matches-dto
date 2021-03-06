package com.twisted.dto.summoner

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class GetSummonerNameById(
    val id: String,
    val name: String
)
