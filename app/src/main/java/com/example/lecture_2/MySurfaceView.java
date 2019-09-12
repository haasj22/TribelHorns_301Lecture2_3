package com.example.lecture_2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class MySurfaceView extends SurfaceView {
    private int radius;


    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setWillNotDraw(false);
        radius=0;
    }


    public void onDraw(Canvas canvas) {
        Paint paint= new Paint();
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(5.0f);

        canvas.drawRect(5.0f, 10.0f, 15.0f, 10.0f, paint);

        Bitmap myImage= BitmapFactory.decodeResource(getResources(), R.drawable.imagegood);
        canvas.drawBitmap(myImage, 100, 100, null);
    }
}
