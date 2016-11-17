package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "special_qualities", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(SpecialQualityPK.class)
public class SpecialQuality {
    private String name;
    private String quality;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "quality")
    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpecialQuality that = (SpecialQuality) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (quality != null ? !quality.equals(that.quality) : that.quality != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (quality != null ? quality.hashCode() : 0);
        return result;
    }
}
