package com.twisted.dto.match_listing.matches

import com.twisted.dto.match_listing.matches.summoner.MatchListingSummonerObject
import com.twisted.dto.match_listing.matches.teams.MatchListingTeamObject

data class MatchListingObject(
    val game_id: String,
    val queue: String,
    val mode: String,
    val season: String,
    val remake: Boolean,
    val type: String,
    val map: String,
    val win: Boolean,
    val duration: Long,
    val creation: Long,
    val summoner: MatchListingSummonerObject,
    val teams: List<MatchListingTeamObject>
)