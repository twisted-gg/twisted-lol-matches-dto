package com.twisted.dto.match_details

import com.twisted.dto.match_details.teams.MatchDetailsTeams

data class MatchDetails(
    val duration: Long,
    val teams: List<MatchDetailsTeams>,
    val leagueAverage: MatchLeagueDetails
)