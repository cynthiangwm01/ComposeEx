package com.example.composeex.presentation.manufacturers

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composeex.common.ApiUtils
import com.example.composeex.data.remote.response_data.manufacturers.ManufacturerContent
import com.example.composeex.domain.model.Manufacturers
import com.example.composeex.domain.use_case.get_manufacturers.GetManufacturersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ManufacturersViewModel @Inject constructor(
    private val getManufacturersUseCase: GetManufacturersUseCase
) : ViewModel() {

    private val _state = mutableStateOf(ManufacturesState())
    val state: State<ManufacturesState> = _state

    init {
        getManufacturers()
    }

    private fun getManufacturers() {
        getManufacturersUseCase().onEach { result ->
            when (result) {
                is ApiUtils.Success -> {
                    _state.value = ManufacturesState(
                        manufacturers = result.data ?: Manufacturers(
                            0,
                            listOf<ManufacturerContent>()
                        )
                    )
                }
                is ApiUtils.Error -> {
                    _state.value = ManufacturesState(
                        error = result.message ?: "An unexpected error occured"
                    )
                }
                is ApiUtils.Loading -> {
                    _state.value = ManufacturesState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}