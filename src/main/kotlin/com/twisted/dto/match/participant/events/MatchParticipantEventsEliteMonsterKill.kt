package com.twisted.dto.match.participant.events

import com.twisted.dto.match.participant.frames.MatchParticipantFramesPosition

data class MatchParticipantEventsEliteMonsterKill(
    val timestamp: Long,
    val position: MatchParticipantFramesPosition,
    val type: Int,
    val subType: String?
)
