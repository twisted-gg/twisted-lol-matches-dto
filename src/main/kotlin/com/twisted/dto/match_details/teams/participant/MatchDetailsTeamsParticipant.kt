package com.twisted.dto.match_details.teams.participant

import com.twisted.dto.match.participant.stats.MatchParticipantKDA

data class MatchDetailsTeamsParticipant(
    val name: String,
    val champion: Int,
    val spells: List<Int>,
    val perks: List<Int>,
    val items: List<Int>,
    val kda: MatchParticipantKDA,
    val stats: MatchDetailsTeamsParticipantStats
)
