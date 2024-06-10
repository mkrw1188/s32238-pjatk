package karwacki.querylang.tests

import karwacki.querylang.expressions.concat
import org.junit.Assert
import org.junit.Test

class ConcatTest {
    @Test
    fun `test concatenation of int sequence`() {
        val result = sequenceOf(1, 2).concat(sequenceOf(3, 4, 5, 6)).toList()

        Assert.assertEquals(result, listOf(1, 2, 3, 4, 5, 6))
    }

    @Test
    fun `test concatenation of string sequence`() {
        val result = sequenceOf("Mary", "Martha").concat(sequenceOf("Philip", "John")).toList()

        Assert.assertEquals(result, listOf("Mary", "Martha", "Philip", "John"))
    }

    @Test
    fun `test concatenation of list and sequence`() {
        val result = listOf(1, 2, 3).concat(sequenceOf(4, 5, 6)).toList()

        Assert.assertEquals(listOf(1, 2, 3, 4, 5, 6), result)
    }

    @Test
    fun `test concatenation with empty first list`() {
        val result = emptyList<Int>().concat(listOf(1, 2, 3)).toList()

        Assert.assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun `test concatenation with empty second list`() {
        val result = listOf(1, 2, 3).concat(emptyList<Int>()).toList()

        Assert.assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun `test concatenation of list and array`() {
        val result = listOf(1, 2, 3).concat(arrayOf(4, 5, 6)).toList()

        Assert.assertEquals(listOf(1, 2, 3, 4, 5, 6), result)
    }

    @Test
    fun `test concatenation of map entries and map`() {
        val mapEntries = mapOf(1 to "one", 2 to "two").entries
        val map = mapOf(3 to "three", 4 to "four")

        val result = mapEntries.concat(map).toList()

        Assert.assertEquals(listOf(1 to "one", 2 to "two", 3 to "three", 4 to "four"), result)
    }

    @Test
    fun `test concatenation of array and sequence`() {
        val array = arrayOf(1, 2, 3)
        val sequence = sequenceOf(4, 5, 6)

        val result = array.concat(sequence).toList()

        Assert.assertEquals(listOf(1, 2, 3, 4, 5, 6), result)
    }

    @Test
    fun `test concatenation with empty array of entries`() {
        val emptyArray = arrayOf<Map.Entry<Int, String>>()
        val map = mapOf(1 to "one", 2 to "two")

        val result = emptyArray.concat(map).toList()

        Assert.assertEquals(listOf(1 to "one", 2 to "two"), result)
    }
}