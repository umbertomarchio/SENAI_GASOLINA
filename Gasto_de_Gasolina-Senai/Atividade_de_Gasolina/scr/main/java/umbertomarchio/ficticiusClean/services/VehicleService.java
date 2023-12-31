package java.umbertomarchio.ficticiusClean.controllers;

import com.nilerbarcelos.ficticiusClean.dto.VehicleResponse;
import com.nilerbarcelos.ficticiusClean.models.Vehicle;

import java.util.List;

public interface VehicleService {

    VehicleResponse insert(Vehicle vehicle);
    List<VehicleResponse> compute(BigDecimal price, BigDecimal city, BigDecimal highway);
}