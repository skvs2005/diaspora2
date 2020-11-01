package com.bestbuy.diaspora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "CLUSTER")
public class ClusterEntity implements Serializable {
    @Id
    @Column(name="CLUSTER_ID")
    private Long clusterId;

    @Column(name="CLUSTER_NAME")
    private String clusterName;

    @Column(name="CLUSTER_DESCRIPTION")
    private String clusterDescription;

    public Long getClusterId() {
        return clusterId;
    }

    public void setClusterId(Long clusterId) {
        this.clusterId = clusterId;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getClusterDescription() {
        return clusterDescription;
    }

    public void setClusterDescription(String clusterDescription) {
        this.clusterDescription = clusterDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClusterEntity that = (ClusterEntity) o;
        return clusterId.equals(that.clusterId) &&
                clusterName.equals(that.clusterName) &&
                clusterDescription.equals(that.clusterDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, clusterName, clusterDescription);
    }
}
