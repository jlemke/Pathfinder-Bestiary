package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "treasures", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(TreasurePK.class)
public class Treasure {
    private String name;
    private String treasure;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "treasure")
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

        Treasure treasure1 = (Treasure) o;

        if (name != null ? !name.equals(treasure1.name) : treasure1.name != null) return false;
        if (treasure != null ? !treasure.equals(treasure1.treasure) : treasure1.treasure != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (treasure != null ? treasure.hashCode() : 0);
        return result;
    }
}
