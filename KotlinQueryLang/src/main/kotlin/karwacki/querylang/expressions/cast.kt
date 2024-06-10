package karwacki.querylang.expressions

inline fun <reified R> Sequence<*>.cast(): Sequence<R> = Sequence {
    map {
        require(it is R) { "CAST FAILED" }
        it as R
    }.iterator()
}

inline fun <reified R> Iterable<*>.cast(): Sequence<R>
        = asSequence().cast<R>()

inline fun <reified R> Array<*>.cast(): Sequence<R>
        = asSequence().cast<R>()

inline fun <reified R> Map<*, *>.cast(): Sequence<R>
        = asSequence().cast<R>()