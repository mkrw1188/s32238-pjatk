package karwacki.querylang.tests

import org.junit.Assert
import org.junit.Test

class MaxTest {

    @Test
    fun `int sequence`() {
        val result = sequenceOf(1, 2, 3, 4, 5).max()
        Assert.assertTrue(result == 5)
    }

    @Test
    fun `double sequence`() {
        val result = sequenceOf(1.0, 2.0, 3.0, 4.0, 5.0).max()
        Assert.assertTrue(result == 5.0)
    }
}