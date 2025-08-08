package integerState

import shared.State

fun isValidInteger(number: String): Boolean {
        var state: State = FirstValueState()
        for (letter in number) {
            state = state.consumeLetter(letter.toString())
        }
        return state is ValidState
    }

