package shared

import shared.State

class InvalidState: State {
    override fun consumeLetter(letter: String): State {
        return this
    }
}