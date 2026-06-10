// Report request DTO
package com.procurement.procurement.dto.report;

import java.time.LocalDate;

public class ReportRequestDTO {

    private Long vendorId; // Optional: filter by vendor
    private Long poId; // Optional: filter by purchase order ID
    private String poNumber; // Optional: filter by PO number (e.g. "po-123")
    private LocalDate startDate; // Optional: report start date
    private LocalDate endDate; // Optional: report end date
    private String reportType; // Optional: "vendor", "po", or "all"

    public ReportRequestDTO() {
    }

    public ReportRequestDTO(Long vendorId, Long poId, LocalDate startDate, LocalDate endDate) {
        this.vendorId = vendorId;
        this.poId = poId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // ===================== Getters & Setters =====================
    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public Long getPoId() {
        return poId;
    }

    public void setPoId(Long poId) {
        this.poId = poId;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }
}
