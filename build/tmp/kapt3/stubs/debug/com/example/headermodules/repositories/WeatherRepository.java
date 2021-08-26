package com.example.headermodules.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J%\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\r0\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/headermodules/repositories/WeatherRepository;", "", "service", "Lcom/example/api/WeatherService;", "cityDao", "Lcom/example/database/CityDao;", "cacheMapper", "Lcom/example/data_utility/mappers/DbMapper;", "networkMapper", "Lcom/example/data_utility/mappers/NetworkMapper;", "(Lcom/example/api/WeatherService;Lcom/example/database/CityDao;Lcom/example/data_utility/mappers/DbMapper;Lcom/example/data_utility/mappers/NetworkMapper;)V", "getAllCities", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/data_utility/DataState;", "", "Lcom/example/data_utility/models/CityWeatherResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWeatherForCity", "city", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MP-git-weatherapp_debug"})
public final class WeatherRepository {
    private final com.example.api.WeatherService service = null;
    private final com.example.database.CityDao cityDao = null;
    private final com.example.data_utility.mappers.DbMapper cacheMapper = null;
    private final com.example.data_utility.mappers.NetworkMapper networkMapper = null;
    
    @javax.inject.Inject()
    public WeatherRepository(@org.jetbrains.annotations.NotNull()
    com.example.api.WeatherService service, @org.jetbrains.annotations.NotNull()
    com.example.database.CityDao cityDao, @org.jetbrains.annotations.NotNull()
    com.example.data_utility.mappers.DbMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    com.example.data_utility.mappers.NetworkMapper networkMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getWeatherForCity(@org.jetbrains.annotations.NotNull()
    java.lang.String city, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.data_utility.DataState<com.example.data_utility.models.CityWeatherResult>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllCities(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.data_utility.DataState<? extends java.util.List<com.example.data_utility.models.CityWeatherResult>>>> continuation) {
        return null;
    }
}