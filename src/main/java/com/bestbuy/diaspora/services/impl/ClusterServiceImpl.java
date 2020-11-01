package com.bestbuy.diaspora.services.impl;

import com.bestbuy.diaspora.domain.Cluster;
import com.bestbuy.diaspora.exception.ClusterNotFoundException;
import com.bestbuy.diaspora.repository.ClusterRepository;
import com.bestbuy.diaspora.services.ClusterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClusterServiceImpl implements ClusterService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ClusterRepository clusterRepository;

    @Override
    public Cluster getCluster(String clusterName) {
        logger.info("Retrieving Cluster named:{}", clusterName);
        Cluster cluster = clusterRepository.findCluster(clusterName);




        return cluster;

    }
}
