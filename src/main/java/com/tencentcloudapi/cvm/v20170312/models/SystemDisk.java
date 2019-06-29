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

public class SystemDisk  extends AbstractModel{

    /**
    * System disk types. For information about the limits on system disk types, please see [CVM Instance Configuration](/document/product/213/2177).<br><li>LOCAL_BASIC: Local disk.<br><li>LOCAL_SSD: SSD local disk.<br><li>CLOUD_BASIC: HDD cloud disk.<br><li>CLOUD_SSD: SSD cloud disk.<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><br>Default: Premium Cloud Storage
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * ID of system disk. Neither LOCAL_BASIC nor LOCAL_SSD comes with an ID and thus neither supports this parameter for now. 
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Size of system disk, in GB. Default: 50 GB.
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;

    /**
     * Obtain type of system disk. For information about the limits on system disk types, please see [CVM Instance Configuration](/document/product/213/2177). Values:<br><li>LOCAL_BASIC: Local disk.<br><li>LOCAL_SSD: SSD local disk.<br><li>CLOUD_BASIC: HDD cloud disk.<br><li>CLOUD_SSD: SSD cloud disk.<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><br>Default: CLOUD_BASIC
     * @return DiskType For information about the limits on system disk types, please see [CVM Instance Configuration](/document/product/213/2177).<br><li>LOCAL_BASIC: Local disk.<br><li>LOCAL_SSD: SSD local disk.<br><li>CLOUD_BASIC: HDD cloud disk.<br><li>CLOUD_SSD: SSD cloud disk.<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><br>Default: CLOUD_BASIC
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set up type of system disks. For more information about the limits on system disk types, please see [CVM Instance Configuration](/document/product/213/2177).<br><li>LOCAL_BASIC: Local disk.<br><li>LOCAL_SSD: SSD local disk.<br><li>CLOUD_BASIC: HDD cloud disk.<br><li>CLOUD_SSD: SSD cloud disk.<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><br>Default: CLOUD_BASIC
     * @param DiskType For information about the limits on system disk types, please see [CVM Instance Configuration](/document/product/213/2177).<br><li>LOCAL_BASIC: Local disk.<br><li>LOCAL_SSD: SSD local disk.<br><li>CLOUD_BASIC: HDD cloud disk.<br><li>CLOUD_SSD: SSD cloud disk.<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><br>Default: CLOUD_BASIC
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Obtain ID of system disk. 
     * @return DiskId System disk ID. LOCAL_BASIC and LOCAL_SSD don’t have IDs and thus don’t support this parameter for now.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Configure System disk ID. LOCAL_BASIC and LOCAL_SSD don’t have IDs and thus don’t support this parameter for now.
     * @param DiskId System disk ID. LOCAL_BASIC and LOCAL_SSD don’t have IDs and thus don’t support this parameter for now.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Obtain size of system disk, in GB. Default: 50 GB.
     * @return DiskSize size of system disk, in GB. Default: 50 GB.
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Configure size of system disk, in GB. Default: 50 GB.
     * @param DiskSize size of system disk, in GB. Default: 50 GB.
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

