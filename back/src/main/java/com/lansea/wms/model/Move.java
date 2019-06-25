package com.lansea.wms.model;


import com.lansea.wms.entity.ValidClass;
import com.lansea.wms.model.base.BaseUserBetweenTime;
import com.lansea.wms.util.DateUtil;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Date;

@Repository
public class Move extends BaseUserBetweenTime {

    @Min(value = 1, message = "id 非法", groups = {ValidClass.EditForm.class})
    private Integer id;

    private String number;
    private Integer type;

    @Min(value = 1, message = "请选择物料")
    private Integer materialId;
    private Integer inventoryId;
    private Integer inventoryTid;
    private Integer companyId;
    private Integer stockEntryId;

    @DecimalMin(value = "0.01", message = "请填写计划数量")
    private BigDecimal planQuantity;

    @DecimalMin(value = "0.01", message = "请填写实际数量")
    private BigDecimal quantity;

    @DateTimeFormat(pattern = DateUtil.DATE_FORMAT)
    private Date happenDate;

    private Integer status;

    private Integer approveUid;

    @DateTimeFormat(pattern = DateUtil.DATE_TIME_FORMAT)
    private Date approveTime;

    private String approveUserName;

    private String rejectRemark;

    private Integer deliveryId;

    private String materialCode;
    private String materialName;
    private String materialCategoryName;
    private String materialUnitName;

    private Integer warehouseId;
    private Integer reservoirId;
    private Integer stockId;

    private String warehouseName;
    private String reservoirName;
    private String stockName;

    private String warehouseCode;
    private String reservoirCode;
    private String stockCode;

    private Integer warehouseIdTo;
    private Integer reservoirIdTo;
    private Integer stockIdTo;


    private String warehouseNameTo;
    private String reservoirNameTo;
    private String stockNameTo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Integer getInventoryTid() {
        return inventoryTid;
    }

    public void setInventoryTid(Integer inventoryTid) {
        this.inventoryTid = inventoryTid;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getStockEntryId() {
        return stockEntryId;
    }

    public void setStockEntryId(Integer stockEntryId) {
        this.stockEntryId = stockEntryId;
    }

    public Date getHappenDate() {
        return happenDate;
    }

    public void setHappenDate(Date happenDate) {
        this.happenDate = happenDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialCategoryName() {
        return materialCategoryName;
    }

    public void setMaterialCategoryName(String materialCategoryName) {
        this.materialCategoryName = materialCategoryName;
    }

    public String getMaterialUnitName() {
        return materialUnitName;
    }

    public void setMaterialUnitName(String materialUnitName) {
        this.materialUnitName = materialUnitName;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getReservoirId() {
        return reservoirId;
    }

    public void setReservoirId(Integer reservoirId) {
        this.reservoirId = reservoirId;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getReservoirName() {
        return reservoirName;
    }

    public void setReservoirName(String reservoirName) {
        this.reservoirName = reservoirName;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Integer getWarehouseIdTo() {
        return warehouseIdTo;
    }

    public void setWarehouseIdTo(Integer warehouseIdTo) {
        this.warehouseIdTo = warehouseIdTo;
    }

    public Integer getReservoirIdTo() {
        return reservoirIdTo;
    }

    public void setReservoirIdTo(Integer reservoirIdTo) {
        this.reservoirIdTo = reservoirIdTo;
    }

    public Integer getStockIdTo() {
        return stockIdTo;
    }

    public void setStockIdTo(Integer stockIdTo) {
        this.stockIdTo = stockIdTo;
    }

    public String getWarehouseNameTo() {
        return warehouseNameTo;
    }

    public void setWarehouseNameTo(String warehouseNameTo) {
        this.warehouseNameTo = warehouseNameTo;
    }

    public String getReservoirNameTo() {
        return reservoirNameTo;
    }

    public void setReservoirNameTo(String reservoirNameTo) {
        this.reservoirNameTo = reservoirNameTo;
    }

    public String getStockNameTo() {
        return stockNameTo;
    }

    public void setStockNameTo(String stockNameTo) {
        this.stockNameTo = stockNameTo;
    }

    public BigDecimal getPlanQuantity() {
        return planQuantity;
    }

    public void setPlanQuantity(BigDecimal planQuantity) {
        this.planQuantity = planQuantity;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getApproveUid() {
        return approveUid;
    }

    public void setApproveUid(Integer approveUid) {
        this.approveUid = approveUid;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public String getApproveUserName() {
        return approveUserName;
    }

    public void setApproveUserName(String approveUserName) {
        this.approveUserName = approveUserName;
    }

    public String getRejectRemark() {
        return rejectRemark;
    }

    public void setRejectRemark(String rejectRemark) {
        this.rejectRemark = rejectRemark;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getReservoirCode() {
        return reservoirCode;
    }

    public void setReservoirCode(String reservoirCode) {
        this.reservoirCode = reservoirCode;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }
}