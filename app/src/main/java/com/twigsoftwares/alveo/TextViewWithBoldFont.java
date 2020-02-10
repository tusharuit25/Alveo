package com.twigsoftwares.alveo;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class TextViewWithBoldFont extends androidx.appcompat.widget.AppCompatTextView {
    private static Typeface mTypeface;
    public TextViewWithBoldFont(final Context context) {
        this(context, null);
    }
    public TextViewWithBoldFont(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public TextViewWithBoldFont(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        if (mTypeface == null) {
            mTypeface = Typeface.createFromAsset(context.getAssets(), "SFProDisplay-Bold.ttf");
        }
        setTypeface(mTypeface);
    }

}
