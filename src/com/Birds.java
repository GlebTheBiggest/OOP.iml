package com;

public class Birds {
    protected int HighOfFlight;
    protected int MinHighOfFlight;

    public Birds (int _HighOfFlight, int _MinHighOfFlight) {
        setBirdsValues(_HighOfFlight, _MinHighOfFlight);
    }

    public void setBirdsValues(int HighOfFlight, int MinHighOfFlight) {
        this.HighOfFlight = HighOfFlight;
        this.MinHighOfFlight = MinHighOfFlight;
    }

    public String getBirdsValues() {
        String info = "High of flight: " + HighOfFlight + "\n" + " Minimal high of flight" + MinHighOfFlight + "\n";
        return info;
    }
}
