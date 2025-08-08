package floatingPointState

class HasPeriodState: State {
    override fun consumeLetter(letter: String) =
            when(letter){
                in "0123456789" -> ValidState()
                else -> InvalidState()
            }
}