package emailState

import shared.runDetector

fun isValidEmail(input: String): Boolean {
    return runDetector(input, FirstValueState()) {
        println("Final state: ${it::class.simpleName}")
        it is ValidState
    }
}
