package software.hsharp.services

import org.compiere.model.I_AD_User

interface UsersService {
    fun getUsers(): List<I_AD_User>
}