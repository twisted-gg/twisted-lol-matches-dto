package com.twisted.dto.team_analysis.participant_build

data class ParticipantBuildTeams(
    val teamId: Int,
    val participants: List<ParticipantBuildTeamsParticipant>
)