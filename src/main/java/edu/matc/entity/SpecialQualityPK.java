package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class SpecialQualityPK implements Serializable {
    private String name;
    private String quality;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "quality")
    @Id
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

        SpecialQualityPK that = (SpecialQualityPK) o;

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
