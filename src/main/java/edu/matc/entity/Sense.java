package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "senses", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(SensePK.class)
public class Sense {
    private String name;
    private String sense;
    private Integer distance;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "sense")
    public String getSense() {
        return sense;
    }

    public void setSense(String sense) {
        this.sense = sense;
    }

    @Basic
    @Column(name = "distance")
    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sense sense1 = (Sense) o;

        if (name != null ? !name.equals(sense1.name) : sense1.name != null) return false;
        if (sense != null ? !sense.equals(sense1.sense) : sense1.sense != null) return false;
        if (distance != null ? !distance.equals(sense1.distance) : sense1.distance != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sense != null ? sense.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        return result;
    }
}
