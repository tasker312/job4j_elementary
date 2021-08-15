package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("length ages = " + ages.length);
        System.out.println("length surnames = " + surnames.length);
        System.out.println("length prices = " + prices.length);
        String[] names = new String[4];
        names[0] = "Ivan";
        names[1] = "Dmitriy";
        names[2] = "Evgeniy";
        names[3] = "Grigory";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
