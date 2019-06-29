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

public class InstanceTypeConfig  extends AbstractModel{

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
    * Instance model series.
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * Number of GPU cores (in core).
    */
    @SerializedName("GPU")
    @Expose
    private Integer GPU;

    /**
    * Number of CPU cores (in core).
    */
    @SerializedName("CPU")
    @Expose
    private Integer CPU;

    /**
    * Memory size (in `GB`).
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
     * Get availability zone.
     * @return Zone availability zone.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set availability zone.
     * @param Zone availability zone.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get instance model.
     * @return InstanceType instance model.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set instance model.
     * @param InstanceType instance model.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get instance model series.
     * @return InstanceFamily Instance model series.
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set instance model series.
     * @param InstanceFamily Instance model series.
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get number of GPU cores (in core).
     * @return GPU Number of cores of GPU, in core.
     */
    public Integer getGPU() {
        return this.GPU;
    }

    /**
     * Set number of GPU cores (in core).
     * @param GPU Number of cores of GPU, in core.
     */
    public void setGPU(Integer GPU) {
        this.GPU = GPU;
    }

    /**
     * Get number of CPU cores (in core).
     * @return CPU Number of cores of GPU, in core.
     */
    public Integer getCPU() {
        return this.CPU;
    }

    /**
     * Set number of CPU cores (in core).
     * @param CPU Number of cores of GPU, in core.
     */
    public void setCPU(Integer CPU) {
        this.CPU = CPU;
    }

    /**
     * Get memory size (in `GB`).
     * @return Memory Memory size (in `GB`).
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * Set memory size (in `GB`).
     * @param Memory Memory size (in `GB`).
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "GPU", this.GPU);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);

    }
}

