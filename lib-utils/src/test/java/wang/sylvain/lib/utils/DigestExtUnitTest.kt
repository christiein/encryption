package wang.sylvain.lib.utils

import org.junit.Test

import org.junit.Assert.*

class DigestExtUnitTest {

    @Test
    fun t_md2() {
        assertEquals("b27af65e6a4096536dd1252e308c2427", md2("Hello"))
    }

    @Test
    fun t_md3() {
        assertEquals("b27af65e6a4096536dd1252e308c2427", md3("Hello"))
    }

    @Test
    fun t_md4() {
        assertEquals("b27af65e6a4096536dd1252e308c2427", md4("Hello"))
    }

    @Test
    fun t_md5() {
        assertEquals("8b1a9953c4611296a827abf8c47804d7", md5("Hello"))
    }

    @Test
    fun t_sha1() {
        assertEquals("f7ff9e8b7bb2e09b70935a5d785e0cc5d9d0abf0", sha1("Hello"))
    }

    @Test
    fun t_sha224() {
        assertEquals("4149da18aa8bfc2b1e382c6c26556d01a92c261b6436dad5e3be3fcc", sha224("Hello"))
    }

    @Test
    fun t_sha256() {
        assertEquals("185f8db32271fe25f561a6fc938b2e264306ec304eda518007d1764826381969", sha256("Hello"))
    }

    @Test
    fun t_sha384() {
        assertEquals("3519fe5ad2c596efe3e276a6f351b8fc0b03db861782490d45f7598ebd0ab5fd5520ed102f38c4a5ec834e98668035fc", sha384("Hello"))
    }

    @Test
    fun t_sha512() {
        assertEquals("3615f80c9d293ed7402687f94b22d58e529b8cc7916f8fac7fddf7fbd5af4cf777d3d795a7a00a16bf7e7f3fb9561ee9baae480da9fe7a18769e71886b03f315", sha512("Hello"))
    }
}