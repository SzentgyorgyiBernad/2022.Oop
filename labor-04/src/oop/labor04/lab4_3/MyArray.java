package oop.labor04.lab4_3;

import oop.labor04.lab4_2.Customer2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MyArray {
    int length;
    double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements = new double[length];
    }

    public MyArray(double[] elements) {
        this.elements = elements;
        this.length = elements.length;
    }

    public MyArray(MyArray myArray) {
        this.length = myArray.length;
        this.elements = myArray.elements;
    }

    public MyArray(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                length = Integer.parseInt(line);
                elements = new double[length];
                line = scanner.nextLine();
                String[] data = line.split(" ");
                for (int i = 0; i < length; ++i) {
                    elements[i] = Double.parseDouble(data[i]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fillRandom(int a, int b) {
        Random random = new Random();
        for (int i = 0; i < elements.length; ++i) {
            elements[i] = random.nextDouble(a,b);
        }
    }

    public double mean() {
        double avg = 0;
        for (double e: elements) {
            avg += e;
        }
        return avg / elements.length;
    }

    public double stddev() {
        double standardDeviation = 0.0;

        double mean = mean();

        for(double num: elements) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/ elements.length);
    }

    public void sort() {
        int pos;
        double temp;
        for (int i = 0; i < length; i++)
        {
            pos = i;
            for (int j = i+1; j < length; j++)
            {
                if (elements[j] < elements[pos])
                {
                    pos = j;
                }
            }

            temp = elements[pos];
            elements[pos] = elements[i];
            elements[i] = temp;
        }
    }

    public void print(String name) {
        System.out.println(name + " " + Arrays.toString(elements));
    }
}