package personelle;

import airline.Plane;

public class Pilot extends Person {

    private String license;
    private Rank rank;

    public Pilot(String name, Rank rank, String license){
        super(name);
        this.rank = rank;
        this.license = license;
    }


    public Rank getRank() {
        return this.rank;
    }

    public String getLicense() {
        return this.license;
    }

    public String flyPlane(Plane plane) {
        return "The capacity of this plane is " + plane.getCapacity();
    }
}
