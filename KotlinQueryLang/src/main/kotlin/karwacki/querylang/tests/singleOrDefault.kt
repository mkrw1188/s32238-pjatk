package karwacki.querylang.tests

import karwacki.querylang.expressions.singleOrDefault
import org.junit.Assert
import org.junit.Test
import java.util.*

class SingleOrDefault {
    @Test
    fun `get single`() {
        val result = sequenceOf(1).singleOrDefault()
        Assert.assertEquals(result, 1)
    }

    @Test
    fun `empty get null`() {
        val result = emptySequence<Int>().singleOrDefault()
        Assert.assertEquals(result, null)
    }

    @Test
    fun `get above range`() {
        val result = sequenceOf(-1, 0, 1).singleOrDefault { it > 0 }
        Assert.assertEquals(result, 1)
    }
    @Test
    fun `get above range none`() {
        val result = sequenceOf(-1, 0, 1).singleOrDefault { it > 1 }
        Assert.assertEquals(result, null)
    }

    @Test
    fun `get above range on empty`() {
        val result = emptySequence<Int>().singleOrDefault { it > 1 }
        Assert.assertEquals(result, null)
    }
}