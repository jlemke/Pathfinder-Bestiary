package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class WeaknessPK implements Serializable {
    private String name;
    private String weakness;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "weakness")
    @Id
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

        WeaknessPK that = (WeaknessPK) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (weakness != null ? !weakness.equals(that.weakness) : that.weakness != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (weakness != null ? weakness.hashCode() : 0);
        return result;
    }
}
