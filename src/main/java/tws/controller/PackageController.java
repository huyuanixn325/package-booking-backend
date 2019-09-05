package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.dto.PackageDto;
import tws.entity.Package;
import tws.service.PackageService;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/packages")
public class PackageController {
    @Autowired
    PackageService packageService;
    @PostMapping
    public  ResponseEntity<Package> addPackage(@RequestBody  Package packages){
        packageService.addPackages(packages);
        return ResponseEntity.created(URI.create("/packages"+packages.getTrackingNumber())).build();
    }

    @GetMapping
    public ResponseEntity<List<PackageDto>> getAllPackages(){
        return ResponseEntity.ok(packageService.getAllPackages());
    }

    @PutMapping
    public ResponseEntity<Package> updatePackage(@RequestBody Package packages){
        packageService.updatePackage(packages);
        return ResponseEntity.ok(packages);
    }
}
