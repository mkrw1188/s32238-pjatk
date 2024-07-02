package karwacki.querylang.expressions

fun <T> Sequence<T>.firstOrDefault(): T? =
    firstOrNull()

fun <T> Iterable<T>.firstOrDefault(): T? =
    asSequence().firstOrDefault()

fun <TK, TV> Map<TK, TV>.firstOrDefault(): Map.Entry<TK, TV>? =
    asSequence().firstOrDefault()

fun <T> Array<T>.firstOrDefault(): T? =
    asSequence().firstOrDefault()

inline fun <T> Sequence<T>.firstOrDefault(predicate: (T) -> Boolean): T? =
    firstOrNull(predicate)

inline fun <T> Iterable<T>.firstOrDefault(predicate: (T) -> Boolean): T? =
    asSequence().firstOrDefault(predicate)

inline fun <TK, TV> Map<TK, TV>.firstOrDefault(predicate: (Map.Entry<TK, TV>) -> Boolean): Map.Entry<TK, TV>? =
    asSequence().firstOrDefault(predicate)

inline fun <T> Array<T>.firstOrDefault(predicate: (T) -> Boolean): T? =
    asSequence().firstOrDefault(predicate)