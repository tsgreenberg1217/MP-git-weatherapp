package com.example.headermodules.repositories

import com.example.data_utility.models.NetworkWeatherResponse
import com.example.api.WeatherService
import com.example.data_utility.DataState
import com.example.data_utility.mappers.DbMapper
import com.example.data_utility.mappers.NetworkMapper
import com.example.database.CityDao
import com.example.data_utility.models.CityWeatherResult

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class WeatherRepository
@Inject constructor(
    private val service: WeatherService,
    private val cityDao: CityDao,
    private val cacheMapper: DbMapper,
    private val networkMapper: NetworkMapper

) {

    suspend fun getWeatherForCity(city: String): Flow<DataState<CityWeatherResult>> = flow {

        emit(DataState.Loading)
        cityDao.getCityByName(city)?.let {
            cacheMapper.entityToDomain(it).also { w ->
                emit(DataState.Success(w))
            }
        } ?: run {
            try {
                val res: NetworkWeatherResponse = service.getWeatherForCity(city)
                val domainCity = networkMapper.entityToDomain(res)
                val cacheCity = cacheMapper.domainToCache(domainCity)
                cityDao.insertCity(cacheCity)
                emit(DataState.Success(domainCity))
            } catch (e: Exception) {
                emit(DataState.Error(e))
            }
        }
    }

    suspend fun getAllCities(): Flow<DataState<List<CityWeatherResult>>> = flow {
        emit(DataState.Loading)
        try {
            cityDao.getAll().map {
                cacheMapper.entityToDomain(it)
            }.also { w ->
                emit(DataState.Success(w.toMutableList()))
            }

        } catch (e: java.lang.Exception) {
            emit(DataState.Error(e))
        }

    }

}