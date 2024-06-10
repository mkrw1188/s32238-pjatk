package karwacki.querylang.tests

import karwacki.querylang.expressions.toDictionary
import org.junit.Assert
import org.junit.Test


class ToDictionaryTest {

    data class Person(val id: Int, val name: String)

    val person1 = Person(id = 1, name = "Mateusz")
    val person2 = Person(id = 2, name = "Tomasz")
    val person3 = Person(id = 3, name = "Jan")
    val person4 = Person(id = 4, name = "Zdzislaw")
    val person5 = Person(id = 5, name = "Henryk")

    val persons = listOf(
        person1,
        person2,
        person3,
        person4,
        person5
    )

    @Test
    fun testDict1() {
        val result = sequenceOf(1, 2, 3, 4, 5).toDictionary { it }
        Assert.assertEquals(result, mapOf(1 to 1, 2 to 2, 3 to 3, 4 to 4, 5 to 5));
    }

    @Test
    fun testDict2() {
        val result = persons.toDictionary { it.id }
        val expected = mapOf(
            1 to person1,
            2 to person2,
            3 to person3,
            4 to person4,
            5 to person5
        )
        Assert.assertEquals(expected, result)
    }
}