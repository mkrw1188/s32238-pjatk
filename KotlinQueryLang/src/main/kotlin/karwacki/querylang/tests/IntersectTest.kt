package karwacki.querylang.tests

import karwacki.querylang.expressions.intersect
import org.junit.Assert
import org.junit.Test

class IntersectTest {

    @Test
    fun `test intersect with non-empty sequences`() {
        val seq1 = sequenceOf(1, 2, 3, 4)
        val seq2 = sequenceOf(3, 4, 5, 6)

        val result = seq1.intersect(seq2).toList()

        Assert.assertEquals(listOf(3, 4), result)
    }

    @Test
    fun `test intersect with empty first sequence`() {
        val seq1 = sequenceOf<Int>()
        val seq2 = sequenceOf(1, 2, 3)

        val result = seq1.intersect(seq2).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test intersect with empty second sequence`() {
        val seq1 = sequenceOf(1, 2, 3)
        val seq2 = sequenceOf<Int>()

        val result = seq1.intersect(seq2).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test intersect with no common elements`() {
        val seq1 = sequenceOf(1, 2, 3)
        val seq2 = sequenceOf(4, 5, 6)

        val result = seq1.intersect(seq2).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test intersect with identical sequences`() {
        val seq1 = sequenceOf(1, 2, 3)
        val seq2 = sequenceOf(1, 2, 3)

        val result = seq1.intersect(seq2).toList()

        Assert.assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun `test intersect with non-empty sequences and iterable`() {
        val seq1 = sequenceOf(1, 2, 3, 4)
        val list2 = listOf(3, 4, 5, 6)

        val result = seq1.intersect(list2).toList()

        Assert.assertEquals(listOf(3, 4), result)
    }

    @Test
    fun `test intersect with empty sequence and non-empty iterable`() {
        val seq1 = sequenceOf<Int>()
        val list2 = listOf(1, 2, 3)

        val result = seq1.intersect(list2).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test intersect with non-empty sequence and empty iterable`() {
        val seq1 = sequenceOf(1, 2, 3)
        val list2 = listOf<Int>()

        val result = seq1.intersect(list2).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test intersect with identical elements in sequence and iterable`() {
        val seq1 = sequenceOf(1, 2, 3)
        val list2 = listOf(1, 2, 3)

        val result = seq1.intersect(list2).toList()

        Assert.assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun `test intersect with non-empty iterable and sequence`() {
        val list1 = listOf(1, 2, 3, 4)
        val seq2 = sequenceOf(3, 4, 5, 6)

        val result = list1.intersect(seq2).toList()

        Assert.assertEquals(listOf(3, 4), result)
    }

    @Test
    fun `test intersect with empty iterable and non-empty sequence`() {
        val list1 = listOf<Int>()
        val seq2 = sequenceOf(1, 2, 3)

        val result = list1.intersect(seq2).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test intersect with non-empty iterable and empty sequence`() {
        val list1 = listOf(1, 2, 3)
        val seq2 = sequenceOf<Int>()

        val result = list1.intersect(seq2).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test intersect with identical elements in iterable and sequence`() {
        val list1 = listOf(1, 2, 3)
        val seq2 = sequenceOf(1, 2, 3)

        val result = list1.intersect(seq2).toList()

        Assert.assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun `test intersect with non-empty iterables`() {
        val list1 = listOf(1, 2, 3, 4)
        val list2 = listOf(3, 4, 5, 6)

        val result = list1.intersect(list2).toList()

        Assert.assertEquals(listOf(3, 4), result)
    }

    @Test
    fun `test intersect with first iterable empty`() {
        val list1 = listOf<Int>()
        val list2 = listOf(1, 2, 3)

        val result = list1.intersect(list2).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test intersect with second iterable empty`() {
        val list1 = listOf(1, 2, 3)
        val list2 = listOf<Int>()

        val result = list1.intersect(list2).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test intersect with identical iterables`() {
        val list1 = listOf(1, 2, 3)
        val list2 = listOf(1, 2, 3)

        val result = list1.intersect(list2).toList()

        Assert.assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun `test intersect with non-empty iterable and array`() {
        val list1 = listOf(1, 2, 3, 4)
        val array2 = arrayOf(3, 4, 5, 6)

        val result = list1.intersect(array2).toList()

        Assert.assertEquals(listOf(3, 4), result)
    }

    @Test
    fun `test intersect with empty iterable and non-empty array`() {
        val list1 = listOf<Int>()
        val array2 = arrayOf(1, 2, 3)

        val result = list1.intersect(array2).toList()

        Assert.assertEquals(result.isEmpty(), true)
    }

    @Test
    fun `test intersect with identical elements in iterable and array`() {
        val list1 = listOf(1, 2, 3)
        val array2 = arrayOf(1, 2, 3)

        val result = list1.intersect(array2).toList()

        Assert.assertEquals(listOf(1, 2, 3), result)
    }
}