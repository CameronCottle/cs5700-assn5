package floatingPointState

import shared.State

fun isValidFloatingPointNumber(number: String): Boolean {
        var state: State = FirstValueState()
        for (letter in number) {
            state = state.consumeLetter(letter.toString())
        }
        return state is ValidState
    }

