package wang.sylvain.lib.utils

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ByteArrayExtUnitTest {

    @Test
    fun t_toHexString() {
        val byteArray = byteArrayOf(0x01, 0x23, 0x45, 0x67, 0x89.toByte(), 0xab.toByte(), 0xcd.toByte(), 0xef.toByte())
        assertEquals("0123456789abcdef", byteArray.toHexString())
    }

}