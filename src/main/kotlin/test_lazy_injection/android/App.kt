package test_lazy_injection.android

import test_lazy_injection.di.AppComponent
import test_lazy_injection.logger.Logger
import javax.inject.Inject

class App {

    var appComponent: AppComponent? = null

    init {
        println("INIT APP")
    }

    @Inject
    lateinit var logger: Logger

    fun fragmentWithoutInject() {
        Fragment(null)
    }

    fun fragment() {
        Fragment(appComponent!!)
    }
}