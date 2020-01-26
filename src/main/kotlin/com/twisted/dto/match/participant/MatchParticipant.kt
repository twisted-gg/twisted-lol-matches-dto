package com.twisted.dto.match.participant

import com.twisted.dto.match.participant.events.MatchParticipantEvents
import com.twisted.dto.match.participant.frames.MatchParticipantFrames
import com.twisted.dto.match.participant.stats.MatchParticipantKDA
import com.twisted.dto.match.participant.stats.MatchParticipantStats
import org.bson.types.ObjectId

data class MatchParticipant(
    val summoner: ObjectId,
    val championId: Int,
    val teamId: Int,
    val lane: Int,
    val role: Int,
    val spells: List<Int>,
    val kda: MatchParticipantKDA,
    val stats: MatchParticipantStats,
    val items: List<Int>,
    val perks: List<Int>,
    val perkPrimaryStyle: Int,
    val perkSubStyle: Int,
    val frames: List<MatchParticipantFrames>,
    val events: MatchParticipantEvents
)
