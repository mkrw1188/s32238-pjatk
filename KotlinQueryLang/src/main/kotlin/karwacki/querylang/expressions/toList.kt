package karwacki.querylang.expressions

fun <TK, TV> Map<TK, TV>.toList(): List<Map.Entry<TK, TV>> =
    asSequence().toList()