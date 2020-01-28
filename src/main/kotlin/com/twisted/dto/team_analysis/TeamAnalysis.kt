package com.twisted.dto.team_analysis

import com.twisted.dto.team_analysis.match_analysis.MatchAnalysis

data class TeamAnalysis(
    val winTeam: Int,
    val matchAnalysis: MatchAnalysis
)