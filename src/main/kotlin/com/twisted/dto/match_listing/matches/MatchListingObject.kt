package com.twisted.dto.match_listing.matches

import com.twisted.dto.match_listing.matches.summoner.MatchListingSummonerObject
import com.twisted.dto.match_listing.matches.teams.MatchListingTeamObject

data class MatchListingObject(
    val game_id: String,
    val queue: Int,
    val mode: Int,
    val season: Int,
    val remake: Boolean,
    val type: Int,
    val map_id: Int,
    val victory: Boolean,
    val duration: Long,
    val creation: Long,
    val summoner: MatchListingSummonerObject,
    val teams: List<MatchListingTeamObject>
)