package com.example.setupmanager.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.setupmanager.SetupManagerApp

object AppViewModelProvider {
    val Factory = viewModelFactory {
    }

    fun CreationExtras.setupManagerApp(): SetupManagerApp =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as SetupManagerApp)
}