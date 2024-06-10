package karwacki.querylang.expressions

fun <T> Sequence<T>.asEnumerable(): Sequence<T> = asSequence()

fun <T> Array<T>.asEnumerable(): Sequence<T> = asSequence().asEnumerable()

fun <T> Iterable<T>.asEnumerable(): Sequence<T> = asSequence().asEnumerable()

fun <TK, TV> Map<TK, TV>.asEnumerable(): Sequence<Map.Entry<TK, TV>> = asSequence().asEnumerable()