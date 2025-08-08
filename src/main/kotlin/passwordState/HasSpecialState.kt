package passwordState

import shared.InvalidState
import shared.PASSWORD_CHARACTERS
import shared.PASSWORD_CHARACTERS_UPPPERCASE
import shared.PASSWORD_SPECIAL_CHARACTERS
import shared.State

class HasSpecialState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in PASSWORD_CHARACTERS -> this
            in PASSWORD_SPECIAL_CHARACTERS -> this
            in PASSWORD_CHARACTERS_UPPPERCASE -> ValidState()
            else -> InvalidState()
        }
}