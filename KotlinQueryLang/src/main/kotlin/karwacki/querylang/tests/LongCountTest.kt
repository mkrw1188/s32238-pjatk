package karwacki.querylang.tests
import karwacki.querylang.expressions.longCount
import org.junit.Assert
import org.junit.Test
class LongCountTest {

    @Test
    fun test() {
        val result = sequenceOf(1, 2, 3, 4, 5).longCount()
        Assert.assertEquals(result, 5);
    }
}