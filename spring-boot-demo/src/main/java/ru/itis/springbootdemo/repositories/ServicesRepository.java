package ru.itis.springbootdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.springbootdemo.models.Service;

public interface ServicesRepository extends JpaRepository<Service, Long> {
}
