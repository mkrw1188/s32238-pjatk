package karwacki.querylang.expressions

fun <T> Sequence<T>.whereIndexed(predicate: (T, Int) -> Boolean): Sequence<T> =
    filterIndexed { i, t -> predicate(t, i) }

fun <T> Iterable<T>.whereWithIndex(predicate: (T, Int) -> Boolean): Sequence<T> =
    asSequence().whereIndexed(predicate)

fun <T> Array<T>.whereIndexed(predicate: (T, Int) -> Boolean): Sequence<T> =
    asSequence().whereIndexed(predicate)

fun <T> List<T>.whereIndexed(predicate: (T, Int) -> Boolean): Sequence<T> =
    asSequence().whereIndexed(predicate)