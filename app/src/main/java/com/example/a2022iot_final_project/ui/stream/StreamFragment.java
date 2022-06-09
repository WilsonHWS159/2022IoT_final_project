package com.example.a2022iot_final_project.ui.stream;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a2022iot_final_project.databinding.FragmentStreamBinding;

public class StreamFragment extends Fragment {
    private FragmentStreamBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        StreamViewModel SVM = new ViewModelProvider(this).get(StreamViewModel.class);
        binding = FragmentStreamBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
