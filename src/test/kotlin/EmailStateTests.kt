package emailState

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class EmailStateTests {

    // ✅ Valid emails
    @Test fun testMinimalValidEmail() {
        assertTrue(isValidEmail("a@b.c"))
    }

    @Test fun testSimpleValidEmail() {
        assertTrue(isValidEmail("cameron.cottle@usu.edu"))
    }

    @Test fun testDotBeforeAt() {
        assertTrue(isValidEmail(".@b.c"))
    }

    @Test fun testValidSpecialChars() {
        assertTrue(isValidEmail("{}*$.&$*(@*$%&.*&*"))
    }

    // ❌ Invalid emails
    @Test fun testMissingPart1() {
        assertFalse(isValidEmail("@b.c"))
    }

    @Test fun testMultipleAts() {
        assertFalse(isValidEmail("a@b@c.com"))
    }

    @Test fun testMultipleDotsAfterAt() {
        assertFalse(isValidEmail("a.b@b.b.c"))
    }

    @Test fun testContainsSpace() {
        assertFalse(isValidEmail("cameron cottle@usu.edu"))
    }

    @Test fun testMissingDot() {
        assertFalse(isValidEmail("cameron@usu"))
    }

    @Test fun testMissingPart3() {
        assertFalse(isValidEmail("cameron@usu."))
    }

    @Test fun testEmptyString() {
        assertFalse(isValidEmail(""))
    }

    @Test fun testJustAtAndDot() {
        assertFalse(isValidEmail("@."))
    }
}
