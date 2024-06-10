package karwacki.querylang.expressions

fun <T> Iterable<T>.distinct(): Sequence<T> =
    asSequence().distinct()

fun <TK, TV> Map<TK, TV>.distinct(): Sequence<Map.Entry<TK, TV>> =
    asSequence().distinct()

fun <T> Array<T>.distinct(): Sequence<T> =
    asSequence().distinct()