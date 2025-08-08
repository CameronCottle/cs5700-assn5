package integerState

import shared.DIGITS
import shared.State
import shared.InvalidState

class ValidState: State {
    override fun consumeLetter(letter: String) =
        when(letter) {
            in DIGITS -> this
            else -> InvalidState()
        }
}