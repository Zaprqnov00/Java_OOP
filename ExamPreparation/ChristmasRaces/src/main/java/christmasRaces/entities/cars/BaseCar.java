package christmasRaces.entities.cars;

import christmasRaces.common.ExceptionMessages;

public abstract class BaseCar implements Car{
    private String model;
    private int horsePower;
    private double cubicCentimeters;

    protected BaseCar(String model, int horsePower, double cubicCentimeters) {
        setModel(model);
        setHorsePower(horsePower);
        setCubicCentimeters(cubicCentimeters);
    }

    private void setModel(String model) {
        if (model == null || model.trim().length() < 4){
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_MODEL,model,4));
        }
        this.model = model;
    }

    private void setHorsePower(int horsePower) {
        checkHorsePower(horsePower);
        this.horsePower = horsePower;
    }

    protected abstract void checkHorsePower(int horsePower);

    private void setCubicCentimeters(double cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public double getCubicCentimeters() {
        return this.cubicCentimeters;
    }

    @Override
    public double calculateRacePoints(int laps) {
        return cubicCentimeters / horsePower * laps;
    }
}
