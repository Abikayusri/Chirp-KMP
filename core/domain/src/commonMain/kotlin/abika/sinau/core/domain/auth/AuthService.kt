package abika.sinau.core.domain.auth

import abika.sinau.core.domain.util.DataError
import abika.sinau.core.domain.util.EmptyResult

interface AuthService {

    suspend fun register(
        email: String,
        username: String,
        password: String
    ): EmptyResult<DataError.Remote>
}