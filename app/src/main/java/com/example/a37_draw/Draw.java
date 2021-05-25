package com.example.a37_draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Draw extends View {
    public Draw (Context context){
        super(context);
    }


    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();

        int px = 0;
        int py = 0;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.argb(255,77,169,214));
        canvas.drawPaint(paint);


        //солнце
        paint.setColor(Color.argb(255,255,196,0));
        px=50;
        py=50;
        canvas.drawCircle(px,py,300,paint);
        paint.setStrokeWidth(7);


        //дом
        //основа
        paint.setColor(Color.rgb(205, 108, 41));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(100,1100,700, 1900,paint);
        //крыша
        float rotate_center_x = 500; //центр поворота холста по оси X
        float rotate_center_y = 1000; // центр поворота холста по оси Y
        float rotate_angle = 315; //угол поворота
        canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);
        canvas.drawRect(290,930,700, 1355,paint);
        canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);

        //прорисовка границ дома и крыши
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setStyle(Paint.Style.STROKE);
        //границы крыши
        canvas.drawLine(100,1100, 400, 800,paint);
        canvas.drawLine(400,800, 700, 1100,paint);
        //границы дома
        canvas.drawRect(100,1100,700, 1900,paint);
        //окно на крыше
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(Color.argb(150,5, 5, 100));
        canvas.drawCircle(400,1000,60,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.rgb(0, 0, 0));
        canvas.drawCircle(400,1000,60,paint);



        //дверь
        paint.setColor(Color.argb(150,98, 240, 211));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(200,1400,300, 1700,paint);
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(200,1400,300, 1700,paint);
        int addY = 0, addX = 0;
        for (int i =0; i<9; i++){
            canvas.drawLine(200,1430+addY, 210+addX, 1400, paint);
            addX+=10;addY+=30;
        }
        addY = 0; addX = 0;
        for (int i =0; i<10; i++){
            canvas.drawLine(300,1670-addY, 290-addX, 1700, paint);
            addX+=10;addY+=30;
        }

        //дверь
        paint.setColor(Color.rgb(240, 240, 98));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);


        px=600;
        py=1600;
        for (int i=0;i<11;i++) {
            px-=20;
            py+=30;
        }
        px=400;
        py=1900;
        for (int i=0;i<10;i++) {
            px+=20;
            py-=30;
        }
        //дерево
        paint.setStrokeWidth(7);
        paint.setColor(Color.argb(255,107,40,6));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawRect(900,800,1000, 1900,paint);
        paint.setColor(Color.rgb(0, 0, 0));
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(900,800,1000, 1900,paint);

        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(Color.argb(255,57,140,18));
        canvas.drawCircle(900,800,400,paint);

    }
}
