package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "auras", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(AuraPK.class)
public class Aura {
    private String name;
    private String aura;
    private Integer distance;
    private Integer dc;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "aura")
    public String getAura() {
        return aura;
    }

    public void setAura(String aura) {
        this.aura = aura;
    }

    @Basic
    @Column(name = "distance")
    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Basic
    @Column(name = "dc")
    public Integer getDc() {
        return dc;
    }

    public void setDc(Integer dc) {
        this.dc = dc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aura aura1 = (Aura) o;

        if (name != null ? !name.equals(aura1.name) : aura1.name != null) return false;
        if (aura != null ? !aura.equals(aura1.aura) : aura1.aura != null) return false;
        if (distance != null ? !distance.equals(aura1.distance) : aura1.distance != null) return false;
        if (dc != null ? !dc.equals(aura1.dc) : aura1.dc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (aura != null ? aura.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (dc != null ? dc.hashCode() : 0);
        return result;
    }
}
