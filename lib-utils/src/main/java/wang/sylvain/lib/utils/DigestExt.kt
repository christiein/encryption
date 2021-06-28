package wang.sylvain.lib.utils

import java.security.MessageDigest

private const val ALGORITHM_MD2 = "MD2"
private const val ALGORITHM_MD3 = "MD3"
private const val ALGORITHM_MD4 = "MD4"
private const val ALGORITHM_MD5 = "MD5"
private const val ALGORITHM_SHA1 = "SHA-1"
private const val ALGORITHM_SHA224 = "SHA-224"
private const val ALGORITHM_SHA256 = "SHA-256"
private const val ALGORITHM_SHA384 = "SHA-384"
private const val ALGORITHM_SHA512 = "SHA-512"

/**
 * 计算字符串信息摘要
 * @param message 需计算信息摘要的字符串
 * @param algorithm 算法
 */
private fun digest(message: String, algorithm: String): String {
    val md = MessageDigest.getInstance(algorithm)
    val digest = md.digest(message.toByteArray(Charsets.UTF_8))
    return digest.toHexString()
}

/**
 * 计算MD2值
 * @param message 需计算信息摘要的字符串
 */
fun md2(message: String): String {
    return digest(message, ALGORITHM_MD2)
}

/**
 * 计算MD3
 * @param message 需计算信息摘要的字符串
 */
fun md3(message: String): String {
    return digest(message, ALGORITHM_MD3)
}

/**
 * 计算MD4
 * @param message 需计算信息摘要的字符串
 */
fun md4(message: String): String {
    return digest(message, ALGORITHM_MD4)
}

/**
 * 计算MD5
 * @param message 需计算信息摘要的字符串
 */
fun md5(message: String): String {
    return digest(message, ALGORITHM_MD5)
}

/**
 * 计算SHA1
 * @param message 需计算信息摘要的字符串
 */
fun sha1(message: String): String {
    return digest(message, ALGORITHM_SHA1)
}

/**
 * 计算SHA224
 * @param message 需计算信息摘要的字符串
 */
fun sha224(message: String): String {
    return digest(message, ALGORITHM_SHA224)
}

/**
 * 计算SHA256
 * @param message 需计算信息摘要的字符串
 */
fun sha256(message: String): String {
    return digest(message, ALGORITHM_SHA256)
}

/**
 * 计算SHA384
 * @param message 需计算信息摘要的字符串
 */
fun sha384(message: String): String {
    return digest(message, ALGORITHM_SHA384)
}

/**
 * 计算SHA512
 * @param message 需计算信息摘要的字符串
 */
fun sha512(message: String): String {
    return digest(message, ALGORITHM_SHA512)
}


fun main(args: Array<String>) {
    println(md2("123"))
    //println(md3("123"))
    //println(md4("123"))
    println(md5("123"))
    println(sha1("123"))
    println(sha224("123"))
    println(sha256("123"))
    println(sha384("123"))
    println(sha512("123"))
}