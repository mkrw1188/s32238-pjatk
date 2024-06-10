package karwacki.querylang.tests

import org.junit.Assert
import org.junit.Test
import karwacki.querylang.expressions.first
import org.junit.Assert.assertThrows

class FirstTest {

    @Test
    fun `test first on non-empty map`() {
        val map = mapOf(1 to "a", 2 to "b", 3 to "c")

        val result = map.first()

        Assert.assertEquals(1 to "a", result)
    }

    @Test
    fun `test first throws exception on empty map`() {
        val map = emptyMap<Int, String>()

        val exception = assertThrows(NoSuchElementException::class.java) {
            map.first()
        }

        Assert.assertEquals("Sequence is empty.", exception.message)
    }

    @Test
    fun `test first with predicate on non-empty map`() {
        val map = mapOf(1 to "one", 2 to "two", 3 to "three")

        val result = map.first { entry -> entry.key > 1 }

        Assert.assertEquals(2 to "two", result)
    }

    @Test
    fun `test first with predicate that no entry satisfies`() {
        val map = mapOf(1 to "one", 2 to "two", 3 to "three")

        val exception = assertThrows(NoSuchElementException::class.java) {
            map.first { entry -> entry.key > 5 }
        }

        Assert.assertEquals("Sequence contains no element matching the predicate.", exception.message)
    }
}