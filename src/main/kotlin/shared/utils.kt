package shared

var DIGITS = "0123456789"
var NON_ZERO_DIGITS = "123456789"

var EMAIL_CHARACTERS = (
        "abcdefghijklmnopqrstuvwxyz" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "0123456789" +
                "!#$%&'*+/=?^_`{|}~.-,:;<>()[]"
        )
var EMAIL_CHARACTERS_NO_PERIOD = (
        "abcdefghijklmnopqrstuvwxyz" +
                "0123456789" +
                "!#$%&'*+/=?^_`{|}~-,:;<>()[]"
        )

var PASSWORD_CHARACTERS = (
        "abcdefghijklmnopqrstuvwxyz" +
                "0123456789"
        )

var PASSWORD_CHARACTERS_UPPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

var PASSWORD_SPECIAL_CHARACTERS = "!@;#\$%&*"

var ALL_PASSWORD_CHARACTERS = (
        "abcdefghijklmnopqrstuvwxyz" +
                "0123456789" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        )