package com.twisted.dto.match_listing.matches.summoner

import com.twisted.dto.match.participant.stats.MatchParticipantKDA

data class MatchListingSummonerObject(
    val champion: Int,
    val kda: MatchParticipantKDA,
    val items: List<Int>,
    val stats: MatchListingSummonerStats,
    val spells: List<Int>,
    val perks: List<Int>,
    val team: Int
)
