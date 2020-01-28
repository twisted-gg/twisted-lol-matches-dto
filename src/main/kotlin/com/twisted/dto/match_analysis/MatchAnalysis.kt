package com.twisted.dto.match_analysis

import com.twisted.dto.match_analysis.teams.MatchAnalysisTeams

data class MatchAnalysis(
    val teams: List<MatchAnalysisTeams>
)