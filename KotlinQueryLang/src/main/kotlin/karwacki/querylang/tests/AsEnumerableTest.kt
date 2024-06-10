package karwacki.querylang.tests

import karwacki.querylang.expressions.asEnumerable
import org.junit.Assert
import org.junit.Test

class AsEnumerableTest {

    @Test
    fun testEnumInt() {
        val result: List<Any> = sequenceOf(1, 2, 3, 4, 5).asEnumerable<Any>().toList()
        Assert.assertEquals(result, listOf<Any>(1, 2, 3,4, 5))
    }

    @Test
    fun testEnumString() {
        val result: List<Any> = sequenceOf("One", "Two", "Three", "Four", "Five").asEnumerable<Any>().toList()
        Assert.assertEquals(result, listOf<Any>("One", "Two", "Three", "Four", "Five"))
    }
}