package test_lazy_injection.di

import test_lazy_injection.logger.Logger
import dagger.Binds
import dagger.Module
import test_lazy_injection.logger.MyLogger
import javax.inject.Singleton

@Module
abstract class LogModule {
    @Binds
    @Singleton
    abstract fun provideLogger(myLogger: MyLogger): Logger
}