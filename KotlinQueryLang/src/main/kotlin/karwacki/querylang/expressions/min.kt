package karwacki.querylang.expressions

fun Sequence<Byte>.min(): Byte {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Sequence<Short>.min(): Short {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Sequence<Int>.min(): Int {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Sequence<Long>.min(): Long {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Sequence<Float>.min(): Float {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Sequence<Double>.min(): Double {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Iterable<Byte>.min(): Byte {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Iterable<Short>.min(): Short {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Iterable<Int>.min(): Int {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Iterable<Long>.min(): Long {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Iterable<Float>.min(): Float {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Iterable<Double>.min(): Double {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Array<Byte>.min(): Byte {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Array<Short>.min(): Short {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Array<Int>.min(): Int {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Array<Long>.min(): Long {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun Array<Float>.min(): Float {
    require(any()) { "empty." }
    return Calculator.min(this)
}


fun Array<Double>.min(): Double {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun ByteArray.min(): Byte {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun ShortArray.min(): Short {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun IntArray.min(): Int {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun LongArray.min(): Long {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun FloatArray.min(): Float {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun DoubleArray.min(): Double {
    require(any()) { "empty." }
    return Calculator.min(this)
}

fun <T : Comparable<T>> Sequence<T>.min(): T {
    require(any()) { "empty" }
    return Calculator.min(this)
}

fun <T : Comparable<T>> Iterable<T>.min(): T {
    require(any()) { "empty" }
    return Calculator.min(this)
}

fun <T : Comparable<T>> Array<T>.min(): T {
    require(any()) { "empty" }
    return Calculator.min(this)
}