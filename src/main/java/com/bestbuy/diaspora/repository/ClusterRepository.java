package com.bestbuy.diaspora.repository;

import com.bestbuy.diaspora.domain.Cluster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClusterRepository {
  public Cluster findCluster(String name);
}
