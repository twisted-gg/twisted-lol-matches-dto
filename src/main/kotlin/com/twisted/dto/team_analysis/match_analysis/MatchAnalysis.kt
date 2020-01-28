package com.twisted.dto.team_analysis.match_analysis

import com.twisted.dto.team_analysis.match_analysis.teams.MatchAnalysisTeams

data class MatchAnalysis(
    val teams: List<MatchAnalysisTeams>
)