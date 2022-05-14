package com;

public class Planes extends Transport {
    protected int Wingspan;

    public Planes(String _name, float _MaxSpeed, float _Weight, int _YearOfManufacture, String _WasItFixed, int Wingspan) {
        super(_name, _MaxSpeed, _Weight, _YearOfManufacture, _WasItFixed);
        this.Wingspan = Wingspan;
    }

    public void setValues(String _name, float _MaxSpeed, float _Weight, int _YearOfManufacture, String _WasItFixed, int Wingspan) {
        super.setValues(_name, _MaxSpeed, _Weight, _YearOfManufacture, _WasItFixed);
        this.Wingspan = Wingspan;
    }

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        String info = "Value of wingspan: " + Wingspan + "\n";
        return info;
    }
}
