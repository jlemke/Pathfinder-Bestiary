package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "feats", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(FeatPK.class)
public class Feat {
    private String name;
    private String feat;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "feat")
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

        Feat feat1 = (Feat) o;

        if (name != null ? !name.equals(feat1.name) : feat1.name != null) return false;
        if (feat != null ? !feat.equals(feat1.feat) : feat1.feat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (feat != null ? feat.hashCode() : 0);
        return result;
    }
}
