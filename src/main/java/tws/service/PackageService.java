package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.dto.PackageDto;
import tws.entity.Package;
import tws.repository.PackageMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class PackageService {
    @Autowired
    PackageMapper packageMapper;

    public void addPackages(Package packages){
         packageMapper.insertPackage(packages);
    }

    public List<PackageDto> getAllPackages(){
        List<Package> packages = packageMapper.selectPackages();
        List<PackageDto> packageDtos = new ArrayList<>();
        for (Package pack :packages){
            PackageDto packageDto = new PackageDto();
            packageDto.setAddressee(pack.getAddressee());
            packageDto.setDateTime(pack.getDateTime());
            packageDto.setKey(pack.getTrackingNumber());
            packageDto.setState(pack.getState());
            packageDto.setTelephone(pack.getTelephone());
            packageDto.setTrackingNumber(pack.getTrackingNumber());
            packageDto.setWeight(pack.getWeight());
            packageDtos.add(packageDto);
        }
        return packageDtos;
    }
}

