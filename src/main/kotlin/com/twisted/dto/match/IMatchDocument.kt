package com.twisted.dto.match

import com.twisted.dto.league.MatchLeagueDocument
import com.twisted.dto.match.participant.MatchParticipant
import com.twisted.dto.match.team.MatchTeam

interface IMatchDocument {
    val region: String
    val game_id: Long
    val match_break: Boolean
    val creation: Long
    val mode: Int
    val type: Int
    val version: String
    val map_id: Int
    val queue: Int
    val season: Int
    val remake: Boolean
    val duration: Long
    val teams: List<MatchTeam>
    val participants: List<MatchParticipant>
    val league: MatchLeagueDocument
    val framesInterval: Long
    val createdAt: Long
    val updatedAt: Long
}

