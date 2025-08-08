package integerState

import shared.State
import shared.InvalidState

class ValidState: State {
    override fun consumeLetter(letter: String) =
        when(letter) {
            in "0123456789" -> this
            else -> InvalidState()
        }
}