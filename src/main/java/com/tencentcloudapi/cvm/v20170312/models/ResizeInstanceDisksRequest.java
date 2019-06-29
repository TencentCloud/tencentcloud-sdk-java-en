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

public class ResizeInstanceDisksRequest  extends AbstractModel{

    /**
    * IDs of instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Configuration information of the data disk whose capacity is to be expanded. Only in-elastic data disk is supported (which can be obtained from [`DescribeDisks`](https://intl.cloud.tencent.com/document/api/362/16315) in the returned value: `Portable` is `false` by the API ), and [Data disk type] (https://intl.cloud.tencent.com/document/api/213/9452#block_device) is: `CLOUD_BASIC`, `CLOUD_PREMIUM`, `CLOUD_SSD`. Data disk capacity unit: GB. Minimum capacity expansion step width: 10G. For the selection of the data disk type, please see the hard disk product intro. The available data disk types are limited by the instance type `InstanceType`. In addition, the maximum capacity allowed for expansion varies depending on the type of data disk.
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * Obtain IDs of instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     * @return InstanceId instances ID you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * To configure ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     * @param InstanceId  of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Obtain configuration information of the data disk whose capacity is to be expanded. Only in-elastic data disk is supported (which can be obtained from [`DescribeDisks`](https://intl.cloud.tencent.com/document/api/362/16315) in the returned value: `Portable` is `false` by the API ), and [Data disk type] (https://intl.cloud.tencent.com/document/api/213/9452#block_device) is: `CLOUD_BASIC`, `CLOUD_PREMIUM`, `CLOUD_SSD`. Data disk capacity unit: GB. Minimum capacity expansion step width: 10G. For the selection of the data disk type, please see the hard disk product intro. The available data disk types are limited by the instance type `InstanceType`. In addition, the maximum capacity allowed for expansion varies depending on the type of data disk.
     * @return DataDisks Configuration information of the data disk whose capacity is to be expanded. Only in-elastic data disk is supported (which can be obtained from [`DescribeDisks`](https://intl.cloud.tencent.com/document/api/362/16315) in the returned value: `Portable` is `false` by the API ), and [Data disk type] (https://intl.cloud.tencent.com/document/api/213/9452#block_device) is: `CLOUD_BASIC`, `CLOUD_PREMIUM`, `CLOUD_SSD`. Data disk capacity unit: GB. Minimum capacity expansion step width: 10G. For the selection of the data disk type, please see the hard disk product intro. The available data disk types are limited by the instance type `InstanceType`. In addition, the maximum capacity allowed for expansion varies depending on the type of data disk.
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Configure configuration information of the data disk whose capacity is to be expanded. Only in-elastic data disk is supported (which can be obtained from [`DescribeDisks`](https://intl.cloud.tencent.com/document/api/362/16315) in the returned value: `Portable` is `false` by the API ), and [Data disk type] (https://intl.cloud.tencent.com/document/api/213/9452#block_device) is: `CLOUD_BASIC`, `CLOUD_PREMIUM`, `CLOUD_SSD`. Data disk capacity unit: GB. Minimum capacity expansion step width: 10G. For the selection of the data disk type, please see the hard disk product intro. The available data disk types are limited by the instance type `InstanceType`. In addition, the maximum capacity allowed for expansion varies depending on the type of data disk.
     * @param DataDisks Configuration information of the data disk whose capacity is to be expanded. Only in-elastic data disk is supported (which can be obtained from [`DescribeDisks`](https://intl.cloud.tencent.com/document/api/362/16315) in the returned value: `Portable` is `false` by the API ), and [Data disk type] (https://intl.cloud.tencent.com/document/api/213/9452#block_device) is: `CLOUD_BASIC`, `CLOUD_PREMIUM`, `CLOUD_SSD`. Data disk capacity unit: GB. Minimum capacity expansion step width: 10G. For the selection of the data disk type, please see the hard disk product intro. The available data disk types are limited by the instance type `InstanceType`. In addition, the maximum capacity allowed for expansion varies depending on the type of data disk.
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Understand whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     * @return ForceStop Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Configure whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     * @param ForceStop Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values: <br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);

    }
}

