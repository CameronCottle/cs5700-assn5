package binaryState

import shared.State

fun isValidBinaryNumber(number: String): Boolean {
    var state: State = FirstValueState()
    for (letter in number) {
        state = state.consumeLetter(letter.toString())
    }
    return state is ValidState
}

