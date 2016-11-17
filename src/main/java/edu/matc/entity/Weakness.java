package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "weaknesses", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(WeaknessPK.class)
public class Weakness {
    private String name;
    private String weakness;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "weakness")
    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Weakness weakness1 = (Weakness) o;

        if (name != null ? !name.equals(weakness1.name) : weakness1.name != null) return false;
        if (weakness != null ? !weakness.equals(weakness1.weakness) : weakness1.weakness != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (weakness != null ? weakness.hashCode() : 0);
        return result;
    }
}
