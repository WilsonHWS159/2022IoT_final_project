package com.example.a2022iot_final_project.ui.sensors;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a2022iot_final_project.databinding.FragmentSensorsBinding;

public class SensorsFragment extends Fragment {
    private FragmentSensorsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        SensorsViewModel SVM = new ViewModelProvider(this).get(SensorsViewModel.class);
        binding = FragmentSensorsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textSensors;
        SVM.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
