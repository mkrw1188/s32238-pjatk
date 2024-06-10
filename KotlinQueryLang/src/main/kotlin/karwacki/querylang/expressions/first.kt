package karwacki.querylang.expressions

fun <TK, TV> Map<TK, TV>.first() =
    asSequence().first()

inline fun <TK, TV> Map<TK, TV>.first(predicate: (Map.Entry<TK, TV>) -> Boolean) =
    asSequence().first(predicate)