package floatingPointState

import binaryState.FirstValueState
import binaryState.ValidState
import shared.runDetector

fun isValidFloatingPointNumber(input: String): Boolean {
    return runDetector(input, FirstValueState()) { it is ValidState }
}

