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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk  extends AbstractModel{

    /**
    * Data disk types. For information on limits of data disk type, please see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Values include:<br><li>LOCAL_BASIC: Local disk.<br><li>LOCAL_SSD: SSD local disk.<br><li>CLOUD_BASIC: HDD cloud disk.<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><li>CLOUD_SSD: SSD cloud disk.<br><br>Default value: LOCAL_BASIC Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Data disk size (in GB). The minimum adjustment increment is 10 GB. Different types of data disks have different value ranges. For information on limits, see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Default is 0, indicating that no data disk is purchased. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;

    /**
    * Data disk snapshot ID, similar to `snap-l8psqwnt` Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
     * Get data disk types. For information on limits of data disk type, please see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Values include:<br><li>LOCAL_BASIC: Local disk.<br><li>LOCAL_SSD: SSD local disk.<br><li>CLOUD_BASIC: HDD cloud disk.<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><li>CLOUD_SSD: SSD cloud disk.<br><br>Default value: LOCAL_BASIC Note: This field may return null, indicating that no valid value was found.
     * @return DiskType Data disk types. For information on limits of data disk type, please see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Values include:<br><li>LOCAL_BASIC: Local disk.<br><li>LOCAL_SSD: SSD local disk.<br><li>CLOUD_BASIC: HDD cloud disk.<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><li>CLOUD_SSD: SSD cloud disk.<br><br>Default value: LOCAL_BASIC Note: This field may return null, indicating that no valid value was found.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set data disk types. For information on limits of data disk type, please see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Values include:<br><li>LOCAL_BASIC: Local disk.<br><li>LOCAL_SSD: SSD local disk.<br><li>CLOUD_BASIC: HDD cloud disk.<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><li>CLOUD_SSD: SSD cloud disk.<br><br>Default value: LOCAL_BASIC Note: This field may return null, indicating that no valid value was found.
     * @param DiskType Data disk types. For information on limits of data disk type, please see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Values include:<br><li>LOCAL_BASIC: Local disk.<br><li>LOCAL_SSD: SSD local disk.<br><li>CLOUD_BASIC: HDD cloud disk.<br><li>CLOUD_PREMIUM: Premium Cloud Storage<br><li>CLOUD_SSD: SSD cloud disk.<br><br>Default value: LOCAL_BASIC Note: This field may return null, indicating that no valid value was found.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get data disk size (in GB). The minimum adjustment increment is 10 GB. Different types of data disks have different value ranges. For information on limits, see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Default is 0, indicating that no data disk is purchased. Note: This field may return null, indicating that no valid value was found.
     * @return DiskSize Data disk size (in GB). The minimum adjustment increment is 10 GB. Different types of data disks have different value ranges. For information on limits, see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Default is 0, indicating that no data disk is purchased. Note: This field may return null, indicating that no valid value was found.
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set data disk size (in GB). The minimum adjustment increment is 10 GB. Different types of data disks have different value ranges. For information on limits, see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Default is 0, indicating that no data disk is purchased. Note: This field may return null, indicating that no valid value was found.
     * @param DiskSize Data disk size (in GB). The minimum adjustment increment is 10 GB. Different types of data disks have different value ranges. For information on limits, see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Default is 0, indicating that no data disk is purchased. Note: This field may return null, indicating that no valid value was found.
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get data disk snapshot ID, similar to `snap-l8psqwnt` Note: This field may return null, indicating that no valid value was found.
     * @return SnapshotId Data disk snapshot ID, similar to `snap-l8psqwnt` Note: This field may return null, indicating that no valid value was found.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set data disk snapshot ID, similar to `snap-l8psqwnt` Note: This field may return null, indicating that no valid value was found.
     * @param SnapshotId Data disk snapshot ID, similar to `snap-l8psqwnt` Note: This field may return null, indicating that no valid value was found.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);

    }
}

