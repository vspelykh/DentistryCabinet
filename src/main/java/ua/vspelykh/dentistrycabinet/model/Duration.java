package ua.vspelykh.dentistrycabinet.model;

public enum Duration {

    DURATION(5), DURATION1(10);
    final int minutes;

    Duration(int minutes){
    this.minutes = minutes;
    }
}
