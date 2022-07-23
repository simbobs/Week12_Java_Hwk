package airline;

public enum Plane {

    BOEING747(400, 447000),
    AIRBUSA320(350, 68000),
    BOEING737(150, 85000);

    private final int capacity;
    private final int totalWeight;

    Plane(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }

}
