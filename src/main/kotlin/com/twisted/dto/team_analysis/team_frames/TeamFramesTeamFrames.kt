package com.twisted.dto.team_analysis.team_frames

data class TeamFramesTeamFrames(
    val frame: Byte,
    var gold: Int,
    var xp: Int,
    var minions: Int
)

operator fun TeamFramesTeamFrames.plusAssign(o: TeamFramesTeamFrames) {
    this.gold += o.gold
    this.xp += o.xp
    this.minions += o.minions
}