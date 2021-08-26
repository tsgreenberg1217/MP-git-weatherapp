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
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Fragment12Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton frag12Btn;

  @NonNull
  public final TextView frag1Txt;

  private Fragment12Binding(@NonNull ConstraintLayout rootView, @NonNull MaterialButton frag12Btn,
      @NonNull TextView frag1Txt) {
    this.rootView = rootView;
    this.frag12Btn = frag12Btn;
    this.frag1Txt = frag1Txt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Fragment12Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Fragment12Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_1_2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Fragment12Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.frag1_2Btn;
      MaterialButton frag12Btn = ViewBindings.findChildViewById(rootView, id);
      if (frag12Btn == null) {
        break missingId;
      }

      id = R.id.frag1Txt;
      TextView frag1Txt = ViewBindings.findChildViewById(rootView, id);
      if (frag1Txt == null) {
        break missingId;
      }

      return new Fragment12Binding((ConstraintLayout) rootView, frag12Btn, frag1Txt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}