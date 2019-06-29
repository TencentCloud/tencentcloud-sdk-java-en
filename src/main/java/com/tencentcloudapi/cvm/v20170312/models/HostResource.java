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

public class HostResource  extends AbstractModel{

    /**
    * Total number of CPU cores in a CDH instance
    */
    @SerializedName("CpuTotal")
    @Expose
    private Integer CpuTotal;

    /**
    * Number of available CPU cores in a CDH instance
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Integer CpuAvailable;

    /**
    * Total memory size in a CDH instance (in GiB)
    */
    @SerializedName("MemTotal")
    @Expose
    private Float MemTotal;

    /**
    * Available memory size in a CDH instance (in GiB)
    */
    @SerializedName("MemAvailable")
    @Expose
    private Float MemAvailable;

    /**
    * Total disk size in a CDH instance (in GiB)
    */
    @SerializedName("DiskTotal")
    @Expose
    private Integer DiskTotal;

    /**
    * Available disk size in a CDH instance (in GiB)
    */
    @SerializedName("DiskAvailable")
    @Expose
    private Integer DiskAvailable;

    /**
     * Get total number of CPU cores in a CDH instance
     * @return CpuTotal Total number of CPU cores in a CDH instance
     */
    public Integer getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * Set total number of CPU cores in a CDH instance
     * @param CpuTotal Total number of CPU cores in a CDH instance
     */
    public void setCpuTotal(Integer CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * Get number of available CPU cores in a CDH instance
     * @return CpuAvailable Number of available CPU cores in a CDH instance
     */
    public Integer getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * Set number of available CPU cores in a CDH instance |
     * @param CpuAvailable Number of available CPU cores in a CDH instance
     */
    public void setCpuAvailable(Integer CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * Get total memory size in a CDH instance (in GiB)
     * @return MemTotal Total memory size in a CDH instance (in GiB)
     */
    public Float getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set total memory size in a CDH instance (in GiB) |
     * @param MemTotal Total memory size in a CDH instance (in GiB)
     */
    public void setMemTotal(Float MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get available memory size in a CDH instance (in GiB)
     * @return MemAvailable Available memory size in a CDH instance (in GiB)
     */
    public Float getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set available memory size in a CDH instance (in GiB) |
     * @param MemAvailable Available memory size in a CDH instance (in GiB)
     */
    public void setMemAvailable(Float MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    /**
     * Get total disk size in a CDH instance (in GiB)
     * @return DiskTotal Total disk size in a CDH instance (in GiB)
     */
    public Integer getDiskTotal() {
        return this.DiskTotal;
    }

    /**
     * Set total disk size in a CDH instance (in GiB)
     * @param DiskTotal Total disk size in a CDH instance (in GiB)
     */
    public void setDiskTotal(Integer DiskTotal) {
        this.DiskTotal = DiskTotal;
    }

    /**
     * Get available disk size in a CDH instance (in GiB)
     * @return DiskAvailable Available disk size in a CDH instance (in GiB)
     */
    public Integer getDiskAvailable() {
        return this.DiskAvailable;
    }

    /**
     * Set available disk size in a CDH instance (in GiB)
     * @param DiskAvailable Available disk size in a CDH instance (in GiB)
     */
    public void setDiskAvailable(Integer DiskAvailable) {
        this.DiskAvailable = DiskAvailable;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuTotal", this.CpuTotal);
        this.setParamSimple(map, prefix + "CpuAvailable", this.CpuAvailable);
        this.setParamSimple(map, prefix + "MemTotal", this.MemTotal);
        this.setParamSimple(map, prefix + "MemAvailable", this.MemAvailable);
        this.setParamSimple(map, prefix + "DiskTotal", this.DiskTotal);
        this.setParamSimple(map, prefix + "DiskAvailable", this.DiskAvailable);

    }
}

