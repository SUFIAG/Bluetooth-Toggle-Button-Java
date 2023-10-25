package com.example.bluetooth_togglebutton_java;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ToggleButton mainButton;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainButton = findViewById(R.id.toggleButton);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        mainButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                bluetoothAdapter.enable();
            } else {
                bluetoothAdapter.disable();
            }
        });
    }
}