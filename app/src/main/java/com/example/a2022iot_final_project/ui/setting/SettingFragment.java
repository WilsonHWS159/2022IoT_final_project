package com.example.a2022iot_final_project.ui.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a2022iot_final_project.databinding.FragmentSettingBinding;

public class SettingFragment extends Fragment {
    private FragmentSettingBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        SettingViewModel SVM = new ViewModelProvider(this).get(SettingViewModel.class);
        binding = FragmentSettingBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    public  void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
