package com.example.demo.repositories;


import com.example.demo.entities.Model;
import com.example.demo.entities.Shell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShellRepo extends JpaRepository<Shell, Long> {

        List<Shell> findById(long shellId);


}
