package karwacki.querylang.expressions
fun <T> Sequence<T>.singleOrDefault(): T? {
    val iterator = iterator()
    if (!iterator.hasNext()) {
        return null
    }
    val single = iterator.next()
    if (iterator.hasNext()) {
        throw IllegalArgumentException("Contains duplicates")
    }
    return single
}

fun <T> Iterable<T>.singleOrDefault(): T? =
    asSequence().singleOrDefault()

fun <TK, TV> Map<TK, TV>.singleOrDefault(): Map.Entry<TK, TV>? =
    asSequence().singleOrDefault()

fun <T> Array<T>.singleOrDefault(): T? =
    asSequence().singleOrDefault()

fun <T> Sequence<T>.singleOrDefault(predicate: (T) -> Boolean): T? =
    where(predicate).singleOrDefault()

fun <T> Iterable<T>.singleOrDefault(predicate: (T) -> Boolean): T? =
    asSequence().singleOrDefault(predicate)

fun <TK, TV> Map<TK, TV>.singleOrDefault(predicate: (Map.Entry<TK, TV>) -> Boolean): Map.Entry<TK, TV>? =
    asSequence().singleOrDefault(predicate)

fun <T> Array<T>.singleOrDefault(predicate: (T) -> Boolean): T? =
    asSequence().singleOrDefault(predicate)