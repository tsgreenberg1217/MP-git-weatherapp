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

public final class Fragment22Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton frag2Btn;

  @NonNull
  public final TextView frag2Txt;

  private Fragment22Binding(@NonNull ConstraintLayout rootView, @NonNull MaterialButton frag2Btn,
      @NonNull TextView frag2Txt) {
    this.rootView = rootView;
    this.frag2Btn = frag2Btn;
    this.frag2Txt = frag2Txt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Fragment22Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Fragment22Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_2_2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Fragment22Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.frag2Btn;
      MaterialButton frag2Btn = ViewBindings.findChildViewById(rootView, id);
      if (frag2Btn == null) {
        break missingId;
      }

      id = R.id.frag2Txt;
      TextView frag2Txt = ViewBindings.findChildViewById(rootView, id);
      if (frag2Txt == null) {
        break missingId;
      }

      return new Fragment22Binding((ConstraintLayout) rootView, frag2Btn, frag2Txt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
