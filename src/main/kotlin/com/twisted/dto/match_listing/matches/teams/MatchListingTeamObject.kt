package com.twisted.dto.match_listing.matches.teams

data class MatchListingTeamObject(
    val teamId: Int,
    val participants: MutableList<MatchListingTeamParticipant>
)