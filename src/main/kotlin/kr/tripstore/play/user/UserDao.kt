package kr.tripstore.play.user

import java.sql.DriverManager

class UserDao(
    private val connectionMaker: ConnectionMaker
) {

    fun add(user: User) {
        Class.forName("org.h2.Driver")
        val conn = connectionMaker.getConnection()

        val ps = conn.prepareStatement("insert into users(id, name, password) values(?, ?, ?)")
        ps.setString(1, user.id)
        ps.setString(2, user.name)
        ps.setString(3, user.password)

        ps.executeUpdate()

        ps.close()
        conn.close()
    }

    fun get(id: String): User {
        val conn = connectionMaker.getConnection()

        val ps = conn.prepareStatement("select * from users where id = ?")
        ps.setString(1, id)

        val rs = ps.executeQuery()
        rs.next()

        val findUser = User(
            id = rs.getString("id"),
            name = rs.getString("name"),
            password = rs.getString("name")
        )

        rs.close()
        ps.close()
        conn.close()

        return findUser
    }
}