package abika.sinau.core.data.auth

import abika.sinau.core.data.dto.requests.RegisterRequest
import abika.sinau.core.data.networking.post
import abika.sinau.core.domain.auth.AuthService
import abika.sinau.core.domain.util.DataError
import abika.sinau.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class KtorAuthService(
    private val httpClient: HttpClient
) : AuthService {
    override suspend fun register(
        email: String,
        username: String,
        password: String
    ): EmptyResult<DataError.Remote> {
        return httpClient.post(
            route = "/auth/register",
            body = RegisterRequest(
                email = email,
                username = username,
                password = password
            )
        )
    }
}