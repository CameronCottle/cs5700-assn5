package passwordState

import shared.runDetector

fun isValidPassword(input: String): Boolean {
    if (input.length < 8) return false
    return runDetector(input, BuildingState()) { it is ValidState }
}
