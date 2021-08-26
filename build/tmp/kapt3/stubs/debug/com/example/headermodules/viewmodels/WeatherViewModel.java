package com.example.headermodules.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R-\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/headermodules/viewmodels/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/example/headermodules/repositories/WeatherRepository;", "(Lcom/example/headermodules/repositories/WeatherRepository;)V", "cities", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/data_utility/DataState;", "", "Lcom/example/data_utility/models/CityWeatherResult;", "getCities", "()Landroidx/lifecycle/MutableLiveData;", "cities$delegate", "Lkotlin/Lazy;", "weatherData", "getWeatherData", "weatherData$delegate", "getAllCities", "", "getWeather", "cityName", "", "MP-git-weatherapp_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.headermodules.repositories.WeatherRepository repo = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy weatherData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cities$delegate = null;
    
    @javax.inject.Inject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.example.headermodules.repositories.WeatherRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.data_utility.DataState<com.example.data_utility.models.CityWeatherResult>> getWeatherData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.data_utility.DataState<java.util.List<com.example.data_utility.models.CityWeatherResult>>> getCities() {
        return null;
    }
    
    public final void getWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String cityName) {
    }
    
    public final void getAllCities() {
    }
}