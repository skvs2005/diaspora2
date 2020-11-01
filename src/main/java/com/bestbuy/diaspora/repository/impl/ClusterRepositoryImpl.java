package com.bestbuy.diaspora.repository.impl;

import com.bestbuy.diaspora.domain.Cluster;
import com.bestbuy.diaspora.entities.ClusterEntity;
import com.bestbuy.diaspora.exception.ClusterNotFoundException;
import com.bestbuy.diaspora.jparepositories.ClusterJpaRepository;
import com.bestbuy.diaspora.repository.ClusterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClusterRepositoryImpl
        implements ClusterRepository {

    @Autowired
    ClusterJpaRepository clusterJpaRepository;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Cluster findCluster(String name) {
        ClusterEntity clusterEntity = clusterJpaRepository.findByClusterName(name);

        if (clusterEntity == null)
        {
            throw new ClusterNotFoundException("Did not find cluster named: '" + name+"'");
        }

        logger.info("clusterEntity id found:{}", clusterEntity.getClusterId());
        Cluster cluster = new Cluster();
        cluster.setId(clusterEntity.getClusterId());
        cluster.setName(clusterEntity.getClusterName());
        cluster.setDescription(clusterEntity.getClusterDescription());

        return cluster;
    }
}
