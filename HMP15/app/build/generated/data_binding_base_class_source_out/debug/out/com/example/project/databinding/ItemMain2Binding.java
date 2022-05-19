// Generated by view binder compiler. Do not edit!
package com.example.project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemMain2Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView item2ContentView;

  @NonNull
  public final TextView item2EmailView;

  @NonNull
  public final TextView item2TitleView;

  private ItemMain2Binding(@NonNull ConstraintLayout rootView, @NonNull TextView item2ContentView,
      @NonNull TextView item2EmailView, @NonNull TextView item2TitleView) {
    this.rootView = rootView;
    this.item2ContentView = item2ContentView;
    this.item2EmailView = item2EmailView;
    this.item2TitleView = item2TitleView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_main2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMain2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item2ContentView;
      TextView item2ContentView = ViewBindings.findChildViewById(rootView, id);
      if (item2ContentView == null) {
        break missingId;
      }

      id = R.id.item2EmailView;
      TextView item2EmailView = ViewBindings.findChildViewById(rootView, id);
      if (item2EmailView == null) {
        break missingId;
      }

      id = R.id.item2TitleView;
      TextView item2TitleView = ViewBindings.findChildViewById(rootView, id);
      if (item2TitleView == null) {
        break missingId;
      }

      return new ItemMain2Binding((ConstraintLayout) rootView, item2ContentView, item2EmailView,
          item2TitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
