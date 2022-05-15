package kr.tripstore.play.user

class User(
    val id: String,
    val name: String,
    val password: String
) {

    override fun toString(): String {
        return "User(id='$id', name='$name', password='$password')"
    }
}