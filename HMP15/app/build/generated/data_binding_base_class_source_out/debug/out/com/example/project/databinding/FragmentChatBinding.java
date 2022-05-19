// Generated by view binder compiler. Do not edit!
package com.example.project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSend;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final EditText etChatting;

  @NonNull
  public final RecyclerView rvList;

  private FragmentChatBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnSend,
      @NonNull ConstraintLayout constraintLayout, @NonNull EditText etChatting,
      @NonNull RecyclerView rvList) {
    this.rootView = rootView;
    this.btnSend = btnSend;
    this.constraintLayout = constraintLayout;
    this.etChatting = etChatting;
    this.rvList = rvList;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_send;
      Button btnSend = ViewBindings.findChildViewById(rootView, id);
      if (btnSend == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = ViewBindings.findChildViewById(rootView, id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.et_chatting;
      EditText etChatting = ViewBindings.findChildViewById(rootView, id);
      if (etChatting == null) {
        break missingId;
      }

      id = R.id.rv_list;
      RecyclerView rvList = ViewBindings.findChildViewById(rootView, id);
      if (rvList == null) {
        break missingId;
      }

      return new FragmentChatBinding((ConstraintLayout) rootView, btnSend, constraintLayout,
          etChatting, rvList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
