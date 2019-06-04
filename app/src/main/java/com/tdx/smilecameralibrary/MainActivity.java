package com.tdx.smilecameralibrary;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.tdx.smilecamera.JCameraView;
import com.tdx.smilecamera.listener.ClickListener;
import com.tdx.smilecamera.listener.ErrorListener;
import com.tdx.smilecamera.listener.JCameraListener;
import com.tdx.smilecamera.util.FileUtil;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PermissionsUtils.getVideoPermissions(MainActivity.this);
        findViewById(R.id.tv_to).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, CameraActivity.class), 100);
            }
        });

    }


}
