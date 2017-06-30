package de.muenchen.jfs2017.demoproducer;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author claus
 */
@RestController
public class RegistrationController {
    
    private final RegistrationService service;

    public RegistrationController(RegistrationService service) {
        this.service = service;
    }
    
    @PostMapping("/employee/hire")
    public void hireEmployee(Employee employee) {
        this.service.hireEmployee(employee);
    }
    
    @GetMapping("/employee/ping_random")
    public void hiereEmployeeTest() {
        Employee employee = new Employee("Tester", RandomStringUtils.randomAlphabetic(15), Gender.MALE, 1400.0);
        employee.setPosition("Manager");
        this.service.hireEmployee(employee);
    }
    
    
}