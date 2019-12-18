package com.twisted.dto.match_loading

import org.bson.types.ObjectId

interface IMatchLoadingDocument {
    val summoner: ObjectId
    val region: String
    val matches: List<MatchLoadingMatches>
    val loading: Boolean
}
