package com.twisted.dto.match_listing.matches.summoner

data class MatchListingSummonerStats(
    val champLevel: Int,
    val minionsKilled: Int,
    val wardsPlaced: Int,
    val killsParticipation: Float
)