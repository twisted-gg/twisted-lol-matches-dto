package com.twisted.dto.match.participant

import com.twisted.dto.match.participant.events.MatchParticipantEvents
import com.twisted.dto.match.participant.frames.MatchParticipantFrames
import com.twisted.dto.match.participant.items.MatchParticipantItems
import com.twisted.dto.match.participant.perks.MatchParticipantPerks
import com.twisted.dto.match.participant.stats.MatchParticipantKDA
import com.twisted.dto.match.participant.stats.MatchParticipantStats
import com.twisted.dto.match.participant.timeline.MatchParticipantTimeline

data class MatchParticipant(
    val summoner: MatchParticipantSummoner,
    val championId: Int,
    val spell1Id: Int,
    val spell2Id: Int,
    val teamId: Int,
    val kda: MatchParticipantKDA,
    val stats: MatchParticipantStats,
    val timeline: MatchParticipantTimeline,
    val items: MatchParticipantItems,
    val perks: MatchParticipantPerks,
    val frames: List<MatchParticipantFrames>,
    val events: MatchParticipantEvents
)
