package com.example.composeex.domain.use_case.get_manufacturers

import com.example.composeex.common.ApiUtils
import com.example.composeex.data.remote.response_data.manufacturers.toManufacturers
import com.example.composeex.domain.model.Manufacturers
import com.example.composeex.domain.repository.ManufacturerRepositoryContract
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetManufacturersUseCase @Inject constructor(
    private val repository: ManufacturerRepositoryContract
) {
    operator fun invoke(): Flow<ApiUtils<Manufacturers>> = flow {
        try {
            emit(ApiUtils.Loading<Manufacturers>())
            val manufacturers = repository.getManufacturers().toManufacturers()
            emit(ApiUtils.Success<Manufacturers>(manufacturers))
        } catch (e: HttpException) {
            emit(ApiUtils.Error<Manufacturers>(e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(ApiUtils.Error<Manufacturers>("No Connection"))
        }
    }
}