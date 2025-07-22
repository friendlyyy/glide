package com.mypackage;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ImageViewWrapper;

@BA.ShortName("GlideWrapper")
public class GlideWrapper {

    public void LoadUrl(ImageViewWrapper iv, String url) {
        ImageView nativeIV = (ImageView) iv.getObject();
        Context context = BA.applicationContext;
        Glide.with(context).load(url).into(nativeIV);
    }
}