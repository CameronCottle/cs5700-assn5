package integerState

import State

class FirstValueState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in "0123456789" -> integerState.ValidState()
            else -> integerState.InvalidState()
    }
}