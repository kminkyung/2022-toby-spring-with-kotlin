package kr.tripstore.play.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class UserDaoTest {

    @Test
    internal fun addAndGetNUser() {
        val userDao = UserDao(NConnectionMaker())

        val user = User(
            id = "id-value", name = "name-value", password = "password-value"
        )
        userDao.add(user)

        val findUser = userDao.get(user.id)

        assertThat(findUser).isNotNull
        assertThat(findUser.id).isEqualTo(user.id)
        assertThat(findUser.name).isEqualTo(user.name)

    }

    @Test
    internal fun oneObject() {
        // val var
        // apply also let run with
    }
}