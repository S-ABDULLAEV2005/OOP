package Prob5;

class Time implements Comparable<Time> {
    int hours;
    int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public int compareTo(Time other) {
        if (this.hours != other.hours) {
            return Integer.compare(this.hours, other.hours);
        } else {
            return Integer.compare(this.minutes, other.minutes);
        }
    }

    @Override
    public String toString() {
        return "Time [hours = " + hours + ", minutes = " + minutes + "]";
    }
}

class Sort {
    static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static <E extends Comparable<E>> void bubbleSort(E[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }

            
            if (!swapped) {
                break;
            }
        }
    }

    static <E extends Comparable<E>> void mergeSort(E[] array) {
        
    }
}


