package com.twisted.dto.match_listing.matches.summoner

import com.twisted.dto.match.participant.items.MatchParticipantItems
import com.twisted.dto.match.participant.perks.MatchParticipantPerks
import com.twisted.dto.match.participant.spells.MatchParticipantSpells
import com.twisted.dto.match.participant.stats.MatchParticipantKDA

data class MatchListingSummonerObject(
    val champion: Int,
    val kda: MatchParticipantKDA,
    val items: MatchParticipantItems,
    val stats: MatchListingSummonerStats,
    val spells: MatchParticipantSpells,
    val perks: MatchParticipantPerks,
    val team: Int
)
