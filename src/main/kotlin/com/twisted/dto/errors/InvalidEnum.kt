package com.twisted.dto.errors

private const val MESSAGE = "Invalid enum value"

class InvalidEnum(enumValue: String) : RuntimeException("$MESSAGE: $enumValue")

