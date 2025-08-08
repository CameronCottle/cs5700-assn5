package integerState

import binaryState.FirstValueState
import binaryState.ValidState
import shared.runDetector

fun isValidInteger(input: String): Boolean {
    return runDetector(input, FirstValueState()) { it is ValidState }
}

