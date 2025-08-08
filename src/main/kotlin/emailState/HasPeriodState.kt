package emailState

import shared.EMAIL_CHARACTERS_NO_PERIOD
import shared.InvalidState
import shared.State

class HasPeriodState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in EMAIL_CHARACTERS_NO_PERIOD -> ValidState()
            else -> InvalidState()
        }
}