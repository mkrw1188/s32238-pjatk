package karwacki.querylang.tests

import karwacki.querylang.expressions.reverse
import org.junit.Assert
import org.junit.Test
import java.util.*


class ReverseTest {
    @Test
    fun `reverse sequence test`() {
        val result = sequenceOf(0, 1, 2, 3).reverse().toList()
        Assert.assertEquals(result, listOf(3, 2, 1, 0))
    }

    @Test
    fun `reverse empty list test`() {
        val result = emptySequence<Int>().reverse().toList()
        Assert.assertEquals(result, emptyList<Int>())
    }
}