package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class SensePK implements Serializable {
    private String name;
    private String sense;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "sense")
    @Id
    public String getSense() {
        return sense;
    }

    public void setSense(String sense) {
        this.sense = sense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SensePK sensePK = (SensePK) o;

        if (name != null ? !name.equals(sensePK.name) : sensePK.name != null) return false;
        if (sense != null ? !sense.equals(sensePK.sense) : sensePK.sense != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sense != null ? sense.hashCode() : 0);
        return result;
    }
}
