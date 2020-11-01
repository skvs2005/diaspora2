package com.bestbuy.diaspora.jparepositories;

import com.bestbuy.diaspora.entities.ClusterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterJpaRepository extends JpaRepository<ClusterEntity, Long> {

    ClusterEntity findByClusterName(String name);
}
