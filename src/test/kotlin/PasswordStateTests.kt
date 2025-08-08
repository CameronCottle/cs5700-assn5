package passwordState

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class PasswordStateTest {

    @Test fun testSimpleValidPassword() {
        assertTrue(isValidPassword("aaaaH!aa"))
    }

    @Test fun testLongValidPassword() {
        assertTrue(isValidPassword("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))
    }

    @Test fun testSpecialCharInMiddle() {
        assertTrue(isValidPassword("1234567*9J"))
    }

    @Test fun testMultipleCapitalsAndSpecials() {
        assertTrue(isValidPassword("H!A@a1a2b3c4d5E"))
    }

    @Test fun testTooShort() {
        assertFalse(isValidPassword("aA!"))
    }

    @Test fun testNoCapitalLetter() {
        assertFalse(isValidPassword("aaaaaaa!"))
    }

    @Test fun testNoSpecialCharacter() {
        assertFalse(isValidPassword("aaaHaaaaa"))
    }

    @Test fun testEndsWithSpecialCharacter() {
        assertFalse(isValidPassword("Abbbbbbb!"))
    }

    @Test fun testNoCapitalOrSpecial() {
        assertFalse(isValidPassword("abcdefgh"))
    }

    @Test fun testContainsSpace() {
        assertFalse(isValidPassword("aaaaH!a a"))
    }

    @Test fun testOnlyCapital() {
        assertFalse(isValidPassword("AAAAAAAA"))
    }

    @Test fun testOnlySpecialsAndDigits() {
        assertFalse(isValidPassword("1234!@#$"))
    }

    @Test fun testCapitalAndSpecialButEndsWithSpecial() {
        assertFalse(isValidPassword("Aaaaaaa!"))
    }
}
