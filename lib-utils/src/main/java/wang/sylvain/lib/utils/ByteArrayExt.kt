package wang.sylvain.lib.utils

/**
 * byte数组转16进制字符串
 * @return 16进制字符串
 */
fun ByteArray.toHexString(): String {
    return map {
        (it.toInt() and 0xFF or 0x100).toString(16).substring(1)
    }.joinToString(separator = "")
}