package com.twisted.dto.match_listing.matches.summoner

data class MatchListingSummonerStats(
    val champLevel: Int,
    val neutralMinionsKilled: Int,
    val neutralMinionsKilledEnemyJungle: Int,
    val neutralMinionsKilledTeamJungle: Int,
    val totalMinionsKilled: Int,
    val wardsPlaced: Int
)