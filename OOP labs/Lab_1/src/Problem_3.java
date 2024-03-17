public class Problem_3 {
    private double temperature;
    private char scale;

    // Constructors
    public Problem_3() {
        this.temperature = 0.0;
        this.scale = 'C';
    }

    public Problem_3(double temperature) {
        this.temperature = temperature;
        this.scale = 'C'; // Default scale is Celsius
    }

    public Problem_3(char scale) {
        this.temperature = 0.0;
        this.scale = Character.toUpperCase(scale);
    }

    public Problem_3(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = Character.toUpperCase(scale);
    }

    // Accessor methods
    public double getTemperatureInCelsius() {
        if (scale == 'C') {
            return temperature;
        } else {
            return (temperature - 32) * 5 / 9;
        }
    }

    public double getTemperatureInFahrenheit() {
        if (scale == 'F') {
            return temperature;
        } else {
            return (temperature * 9 / 5) + 32;
        }
    }

    public char getScale() {
        return scale;
    }

    // Mutator methods
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = Character.toUpperCase(scale);
    }

    public void setTemperatureAndScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = Character.toUpperCase(scale);
    }

    public static void main(String[] args) {
        Problem_3 temp1 = new Problem_3();
        Problem_3 temp2 = new Problem_3(32, 'F');
        Problem_3 temp3 = new Problem_3(100);

        System.out.println("Temp1 in Celsius: " + temp1.getTemperatureInCelsius());
        System.out.println("Temp2 in Celsius: " + temp2.getTemperatureInCelsius());
        System.out.println("Temp3 in Fahrenheit: " + temp3.getTemperatureInFahrenheit());
    }
}
