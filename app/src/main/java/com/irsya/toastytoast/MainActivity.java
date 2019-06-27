package com.irsya.toastytoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    Button btn_error, btn_success, btn_info, btn_warning, btn_normal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_error = findViewById(R.id.btn_error);
        btn_success = findViewById(R.id.btn_success);
        btn_info = findViewById(R.id.btn_info);
        btn_warning = findViewById(R.id.btn_warning);
        btn_normal = findViewById(R.id.btn_normal);

        btn_error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(MainActivity.this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
            }
        });

        btn_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(MainActivity.this, "This is an success toast.", Toast.LENGTH_SHORT, true).show();
            }
        });

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.info(MainActivity.this, "This is an info toast.", Toast.LENGTH_SHORT, true).show();
            }
        });

        btn_warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.warning(MainActivity.this, "This is an warning toast.", Toast.LENGTH_SHORT, true).show();
            }
        });

        btn_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.normal(MainActivity.this, "This is an normal toast.").show();
            }
        });
    }
}
