package playground

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Hello"), Person("World", 100))

    val youngestPerson = persons.minBy(fun(it: Person): Int {
        return it.age ?: 0
    })
    // Shortcut / idiom
    val oldestPerson = persons.maxBy { it.age ?: 0 }

    println("The oldest person: $oldestPerson")
    println("The youngest person: $youngestPerson")
}