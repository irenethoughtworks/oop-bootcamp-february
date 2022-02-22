package oop;

public interface Measure {

    MeasureType getName();

    double getValue();

    double to(MeasureType measureName);

}
