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
        assertTrue(isValidEmail("joseph.ditton@usu.edu"))
    }

    @Test fun testValidSpecialChars() {
        assertTrue(isValidEmail("{}*$.&$*(@*$%&.*&*"))
    }

    // ❌ Invalid emails
    @Test fun testMissingPart1() {
        assertFalse(isValidEmail("@b.c"))  // part1 is empty
    }

    @Test fun testMultipleAts() {
        assertFalse(isValidEmail("a@b@c.com"))  // multiple @ symbols
    }

    @Test fun testMultipleDotsAfterAt() {
        assertFalse(isValidEmail("a.b@b.b.c"))  // multiple periods after @
    }

    @Test fun testContainsSpace() {
        assertFalse(isValidEmail("joseph ditton@usu.edu"))  // space not allowed
    }

    @Test fun testMissingDot() {
        assertFalse(isValidEmail("joseph@usu"))  // no period after @
    }

    @Test fun testMissingPart3() {
        assertFalse(isValidEmail("joseph@usu."))  // nothing after .
    }

    @Test fun testDotBeforeAt() {
        assertFalse(isValidEmail(".@b.c"))  // invalid part1
    }

    @Test fun testEmptyString() {
        assertFalse(isValidEmail(""))
    }

    @Test fun testJustAtAndDot() {
        assertFalse(isValidEmail("@."))  // missing all parts
    }
}
