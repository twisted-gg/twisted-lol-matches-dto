package com.twisted.dto.match_listing.matches

import com.twisted.dto.match_listing.matches.teams.MatchListingTeamObject

data class MatchListingObject(
    val victory: Boolean,
    val timestamp: Long,
    val summoner: MatchListingSummonerObject,
    val teams: MatchListingTeamObject
)