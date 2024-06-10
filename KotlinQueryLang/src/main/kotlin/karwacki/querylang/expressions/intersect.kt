package karwacki.querylang.expressions


fun <T> Sequence<T>.intersect(part: Sequence<T>): Sequence<T> =
    Sequence {
        val set = part.toMutableSet()
        filter { set.remove(it) }.iterator()
    }

fun <T> Sequence<T>.intersect(part: Iterable<T>): Sequence<T> =
    intersect(part.asSequence())

fun <T> Sequence<T>.intersect(part: Array<T>): Sequence<T> =
    intersect(part.asSequence())

fun <TK, TV> Sequence<Map.Entry<TK, TV>>.intersect(part: Map<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    intersect(part.asSequence())

fun <T> Iterable<T>.intersect(part: Sequence<T>): Sequence<T> =
    asSequence().intersect(part)

fun <T> Iterable<T>.intersect(part: Iterable<T>): Sequence<T> =
    asSequence().intersect(part)

fun <T> Iterable<T>.intersect(part: Array<T>): Sequence<T> =
    asSequence().intersect(part)

fun <TK, TV> Iterable<Map.Entry<TK, TV>>.intersect(part: Map<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    asSequence().intersect(part)

fun <T> Array<T>.intersect(part: Sequence<T>): Sequence<T> =
    asSequence().intersect(part)

fun <T> Array<T>.intersect(part: Iterable<T>): Sequence<T> =
    asSequence().intersect(part)

fun <T> Array<T>.intersect(part: Array<T>): Sequence<T> =
    asSequence().intersect(part)

fun <TK, TV> Array<Map.Entry<TK, TV>>.intersect(part: Map<TK, TV>): Sequence<Map.Entry<TK, TV>> =
    asSequence().intersect(part)