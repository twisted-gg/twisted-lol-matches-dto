package com.twisted.dto.match_participant_frames

data class MatchParticipantFrames(
    val teamId: Int,
    val framesInterval: Long,
    val participants: List<MatchParticipantFramesParticipant>
)