package com.twisted.dto.league

data class MatchLeagueDocument(
    val tier: String,
    val rank: String? = null,
    val points: Int? = null,
    val mmr: Int
)
