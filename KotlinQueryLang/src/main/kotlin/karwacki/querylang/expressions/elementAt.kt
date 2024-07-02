package karwacki.querylang.expressions

fun <TK, TV> Map<TK, TV>.elementAt(index: Int): Map.Entry<TK, TV> = asSequence().elementAt(index)