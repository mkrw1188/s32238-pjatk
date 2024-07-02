package karwacki.querylang.expressions


// for Sequence
fun <T, TResult> Sequence<T>.selectMany(selector: (T) -> Sequence<TResult>): Sequence<TResult> =
    flatMap(selector)

fun <T, TResult> Sequence<T>.selectMany(selector: (T, Int) -> Sequence<TResult>): Sequence<TResult> =
    withIndex().flatMap { selector(it.value, it.index) }

fun <T, TCollection, TResult> Sequence<T>.selectMany(
    collectionSelector: (T) -> Sequence<TCollection>,
    resultSelector: (T, TCollection) -> TResult): Sequence<TResult> =
    flatMap { source -> collectionSelector(source).map { collection -> resultSelector(source, collection) } }

fun <T, TCollection, TResult> Sequence<T>.selectMany(
    collectionSelector: (T, Int) -> Sequence<TCollection>,
    resultSelector: (T, TCollection) -> TResult): Sequence<TResult> =
    withIndex().flatMap { source -> collectionSelector(source.value, source.index).map { collection -> resultSelector(source.value, collection) } }

// for Iterable
fun <T, TResult> Iterable<T>.selectMany(selector: (T) -> Sequence<TResult>): Sequence<TResult> =
    asSequence().selectMany(selector)

fun <T, TResult> Iterable<T>.selectMany(selector: (T, Int) -> Sequence<TResult>): Sequence<TResult> =
    asSequence().selectMany(selector)

fun <T, TCollection, TResult> Iterable<T>.selectMany(
    collectionSelector: (T) -> Sequence<TCollection>,
    resultSelector: (T, TCollection) -> TResult): Sequence<TResult> =
    asSequence().selectMany(collectionSelector, resultSelector)

fun <T, TCollection, TResult> Iterable<T>.selectMany(
    collectionSelector: (T, Int) -> Sequence<TCollection>,
    resultSelector: (T, TCollection) -> TResult): Sequence<TResult> =
    asSequence().selectMany(collectionSelector, resultSelector)

// for Array
fun <T, TResult> Array<T>.selectMany(selector: (T) -> Sequence<TResult>): Sequence<TResult> =
    asSequence().selectMany(selector)

fun <T, TResult> Array<T>.selectMany(selector: (T, Int) -> Sequence<TResult>): Sequence<TResult> =
    asSequence().selectMany(selector)

fun <T, TCollection, TResult> Array<T>.selectMany(
    collectionSelector: (T) -> Sequence<TCollection>,
    resultSelector: (T, TCollection) -> TResult): Sequence<TResult> =
    asSequence().selectMany(collectionSelector, resultSelector)

fun <T, TCollection, TResult> Array<T>.selectMany(
    collectionSelector: (T, Int) -> Sequence<TCollection>,
    resultSelector: (T, TCollection) -> TResult): Sequence<TResult> =
    asSequence().selectMany(collectionSelector, resultSelector)

// for Array

fun <TKey, TValue, TResult> Map<TKey, TValue>.selectMany(selector: (Map.Entry<TKey, TValue>) -> Sequence<TResult>): Sequence<TResult> =
    asSequence().selectMany (selector)

fun <TKey, TValue, TResult> Map<TKey, TValue>.selectMany(selector: (Map.Entry<TKey, TValue>, Int) -> Sequence<TResult>): Sequence<TResult> =
    asSequence().selectMany(selector)

fun <TKey, TValue, TCollection, TResult> Map<TKey, TValue>.selectMany(
    collectionSelector: (Map.Entry<TKey, TValue>) -> Sequence<TCollection>,
    resultSelector: (Map.Entry<TKey, TValue>, TCollection) -> TResult): Sequence<TResult> =
    asSequence().selectMany(collectionSelector, resultSelector)

fun <TKey, TValue, TCollection, TResult> Map<TKey, TValue>.selectMany(
    collectionSelector: (Map.Entry<TKey, TValue>, Int) -> Sequence<TCollection>,
    resultSelector: (Map.Entry<TKey, TValue>, TCollection) -> TResult): Sequence<TResult> =
    asSequence().selectMany(collectionSelector, resultSelector)