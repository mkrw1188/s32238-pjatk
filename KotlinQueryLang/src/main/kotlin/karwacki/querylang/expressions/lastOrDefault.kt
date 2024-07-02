package karwacki.querylang.expressions

fun <T> Sequence<T>.lastOrDefault(): T? =
    lastOrNull()

fun <T> Iterable<T>.lastOrDefault(): T? =
    asSequence().lastOrDefault()

fun <TK, TV> Map<TK, TV>.lastOrDefault(): Map.Entry<TK, TV>? =
    asSequence().lastOrDefault()

fun <T> Array<T>.lastOrDefault(): T? =
    asSequence().lastOrDefault()

inline fun <T> Sequence<T>.lastOrDefault(predicate: (T) -> Boolean): T? =
    lastOrNull(predicate)

inline fun <T> Iterable<T>.lastOrDefault(predicate: (T) -> Boolean): T? =
    asSequence().lastOrDefault(predicate)

inline fun <TK, TV> Map<TK, TV>.lastOrDefault(predicate: (Map.Entry<TK, TV>) -> Boolean): Map.Entry<TK, TV>? =
    asSequence().lastOrDefault(predicate)

inline fun <T> Array<T>.lastOrDefault(predicate: (T) -> Boolean): T? =
    asSequence().lastOrDefault(predicate)