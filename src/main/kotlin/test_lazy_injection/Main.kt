package test_lazy_injection

import test_lazy_injection.android.App
import test_lazy_injection.di.DaggerAppComponent

fun main() {
    separate("Should initialize the logger") {
        val app = App()
        DaggerAppComponent.create().inject(app)
        app.logger.log("Hello World")
    }

    separate("Should initialize the logger even though log not called") {
        val app = App()
        DaggerAppComponent.create().inject(app)
    }

    separate("Should not initialize the logger even though Inject annotation exists") {
        val app = App()
        val component = DaggerAppComponent.create()
        app.appComponent = component
        app.fragmentWithoutInject()
    }

    separate("Should initialize the logger since Fragment is injecting") {
        val app = App()
        val component = DaggerAppComponent.create()
        app.appComponent = component
        app.fragment()
    }

}

fun separate(description: String = "", block: () -> Unit) {
    var s = ""
    repeat(20) {
        s += "*"
    }
    println(s)
    println(description)
    block()
}
