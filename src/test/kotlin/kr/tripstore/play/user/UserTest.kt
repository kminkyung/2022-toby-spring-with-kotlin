package kr.tripstore.play.user

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class UserTest{
    @Test
    internal fun createdUser() {
        val user = User(
            id = "id", name = "name", password = "password"
        )

        assertThat(user).isNotNull
        assertThat(user.id).isEqualTo("id")
        assertThat(user.name).isEqualTo("name")
        assertThat(user.password).isEqualTo("password")
    }
}