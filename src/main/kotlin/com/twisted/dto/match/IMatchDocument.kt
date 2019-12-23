package com.twisted.dto.match

import com.twisted.dto.match.participant.MatchParticipant
import com.twisted.dto.match.team.MatchTeam
import org.bson.types.ObjectId

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
    val participantsIds: List<ObjectId>
    val participants: List<MatchParticipant>
    val framesInterval: Long
    val createdAt: Long
    val updatedAt: Long
}

