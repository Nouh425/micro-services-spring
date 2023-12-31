package com.emsi.VoitureService.Service;


import com.emsi.VoitureService.Model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-client")
public interface ClientService {

    @GetMapping("/clients/{clientId}")
    Client clientById(@PathVariable("clientId") Long clientId);
}
