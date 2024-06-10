package karwacki.querylang.expressions

fun <T> Sequence<T>.where(predicate: (T) -> Boolean): Sequence<T> =
    filter(predicate)

fun <T> Iterable<T>.where(predicate: (T) -> Boolean): Sequence<T> =
    asSequence().filter(predicate)

fun <T> Array<T>.where(predicate: (T) -> Boolean): Sequence<T> =
    asSequence().filter(predicate)

fun <T> List<T>.where(predicate: (T) -> Boolean): Sequence<T> =
    asSequence().filter(predicate)