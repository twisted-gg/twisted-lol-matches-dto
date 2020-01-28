package com.twisted.dto.match_analysis.teams

data class MatchAnalysisTeamsStats(
    val kills: Int,
    val goldEarned: Int,
    val damageToChampions: Long,
    val damageTaken: Long,
    val cs: Int,
    val wardsPlaces: Int
)