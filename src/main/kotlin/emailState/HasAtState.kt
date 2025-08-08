package emailState

import shared.EMAIL_PART_TWO_CHARACTERS
import shared.InvalidState
import shared.State

class HasAtState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in EMAIL_PART_TWO_CHARACTERS -> PartTwoState()
            else -> InvalidState()
        }
}