package floatingPointState

import shared.DIGITS
import shared.State
import shared.InvalidState

class HasPeriodState: State {
    override fun consumeLetter(letter: String) =
            when(letter){
                in DIGITS -> ValidState()
                else -> InvalidState()
            }
}