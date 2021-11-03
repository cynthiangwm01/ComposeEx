package com.example.composeex.di

import com.example.composeex.common.Constants
import com.example.composeex.data.remote.ManufacturerApi
import com.example.composeex.data.repository.ManufacturerRepository
import com.example.composeex.domain.repository.ManufacturerRepositoryContract
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideManufacturerApi(): ManufacturerApi {
        val interceptor = HttpLoggingInterceptor()

        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        val client: OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ManufacturerApi::class.java)
    }

    @Provides
    @Singleton
    fun provideManufacturerRepository(api: ManufacturerApi): ManufacturerRepositoryContract {
        return ManufacturerRepository(api)
    }
}