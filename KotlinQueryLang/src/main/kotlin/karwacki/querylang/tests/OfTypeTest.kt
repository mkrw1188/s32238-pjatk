package karwacki.querylang.tests
import karwacki.querylang.expressions.ofType
import org.junit.Assert
import org.junit.Test

class OfTypeTest {

    @Test
    fun test() {
        val a1 = A()
        val a2 = A()
        val b1 = B()
        val b2 = B()

        Assert.assertEquals(
            sequenceOf(a1, a2).ofType<A>().toList(),
            listOf(a1, a2)
        )

        Assert.assertEquals(
            sequenceOf(a1, a2).ofType<B>().toList(),
            emptyList<B>()
        )

        Assert.assertEquals(
            sequenceOf(a1, b1).ofType<B>().toList(),
            listOf(b1)
        )

        Assert.assertEquals(
            sequenceOf(a1, b1).ofType<A>().toList(),
            listOf(a1)
        )

        Assert.assertEquals(
            sequenceOf(b1, b2).ofType<A>().toList(),
            emptyList<A>()
        )

        Assert.assertEquals(
            sequenceOf(b1, b2).ofType<B>().toList(),
            listOf(b1, b2)
        )
    }
}

class A {

}

class B {

}