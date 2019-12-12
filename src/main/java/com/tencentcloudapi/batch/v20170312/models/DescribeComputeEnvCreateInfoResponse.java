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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComputeEnvCreateInfoResponse  extends AbstractModel{

    /**
    * Compute environment ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * Compute environment name
    */
    @SerializedName("EnvName")
    @Expose
    private String EnvName;

    /**
    * Compute environment description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvDescription")
    @Expose
    private String EnvDescription;

    /**
    * Compute environment type. Only "MANAGED" type is supported
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * Compute environment parameter
    */
    @SerializedName("EnvData")
    @Expose
    private EnvData EnvData;

    /**
    * Data disk mounting option
    */
    @SerializedName("MountDataDisks")
    @Expose
    private MountDataDisk [] MountDataDisks;

    /**
    * Input mapping
    */
    @SerializedName("InputMappings")
    @Expose
    private InputMapping [] InputMappings;

    /**
    * Authorization information
    */
    @SerializedName("Authentications")
    @Expose
    private Authentication [] Authentications;

    /**
    * Notification information
    */
    @SerializedName("Notifications")
    @Expose
    private Notification [] Notifications;

    /**
    * Number of desired compute nodes
    */
    @SerializedName("DesiredComputeNodeCount")
    @Expose
    private Long DesiredComputeNodeCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Compute environment ID 
     * @return EnvId Compute environment ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Compute environment ID
     * @param EnvId Compute environment ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get Compute environment name 
     * @return EnvName Compute environment name
     */
    public String getEnvName() {
        return this.EnvName;
    }

    /**
     * Set Compute environment name
     * @param EnvName Compute environment name
     */
    public void setEnvName(String EnvName) {
        this.EnvName = EnvName;
    }

    /**
     * Get Compute environment description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnvDescription Compute environment description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnvDescription() {
        return this.EnvDescription;
    }

    /**
     * Set Compute environment description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnvDescription Compute environment description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnvDescription(String EnvDescription) {
        this.EnvDescription = EnvDescription;
    }

    /**
     * Get Compute environment type. Only "MANAGED" type is supported 
     * @return EnvType Compute environment type. Only "MANAGED" type is supported
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set Compute environment type. Only "MANAGED" type is supported
     * @param EnvType Compute environment type. Only "MANAGED" type is supported
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get Compute environment parameter 
     * @return EnvData Compute environment parameter
     */
    public EnvData getEnvData() {
        return this.EnvData;
    }

    /**
     * Set Compute environment parameter
     * @param EnvData Compute environment parameter
     */
    public void setEnvData(EnvData EnvData) {
        this.EnvData = EnvData;
    }

    /**
     * Get Data disk mounting option 
     * @return MountDataDisks Data disk mounting option
     */
    public MountDataDisk [] getMountDataDisks() {
        return this.MountDataDisks;
    }

    /**
     * Set Data disk mounting option
     * @param MountDataDisks Data disk mounting option
     */
    public void setMountDataDisks(MountDataDisk [] MountDataDisks) {
        this.MountDataDisks = MountDataDisks;
    }

    /**
     * Get Input mapping 
     * @return InputMappings Input mapping
     */
    public InputMapping [] getInputMappings() {
        return this.InputMappings;
    }

    /**
     * Set Input mapping
     * @param InputMappings Input mapping
     */
    public void setInputMappings(InputMapping [] InputMappings) {
        this.InputMappings = InputMappings;
    }

    /**
     * Get Authorization information 
     * @return Authentications Authorization information
     */
    public Authentication [] getAuthentications() {
        return this.Authentications;
    }

    /**
     * Set Authorization information
     * @param Authentications Authorization information
     */
    public void setAuthentications(Authentication [] Authentications) {
        this.Authentications = Authentications;
    }

    /**
     * Get Notification information 
     * @return Notifications Notification information
     */
    public Notification [] getNotifications() {
        return this.Notifications;
    }

    /**
     * Set Notification information
     * @param Notifications Notification information
     */
    public void setNotifications(Notification [] Notifications) {
        this.Notifications = Notifications;
    }

    /**
     * Get Number of desired compute nodes 
     * @return DesiredComputeNodeCount Number of desired compute nodes
     */
    public Long getDesiredComputeNodeCount() {
        return this.DesiredComputeNodeCount;
    }

    /**
     * Set Number of desired compute nodes
     * @param DesiredComputeNodeCount Number of desired compute nodes
     */
    public void setDesiredComputeNodeCount(Long DesiredComputeNodeCount) {
        this.DesiredComputeNodeCount = DesiredComputeNodeCount;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "EnvName", this.EnvName);
        this.setParamSimple(map, prefix + "EnvDescription", this.EnvDescription);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamObj(map, prefix + "EnvData.", this.EnvData);
        this.setParamArrayObj(map, prefix + "MountDataDisks.", this.MountDataDisks);
        this.setParamArrayObj(map, prefix + "InputMappings.", this.InputMappings);
        this.setParamArrayObj(map, prefix + "Authentications.", this.Authentications);
        this.setParamArrayObj(map, prefix + "Notifications.", this.Notifications);
        this.setParamSimple(map, prefix + "DesiredComputeNodeCount", this.DesiredComputeNodeCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

