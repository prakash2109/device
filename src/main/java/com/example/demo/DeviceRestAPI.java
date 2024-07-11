package com.example.demo;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeviceRestAPI {

    private DeviceRepository deviceRepository;

    public DeviceRestAPI(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/v1/createDevice")
    public Device createDevice(@Valid @RequestBody Device device) {
        return deviceRepository.save(device);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/v1/getDevice/{param}")
    public List<Device> getDevice(@PathVariable String param){
        return deviceRepository.findByIDorName(param);
    }
}
