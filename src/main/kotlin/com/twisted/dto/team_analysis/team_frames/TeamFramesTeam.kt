package com.twisted.dto.team_analysis.team_frames

data class TeamFramesTeam(
    val teamId: Int,
    var frames: MutableList<TeamFramesTeamFrames>
) {
    fun saveFrame(frame: TeamFramesTeamFrames) {
        val currentFrame = frames.find { f -> f.frame == frame.frame }
        // If exists, update
        if (currentFrame != null) {
            currentFrame += frame
            return
        }
        // Create new
        frames.add(frame)
    }
}
