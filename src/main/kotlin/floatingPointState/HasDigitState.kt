package floatingPointState

import shared.State
import shared.InvalidState

class HasDigitState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in "0123456789" -> this
            "." -> HasPeriodState()
            else -> InvalidState()
        }
}