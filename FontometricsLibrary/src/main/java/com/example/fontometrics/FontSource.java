package com.example.fontometrics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


final class FontSource {
    public static Typeface process(int resource, Context context){
        Typeface mTypeface;
        InputStream mInputStream = null;

        String mOutPath = context.getCacheDir() + "/tmp" + System.currentTimeMillis() + ".raw";

        try{
            mInputStream = context.getResources().openRawResource(resource);
        }catch (Resources.NotFoundException e){
                    }

        try{
            byte[] mBuffer = new byte[mInputStream.available()];
            BufferedOutputStream mStream = new BufferedOutputStream(new FileOutputStream(mOutPath));
            int num;
            while ((num = mInputStream.read(mBuffer)) > 0){
                mStream.write(mBuffer, 0, num);
            }
            mStream.close();
            mTypeface = Typeface.createFromFile(mOutPath);
            new File(mOutPath).delete();
        }catch (IOException e){
            return null;
        }

        return mTypeface;
    }
}
