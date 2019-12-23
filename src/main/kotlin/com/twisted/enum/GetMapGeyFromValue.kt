package com.twisted.enum

fun GetMapGeyFromValue(map: Map<Int, String>, value: String): Int {
    val keys = map.filterValues { it == value }.keys
    if (keys.count() == 0) {
        throw Exception("Invalid enum value: $value")
    }
    return keys.first()
}