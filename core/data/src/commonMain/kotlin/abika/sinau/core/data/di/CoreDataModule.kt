package abika.sinau.core.data.di

import abika.sinau.core.data.auth.KtorAuthService
import abika.sinau.core.data.logging.KermitLogger
import abika.sinau.core.data.networking.HttpClientFactory
import abika.sinau.core.domain.auth.AuthService
import abika.sinau.core.domain.logging.ChirpLogger
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformCoreDataModule: Module

val coreDataModule = module {
    includes(platformCoreDataModule)

    single<ChirpLogger> { KermitLogger }

    single {
        HttpClientFactory(get()).create(get())
    }

    single<AuthService> {
        KtorAuthService(get())
    }

    singleOf(::KtorAuthService) bind AuthService::class
}