package com.dicoding.todoapp.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.dicoding.todoapp.model.UserModel
import com.dicoding.todoapp.model.UserPreference
import kotlinx.coroutines.launch

class LoginViewModel (private val pref: UserPreference): ViewModel() {

    fun getUser(): LiveData<UserModel>{
        return pref.getUser().asLiveData()
    }

    fun login(){
        viewModelScope.launch {
            pref.login()
        }
    }
}