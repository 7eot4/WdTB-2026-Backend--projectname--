package pl.wsb.przeglady.inspection.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "inspection_order")
public class InspectionOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_number", nullable = false, unique = true, length = 30)
    private String orderNumber;

    @Column(name = "scheduled_on", nullable = false)
    private LocalDate scheduledOn;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private InspectionStatus status;

    @Column(name = "estimated_minutes", nullable = false)
    private Integer estimatedMinutes;

    @Column(name = "notes", length = 500)
    private String notes;

    protected InspectionOrder() {
    }

    public InspectionOrder(String orderNumber, LocalDate scheduledOn, InspectionStatus status, Integer estimatedMinutes, String notes) {
        this.orderNumber = orderNumber;
        this.scheduledOn = scheduledOn;
        this.status = status;
        this.estimatedMinutes = estimatedMinutes;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public LocalDate getScheduledOn() {
        return scheduledOn;
    }

    public InspectionStatus getStatus() {
        return status;
    }

    public Integer getEstimatedMinutes() {
        return estimatedMinutes;
    }

    public String getNotes() {
        return notes;
    }

}
