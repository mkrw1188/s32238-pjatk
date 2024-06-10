package karwacki.querylang.expressions

fun <T> Sequence<T>.concat(part: Sequence<T>) =
    plus(part)

fun <T> Sequence<T>.concat(part: Iterable<T>) =
    plus(part.asSequence())

fun <T> Sequence<T>.concat(part: Array<T>) =
    plus(part.asSequence())

fun <TK, TV> Sequence<Map.Entry<TK, TV>>.concat(part: Map<TK, TV>) =
    plus(part.asSequence())

fun <T> Iterable<T>.concat(part: Sequence<T>) =
    asSequence().concat(part)

fun <T> Iterable<T>.concat(part: Iterable<T>) =
    asSequence().concat(part)

fun <T> Iterable<T>.concat(part: Array<T>) =
    asSequence().concat(part)

fun <TK, TV> Iterable<Map.Entry<TK, TV>>.concat(part: Map<TK, TV>) =
    asSequence().concat(part)

fun <T> Array<T>.concat(part: Sequence<T>) =
    asSequence().concat(part)

fun <TK, TV> Array<Map.Entry<TK, TV>>.concat(part: Map<TK, TV>) =
    asSequence().concat(part)