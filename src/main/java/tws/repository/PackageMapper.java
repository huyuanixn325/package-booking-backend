package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Package;

import java.util.List;

@Mapper
public interface PackageMapper {

    void insertPackage(@Param("packages") Package packages);
    List<Package> selectPackages();
}
