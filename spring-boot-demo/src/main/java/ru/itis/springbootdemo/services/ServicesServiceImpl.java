package ru.itis.springbootdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.springbootdemo.dto.ServiceDto;
import ru.itis.springbootdemo.dto.ServiceForm;
import ru.itis.springbootdemo.dto.UserForm;
import ru.itis.springbootdemo.models.Service;
import ru.itis.springbootdemo.repositories.ServicesRepository;

import java.util.List;

import static ru.itis.springbootdemo.dto.ServiceDto.from;

@Component
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    private ServicesRepository servicesRepository;
    @Override
    public List<ServiceDto> getAllServices() {
        return from(servicesRepository.findAll());
    }

    @Override
    public ServiceDto addService(ServiceForm serviceForm) {
        Service service = Service.builder()
                .name(serviceForm.getName())
                .cost(serviceForm.getCost())
                .date(serviceForm.getDate())
                .build();
        servicesRepository.save(service);
        return ServiceDto.of(service);
    }

}