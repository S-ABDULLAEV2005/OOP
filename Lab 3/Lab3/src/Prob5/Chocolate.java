package Prob5;


import java.util.Arrays;

class Chocolate implements Comparable<Chocolate> {
     double weight;
     String name;

    public Chocolate(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Chocolate [name = " + name + ", weight = " + weight + "]";
    }
}