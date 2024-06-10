package karwacki.querylang.tests

import org.junit.Assert
import org.junit.Test

class ToListTest {

    @Test
    fun testToList() {
        val result = sequenceOf(1, 2, 3, 4, 5).toList()
        Assert.assertEquals(result, listOf(1, 2, 3, 4, 5));
    }
}