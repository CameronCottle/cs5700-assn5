package shared

fun runDetector(
    input: String,
    start: State,
    isAccepting: (State) -> Boolean
): Boolean {
    var state = start
    for (char in input) {
        state = state.consumeLetter(char.toString())
    }
    return isAccepting(state)
}
