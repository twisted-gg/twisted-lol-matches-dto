package com.twisted.dto.match.participant.events

data class MatchParticipantEventsWard(
    val type: String,
    val timestamp: Long,
    val wardType: String
)
