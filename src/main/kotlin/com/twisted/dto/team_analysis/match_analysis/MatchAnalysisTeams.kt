package com.twisted.dto.team_analysis.match_analysis

data class MatchAnalysisTeams(
    val teamId: Int,
    val stats: MatchAnalysisTeamsStats,
    val participants: MutableList<MatchAnalysisTeamsParticipants>
)