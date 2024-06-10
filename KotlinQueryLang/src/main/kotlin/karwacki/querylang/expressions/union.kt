package karwacki.querylang.expressions

fun <T> Sequence<T>.union(second: Sequence<T>): Sequence<T> =
    plus(second).distinct()

fun <T> Sequence<T>.union(second: Iterable<T>): Sequence<T> =
    plus(second).distinct()

fun <T> Sequence<T>.union(second: Array<T>): Sequence<T> =
    plus(second).distinct()

fun <TK, TV> Sequence<Map.Entry<TK, TV>>.union(second: Map<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    plus(second.asSequence()).distinct()

fun <T> Iterable<T>.union(second: Sequence<T>): Sequence<T> =
    asSequence().union(second)

fun <T> Iterable<T>.union(second: Iterable<T>): Sequence<T> =
    asSequence().union(second)

fun <T> Iterable<T>.union(second: Array<T>): Sequence<T> =
    asSequence().union(second)

fun <TK, TV> Iterable<Map.Entry<TK, TV>>.union(second: Map<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    asSequence().union(second)

fun <T> Array<T>.union(second: Sequence<T>): Sequence<T> =
    asSequence().union(second)

fun <T> Array<T>.union(second: Iterable<T>): Sequence<T> =
    asSequence().union(second)

fun <T> Array<T>.union(second: Array<T>): Sequence<T> =
    asSequence().union(second)

fun <TK, TV> Array<Map.Entry<TK, TV>>.union(second: Map<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    asSequence().union(second)