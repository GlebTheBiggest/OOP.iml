package com;

public class Transport {
    protected String name;
    protected float MaxSpeed;
    protected float Weight;
    protected int YearOfManufacture;
    protected String WasItFixed;

    public Transport(String _name, float _MaxSpeed, float _Weight, int _YearOfManufacture, String _WasItFixed) {
        setValues(_name, _MaxSpeed, _Weight, _YearOfManufacture, _WasItFixed);
    }

    public void setValues(String _name, float _MaxSpeed, float _Weight, int _YearOfManufacture, String _WasItFixed) {
        name = _name;
        MaxSpeed = _MaxSpeed;
        Weight = _Weight;
        YearOfManufacture = _YearOfManufacture;
        WasItFixed = _WasItFixed;
    }

    public String getValues() {
        String information = "Name: " + name + "\n" + "MaxSpeed: " + MaxSpeed + "\n" + "Weight: " + Weight + "\n" + "Year of manufacture: " + YearOfManufacture + "\n" + "Was it fixed: " + WasItFixed;
        return information;
    }
}
