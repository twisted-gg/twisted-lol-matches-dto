package com.twisted.dto.match.participant.events

data class MatchParticipantEventsWard(
    val timestamp: Long,
    val type: Int,
    val wardType: Int
)
