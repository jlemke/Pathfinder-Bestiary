package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class GearPK implements Serializable {
    private String name;
    private String gear;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "gear")
    @Id
    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GearPK gearPK = (GearPK) o;

        if (name != null ? !name.equals(gearPK.name) : gearPK.name != null) return false;
        if (gear != null ? !gear.equals(gearPK.gear) : gearPK.gear != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (gear != null ? gear.hashCode() : 0);
        return result;
    }
}
