package shared

class InvalidState: State {
    override fun consumeLetter(letter: String): State {
        return this
    }
}