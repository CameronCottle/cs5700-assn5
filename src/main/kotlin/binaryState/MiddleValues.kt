package binaryState

import shared.State
import shared.InvalidState

class MiddleValues: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            "0" -> this
            "1" -> ValidState()
            else -> InvalidState()
        }
}