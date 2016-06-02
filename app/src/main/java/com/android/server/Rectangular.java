package com.android.server;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 自定义数据类型
 */
public class Rectangular implements Parcelable{

    public int left;
    public int right;
    public int top;
    public int bottom;

    public Rectangular(){

    }

    public Rectangular(Parcel in){
        readFromParcel(in);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(left);
        dest.writeInt(right);
        dest.writeInt(top);
        dest.writeInt(bottom);
    }

    public void readFromParcel(Parcel in){
        left = in.readInt();
        right = in.readInt();
        top = in.readInt();
        bottom = in.readInt();
    }

    public static final Parcelable.Creator<Rectangular> CREATOR = new Parcelable.Creator<Rectangular>(){

        @Override
        public Rectangular createFromParcel(Parcel source) {
            return new Rectangular(source);
        }

        @Override
        public Rectangular[] newArray(int size) {
            return new Rectangular[size];
        }

    };
}
