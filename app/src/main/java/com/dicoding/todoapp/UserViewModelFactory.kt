package com.dicoding.todoapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dicoding.todoapp.model.UserPreference
import com.dicoding.todoapp.ui.login.LoginViewModel
import com.dicoding.todoapp.ui.register.RegisterViewModel

class UserViewModelFactory (private val pref: UserPreference): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when{
            modelClass.isAssignableFrom(RegisterViewModel::class.java) ->{
                RegisterViewModel(pref) as T
            }
            modelClass.isAssignableFrom(LoginViewModel::class.java) -> {
                LoginViewModel(pref) as T
            }
            else -> throw IllegalArgumentException("Unknown ViewModel class" + modelClass.name)
        }
    }

}