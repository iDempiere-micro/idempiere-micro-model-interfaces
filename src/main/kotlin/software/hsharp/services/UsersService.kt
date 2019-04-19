package software.hsharp.services

import org.compiere.model.User

interface UsersService {
    fun getUsers(): List<User>
}