package karwacki.querylang.tests

import karwacki.querylang.expressions.except
import org.junit.Assert
import org.junit.Test

class ExceptTest {
    @Test
    fun test() {
        Assert.assertEquals(
            sequenceOf(1, 2, 3, 4).except(sequenceOf(1, 2, 3, 4)).toList(),
            listOf<Int>()
        )

        Assert.assertEquals(
            sequenceOf(1, 2, 3, 4, 5, 3).except(sequenceOf(4, 6, 7)).toList(),
            listOf(1, 2, 3, 5)
        )

        Assert.assertEquals(
            sequenceOf(1, 1, 2, 3, 2, 4, 3).except(sequenceOf(4, 6, 7, 7, 5, 3, 1)).toList(),
            listOf(2)
        )

        Assert.assertEquals(
            sequenceOf(1, 2, 3, 4).except(sequenceOf()).toList(),
            listOf(1, 2, 3, 4)
        )

        Assert.assertEquals(
            emptySequence<Int>().except(sequenceOf(1, 2)).toList(),
            emptyList<Int>()
        )

        Assert.assertEquals(
            emptySequence<Int>().except(sequenceOf()).toList(),
            emptyList<Int>()
        )
    }
}