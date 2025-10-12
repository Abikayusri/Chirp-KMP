package abika.sinau.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform