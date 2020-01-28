package test_lazy_injection.android

import test_lazy_injection.di.AppComponent
import test_lazy_injection.di.DaggerFragmentComponent
import test_lazy_injection.logger.Logger
import javax.inject.Inject

class Fragment(appComponent: AppComponent?) {

    @Inject
    lateinit var logger: Logger

    init {
        appComponent?.let {
            DaggerFragmentComponent.builder()
                .appComponent(it)
                .build()
                .inject(this)
        }
    }
}