package floatingPointState

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class FloatingPointStateTest {

    @Test fun testSimpleFloat() {
        assertTrue(isValidFloatingPointNumber("1.0"))
    }

    @Test fun testLargeFloat() {
        assertTrue(isValidFloatingPointNumber("12349871234.12340981234098"))
    }

    @Test fun testFloatWithLeadingZero() {
        assertTrue(isValidFloatingPointNumber("0.20000"))
    }

    @Test fun testFloatStartingWithDot() {
        assertTrue(isValidFloatingPointNumber(".123"))
    }

    @Test fun testAnotherValidFloat() {
        assertTrue(isValidFloatingPointNumber("123.34"))
    }

    @Test fun testNoDecimal() {
        assertFalse(isValidFloatingPointNumber("123"))
    }

    @Test fun testTrailingPeriod() {
        assertFalse(isValidFloatingPointNumber("123."))
    }

    @Test fun testTooManyDots() {
        assertFalse(isValidFloatingPointNumber("123.123."))
    }

    @Test fun testWithLetter() {
        assertFalse(isValidFloatingPointNumber("123.02a"))
    }

    @Test fun testLeadingZeroNotFollowedByPeriod() {
        assertFalse(isValidFloatingPointNumber("012.4"))
    }

    @Test fun testEmptyString() {
        assertFalse(isValidFloatingPointNumber(""))
    }

    @Test fun testOnlyPeriod() {
        assertFalse(isValidFloatingPointNumber("."))
    }
}
