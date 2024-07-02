package karwacki.querylang.expressions

fun <T> Sequence<T>.defaultIfEmpty(defaultValue: T): Sequence<T> {
    return Sequence {
        if (any()) {
            this.iterator()
        } else {
            sequenceOf(defaultValue).iterator()
        }
    }
}

fun <T> Array<T>.defaultIfEmpty(defaultValue: T): Sequence<T> =
    asSequence().defaultIfEmpty(defaultValue)

fun <T> Iterable<T>.defaultIfEmpty(defaultValue: T): Sequence<T> =
    asSequence().defaultIfEmpty(defaultValue)

fun <TK, TV> Map<TK, TV>.defaultIfEmpty(defaultValue: Map.Entry<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    asSequence().defaultIfEmpty(defaultValue)

fun <T> Sequence<T?>.defaultIfEmpty(): Sequence<T?> {
    return Sequence {
        if (any()) {
            this.iterator()
        } else {
            sequenceOf(null).iterator()
        }
    }
}

fun <T> Array<T?>.defaultIfEmpty(): Sequence<T?> =
    asSequence().defaultIfEmpty()

fun <T> Iterable<T?>.defaultIfEmpty(): Sequence<T?> =
    asSequence().defaultIfEmpty()

fun <TK, TV> Map<TK, TV>.defaultIfEmpty(): Sequence<Map.Entry<TK, TV>?> =
    asSequence().defaultIfEmpty()