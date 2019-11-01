package com.example.portala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void tirarFoto(View view){
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(data != null){
            Bundle bundle = data.getExtras();
            if(bundle != null){
                Bitmap img = (Bitmap) bundle.get("data");

                ImageView iv = (ImageView)findViewById(R.id.imageView5);
                iv.setImageBitmap(img);
            }
        }
    }
}
