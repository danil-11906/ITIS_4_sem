package ru.itis.springbootdemo.controllers;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.ResponseBody;
        import ru.itis.springbootdemo.dto.ServiceDto;
        import ru.itis.springbootdemo.dto.ServiceForm;
        import ru.itis.springbootdemo.services.ServicesService;

        import java.util.List;

@Controller
public class ServicesController {

    @Autowired
    private ServicesService servicesService;

    @GetMapping("/services")
    public String getServicesPage(Model model) {
        model.addAttribute("servicesList", servicesService.getAllServices());
        return "services";
    }

    @PostMapping("/services")
    @ResponseBody
    public ResponseEntity<ServiceDto> addService(@RequestBody ServiceForm serviceForm) {
        return ResponseEntity.ok(servicesService.addService(serviceForm));
    }

    @GetMapping("/allservices")
    @ResponseBody
    public ResponseEntity<List<ServiceDto>> getAllServices() {
        return ResponseEntity.ok(servicesService.getAllServices());
    }

}
