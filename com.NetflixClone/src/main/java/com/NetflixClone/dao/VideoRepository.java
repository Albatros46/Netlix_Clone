package com.NetflixClone.dao;

import com.NetflixClone.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
