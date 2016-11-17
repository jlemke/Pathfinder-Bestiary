package edu.matc.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Joe on 11/16/2016.
 */
@Entity
@Table(name = "ecology")
@SecondaryTables({
        @SecondaryTable(name="environments", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="organizations", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") }),
        @SecondaryTable(name="treasures", pkJoinColumns={
                @PrimaryKeyJoinColumn(name="name", referencedColumnName="name") })
})
public class Ecology {
    private String name;
    private String treasureType;
    private String description;
    private List<Environment> environments;
    private List<Organization> organizations;
    private List<Treasure> treasures;

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "environments")
    public List<Environment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<Environment> environments) {
        this.environments = environments;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "organizations")
    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    @OneToMany
    @JoinColumn(name = "name")
    @Column(table = "treasures")
    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }



    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "treasureType")
    public String getTreasureType() {
        return treasureType;
    }

    public void setTreasureType(String treasureType) {
        this.treasureType = treasureType;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ecology ecology = (Ecology) o;

        if (name != null ? !name.equals(ecology.name) : ecology.name != null) return false;
        if (treasureType != null ? !treasureType.equals(ecology.treasureType) : ecology.treasureType != null)
            return false;
        if (description != null ? !description.equals(ecology.description) : ecology.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (treasureType != null ? treasureType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
