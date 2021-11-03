package com.example.composeex.domain.use_case.get_manufacturer_detail

import com.example.composeex.common.ApiUtils
import com.example.composeex.data.remote.response_data.manufacturer_detail.toManufacturerDetail
import com.example.composeex.domain.model.ManufacturerDetail
import com.example.composeex.domain.repository.ManufacturerRepositoryContract
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetManufacturerDetailUseCase @Inject constructor(
    private val repository: ManufacturerRepositoryContract
) {
    operator fun invoke(manufacturerId: String): Flow<ApiUtils<ManufacturerDetail>> = flow {
        try {
            emit(ApiUtils.Loading<ManufacturerDetail>())
            val manufacturerDetail = repository.getManufacturerDetailById(manufacturerId).toManufacturerDetail()
            emit(ApiUtils.Success<ManufacturerDetail>(manufacturerDetail))
        } catch (e: HttpException) {
            emit(
                ApiUtils.Error<ManufacturerDetail>(
                    e.localizedMessage ?: "Unexpected error"
                )
            )
        } catch (e: IOException) {
            emit(ApiUtils.Error<ManufacturerDetail>("No Connection"))
        }
    }
}