package ru.itis.springbootdemo.services;

import ru.itis.springbootdemo.dto.ServiceDto;
import ru.itis.springbootdemo.dto.ServiceForm;

import java.util.List;

public interface ServicesService {
    List<ServiceDto> getAllServices();
    ServiceDto addService(ServiceForm serviceForm);
}
