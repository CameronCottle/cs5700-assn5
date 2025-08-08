package emailState

import shared.EMAIL_PART_ONE_CHARACTERS
import shared.InvalidState
import shared.State

class FirstValueState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in EMAIL_PART_ONE_CHARACTERS -> PartOneState()
            else -> InvalidState()
        }
}