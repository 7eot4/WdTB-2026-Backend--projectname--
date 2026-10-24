package pl.wsb.przeglady.equipment.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.math.BigDecimal;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serial_number", nullable = false, unique = true, length = 60)
    private String serialNumber;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "manufacturer", length = 80)
    private String manufacturer;

    @Column(name = "commissioned_on", nullable = false)
    private LocalDate commissionedOn;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "replacement_cost", nullable = false, precision = 10, scale = 2)
    private BigDecimal replacementCost;

    protected Equipment() {
    }

    public Equipment(String serialNumber, String name, String manufacturer, LocalDate commissionedOn, Boolean active, BigDecimal replacementCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.manufacturer = manufacturer;
        this.commissionedOn = commissionedOn;
        this.active = active;
        this.replacementCost = replacementCost;
    }

    public Long getId() {
        return id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public LocalDate getCommissionedOn() {
        return commissionedOn;
    }

    public Boolean getActive() {
        return active;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

}
