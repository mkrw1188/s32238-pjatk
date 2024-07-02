package karwacki.querylang.expressions

inline fun <T> Sequence<T>.aggregate(func: (T, T) -> T): T
        = reduce(func)

inline fun <T, TAccumulate> Sequence<T>.aggregate(seed: TAccumulate, func: (TAccumulate, T) -> TAccumulate): TAccumulate
        = fold(seed, func)

inline fun <T, TAccumulate, TResult> Sequence<T>.aggregate(seed: TAccumulate, func: (TAccumulate, T) -> TAccumulate, resultSelector: (TAccumulate) -> TResult): TResult
        = resultSelector(fold(seed, func))

inline fun <T> Iterable<T>.aggregate(func: (T, T) -> T): T
        = asSequence().aggregate(func)

inline fun <T, TAccumulate> Iterable<T>.aggregate(seed: TAccumulate, func: (TAccumulate, T) -> TAccumulate): TAccumulate
        = asSequence().aggregate(seed, func)

inline fun <T, TAccumulate, TResult> Iterable<T>.aggregate(seed: TAccumulate, func: (TAccumulate, T) -> TAccumulate, resultSelector: (TAccumulate) -> TResult): TResult
        = asSequence().aggregate(seed, func, resultSelector)

inline fun <T> Array<T>.aggregate(func: (T, T) -> T): T
        = asSequence().aggregate(func)

inline fun <T, TAccumulate> Array<T>.aggregate(seed: TAccumulate, func: (TAccumulate, T) -> TAccumulate): TAccumulate
        = asSequence().aggregate(seed, func)

inline fun <T, TAccumulate, TResult> Array<T>.aggregate(seed: TAccumulate, func: (TAccumulate, T) -> TAccumulate, resultSelector: (TAccumulate) -> TResult): TResult
        = asSequence().aggregate(seed, func, resultSelector)

inline fun <TK, TV> Map<TK, TV>.aggregate(func: (Map.Entry<TK, TV>, Map.Entry<TK, TV>) -> Map.Entry<TK, TV>): Map.Entry<TK, TV>
        = asSequence().aggregate(func)

inline fun <TK, TV, TAccumulate> Map<TK, TV>.aggregate(seed: TAccumulate, func: (seed: TAccumulate, Map.Entry<TK, TV>) -> TAccumulate): TAccumulate
        = asSequence().aggregate(seed, func)

inline fun <TK, TV, TAccumulate, TResult> Map<TK, TV>.aggregate(seed: TAccumulate, func: (seed: TAccumulate, Map.Entry<TK, TV>) -> TAccumulate, resultSelector: (TAccumulate) -> TResult)
        = asSequence().aggregate(seed, func, resultSelector)