// Generated by view binder compiler. Do not edit!
package com.example.headermodules.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.headermodules.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewholderWeatherBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView weatherVHCityTxt;

  @NonNull
  public final TextView weatherVHHumidityTxt;

  private ViewholderWeatherBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView weatherVHCityTxt, @NonNull TextView weatherVHHumidityTxt) {
    this.rootView = rootView;
    this.weatherVHCityTxt = weatherVHCityTxt;
    this.weatherVHHumidityTxt = weatherVHHumidityTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewholderWeatherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewholderWeatherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.viewholder_weather, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewholderWeatherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.weatherVH_city_txt;
      TextView weatherVHCityTxt = ViewBindings.findChildViewById(rootView, id);
      if (weatherVHCityTxt == null) {
        break missingId;
      }

      id = R.id.weatherVH_humidity_txt;
      TextView weatherVHHumidityTxt = ViewBindings.findChildViewById(rootView, id);
      if (weatherVHHumidityTxt == null) {
        break missingId;
      }

      return new ViewholderWeatherBinding((ConstraintLayout) rootView, weatherVHCityTxt,
          weatherVHHumidityTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}