package karwacki.querylang.tests
import karwacki.querylang.expressions.contains
import org.junit.Assert
import org.junit.Test

class ContainsTest {
    @Test
    fun `test sequence contains the value`() {
        val sequence = sequenceOf(1, 2, 3, 4, 5)

        val result = sequence.contains(3)

        Assert.assertEquals(result, true)
    }

    @Test
    fun `test sequence does not contain the value`() {
        val sequence = sequenceOf(1, 2, 3, 4, 5)

        val result = sequence.contains(6)

        Assert.assertEquals(result, false)
    }

    @Test
    fun `test contains with empty sequence`() {
        val emptySequence = emptySequence<Int>()

        val result = emptySequence.contains(1)

        Assert.assertEquals(result, false)
    }

    @Test
    fun `test contains with null values in the sequence`() {
        val sequence = sequenceOf(null, null, null)

        val result = sequence.contains(null)

        Assert.assertEquals(result, false)
    }
}