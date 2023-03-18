package com.example.crossplatformapps

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform