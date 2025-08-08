package shared

interface State {
    fun consumeLetter(letter: String): State
}