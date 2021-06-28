package wang.sylvain.lib.utils

import org.junit.Test

import org.junit.Assert.*

class HmacExtUnitTest {

    @Test
    fun t_hmacMd2() {
        assertEquals("4583d113e12bdd115c62796c1b5c2d52", hmacMd2("Hello", "sylvain"))
    }

    @Test
    fun t_hmacMd3() {
        assertEquals("4583d113e12bdd115c62796c1b5c2d52", hmacMd3("Hello", "sylvain"))
    }

    @Test
    fun t_hmacMd4() {
        assertEquals("4583d113e12bdd115c62796c1b5c2d52", hmacMd4("Hello", "sylvain"))
    }

    @Test
    fun t_hmacMd5() {
        assertEquals("4583d113e12bdd115c62796c1b5c2d52", hmacMd5("Hello", "sylvain"))
    }

    @Test
    fun t_hmacSha1() {
        assertEquals("6a786dc4541efd3c00b50d101d31841ad5d7df23", hmacSha1("Hello", "sylvain"))
    }

    @Test
    fun t_hmacSha224() {
        assertEquals("76302625a5d9da7e612380983c3b1b785c105f1570b4c57e31376d1e", hmacSha224("Hello", "sylvain"))
    }

    @Test
    fun t_hmacSha256() {
        assertEquals("66d738495f77d1baa2696f0aba5ed2bac4afc005a2ca392a00656cb692ec2a05", hmacSha256("Hello", "sylvain"))
    }

    @Test
    fun t_hmacSha384() {
        assertEquals("9ae700c7e70445c6e65b9f3851798f6d40222ba9517e350bd966bc70194744cd72d73e57f286a44be73b17ccd8f103b8", hmacSha384("Hello", "sylvain"))
    }

    @Test
    fun t_hmacSha512() {
        assertEquals("d28a26f5fbc085704821a911973549a564966929e19ce9ce8a413ce10af5d7fbf0fffef15f0394757d7bfd69a03289f384f7b60c34c64546befc7818e7871b09", hmacSha512("Hello", "sylvain"))
    }

}