// Generated by view binder compiler. Do not edit!
package com.example.project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

public final class ItemMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgIcon;

  @NonNull
  public final TextView itemContentView;

  @NonNull
  public final TextView itemDateView;

  @NonNull
  public final TextView itemEmailView;

  @NonNull
  public final TextView itemTitleView;

  private ItemMainBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imgIcon,
      @NonNull TextView itemContentView, @NonNull TextView itemDateView,
      @NonNull TextView itemEmailView, @NonNull TextView itemTitleView) {
    this.rootView = rootView;
    this.imgIcon = imgIcon;
    this.itemContentView = itemContentView;
    this.itemDateView = itemDateView;
    this.itemEmailView = itemEmailView;
    this.itemTitleView = itemTitleView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_icon;
      ImageView imgIcon = ViewBindings.findChildViewById(rootView, id);
      if (imgIcon == null) {
        break missingId;
      }

      id = R.id.itemContentView;
      TextView itemContentView = ViewBindings.findChildViewById(rootView, id);
      if (itemContentView == null) {
        break missingId;
      }

      id = R.id.itemDateView;
      TextView itemDateView = ViewBindings.findChildViewById(rootView, id);
      if (itemDateView == null) {
        break missingId;
      }

      id = R.id.itemEmailView;
      TextView itemEmailView = ViewBindings.findChildViewById(rootView, id);
      if (itemEmailView == null) {
        break missingId;
      }

      id = R.id.itemTitleView;
      TextView itemTitleView = ViewBindings.findChildViewById(rootView, id);
      if (itemTitleView == null) {
        break missingId;
      }

      return new ItemMainBinding((ConstraintLayout) rootView, imgIcon, itemContentView,
          itemDateView, itemEmailView, itemTitleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
