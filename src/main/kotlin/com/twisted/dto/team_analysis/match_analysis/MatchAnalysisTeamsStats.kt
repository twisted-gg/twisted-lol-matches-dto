package com.twisted.dto.team_analysis.match_analysis

data class MatchAnalysisTeamsStats(
    var kills: Int,
    var goldEarned: Int,
    var damageToChampions: Long,
    var damageTaken: Long,
    var cs: Int,
    var wardsPlaces: Int
)

operator fun MatchAnalysisTeamsStats.plusAssign(o: MatchAnalysisTeamsStats) {
    this.kills += o.kills
    this.goldEarned += o.goldEarned
    this.damageToChampions += o.damageToChampions
    this.damageTaken += o.damageTaken
    this.cs += o.cs
    this.wardsPlaces += o.wardsPlaces
}