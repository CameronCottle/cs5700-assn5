package passwordState

import shared.ALL_PASSWORD_CHARACTERS
import shared.InvalidState
import shared.State

class ValidLastCharacter: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in ALL_PASSWORD_CHARACTERS -> ValidState()
            else -> InvalidState()
        }
}