package com.twisted.dto.match_details

data class MatchLeagueDetails(
    val tier: String,
    val rank: String? = null,
    val points: Int? = null
)