package java.umbertomarchio.ficticiusClean.controllers;

public interface ConsumptionService {
    BigDecimal computeTotalPrice(BigDecimal fuelPrice, BigDecimal consumedFuel);
    BigDecimal computeUsage(BigDecimal distance, BigDecimal averageConsumption);
}