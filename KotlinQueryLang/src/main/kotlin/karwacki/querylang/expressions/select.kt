package karwacki.querylang.expressions

fun <T, TResult> Sequence<T>.select(selector: (T) -> TResult): Sequence<TResult> =
    map(selector)

fun <T, TResult> Iterable<T>.select(selector: (T) -> TResult): Sequence<TResult> =
    asSequence().select(selector)

fun <TK, TV, TResult> Map<TK, TV>.select(selector: (Map.Entry<TK, TV>) -> TResult): Sequence<TResult> =
    asSequence().select(selector)

fun <T, TResult> Array<T>.select(selector: (T) -> TResult): Sequence<TResult> =
    asSequence().select(selector)