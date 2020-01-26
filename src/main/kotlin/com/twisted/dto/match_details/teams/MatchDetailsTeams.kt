package com.twisted.dto.match_details.teams

import com.twisted.dto.match_details.teams.participant.MatchDetailsTeamsParticipant

data class MatchDetailsTeams(
    val teamId: Int,
    val win: Boolean,
    val stats: MatchDetailsTeamsStats,
    val participants: List<MatchDetailsTeamsParticipant>
)