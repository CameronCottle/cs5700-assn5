package integerState

import shared.runDetector

fun isValidInteger(input: String): Boolean {
    return runDetector(input, FirstValueState()) { it is ValidState }
}

