package karwacki.querylang.tests

import karwacki.querylang.expressions.distinct
import org.junit.Assert
import org.junit.Test

class DistinctTest {

    @Test
    fun `test distinct removes duplicates`() {
        val list = listOf(1, 2, 2, 3, 4, 4, 5)

        val result = list.distinct().toList()

        Assert.assertEquals(listOf(1, 2, 3, 4, 5), result)
    }

    @Test
    fun `test distinct with no duplicates`() {
        val list = listOf(1, 2, 3, 4, 5)

        val result = list.distinct().toList()

        Assert.assertEquals(listOf(1, 2, 3, 4, 5), result)
    }

    @Test
    fun `test distinct on empty list`() {
        val emptyList = emptyList<Int>()

        val result = emptyList.distinct().toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test distinct with null values`() {
        val list = listOf(null, null, null, 1, 1)

        val result = list.distinct().toList()

        Assert.assertEquals(listOf(null, 1), result)
    }
}