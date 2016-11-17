package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class SubtypePK implements Serializable {
    private String name;
    private String subtype;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "subtype")
    @Id
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

        SubtypePK subtypePK = (SubtypePK) o;

        if (name != null ? !name.equals(subtypePK.name) : subtypePK.name != null) return false;
        if (subtype != null ? !subtype.equals(subtypePK.subtype) : subtypePK.subtype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (subtype != null ? subtype.hashCode() : 0);
        return result;
    }
}
