package com.animbus.music.customImpls;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.animbus.music.media.objects.Album;
import com.animbus.music.shared.Constants;

public class SquareImageViewWidth_Based extends ImageView {
    public boolean isInEditMode (){
        return true;
    }

    public SquareImageViewWidth_Based(Context context) {
        super(context);
    }

    public SquareImageViewWidth_Based(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageViewWidth_Based(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = getMeasuredWidth();
        setMeasuredDimension(width, width);
    }

    public void albumArt(final Album album) {
        setImageBitmap(Constants.defaultArt(getContext()));
        if (album != null) {
            album.requestArt(this);
        }
    }
}