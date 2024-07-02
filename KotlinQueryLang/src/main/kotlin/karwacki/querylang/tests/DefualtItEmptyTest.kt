package karwacki.querylang.tests

import karwacki.querylang.expressions.defaultIfEmpty
import org.junit.Assert
import org.junit.Test

class DefaultIfEmptyTest {
    @Test
    fun `with list`() {
        val result = sequenceOf(1, 2, 3).defaultIfEmpty(0).toList()
        Assert.assertEquals(result, listOf(1, 2, 3))
    }

    @Test
    fun `no list`() {
        val result = emptySequence<Int>().defaultIfEmpty(0).toList()
        Assert.assertEquals(result, listOf(0))
    }

    @Test
    fun `non-empty sequence`() {
        val result = sequenceOf(1, 2, 3).defaultIfEmpty().toList()
        Assert.assertEquals(result, listOf(1, 2, 3))
    }

    @Test
    fun `nullable sequence`() {
        val result = emptySequence<Int?>().defaultIfEmpty().toList()
        Assert.assertEquals(result, listOf(null))
    }
}