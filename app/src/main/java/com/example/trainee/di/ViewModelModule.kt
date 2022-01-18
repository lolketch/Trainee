package com.example.trainee.di

import androidx.lifecycle.ViewModel
import com.example.trainee.ui.screens.screen_department_host.DepartmentHostViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {
    @Binds
    @[IntoMap ViewModelKey(DepartmentHostViewModel::class)]
    fun provideDepartmentHostViewModel(departmentHostViewModel: DepartmentHostViewModel): ViewModel

}