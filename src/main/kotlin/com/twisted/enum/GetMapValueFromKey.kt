package com.twisted.enum

import com.twisted.dto.errors.InvalidEnum

fun getMapValueFromKey(map: Map<Int, String>, key: Int) = map[key] ?: throw InvalidEnum(key.toString())

fun getMapValueFromKey(map: Map<Int, String>, key: Int, default: String) = try {
    getMapValueFromKey(map, key)
} catch (e: Exception) {
    default
}