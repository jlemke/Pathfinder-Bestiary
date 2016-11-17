package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class FeatPK implements Serializable {
    private String name;
    private String feat;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "feat")
    @Id
    public String getFeat() {
        return feat;
    }

    public void setFeat(String feat) {
        this.feat = feat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FeatPK featPK = (FeatPK) o;

        if (name != null ? !name.equals(featPK.name) : featPK.name != null) return false;
        if (feat != null ? !feat.equals(featPK.feat) : featPK.feat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (feat != null ? feat.hashCode() : 0);
        return result;
    }
}
