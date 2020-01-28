package test_lazy_injection.di

import test_lazy_injection.android.Fragment
import dagger.Component

@Component(dependencies = [AppComponent::class])
@FragmentScope
interface FragmentComponent {
    fun inject(fragment: Fragment)
}