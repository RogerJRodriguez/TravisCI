package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float val = (float) ((this.getValue() - 32) * 5/9);
        return new Celsius(val);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}
