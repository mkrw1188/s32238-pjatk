package karwacki.querylang.expressions

fun <T, TSourceV> Map<T, TSourceV>.single(): Map.Entry<T, TSourceV> =
    asSequence().single()

inline fun <T, TSourceV> Map<T, TSourceV>.single(predicate: (Map.Entry<T, TSourceV>) -> Boolean): Map.Entry<T, TSourceV> =
    asSequence().single(predicate)