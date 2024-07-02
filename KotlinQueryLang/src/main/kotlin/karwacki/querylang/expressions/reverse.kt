package karwacki.querylang.expressions

fun <T> Sequence<T>.reverse(): Sequence<T> =
    Sequence { toList().reversed().iterator() }

fun <T> Iterable<T>.reverse(): Sequence<T> =
    asSequence().reverse()

fun <T> Array<T>.reverse(): Sequence<T> =
    asSequence().reverse()

fun <TK, TV> Map<TK, TV>.reverse(): Sequence<Map.Entry<TK, TV>> =
    asSequence().reverse()