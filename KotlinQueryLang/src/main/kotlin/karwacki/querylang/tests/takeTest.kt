package karwacki.querylang.tests

import org.junit.Assert
import org.junit.Test

class takeTest {

    @Test
    fun `test take on non-empty iterable with count less than size`() {
        val list = listOf(1, 2, 3, 4, 5)

        val result = list.take(3).toList()

        Assert.assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun `test take with count greater than size of iterable`() {
        val list = listOf(1, 2, 3)

        val result = list.take(5).toList()

        Assert.assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun `test take with count zero`() {
        val list = listOf(1, 2, 3, 4, 5)

        val result = list.take(0).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test take on empty iterable`() {
        val list = emptyList<Int>()

        val result = list.take(3).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }
}