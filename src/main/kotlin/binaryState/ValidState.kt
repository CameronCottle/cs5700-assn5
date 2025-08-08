package binaryState

import shared.InvalidState
import shared.State

class ValidState: State {
    override fun consumeLetter(letter: String) =
        when(letter) {
            "1" -> this
            "0" -> MiddleValues()
            else -> InvalidState()
        }
}