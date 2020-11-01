package com.bestbuy.diaspora.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cluster {

    @JsonProperty("clusterName")
    private String name ;
    @JsonProperty("clusterDescription")
    private String description ;

    @JsonProperty("clusterId")
    private Long id;

    public Cluster(String name, String description, Long id) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public Cluster() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cluster{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cluster cluster = (Cluster) o;
        return name.equals(cluster.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
