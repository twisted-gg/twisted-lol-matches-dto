package com.twisted.dto.match.participant.events

import com.twisted.dto.match.participant.frames.MatchParticipantFramesPosition
import org.bson.types.ObjectId

data class MatchParticipantEventsChampionKill(
    val timestamp: Long,
    val position: MatchParticipantFramesPosition,
    val target: ObjectId,
    val assistingIds: List<ObjectId>
)
