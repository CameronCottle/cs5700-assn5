package floatingPointState

import kotlin.text.iterator

fun isValidFloatingPointNumber(number: String): Boolean {
        var state: State = FirstValueState()
        for (letter in number) {
            state = state.consumeLetter(letter.toString())
        }
        return state is ValidState
    }

