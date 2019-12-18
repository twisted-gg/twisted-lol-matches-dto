package com.twisted.dto.match.participant.events

data class MatchParticipantEventsItem(
    val type: String,
    val timestamp: Long,
    val itemId: Int
)
