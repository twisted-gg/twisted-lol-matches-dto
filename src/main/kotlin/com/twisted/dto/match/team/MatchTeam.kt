package com.twisted.dto.match.team

data class MatchTeam(
    val teamId: Int,
    val win: Boolean,
    val stats: MatchTeamStats,
    val bans: List<MatchTeamBans>
)
