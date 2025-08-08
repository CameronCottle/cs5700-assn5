package binaryState

import shared.State
import shared.InvalidState

class FirstValueState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            "1" -> ValidState()
            else -> InvalidState()
        }
}