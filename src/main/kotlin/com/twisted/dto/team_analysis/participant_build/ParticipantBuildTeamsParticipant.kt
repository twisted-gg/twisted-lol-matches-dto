package com.twisted.dto.team_analysis.participant_build


data class ParticipantBuildTeamsParticipant(
    val championId: Int,
    val build: Map<Int, List<ParticipantBuildTeamsParticipantBuild>>,
    val perks: List<Int>,
    val skills: List<Int>
)