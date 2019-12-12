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

public class AttachDisksRequest  extends AbstractModel{

    /**
    * ID of the elastic cloud disk to be mounted, which can be queried through the API [DescribeDisks](/document/product/362/16315). A maximum of 10 elastic cloud disks can be mounted in a single request.
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * ID of the CVM instance on which the cloud disk will be mounted. It can be queried via the API [DescribeInstances](/document/product/213/15728).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Optional parameter. If this is not passed only the mount operation is executed. If `True` is passed, the cloud disk will be configured to be terminated when the server it is mounted to is terminated. This is only valid for pay-as-you-go cloud disks.
    */
    @SerializedName("DeleteWithInstance")
    @Expose
    private Boolean DeleteWithInstance;

    /**
     * Get ID of the elastic cloud disk to be mounted, which can be queried through the API [DescribeDisks](/document/product/362/16315). A maximum of 10 elastic cloud disks can be mounted in a single request. 
     * @return DiskIds ID of the elastic cloud disk to be mounted, which can be queried through the API [DescribeDisks](/document/product/362/16315). A maximum of 10 elastic cloud disks can be mounted in a single request.
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set ID of the elastic cloud disk to be mounted, which can be queried through the API [DescribeDisks](/document/product/362/16315). A maximum of 10 elastic cloud disks can be mounted in a single request.
     * @param DiskIds ID of the elastic cloud disk to be mounted, which can be queried through the API [DescribeDisks](/document/product/362/16315). A maximum of 10 elastic cloud disks can be mounted in a single request.
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get ID of the CVM instance on which the cloud disk will be mounted. It can be queried via the API [DescribeInstances](/document/product/213/15728). 
     * @return InstanceId ID of the CVM instance on which the cloud disk will be mounted. It can be queried via the API [DescribeInstances](/document/product/213/15728).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the CVM instance on which the cloud disk will be mounted. It can be queried via the API [DescribeInstances](/document/product/213/15728).
     * @param InstanceId ID of the CVM instance on which the cloud disk will be mounted. It can be queried via the API [DescribeInstances](/document/product/213/15728).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Optional parameter. If this is not passed only the mount operation is executed. If `True` is passed, the cloud disk will be configured to be terminated when the server it is mounted to is terminated. This is only valid for pay-as-you-go cloud disks. 
     * @return DeleteWithInstance Optional parameter. If this is not passed only the mount operation is executed. If `True` is passed, the cloud disk will be configured to be terminated when the server it is mounted to is terminated. This is only valid for pay-as-you-go cloud disks.
     */
    public Boolean getDeleteWithInstance() {
        return this.DeleteWithInstance;
    }

    /**
     * Set Optional parameter. If this is not passed only the mount operation is executed. If `True` is passed, the cloud disk will be configured to be terminated when the server it is mounted to is terminated. This is only valid for pay-as-you-go cloud disks.
     * @param DeleteWithInstance Optional parameter. If this is not passed only the mount operation is executed. If `True` is passed, the cloud disk will be configured to be terminated when the server it is mounted to is terminated. This is only valid for pay-as-you-go cloud disks.
     */
    public void setDeleteWithInstance(Boolean DeleteWithInstance) {
        this.DeleteWithInstance = DeleteWithInstance;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeleteWithInstance", this.DeleteWithInstance);

    }
}

