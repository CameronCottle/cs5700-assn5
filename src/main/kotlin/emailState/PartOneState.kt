package emailState

import shared.EMAIL_PART_ONE_CHARACTERS
import shared.InvalidState
import shared.State

class PartOneState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in EMAIL_PART_ONE_CHARACTERS -> PartOneState()
            "@" -> HasAtState()
            else -> InvalidState()
        }
}