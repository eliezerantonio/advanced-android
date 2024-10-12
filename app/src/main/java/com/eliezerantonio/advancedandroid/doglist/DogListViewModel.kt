package com.eliezerantonio.advancedandroid.doglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class DogListViewModel : ViewModel() {

    init {
        downloadDogs()
    }

    private fun downloadDogs() {
        viewModelScope.launch {


        }
    }
}