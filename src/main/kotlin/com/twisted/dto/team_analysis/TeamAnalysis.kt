package com.twisted.dto.team_analysis

import com.twisted.dto.team_analysis.match_analysis.MatchAnalysis
import com.twisted.dto.team_analysis.team_frames.TeamFrames

data class TeamAnalysis(
    val teamWinner: Int,
    val matchAnalysis: MatchAnalysis,
    val teamFrames: TeamFrames
)