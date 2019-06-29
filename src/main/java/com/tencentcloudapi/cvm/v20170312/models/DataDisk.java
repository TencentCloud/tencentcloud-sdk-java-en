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

public class DataDisk  extends AbstractModel{

    /**
    * Data disk size (in GB). The minimum adjustment increment is 10 GB. Different types of data disks have different value ranges. For information on limits, see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Default is 0, indicating that no data disk is purchased.
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;

    /**
    * Data disk types. For information on limits of data disk type, please see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Values include:<br><li>LOCAL_BASIC：Local disk<br><li>LOCAL_SSD：Local SSD<br><li>CLOUD_BASIC：Basic cloud disk<br><li>CLOUD_PREMIUM：Premium Cloud Storage<br><li>CLOUD_SSD：SSD Cloud Disk<br><br>Default value: LOCAL_BASIC<br><br>This parameter is invalid for the API `ResizeInstanceDisk`.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * ID of data disk. Neither LOCAL_BASIC nor LOCAL_SSD comes with an ID and thus neither supports this parameter for now.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Whether terminate data disk with CVM. Value:
<li>True: terminate data disk with CVM, only postpaid mode disk supported
<li>FALSE: Keep data disk when CVM is terminated<br>
Default: TRUE<br>
This parameter is invalid for the API `RunInstances`. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
    * Data disk snapshot ID. the capacity of the selected data disk snapshot must be less than that of the data disk (storageSize). Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
     * Get Data disk size (in GB). The minimum adjustment increment is 10 GB. Different types of data disks have different value ranges. For information on limits, see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Default is 0, indicating that no data disk is purchased.
     * @return DiskSize Data disk size (in GB). The minimum adjustment increment is 10 GB. Different types of data disks have different value ranges. For information on limits, see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Default is 0, indicating that no data disk is purchased.
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Data disk size (in GB). The minimum adjustment increment is 10 GB. Different types of data disks have different value ranges. For information on limits, see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Default is 0, indicating that no data disk is purchased.
     * @param DiskSize Data disk size (in GB). The minimum adjustment increment is 10 GB. Different types of data disks have different value ranges. For information on limits, see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Default is 0, indicating that no data disk is purchased.
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Data disk types. For information on limits of data disk type, please see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Values include:<br><li>LOCAL_BASIC：Local disk<br><li>LOCAL_SSD：Local SSD<br><li>CLOUD_BASIC：Basic cloud disk<br><li>CLOUD_PREMIUM：Premium Cloud Storage<br><li>CLOUD_SSD：SSD Cloud Disk<br><br>Default value: LOCAL_BASIC<br><br>This parameter is invalid for the API `ResizeInstanceDisk`.
     * @return DiskType Data disk types. For information on limits of data disk type, please see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Values include:<br><li>LOCAL_BASIC：Local disk<br><li>LOCAL_SSD：Local SSD<br><li>CLOUD_BASIC：Basic cloud disk<br><li>CLOUD_PREMIUM：Premium Cloud Storage<br><li>CLOUD_SSD：SSD Cloud Disk<br><br>Default value: LOCAL_BASIC<br><br>This parameter is invalid for the API `ResizeInstanceDisk`.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Data disk types. For information on limits of data disk type, please see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Values include:<br><li>LOCAL_BASIC：Local disk<br><li>LOCAL_SSD：Local SSD<br><li>CLOUD_BASIC：Basic cloud disk<br><li>CLOUD_PREMIUM：Premium Cloud Storage<br><li>CLOUD_SSD：SSD Cloud Disk<br><br>Default value: LOCAL_BASIC<br><br>This parameter is invalid for the API `ResizeInstanceDisk`.
     * @param DiskType Data disk types. For information on limits of data disk type, please see [CVM Instance Types](https://intl.cloud.tencent.com/document/product/213/11518). Values include:<br><li>LOCAL_BASIC：Local disk<br><li>LOCAL_SSD：Local SSD<br><li>CLOUD_BASIC：Basic cloud disk<br><li>CLOUD_PREMIUM：Premium Cloud Storage<br><li>CLOUD_SSD：SSD Cloud Disk<br><br>Default value: LOCAL_BASIC<br><br>This parameter is invalid for the API `ResizeInstanceDisk`.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get ID of data disk. Neither LOCAL_BASIC nor LOCAL_SSD comes with an ID and thus neither supports this parameter for now.
     * @return DiskId ID of data disk. Neither LOCAL_BASIC nor LOCAL_SSD comes with an ID and thus neither supports this parameter for now.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set ID of data disk. Neither LOCAL_BASIC nor LOCAL_SSD comes with an ID and thus neither supports this parameter for now.
     * @param DiskId ID of data disk. Neither LOCAL_BASIC nor LOCAL_SSD comes with an ID and thus neither supports this parameter for now.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Whether terminate data disk with CVM. Value:
<li>True: terminate data disk with CVM, only postpaid mode disk supported
<li>FALSE: Keep data disk when CVM is terminated<br>
Default: TRUE<br>
This parameter is invalid for the API `RunInstances`. Note: This field may return null, indicating that no valid value was found.
     * @return DeleteWithInstance Whether terminate data disk with CVM. Value:
<li>True: terminate data disk with CVM, only postpaid mode disk supported
<li>FALSE: Keep data disk when CVM is terminated<br>
Default: TRUE<br>
This parameter is invalid for the API `RunInstances`. Note: This field may return null, indicating that no valid value was found.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Whether terminate data disk with CVM. Value:
<li>True: terminate data disk with CVM, only postpaid mode disk supported
<li>FALSE: Keep data disk when CVM is terminated<br>
Default: TRUE<br>
This parameter is invalid for the API `RunInstances`. Note: This field may return null, indicating that no valid value was found.
     * @param DeleteWithInstance Whether terminate data disk with CVM. Value:
<li>True: terminate data disk with CVM, only postpaid mode disk supported
<li>FALSE: Keep data disk when CVM is terminated<br>
Default: TRUE<br>
This parameter is invalid for the API `RunInstances`. Note: This field may return null, indicating that no valid value was found.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Get data disk snapshot ID. the capacity of the selected data disk snapshot must be less than that of the data disk (storageSize). Note: This field may return null, indicating that no valid value was found.
     * @return SnapshotId Data disk snapshot ID. the capacity of the selected data disk snapshot must be less than that of the data disk (storageSize). Note: This field may return null, indicating that no valid value was found.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set data disk snapshot ID. the capacity of the selected data disk snapshot must be less than that of the data disk (storageSize). Note: This field may return null, indicating that no valid value was found.
     * @param SnapshotId Data disk snapshot ID. the capacity of the selected data disk snapshot must be less than that of the data disk (storageSize). Note: This field may return null, indicating that no valid value was found.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);

    }
}

