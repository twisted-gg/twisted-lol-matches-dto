package com.twisted.dto.match.participant.events

data class MatchParticipantEventsWard(
    val type: Int,
    val timestamp: Long,
    val wardType: Int
)
