package karwacki.querylang.expressions

inline fun <reified T> Sequence<T>.toArray(): Array<T> =
    toList().toTypedArray()

inline fun <reified T> Iterable<T>.toArray(): Array<T> =
    asSequence().toArray()

inline fun <reified T> Array<T>.toArray(): Array<T> =
    asSequence().toArray()

inline fun <reified TK, reified TV> Map<TK, TV>.toArray(): Array<Map.Entry<TK, TV>> =
    asSequence().toArray()