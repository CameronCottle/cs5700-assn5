package passwordState

import shared.runDetector

fun isValidPassword(input: String): Boolean {
    return runDetector(input, BuildingState()) { it is ValidState }
}
