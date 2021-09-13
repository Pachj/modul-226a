public class Heater {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heater(int min, int max) {
        this.temperature = 15;
        this.min = min;
        this.max = max;
        this.increment = 5;
    }

    public void warmer() {
        if ((this.temperature += this.increment) <= max) {
            this.temperature += this.increment;
        }
    }

    public void cooler() {
        if ((this.temperature -= this.increment) >= min) {
            this.temperature -= this.increment;
        }
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }
}
