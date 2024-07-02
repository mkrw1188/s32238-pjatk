package karwacki.querylang.tests

import karwacki.querylang.expressions.lastOrDefault
import org.junit.Assert
import org.junit.Test

class LastOrDefaultTest {

    @Test
    fun test0() {
        val result = sequenceOf(1, 2, 3, 4).lastOrDefault()
        Assert.assertEquals(result, 4)
    }

    @Test
    fun test1() {
        val result = emptySequence<Int>().lastOrDefault()
        Assert.assertEquals(result, null)
    }

    @Test
    fun test2() {
        val result = sequenceOf(1, 2, 3, 4).lastOrDefault { it > 3 }
        Assert.assertEquals(result, 4);
    }

    @Test
    fun test3() {
        val result = sequenceOf(1, 2, 3, 4).lastOrDefault { it > 4 }
        Assert.assertEquals(result, null)
    }
}