package edu.matc.entity;

import javax.persistence.*;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "speeds", schema = "pathfinder_bestiarydb", catalog = "")
@IdClass(SpeedPK.class)
public class Speed {
    private String name;
    private String type;
    private Integer speed;
    private String maneuverability;

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "speed")
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Basic
    @Column(name = "maneuverability")
    public String getManeuverability() {
        return maneuverability;
    }

    public void setManeuverability(String maneuverability) {
        this.maneuverability = maneuverability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Speed speed1 = (Speed) o;

        if (name != null ? !name.equals(speed1.name) : speed1.name != null) return false;
        if (type != null ? !type.equals(speed1.type) : speed1.type != null) return false;
        if (speed != null ? !speed.equals(speed1.speed) : speed1.speed != null) return false;
        if (maneuverability != null ? !maneuverability.equals(speed1.maneuverability) : speed1.maneuverability != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (speed != null ? speed.hashCode() : 0);
        result = 31 * result + (maneuverability != null ? maneuverability.hashCode() : 0);
        return result;
    }
}
