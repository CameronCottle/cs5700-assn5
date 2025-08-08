package binaryState

import shared.runDetector

fun isValidBinaryNumber(input: String): Boolean {
    return runDetector(input, FirstValueState()) { it is ValidState }
}
