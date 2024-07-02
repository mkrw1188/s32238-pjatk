package karwacki.querylang.expressions

fun <T> Sequence<T>.elementAtOrDefault(index: Int): T? =
    elementAtOrNull(index)

fun <T> Iterable<T>.elementAtOrDefault(index: Int): T? =
    asSequence().elementAtOrDefault(index)

fun <TK, TV> Map<TK, TV>.elementAtOrDefault(index: Int): Map.Entry<TK, TV>? =
    asSequence().elementAtOrDefault(index)

fun <T> Array<T>.elementAtOrDefault(index: Int): T? =
    asSequence().elementAtOrDefault(index)