package karwacki.querylang.tests

import karwacki.querylang.expressions.select
import org.junit.Assert
import org.junit.Test

class SelectTest {

    @Test
    fun test() {
        val result = sequenceOf(1, 2, 3, 4).select { it * it }.toList()
        Assert.assertEquals(result, listOf(1, 4, 9, 16));
    }
}