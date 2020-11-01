package com.bestbuy.diaspora.controllers;

import com.bestbuy.diaspora.domain.Cluster;
import com.bestbuy.diaspora.exception.ClusterNotFoundException;
import com.bestbuy.diaspora.services.ClusterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cluster")
public class ClusterController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ClusterService clusterService;

    @GetMapping(value = "/{clusterName}", produces = "application/json")
    public ResponseEntity<Cluster> getCluster(@PathVariable String clusterName) {
        logger.info("Get Cluster by name:{}", clusterName);


        Cluster cluster = clusterService.getCluster(clusterName);
        logger.info("returning cluster", cluster);

        return new ResponseEntity<Cluster>(cluster, HttpStatus.OK);
    }

}
