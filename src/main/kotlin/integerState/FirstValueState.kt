package integerState

import shared.State
import shared.InvalidState

class FirstValueState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in "0123456789" -> ValidState()
            else -> InvalidState()
    }
}