package kr.tripstore.play.user

import java.sql.Connection
import java.sql.SQLException

interface ConnectionMaker {
    fun getConnection(): Connection
}


