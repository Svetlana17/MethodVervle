package com.example.user.methodvervle;

import android.hardware.Sensor;
import android.hardware.SensorEvent;

public class MySensorEvent {
    public int accuracy;
    public Sensor sensor;
    public long timestamp;
    public long time;
    public  float[] values = null;

    public MySensorEvent(SensorEvent data, long time){
        this.accuracy = data.accuracy;
        this.sensor = data.sensor;
        this.timestamp = data.timestamp;
        this.values = data.values;
        this.time=time;
    }

}
