package com;

public class Cars extends Transport {
protected int numberOfAirbags;

    public Cars(String _name, float _MaxSpeed, float _Weight, int _YearOfManufacture, String _WasItFixed, int NumberOfAirbags) {
        super(_name, _MaxSpeed, _Weight, _YearOfManufacture, _WasItFixed);
        this.NumberOfAirbags = NumberOfAirbags;
    }

    @Override
    public int GetNumberOfAirbag () {
        // System.out.println(super.getValues());
        String info = "Number of airbags: " + NumberOfAirbags + "\n";
        return info;
    }

    public void  CurrentSpeed()
    {
        speed* turbo;
    }

    public void showValues() {
        System.out.println(NumberOfAirbags);
    }
}
