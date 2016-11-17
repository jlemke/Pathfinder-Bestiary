package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class AuraPK implements Serializable {
    private String name;
    private String aura;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "aura")
    @Id
    public String getAura() {
        return aura;
    }

    public void setAura(String aura) {
        this.aura = aura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuraPK auraPK = (AuraPK) o;

        if (name != null ? !name.equals(auraPK.name) : auraPK.name != null) return false;
        if (aura != null ? !aura.equals(auraPK.aura) : auraPK.aura != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (aura != null ? aura.hashCode() : 0);
        return result;
    }
}
