package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Package;
import tws.service.PackageService;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/packages")
public class PackageController {
    @Autowired
    PackageService packageService;
    @CrossOrigin
    @PostMapping
    public  ResponseEntity<Package> addPackage(@RequestBody  Package packages){
        packageService.addPackages(packages);
        return ResponseEntity.created(URI.create("/packages"+packages.getTrackingNumber())).build();
    }

    @GetMapping
    public ResponseEntity<List<Package>> getAllPackages(){
        return ResponseEntity.ok(packageService.getAllPackages());
    }
}
