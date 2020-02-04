package com.twisted.dto.team_graph

data class TeamGraphParticipant(
    val championId: Int,
    // Income
    val goldEarned: Int,
    val goldSpent: Int,
    // Damage dealt to champions
    val totalDamageDealtToChampions: Long,
    val physicalDamageDealtToChampions: Long,
    val magicDamageDealtToChampions: Long,
    val trueDamageDealtToChampions: Long,
    // Total damage dealt
    val physicalDamageDealt: Long,
    val magicDamageDealt: Long,
    val trueDamageDealt: Long,
    val damageDealtToTurrets: Long,
    val damageDealtToObjectives: Long,
    // Damage taken and healed
    val totalHeal: Long,
    val totalDamageTaken: Long,
    val physicalDamageTaken: Long,
    val magicalDamageTaken: Long,
    val trueDamageTaken: Long,
    val damageSelfMitigated: Long,
    // Vision
    val visionScore: Long,
    val wardsPlaced: Int,
    val wardsKilled: Int,
    val visionWardsBoughtInGame: Int,
    // Kills
    val inhibitorKills: Int,
    val killingSprees: Int,
    val doubleKills: Int,
    val tripleKills: Int,
    val quadraKills: Int,
    val pentaKills: Int
)