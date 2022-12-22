package com.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class DemoActivity {
    public static void setData(Context context,String msg){
        Toast.makeText(context, "Hello run", Toast.LENGTH_SHORT).show();
    }
}
