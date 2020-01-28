package test_lazy_injection.logger

import javax.inject.Inject

class MyLogger @Inject constructor(): Logger {
    init {
        println("INIT LOGGER")
    }

    override fun log(s: String) {
        println(s)
    }
}
