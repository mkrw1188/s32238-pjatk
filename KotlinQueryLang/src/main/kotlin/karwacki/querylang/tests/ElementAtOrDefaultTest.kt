package karwacki.querylang.tests

import karwacki.querylang.expressions.elementAtOrDefault
import org.junit.Assert
import org.junit.Test

class ElementAtOrDefaultTest {
    @Test
    fun `first element`() {
        val result = sequenceOf(1, 2, 3).elementAtOrDefault(0)
        Assert.assertEquals(result, 1)
    }

    @Test
    fun `out of range default`() {
        val result = sequenceOf(1, 2, 3).elementAtOrDefault(3)
        Assert.assertEquals(result, null)
    }

    @Test
    fun `empty sequence default`() {
        val result =  emptySequence<Int>().elementAtOrDefault(0)
        Assert.assertEquals(result, null)
    }
}