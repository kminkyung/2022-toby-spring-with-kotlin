package kr.tripstore.play.user

import java.sql.Connection
import java.sql.DriverManager

class NConnectionMaker : ConnectionMaker {
    override fun getConnection(): Connection {
        Class.forName("org.h2.Driver")
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/toby-spring", "sa", "")
    }
}