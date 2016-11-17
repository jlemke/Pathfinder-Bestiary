package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "subtypes", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(SubtypePK.class)
public class Subtype {
    private String name;
    private String subtype;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "subtype")
    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subtype subtype1 = (Subtype) o;

        if (name != null ? !name.equals(subtype1.name) : subtype1.name != null) return false;
        if (subtype != null ? !subtype.equals(subtype1.subtype) : subtype1.subtype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (subtype != null ? subtype.hashCode() : 0);
        return result;
    }
}
