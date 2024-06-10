package karwacki.querylang.expressions

fun <T> Sequence<T>.contains(value: T): Boolean =
    contains(element = value)

fun <T> Array<T>.contains(value: T): Boolean =
    asSequence().contains(value)

fun <T> Iterable<T>.contains(value: T): Boolean =
    asSequence().contains(value)

fun <TK, TV> Map<TK, TV>.contains(value: Map.Entry<TK, TV>): Boolean =
    asSequence().contains(value)