package integerState

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class IntegerStateTest {

    @Test fun testSingleDigit() {
        assertTrue(isValidInteger("1"))
    }

    @Test fun testMultiDigit() {
        assertTrue(isValidInteger("123"))
    }

    @Test fun testVeryLargeInteger() {
        assertTrue(isValidInteger("3452342352434534524346"))
    }

    @Test fun testEmptyString() {
        assertFalse(isValidInteger(""))
    }

    @Test fun testStartsWithZero() {
        assertFalse(isValidInteger("0123"))
    }

    @Test fun testContainsNonDigit() {
        assertFalse(isValidInteger("132a"))
    }

    @Test fun testOnlyZero() {
        assertFalse(isValidInteger("0"))
    }

    @Test fun testSymbols() {
        assertFalse(isValidInteger("123$"))
    }

    @Test fun testWhitespace() {
        assertFalse(isValidInteger("123 "))
    }
}
