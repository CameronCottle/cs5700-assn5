package floatingPointState

import shared.DIGITS
import shared.State
import shared.InvalidState

class HasDigitState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            in DIGITS -> this
            "." -> HasPeriodState()
            else -> InvalidState()
        }
}