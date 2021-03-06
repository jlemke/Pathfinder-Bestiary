package edu.matc.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Joe on 11/16/2016.
 */
public class EnvironmentPK implements Serializable {
    private String name;
    private String environment;

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "environment")
    @Id
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnvironmentPK that = (EnvironmentPK) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (environment != null ? !environment.equals(that.environment) : that.environment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (environment != null ? environment.hashCode() : 0);
        return result;
    }
}
