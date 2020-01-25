package com.twisted.enum

import com.twisted.dto.errors.InvalidEnum

fun getMapGeyFromValue(map: Map<Int, String>, value: String): Int {
    val keys = map.filterValues { it == value }.keys
    if (keys.count() == 0) {
        throw InvalidEnum(value)
    }
    return keys.first()
}

fun getMapGeyFromValue(map: Map<Int, String>, value: String, default: Int) = try {
    getMapGeyFromValue(map, value)
} catch (e: Exception) {
    default
}