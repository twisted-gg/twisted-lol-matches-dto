package com.twisted.dto.mmr

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class MMRToLeagueDocument(
    val tier: String,
    val rank: String? = null,
    val points: Int? = null
)
