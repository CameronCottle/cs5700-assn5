package emailState

import binaryState.ValidState
import shared.InvalidState
import shared.State

class FirstValueState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            "1" -> ValidState()
            else -> InvalidState()
        }
}