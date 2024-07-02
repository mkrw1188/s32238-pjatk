package karwacki.querylang.expressions

fun <T> Sequence<T>.longCount(): Long =
    fold(0L, { num: Long, source: T -> num + 1L })

fun <T> Iterable<T>.longCount(): Long =
    asSequence().longCount()

fun <T> Array<T>.longCount(): Long =
    asSequence().longCount()

fun <TK, TV> Map<TK, TV>.longCount(): Long =
    asSequence().longCount()