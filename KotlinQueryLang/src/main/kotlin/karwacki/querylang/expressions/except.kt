package karwacki.querylang.expressions

fun <T> Sequence<T>.except(other: Sequence<T>): Sequence<T> =
    distinct().minus(other)

fun <T> Sequence<T>.except(other: Iterable<T>): Sequence<T> =
    distinct().minus(other)

fun <T> Sequence<T>.except(other: Array<T>): Sequence<T> =
    distinct().minus(other)

fun <TK, TV> Sequence<Map.Entry<TK, TV>>.except(other: Map<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    distinct().minus(other.asSequence())

fun <T> Iterable<T>.except(other: Sequence<T>): Sequence<T> =
    asSequence().except(other)

fun <T> Iterable<T>.except(other: Iterable<T>): Sequence<T> =
    asSequence().except(other)

fun <T> Iterable<T>.except(other: Array<T>): Sequence<T> =
    asSequence().except(other)

fun <TK, TV> Iterable<Map.Entry<TK, TV>>.except(other: Map<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    asSequence().except(other)

fun <T> Array<T>.except(other: Sequence<T>): Sequence<T> =
    asSequence().except(other)

fun <T> Array<T>.except(other: Iterable<T>): Sequence<T> =
    asSequence().except(other)

fun <T> Array<T>.except(other: Array<T>): Sequence<T> =
    asSequence().plus(other).distinct()

fun <TK, TV> Array<Map.Entry<TK, TV>>.except(other: Map<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    asSequence().except(other)

fun <TK, TV> Map<TK, TV>.except(other: Sequence<Map.Entry<TK, TV>>): Sequence<Map.Entry<TK, TV>> =
    asSequence().except(other)

fun <TK, TV> Map<TK, TV>.except(other: Iterable<Map.Entry<TK, TV>>): Sequence<Map.Entry<TK, TV>> =
    asSequence().except(other)

fun <TK, TV> Map<TK, TV>.except(other: Array<Map.Entry<TK, TV>>): Sequence<Map.Entry<TK, TV>> =
    asSequence().except(other)

fun <TK, TV> Map<TK, TV>.except(other: Map<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    asSequence().except(other)