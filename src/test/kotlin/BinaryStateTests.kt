package binaryState

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class BinaryStateTest {

    @Test fun testSingleOne() {
        assertTrue(isValidBinaryNumber("1"))
    }

    @Test fun testSimpleBinary() {
        assertTrue(isValidBinaryNumber("101"))
    }

    @Test fun testAllOnes() {
        assertTrue(isValidBinaryNumber("111111"))
    }

    @Test fun testComplexValidBinary() {
        assertTrue(isValidBinaryNumber("10011010001"))
    }

    // ❌ Invalid binary numbers
    @Test fun testStartsWithZero() {
        assertFalse(isValidBinaryNumber("01"))
    }

    @Test fun testEndsWithZero() {
        assertFalse(isValidBinaryNumber("10"))
    }

    @Test fun testEndsWithZeroComplex() {
        assertFalse(isValidBinaryNumber("1000010"))
    }

    @Test fun testContainsInvalidChar() {
        assertFalse(isValidBinaryNumber("100a01"))
    }

    @Test fun testEmptyString() {
        assertFalse(isValidBinaryNumber(""))
    }

    @Test fun testOnlyZero() {
        assertFalse(isValidBinaryNumber("0"))
    }

    @Test fun testZeroInMiddleIsOkay() {
        assertTrue(isValidBinaryNumber("10101"))
    }

    @Test fun testSpaceCharacter() {
        assertFalse(isValidBinaryNumber("1 1"))
    }
}
