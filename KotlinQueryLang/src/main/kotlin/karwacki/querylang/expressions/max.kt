package karwacki.querylang.expressions

fun Sequence<Byte>.max(): Byte {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Sequence<Short>.max(): Short {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Sequence<Int>.max(): Int {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Sequence<Long>.max(): Long {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Sequence<Float>.max(): Float {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Sequence<Double>.max(): Double {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Iterable<Byte>.max(): Byte {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Iterable<Short>.max(): Short {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Iterable<Int>.max(): Int {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Iterable<Long>.max(): Long {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Iterable<Float>.max(): Float {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Iterable<Double>.max(): Double {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Array<Byte>.max(): Byte {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Array<Short>.max(): Short {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Array<Int>.max(): Int {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Array<Long>.max(): Long {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Array<Float>.max(): Float {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun Array<Double>.max(): Double {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun ByteArray.max(): Byte {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun ShortArray.max(): Short {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun IntArray.max(): Int {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun LongArray.max(): Long {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun FloatArray.max(): Float {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun DoubleArray.max(): Double {
    require(any()) { "Must have value" }
    return Calculator.max(this)
}

fun <T : Comparable<T>> Sequence<T>.max(): T {
    require(any()) { "empty" }
    return Calculator.max(this)
}

fun <T : Comparable<T>> Iterable<T>.max(): T {
    require(any()) { "empty" }
    return Calculator.max(this)
}

fun <T : Comparable<T>> Array<T>.max(): T {
    require(any()) { "empty" }
    return Calculator.max(this)
}

fun <T> Sequence<T>.max(selector: (T) -> Byte): Byte = map(selector).max()

fun <T> Sequence<T>.max(selector: (T) -> Short): Short = map(selector).max()

fun <T> Sequence<T>.max(selector: (T) -> Int): Int = map(selector).max()

fun <T> Sequence<T>.max(selector: (T) -> Long): Long = map(selector).max()

fun <T> Sequence<T>.max(selector: (T) -> Float): Float = map(selector).max()

fun <T> Sequence<T>.max(selector: (T) -> Double): Double = map(selector).max()

fun <T> Iterable<T>.max(selector: (T) -> Byte): Byte = map(selector).max()

fun <T> Iterable<T>.max(selector: (T) -> Short): Short = map(selector).max()

fun <T> Iterable<T>.max(selector: (T) -> Int): Int = map(selector).max()

fun <T> Iterable<T>.max(selector: (T) -> Long): Long = map(selector).max()

fun <T> Iterable<T>.max(selector: (T) -> Float): Float = map(selector).max()

fun <T> Iterable<T>.max(selector: (T) -> Double): Double = map(selector).max()

fun <T> Array<T>.max(selector: (T) -> Byte): Byte = map(selector).max()

fun <T> Array<T>.max(selector: (T) -> Short): Short = map(selector).max()

fun <T> Array<T>.max(selector: (T) -> Int): Int = map(selector).max()

fun <T> Array<T>.max(selector: (T) -> Long): Long = map(selector).max()

fun <T> Array<T>.max(selector: (T) -> Float): Float = map(selector).max()

fun <T> Array<T>.max(selector: (T) -> Double): Double = map(selector).max()

fun ByteArray.max(selector: (Byte) -> Byte): Byte = map(selector).max()

fun ByteArray.max(selector: (Byte) -> Short): Short = map(selector).max()

fun ByteArray.max(selector: (Byte) -> Int): Int = map(selector).max()

fun ByteArray.max(selector: (Byte) -> Long): Long = map(selector).max()

fun ByteArray.max(selector: (Byte) -> Float): Float = map(selector).max()

fun ByteArray.max(selector: (Byte) -> Double): Double = map(selector).max()

fun ShortArray.max(selector: (Short) -> Byte): Byte = map(selector).max()

fun ShortArray.max(selector: (Short) -> Short): Short = map(selector).max()

fun ShortArray.max(selector: (Short) -> Int): Int = map(selector).max()

fun ShortArray.max(selector: (Short) -> Long): Long = map(selector).max()

fun ShortArray.max(selector: (Short) -> Float): Float = map(selector).max()

fun ShortArray.max(selector: (Short) -> Double): Double = map(selector).max()

fun IntArray.max(selector: (Int) -> Byte): Byte = map(selector).max()

fun IntArray.max(selector: (Int) -> Short): Short = map(selector).max()

fun IntArray.max(selector: (Int) -> Int): Int = map(selector).max()

fun IntArray.max(selector: (Int) -> Long): Long = map(selector).max()

fun IntArray.max(selector: (Int) -> Float): Float = map(selector).max()

fun IntArray.max(selector: (Int) -> Double): Double = map(selector).max()

fun LongArray.max(selector: (Long) -> Byte): Byte = map(selector).max()

fun LongArray.max(selector: (Long) -> Short): Short = map(selector).max()

fun LongArray.max(selector: (Long) -> Int): Int = map(selector).max()

fun LongArray.max(selector: (Long) -> Long): Long = map(selector).max()

fun LongArray.max(selector: (Long) -> Float): Float = map(selector).max()

fun LongArray.max(selector: (Long) -> Double): Double = map(selector).max()

fun FloatArray.max(selector: (Float) -> Byte): Byte = map(selector).max()

fun FloatArray.max(selector: (Float) -> Short): Short = map(selector).max()

fun FloatArray.max(selector: (Float) -> Int): Int = map(selector).max()

fun FloatArray.max(selector: (Float) -> Long): Long = map(selector).max()

fun FloatArray.max(selector: (Float) -> Float): Float = map(selector).max()

fun FloatArray.max(selector: (Float) -> Double): Double = map(selector).max()

fun DoubleArray.max(selector: (Double) -> Byte): Byte = map(selector).max()

fun DoubleArray.max(selector: (Double) -> Short): Short = map(selector).max()

fun DoubleArray.max(selector: (Double) -> Int): Int = map(selector).max()

fun DoubleArray.max(selector: (Double) -> Long): Long = map(selector).max()

fun DoubleArray.max(selector: (Double) -> Float): Float = map(selector).max()

fun DoubleArray.max(selector: (Double) -> Double): Double = map(selector).max()

internal object Calculator {

    fun min(sequence: Sequence<Byte>): Byte = sequence.min()

    fun min(sequence: Sequence<Short>): Short = sequence.min()

    fun min(sequence: Sequence<Int>): Int = sequence.min()

    fun min(sequence: Sequence<Long>): Long = sequence.min()

    fun min(sequence: Sequence<Float>): Float = sequence.min()

    fun min(sequence: Sequence<Double>): Double = sequence.min()

    fun min(iterable: Iterable<Byte>): Byte = iterable.min()

    fun min(iterable: Iterable<Short>): Short = iterable.min()

    fun min(iterable: Iterable<Int>): Int = iterable.min()

    fun min(iterable: Iterable<Long>): Long = iterable.min()

    fun min(iterable: Iterable<Float>): Float = iterable.min()

    fun min(iterable: Iterable<Double>): Double = iterable.min()

    fun min(array: Array<Byte>): Byte = array.min()

    fun min(array: Array<Short>): Short = array.min()

    fun min(array: Array<Int>): Int = array.min()

    fun min(array: Array<Long>): Long = array.min()

    fun min(array: Array<Float>): Float = array.min()

    fun min(array: Array<Double>): Double = array.min()

    fun max(sequence: Sequence<Byte>): Byte = sequence.max()

    fun max(sequence: Sequence<Short>): Short = sequence.max()

    fun max(sequence: Sequence<Int>): Int = sequence.max()

    fun max(sequence: Sequence<Long>): Long = sequence.max()

    fun max(sequence: Sequence<Float>): Float = sequence.max()

    fun max(sequence: Sequence<Double>): Double = sequence.max()

    fun max(iterable: Iterable<Byte>): Byte = iterable.max()

    fun max(iterable: Iterable<Short>): Short = iterable.max()

    fun max(iterable: Iterable<Int>): Int = iterable.max()

    fun max(iterable: Iterable<Long>): Long = iterable.max()

    fun max(iterable: Iterable<Float>): Float = iterable.max()

    fun max(iterable: Iterable<Double>): Double = iterable.max()

    fun max(array: Array<Byte>): Byte = array.max()

    fun max(array: Array<Short>): Short = array.max()

    fun max(array: Array<Int>): Int = array.max()

    fun max(array: Array<Long>): Long = array.max()

    fun max(array: Array<Float>): Float = array.max()

    fun max(array: Array<Double>): Double = array.max()

    fun min(byteArray: ByteArray): Byte = byteArray.min()

    fun min(shortArray: ShortArray): Short = shortArray.min()

    fun min(intArray: IntArray): Int = intArray.min()

    fun min(longArray: LongArray): Long = longArray.min()

    fun min(floatArray: FloatArray): Float = floatArray.min()

    fun min(doubleArray: DoubleArray): Double = doubleArray.min()

    fun max(byteArray: ByteArray): Byte = byteArray.max()

    fun max(shortArray: ShortArray): Short = shortArray.max()

    fun max(intArray: IntArray): Int = intArray.max()

    fun max(longArray: LongArray): Long = longArray.max()

    fun max(floatArray: FloatArray): Float = floatArray.max()

    fun max(doubleArray: DoubleArray): Double = doubleArray.max()

    fun <T : Comparable<T>> min(sequence: Sequence<T>): T = sequence.min()

    fun <T : Comparable<T>> min(iterable: Iterable<T>): T = iterable.min()

    fun <T : Comparable<T>> min(array: Array<T>): T = array.min()

    fun <T : Comparable<T>> max(sequence: Sequence<T>): T = sequence.max()

    fun <T : Comparable<T>> max(iterable: Iterable<T>): T = iterable.max()

    fun <T : Comparable<T>> max(array: Array<T>): T = array.max()
}