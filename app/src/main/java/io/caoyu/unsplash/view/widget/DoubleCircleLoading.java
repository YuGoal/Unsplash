package io.caoyu.unsplash.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * 双圆加载
 *
 * @author caoyu
 */
public class DoubleCircleLoading extends View {

    private Paint mMinPaint;

    private float mMinOvalR1 = 40;//圆环1外接矩形边长的一半
    private float mMinOvalR2 = 80; //圆环2外接矩形边长的一半
    private float mMinWidth = 18; //圆环宽度
    private float startAngle1 = -90; //圆弧1起始点
    private float startAngle2 = -90; //圆弧2起始点
    private float degree1 = 360; //圆弧1扫过的角度
    private float degree2 = 1; //圆弧2扫过的角度
    private float speed = 5; //速度

    private boolean isOk = true;


    public DoubleCircleLoading(Context context) {
        super(context);
        init();
    }

    public DoubleCircleLoading(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DoubleCircleLoading(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        //创建画笔：
        mMinPaint = new Paint();
        mMinPaint.setColor(Color.WHITE); //先随便给个颜色
        mMinPaint.setAntiAlias(true); //启用抗锯齿
        mMinPaint.setDither(true); //启用抗颜色抖动（可以让渐变更平缓）
        mMinPaint.setStyle(Paint.Style.STROKE);
        mMinPaint.setStrokeWidth(mMinWidth); //设置宽度
        mMinPaint.setStrokeCap(Paint.Cap.ROUND);//设置线头圆角
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //外接矩形
        //由于手表屏幕是正圆，所以canvas正好是正方形，于是可以用下面方法算出矩形顶点坐标。
        RectF rect1 = new RectF(canvas.getWidth() / 2 - mMinOvalR1,
                canvas.getHeight() / 2 - mMinOvalR1,
                canvas.getWidth() - (canvas.getWidth() / 2 - mMinOvalR1),
                canvas.getHeight() - (canvas.getHeight() / 2 - mMinOvalR1));

        RectF rect2 = new RectF(canvas.getWidth() / 2 - mMinOvalR2,
                canvas.getHeight() / 2 - mMinOvalR2,
                canvas.getWidth() - (canvas.getWidth() / 2 - mMinOvalR2),
                canvas.getHeight() - (canvas.getHeight() / 2 - mMinOvalR2));
        if (isOk) {
            //1.外圆开始加载
            degree2 += speed;
            //2.内圆开始缩小
            degree1 -= speed;
            startAngle1 += speed;
            startAngle2 += speed;
            if (degree2 >= 360) {
                isOk = false;
                startAngle2 = -90;
                startAngle1 = -90;
            }
        } else {
            //1.外圆开始缩小
            degree2 -= speed;
            //2.内圆开始加载
            degree1 += speed;

            startAngle1 += speed;
            startAngle2 += speed;
            if (degree2 <= 1) {
                isOk = true;
                startAngle2 = -90;
                startAngle1 = -90;
            }
        }
        //画弧2
        canvas.drawArc(rect1, startAngle1, degree1, false, mMinPaint);
        canvas.drawArc(rect2, startAngle2, degree2, false, mMinPaint);
        invalidate();
    }
}
