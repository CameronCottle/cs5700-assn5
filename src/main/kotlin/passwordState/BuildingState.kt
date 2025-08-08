package passwordState

import shared.InvalidState
import shared.PASSWORD_CHARACTERS
import shared.PASSWORD_CHARACTERS_UPPPERCASE
import shared.PASSWORD_SPECIAL_CHARACTERS
import shared.State

class BuildingState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in PASSWORD_CHARACTERS -> this
            in PASSWORD_CHARACTERS_UPPPERCASE -> HasCapitalState()
            in PASSWORD_SPECIAL_CHARACTERS -> HasSpecialState()
            else -> InvalidState()
        }
}