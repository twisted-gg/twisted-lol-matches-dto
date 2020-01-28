package com.twisted.dto.match_analysis.teams

data class MatchAnalysisTeams(
    val teamId: Int,
    var stats: MatchAnalysisTeamsStats,
    val participants: List<MatchAnalysisTeamsParticipants>
)