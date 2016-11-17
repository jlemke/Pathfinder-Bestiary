package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class TreasurePK implements Serializable {
    private String name;
    private String treasure;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "treasure")
    @Id
    public String getTreasure() {
        return treasure;
    }

    public void setTreasure(String treasure) {
        this.treasure = treasure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreasurePK that = (TreasurePK) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (treasure != null ? !treasure.equals(that.treasure) : that.treasure != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (treasure != null ? treasure.hashCode() : 0);
        return result;
    }
}
