package test_lazy_injection.di

import test_lazy_injection.logger.Logger
import test_lazy_injection.android.App
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [LogModule::class]
)
@Singleton
interface AppComponent {
    fun logger(): Logger
    fun inject(app: App)
}