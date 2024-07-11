package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceRestAPI {

    private deviceRepository DeviceRepository;

    public DeviceRestAPI(deviceRepository DeviceRepository) {
        this.DeviceRepository = DeviceRepository;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/v1/createDevice")
    public device1 createDevice(@Valid @RequestBody device1 device) {
        return DeviceRepository.save(device);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/v1/getDevice/{param}")
    public List<device1> getDevice(@PathVariable String param){
        return DeviceRepository.findByIDorName(param);
    }
}
