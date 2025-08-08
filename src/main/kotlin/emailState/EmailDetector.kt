package emailState

import shared.runDetector

fun isValidEmail(input: String): Boolean {
    return runDetector(input, FirstValueState()) { it is ValidState }
}
