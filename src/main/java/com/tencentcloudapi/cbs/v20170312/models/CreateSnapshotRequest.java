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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSnapshotRequest  extends AbstractModel{

    /**
    * ID of the cloud disk, for which a snapshot needs to be created. It can be queried via the API [DescribeDisks](/document/product/362/16315).
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * Snapshot name. If it is left empty, the new snapshot name is "Not named" by default.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
     * Get ID of the cloud disk, for which a snapshot needs to be created. It can be queried via the API [DescribeDisks](/document/product/362/16315). 
     * @return DiskId ID of the cloud disk, for which a snapshot needs to be created. It can be queried via the API [DescribeDisks](/document/product/362/16315).
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set ID of the cloud disk, for which a snapshot needs to be created. It can be queried via the API [DescribeDisks](/document/product/362/16315).
     * @param DiskId ID of the cloud disk, for which a snapshot needs to be created. It can be queried via the API [DescribeDisks](/document/product/362/16315).
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get Snapshot name. If it is left empty, the new snapshot name is "Not named" by default. 
     * @return SnapshotName Snapshot name. If it is left empty, the new snapshot name is "Not named" by default.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set Snapshot name. If it is left empty, the new snapshot name is "Not named" by default.
     * @param SnapshotName Snapshot name. If it is left empty, the new snapshot name is "Not named" by default.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);

    }
}

