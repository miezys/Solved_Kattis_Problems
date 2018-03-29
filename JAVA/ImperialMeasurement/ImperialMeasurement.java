/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/measurement
*/


public class ImperialMeasurement {
    private String unit;
    private String unitShort;
    private int value;

    public ImperialMeasurement(String unit,String unitShort, int value) {
        this.unit = unit;
        this.unitShort = unitShort;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getUnit() {

        return unit;
    }

    public String getUnitShort() {
        return unitShort;
    }
}