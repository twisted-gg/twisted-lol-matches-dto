package com.twisted.dto.match.participant

import org.bson.types.ObjectId

data class MatchParticipantSummoner(
    val _id: ObjectId,
    val name: String,
    val level: Int
)