package com;

public class main {
    public static void main(String[] args) {

    Cars BMW = new Cars("BMW",214.7f, 2300,2020,"No, it wasn't.", 4);

    Cars Truck = new Cars("Truck",100, 6700,1999,"Yes, it was.", 0);

    Planes CornPlane = new Planes("CornPlane",150,641,1997,"Yes, it was.",10);

        System.out.println(BMW.getValues());
        System.out.println(Truck.getValues());
        System.out.println(CornPlane.getValues());
    }
}
