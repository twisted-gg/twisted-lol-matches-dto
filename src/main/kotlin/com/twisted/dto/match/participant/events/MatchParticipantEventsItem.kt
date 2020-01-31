package com.twisted.dto.match.participant.events

data class MatchParticipantEventsItem(
    val timestamp: Long,
    val type: Int,
    val itemId: Int
)
