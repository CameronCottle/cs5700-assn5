package floatingPointState

import shared.State
import shared.InvalidState
import shared.NON_ZERO_DIGITS

class FirstValueState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            "0" -> ZeroDigitState()
            in NON_ZERO_DIGITS -> HasDigitState()
            "." -> HasPeriodState()
            else -> InvalidState()
    }
}