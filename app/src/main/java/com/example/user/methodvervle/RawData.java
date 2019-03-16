package com.example.user.methodvervle;

public class RawData {
    double[] accel = new double[3];
    double[] rot = new double[3];
    double timestamp;

    RawData(double[] accel, double[] rot, double timestamp) {
        this.accel = accel;
        this.rot = rot;
        this.timestamp = timestamp;
    }
}
