package integerState

import shared.State

class ValidState: State {
    override fun consumeLetter(letter: String) =
        when(letter) {
            in "0123456789" -> this
            else -> InvalidState()
        }
}