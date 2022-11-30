package com.dicoding.todoapp.ui.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.todoapp.model.UserModel
import com.dicoding.todoapp.model.UserPreference
import kotlinx.coroutines.launch

class RegisterViewModel (private val pref: UserPreference): ViewModel() {
    fun saveUser(user: UserModel){
        viewModelScope.launch {
            pref.saveUser(user)
        }
    }
}