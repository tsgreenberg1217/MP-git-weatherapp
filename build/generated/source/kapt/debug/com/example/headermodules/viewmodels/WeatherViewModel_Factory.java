// Generated by Dagger (https://dagger.dev).
package com.example.headermodules.viewmodels;

import com.example.headermodules.repositories.WeatherRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WeatherViewModel_Factory implements Factory<WeatherViewModel> {
  private final Provider<WeatherRepository> repoProvider;

  public WeatherViewModel_Factory(Provider<WeatherRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public WeatherViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static WeatherViewModel_Factory create(Provider<WeatherRepository> repoProvider) {
    return new WeatherViewModel_Factory(repoProvider);
  }

  public static WeatherViewModel newInstance(WeatherRepository repo) {
    return new WeatherViewModel(repo);
  }
}
