package com.twisted.dto.match_participant_frames

data class MatchParticipantFramesParticipant(
    val championId: Int,
    val frames: List<MatchParticipantFramesParticipantFrames>
)