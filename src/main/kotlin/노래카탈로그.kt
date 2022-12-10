fun main() {
    val song1 = Song("my sea", "IU", 2020, 37_800_000)
    song1.explainSong()
    println(song1.popularity)
}

class Song(
    val title: String,
    val artist: String,
    val releasedYear: Int,
    val playCount: Int
) {

    val popularity : Boolean
        get() = playCount >= 1000

    fun explainSong() {
        println("[${title}], [${artist}], [${releasedYear}]")
    }
}