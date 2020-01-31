package com.twisted.dto.team_analysis

import com.twisted.dto.team_analysis.match_analysis.MatchAnalysisTeams
import com.twisted.dto.team_analysis.participant_build.ParticipantBuildTeams
import com.twisted.dto.team_analysis.team_frames.TeamFramesTeam

data class TeamAnalysis(
    val framesInterval: Long,
    val teamWinner: Int,
    val matchAnalysis: List<MatchAnalysisTeams>,
    val teamFrames: List<TeamFramesTeam>,
    val participantsBuild: List<ParticipantBuildTeams>
)