/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceTypeQuotaItem  extends AbstractModel{

    /**
    * Availability Zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Instance model.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance billing method. Value range: <br><li>PREPAID: Prepaid. Monthly Subscription.<br><li>POSTPAID_BY_HOUR: Postpaid, by usage<br><li>CDHPAID: [CDH](https://cloud.tencent.com/document/product/416) paid, i.e., only pay for CDH, excluding instances on the CDH.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    *  ENI type. For example, 25 represents an ENI of 25 GB.
    */
    @SerializedName("NetworkCard")
    @Expose
    private Integer NetworkCard;

    /**
    * Scaled attributes. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * Number of CPU cores in an instance (in core).
    */
    @SerializedName("Cpu")
    @Expose
    private Integer Cpu;

    /**
    * Size of the memory of instance, in `GB`.
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * Instance model series.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Model name.
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * List of local disk specifications. When the parameter returns null, indicates it cannot create local disk in this situation.
    */
    @SerializedName("LocalDiskTypeList")
    @Expose
    private LocalDiskType [] LocalDiskTypeList;

    /**
    * Sell instance or not. Value range: <br><li>SELL：instance can be sold.<br><li>SOLD_OUT：instance is sold out.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Price of an instance.
    */
    @SerializedName("Price")
    @Expose
    private ItemPrice Price;

    /**
     * Obtain the Availability Zone.
     * @return Zone Availability Zone.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Configure the Availability Zone.
     * @param Zone Availability Zone.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Obtain the instance model.
     * @return InstanceType Instance model.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Configure the instance model.
     * @param InstanceType Instance model.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get instance billing method. Value range: <br><li>PREPAID: Prepaid. Monthly Subscription.<br><li>POSTPAID_BY_HOUR: Postpaid, by usage<br><li>CDHPAID: [CDH](https://cloud.tencent.com/document/product/416) paid, i.e., only pay for CDH, excluding instances on the CDH.
     * @return InstanceChargeType Instance billing method. Value range: <br><li>PREPAID: Prepaid. Monthly Subscription.<br><li>POSTPAID_BY_HOUR: Postpaid, by usage<br><li>CDHPAID: [CDH](https://cloud.tencent.com/document/product/416) paid, i.e., only pay for CDH, excluding instances on the CDH.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set instance billing method. Value range: <br><li>PREPAID: Prepaid. Monthly Subscription.<br><li>POSTPAID_BY_HOUR: Postpaid, by usage<br><li>CDHPAID: [CDH](https://cloud.tencent.com/document/product/416) paid, i.e., only pay for CDH, excluding instances on the CDH.
     * @param InstanceChargeType Instance billing method. Value range: <br><li>PREPAID: Prepaid. Monthly Subscription.<br><li>POSTPAID_BY_HOUR: Postpaid, by usage<br><li>CDHPAID: [CDH](https://cloud.tencent.com/document/product/416) paid, i.e., only pay for CDH, excluding instances on the CDH.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get ENI type. For example, 25 represents an ENI of 25 GB.
     * @return NetworkCard ENI type. For example, 25 represents an ENI of 25 GB.
     */
    public Integer getNetworkCard() {
        return this.NetworkCard;
    }

    /**
     * Set ENI type. For example, 25 represents an ENI of 25 GB.
     * @param NetworkCard ENI type. For example, 25 represents an ENI of 25 GB.
     */
    public void setNetworkCard(Integer NetworkCard) {
        this.NetworkCard = NetworkCard;
    }

    /**
     * Set scaled attributes. Note: This field may return null, indicating that no valid value was found.
     * @return Externals Scaled attributes. Note: This field may return null, indicating that no valid value was found.
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * Set scaled attributes. Note: This field may return null, indicating that no valid value was found.
     * @param Externals Scaled attributes. Note: This field may return null, indicating that no valid value was found.
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * Get number of CPU cores in an instance (in core).
     * @return Cpu number of CPU cores in an instance (in core).
     */
    public Integer getCpu() {
        return this.Cpu;
    }

    /**
     * Set number of CPU cores in an instance (in core).
     * @param Cpu number of CPU cores in an instance (in core).
     */
    public void setCpu(Integer Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get instance memory capacity (in `GB`).
     * @return Memory Instance memory capacity (in `GB`).
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * Set instance memory capacity (in `GB`).
     * @param Memory Instance memory capacity (in `GB`).
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * Obtain the list of instance model series.
     * @return InstanceFamily Instance model series.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Configure the instance model series.
     * @param InstanceFamily instance model series.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get model name.
     * @return TypeName Model name.
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set model name.
     * @param TypeName Model name.
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get list of local disk specifications. When the parameter returns null, indicates it cannot create local disk in this situation.
     * @return LocalDiskTypeList List of local disk specifications. When the parameter returns null, indicates it cannot create local disk in this situation.
     */
    public LocalDiskType [] getLocalDiskTypeList() {
        return this.LocalDiskTypeList;
    }

    /**
     * Set list of local disk specifications. When the parameter returns null, indicates it cannot create local disk in this situation.
     * @param LocalDiskTypeList list of local disk specifications. When the parameter returns null, indicates it cannot create local disk in this situation.
     */
    public void setLocalDiskTypeList(LocalDiskType [] LocalDiskTypeList) {
        this.LocalDiskTypeList = LocalDiskTypeList;
    }

    /**
     * Get whether an instance is sold. Value range: <br><li>SELL：indicates the instance can be sold or not.<br><li>SOLD_OUT：indicates the instance is sold out.
     * @return Status whether an instance is sold. Value range: <br><li>SELL：indicates the instance can be sold or not.<br><li>SOLD_OUT：indicates the instance is sold out.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set whether an instance is sold. Value range: <br><li>SELL：indicates the instance can be sold or not.<br><li>SOLD_OUT：indicates the instance is sold out.
     * @param Status whether an instance is sold. Value range: <br><li>SELL：indicates the instance can be sold or not.<br><li>SOLD_OUT：indicates the instance is sold out.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get price of an instance.
     * @return Price price of an instance.
     */
    public ItemPrice getPrice() {
        return this.Price;
    }

    /**
     * Set price of an instance.
     * @param Price price of an instance.
     */
    public void setPrice(ItemPrice Price) {
        this.Price = Price;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "NetworkCard", this.NetworkCard);
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArrayObj(map, prefix + "LocalDiskTypeList.", this.LocalDiskTypeList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Price.", this.Price);

    }
}

