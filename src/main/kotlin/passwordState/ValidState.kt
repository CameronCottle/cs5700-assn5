package passwordState

import shared.ALL_PASSWORD_CHARACTERS
import shared.InvalidState
import shared.PASSWORD_SPECIAL_CHARACTERS
import shared.State

class ValidState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in ALL_PASSWORD_CHARACTERS -> this
            in PASSWORD_SPECIAL_CHARACTERS -> ValidLastCharacter()
            else -> InvalidState()
        }
}