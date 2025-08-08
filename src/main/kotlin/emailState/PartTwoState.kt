package emailState

import shared.EMAIL_CHARACTERS_NO_PERIOD
import shared.InvalidState
import shared.State

class PartTwoState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in EMAIL_CHARACTERS_NO_PERIOD -> PartTwoState()
            "." -> HasPeriodState()
            else -> InvalidState()
        }
}