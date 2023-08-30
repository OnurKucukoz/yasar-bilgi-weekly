package com.yasarbilgi.yasarbilgiweeklyschedule.repositories;

import com.yasarbilgi.yasarbilgiweeklyschedule.entities.YasarUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<YasarUser,Long> {

}
