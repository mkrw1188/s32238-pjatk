package karwacki.querylang.expressions


fun <T, TKey> Sequence<T>.toDictionary(keySelector: (T) -> TKey): Map<TKey, T> =
    toDictionary(keySelector, { it -> it })

fun <T, TKey> Iterable<T>.toDictionary(keySelector: (T) -> TKey): Map<TKey, T> =
    toDictionary(keySelector, { it -> it })

fun <T, TKey> Array<T>.toDictionary(keySelector: (T) -> TKey): Map<TKey, T> =
    toDictionary(keySelector, { it -> it })

fun <TK, TV, TKey> Map<TK, TV>.toDictionary(keySelector: (Map.Entry<TK, TV>) -> TKey): Map<TKey, Map.Entry<TK, TV>> =
    toDictionary(keySelector, { it -> it })

fun <T, TKey, TVal> Iterable<T>.toDictionary(keySelector: (T) -> TKey, elementSelector: (T) -> TVal): Map<TKey, TVal> =
    asSequence().toDictionary(keySelector, elementSelector)

fun <T, TKey, TVal> Array<T>.toDictionary(keySelector: (T) -> TKey, elementSelector: (T) -> TVal): Map<TKey, TVal> =
    asSequence().toDictionary(keySelector, elementSelector)

fun <TK, TV, TKey, TVal> Map<TK, TV>.toDictionary(keySelector: (Map.Entry<TK, TV>) -> TKey, elementSelector: (Map.Entry<TK, TV>) -> TVal): Map<TKey, TVal> =
    asSequence().toDictionary(keySelector, elementSelector)


fun <T, TKey, TVal> Sequence<T>.toDictionary(keySelector: (T) -> TKey, elementSelector: (T) -> TVal): Map<TKey, TVal> {
    val list = toList()
    val result = list.associateBy(keySelector, elementSelector)

    require(result.keys.size == list.size) { "duplicate key" }

    return result
}