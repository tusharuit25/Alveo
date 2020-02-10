package com.twigsoftwares.alveo;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class TextViewWithRegularFont extends androidx.appcompat.widget.AppCompatTextView {
    private static Typeface mTypeface;
    public TextViewWithRegularFont(final Context context) {
        this(context, null);
    }
    public TextViewWithRegularFont(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public TextViewWithRegularFont(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);

        if (mTypeface == null) {
            mTypeface = Typeface.createFromAsset(context.getAssets(), "SFProDisplay-Regular.ttf");
        }
        setTypeface(mTypeface);
    }
}

