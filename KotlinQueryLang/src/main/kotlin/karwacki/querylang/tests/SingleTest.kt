package karwacki.querylang.tests

import org.junit.Assert
import org.junit.Test
import java.util.*

class SingleTest {
    @Test
    fun `get one`() {
        val result = sequenceOf(1).single()
        Assert.assertEquals(result, 1)
    }

    @Test(expected = NoSuchElementException::class)
    fun `no such element`() {
        emptySequence<Int>().single()
    }

    @Test
    fun `get above range`() {
        val result = sequenceOf(-1, 0, 1).single { it > 0 }
        Assert.assertEquals(result, 1)
    }
}