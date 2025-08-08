package shared

val DIGITS = "0123456789"
val NON_ZERO_DIGITS = "123456789"

val EMAIL_CHARACTERS = (
        "abcdefghijklmnopqrstuvwxyz" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "0123456789" +
                "!#$%&'*+/=?^_`{|}~.-,:;<>()[]"
        )
val EMAIL_CHARACTERS_NO_PERIOD = (
        "abcdefghijklmnopqrstuvwxyz" +
                "0123456789" +
                "!#$%&'*+/=?^_`{|}~-,:;<>()[]"
        )

val PASSWORD_CHARACTERS = (
        "abcdefghijklmnopqrstuvwxyz" +
                "0123456789"
        )

val PASSWORD_CHARACTERS_UPPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

val PASSWORD_SPECIAL_CHARACTERS = "!@;#\$%&*"

val ALL_PASSWORD_CHARACTERS = (
        "abcdefghijklmnopqrstuvwxyz" +
                "0123456789" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        )