package com.twisted.dto.match_loading.dto

data class MatchLoadingSummonerStatus(
    val summoner: String,
    val loading: Boolean,
    val totalMatches: Int,
    val totalLoaded: Int,
    val percentageLoaded: Float
)
