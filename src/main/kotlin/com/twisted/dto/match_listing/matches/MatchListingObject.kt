package com.twisted.dto.match_listing.matches

import com.twisted.dto.match_listing.matches.teams.MatchListingTeamObject

data class MatchListingObject(
    val game_id: String,
    val victory: Boolean,
    val duration: Long,
    val creation: Long,
    val summoner: MatchListingSummonerObject,
    val teams: List<MatchListingTeamObject>
)