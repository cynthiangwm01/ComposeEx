package com.example.composeex.presentation.manufacturer_detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composeex.common.ApiUtils
import com.example.composeex.common.Constants
import com.example.composeex.data.remote.response_data.manufacturer_detail.ManufacturerDetailContent
import com.example.composeex.data.remote.response_data.manufacturers.ManufacturerContent
import com.example.composeex.domain.model.ManufacturerDetail
import com.example.composeex.domain.model.Manufacturers
import com.example.composeex.domain.use_case.get_manufacturer_detail.GetManufacturerDetailUseCase
import com.example.composeex.domain.use_case.get_manufacturers.GetManufacturersUseCase
import com.example.composeex.presentation.manufacturers.ManufacturesState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ManufacturerDetailViewModel @Inject constructor(
    private val getManufacturerDetailUseCase: GetManufacturerDetailUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = mutableStateOf(ManufacturerDetailState())
    val state: State<ManufacturerDetailState> = _state

    init {
        savedStateHandle.get<String>(Constants.PARAM_MANUFACTURER_ID)?.let { manufacturerId ->
            getManufacturerDetail(manufacturerId)
        }

    }

    private fun getManufacturerDetail(manufacturerId: String) {
        getManufacturerDetailUseCase(manufacturerId).onEach { result ->
            when (result) {
                is ApiUtils.Success -> {
                    _state.value = ManufacturerDetailState(
                        manufacturerDetail = result.data ?: ManufacturerDetail(
                            listOf<ManufacturerDetailContent>(),
                            null
                        )
                    )
                }
                is ApiUtils.Error -> {
                    _state.value = ManufacturerDetailState(
                        error = result.message ?: "An unexpected error occured"
                    )
                }
                is ApiUtils.Loading -> {
                    _state.value = ManufacturerDetailState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }
}