package com.twisted.dto.match_listing.matches.summoner

import com.twisted.dto.match.participant.stats.MatchParticipantKDA
import com.twisted.dto.match_details.teams.participant.MatchDetailsTeamsParticipantPerks

data class MatchListingSummonerObject(
    val champion: Int,
    val kda: MatchParticipantKDA,
    val items: List<Int>,
    val stats: MatchListingSummonerStats,
    val spells: List<Int>,
    val perks: MatchDetailsTeamsParticipantPerks,
    val team: Int
)
