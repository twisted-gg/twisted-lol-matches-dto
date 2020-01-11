package com.twisted.dto.match_listing.matches

import com.twisted.dto.match.participant.items.MatchParticipantItems
import com.twisted.dto.match.participant.spells.MatchParticipantSpells
import com.twisted.dto.match.participant.stats.MatchParticipantKDA
import com.twisted.dto.match.participant.stats.MatchParticipantStats

data class MatchListingSummonerObject(
    val duration: Long,
    val champion: Int,
    val kda: MatchParticipantKDA,
    val items: MatchParticipantItems,
    val stats: MatchParticipantStats,
    val spells: MatchParticipantSpells,
    val team: Int
)
