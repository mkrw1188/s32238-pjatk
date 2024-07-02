package karwacki.querylang.expressions

inline fun <reified T> Sequence<*>.ofType(): Sequence<T>
        = filterIsInstance<T>()

inline fun <reified T> Iterable<*>.ofType(): Sequence<T>
        = asSequence().ofType<T>()

inline fun <reified T> Array<*>.ofType(): Sequence<T>
        = asSequence().ofType<T>()

inline fun <reified T> Map<*, *>.ofType(): Sequence<T>
        = asSequence().ofType<T>()