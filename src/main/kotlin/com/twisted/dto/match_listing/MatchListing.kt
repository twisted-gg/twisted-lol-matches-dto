package com.twisted.dto.match_listing

import com.twisted.dto.match_listing.matches.MatchListingObject

data class MatchListing(
    val page: Int,
    val limit: Int,
    val total: Int,
    val matches: List<MatchListingObject>
)