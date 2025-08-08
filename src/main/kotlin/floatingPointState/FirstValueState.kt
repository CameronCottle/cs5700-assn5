package floatingPointState

import shared.State
import shared.InvalidState

class FirstValueState: State {
    override fun consumeLetter(letter: String) =
        when (letter) {
            "0" -> ZeroDigitState()
            in "123456789" -> HasDigitState()
            "." -> HasPeriodState()
            else -> InvalidState()
    }
}