package karwacki.querylang.expressions

fun <T> Iterable<T>.take(count: Int): Sequence<T> =
    asSequence().take(count)

fun <TK, TV> Map<TK, TV>.take(count: Int): Sequence<Map.Entry<TK, TV>> =
    asSequence().take(count)

fun <T> Array<T>.take(count: Int): Sequence<T> =
    asSequence().take(count)