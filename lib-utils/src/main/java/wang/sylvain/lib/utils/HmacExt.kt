package wang.sylvain.lib.utils

import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

private const val ALGORITHM_HMAC_SHA1 = "HmacSHA1"
private const val ALGORITHM_HMAC_SHA224 = "HmacSHA224"
private const val ALGORITHM_HMAC_SHA256 = "HmacSHA256"
private const val ALGORITHM_HMAC_SHA384 = "HmacSHA384"
private const val ALGORITHM_HMAC_SHA512 = "HmacSHA512"
private const val ALGORITHM_HMAC_MD2 = "HmacMD2"
private const val ALGORITHM_HMAC_MD3 = "HmacMD3"
private const val ALGORITHM_HMAC_MD4 = "HmacMD4"
private const val ALGORITHM_HMAC_MD5 = "HmacMD5"

/**
 * 计算散列消息认证码
 * @param message 需计算散列消息认证码的字符串
 * @param algorithm 算法
 */
private fun mac(message: String, key: String, algorithm: String): String {
    val secretKey = SecretKeySpec(key.toByteArray(Charsets.UTF_8), algorithm)
    val mac = Mac.getInstance(secretKey.algorithm)
    mac.init(secretKey)
    return mac.doFinal(message.toByteArray(Charsets.UTF_8)).toHexString()
}

/**
 * 计算HMAC_SHA1值
 * @param message 需计算散列消息认证码的字符串
 */
fun hmacSha1(message: String, key: String): String {
    return mac(message, key, ALGORITHM_HMAC_SHA1)
}

/**
 * 计算HMAC_SHA224值
 * @param message 需计算散列消息认证码的字符串
 */
fun hmacSha224(message: String, key: String): String {
    return mac(message, key, ALGORITHM_HMAC_SHA224)
}

/**
 * 计算HMAC_SHA256值
 * @param message 需计算散列消息认证码的字符串
 */
fun hmacSha256(message: String, key: String): String {
    return mac(message, key, ALGORITHM_HMAC_SHA256)
}

/**
 * 计算HMAC_SHA384值
 * @param message 需计算散列消息认证码的字符串
 */
fun hmacSha384(message: String, key: String): String {
    return mac(message, key, ALGORITHM_HMAC_SHA384)
}

/**
 * 计算HMAC_SHA512值
 * @param message 需计算散列消息认证码的字符串
 */
fun hmacSha512(message: String, key: String): String {
    return mac(message, key, ALGORITHM_HMAC_SHA512)
}

/**
 * 计算HMAC_MD2值
 * @param message 需计算散列消息认证码的字符串
 */
fun hmacMd2(message: String, key: String): String {
    return mac(message, key, ALGORITHM_HMAC_MD2)
}

/**
 * 计算HMAC_MD3值
 * @param message 需计算散列消息认证码的字符串
 */
fun hmacMd3(message: String, key: String): String {
    return mac(message, key, ALGORITHM_HMAC_MD3)
}

/**
 * 计算HMAC_MD4值
 * @param message 需计算散列消息认证码的字符串
 */
fun hmacMd4(message: String, key: String): String {
    return mac(message, key, ALGORITHM_HMAC_MD4)
}

/**
 * 计算HMAC_MD5值
 * @param message 需计算散列消息认证码的字符串
 */
fun hmacMd5(message: String, key: String): String {
    return mac(message, key, ALGORITHM_HMAC_MD5)
}