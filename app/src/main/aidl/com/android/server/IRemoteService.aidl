package com.android.server;

import com.android.server.Rectangular;

interface IRemoteService {

    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

    int getArea(in Rectangular rect);

}
