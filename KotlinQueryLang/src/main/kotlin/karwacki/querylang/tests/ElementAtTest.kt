package karwacki.querylang.tests

import org.junit.Assert
import org.junit.Test

class ElementAtTest {

    @Test
    fun `first index`() {
        val result = sequenceOf(1, 2, 3).elementAt(0)
        Assert.assertEquals(result, 1)
    }

    fun `last element`() {
        val result = sequenceOf(1, 2, 3).elementAt(2)
        Assert.assertEquals(result, 3)
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun `index out of bounds`() {
        emptySequence<Int>().elementAt(0)
    }
}