package karwacki.querylang.tests

import karwacki.querylang.expressions.where
import org.junit.Assert
import org.junit.Test


class WhereIndexedTest {
    @Test
    fun testSequence() {
        val sequence = sequenceOf(1, 2, 3, 4, 5);
        val result = sequence.where { it < 5 }.toList()
        Assert.assertEquals(result, listOf(1, 2, 3, 4,));
    }

    @Test
    fun testIterable() {
        val iterable = setOf(1, 2, 3, 4, 5);
        val result = iterable.where { it < 5 }.toList()
        Assert.assertEquals(result, listOf(1, 2, 3, 4,));
    }

    @Test
    fun testArray() {
        val array = arrayOf(1, 2, 3, 4, 5);
        val result = array.where { it < 5 }.toList()
        Assert.assertEquals(result, listOf(1, 2, 3, 4));
    }

    @Test
    fun testList() {
        val list = listOf(1, 2, 3, 4, 5);
        val result = list.where { it < 5 }.toList()
        Assert.assertEquals(result, listOf(1, 2, 3, 4));
    }
}
