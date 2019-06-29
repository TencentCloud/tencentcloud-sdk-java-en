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

public class CreateImageRequest  extends AbstractModel{

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Instance ID used to create an image
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Image description
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * Indicates whether to perform a forced shutdown to create an image when soft shutdown fails
    */
    @SerializedName("ForcePoweroff")
    @Expose
    private String ForcePoweroff;

    /**
    * whether enable Sysprep when creating a Windows image
    */
    @SerializedName("Sysprep")
    @Expose
    private String Sysprep;

    /**
    * whether allow shutdown a running instance to create an image
    */
    @SerializedName("Reboot")
    @Expose
    private String Reboot;

    /**
    * Data disk ID used to create an image
    */
    @SerializedName("DataDiskIds")
    @Expose
    private String [] DataDiskIds;

    /**
    * Snapshot ID used to create an image, a system disk snapshot must be included
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * Detect validity of the request, without any impact on the detected resources
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get Image name
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Instance ID used to create an image
     * @return InstanceId Instance ID used to create an image
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID used to create an image
     * @param InstanceId Instance ID used to create an image
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Image description
     * @return ImageDescription Image description
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set Image description
     * @param ImageDescription Image description
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get whether to perform a forced shutdown to create an image when soft shutdown fails
     * @return ForcePoweroff whether to perform a forced shutdown to create an image when soft shutdown fails
     */
    public String getForcePoweroff() {
        return this.ForcePoweroff;
    }

    /**
     * Set whether to perform a forced shutdown to create an image when soft shutdown fails
     * @param ForcePoweroff whether to perform a forced shutdown to create an image when soft shutdown fails
     */
    public void setForcePoweroff(String ForcePoweroff) {
        this.ForcePoweroff = ForcePoweroff;
    }

    /**
     * Get whether enable Sysprep when creating a Windows image
     * @return Sysprep whether enable Sysprep when creating a Windows image
     */
    public String getSysprep() {
        return this.Sysprep;
    }

    /**
     * Set whether enable Sysprep when creating a Windows image
     * @param Sysprep whether enable Sysprep when creating a Windows image
     */
    public void setSysprep(String Sysprep) {
        this.Sysprep = Sysprep;
    }

    /**
     * Get whether allow shutdown a running instance to create an image
     * @return Reboot whether allow shutdown a running instance to create an image
     */
    public String getReboot() {
        return this.Reboot;
    }

    /**
     * Set whether allow shutdown a running instance to create an image
     * @param Reboot whether allow shutdown a running instance to create an image
     */
    public void setReboot(String Reboot) {
        this.Reboot = Reboot;
    }

    /**
     * Get Instance ID used to create an image
     * @return DataDiskIds Data disk ID used to create an image
     */
    public String [] getDataDiskIds() {
        return this.DataDiskIds;
    }

    /**
     * Set Data disk ID used to create an image
     * @param DataDiskIds Data disk ID used to create an image
     */
    public void setDataDiskIds(String [] DataDiskIds) {
        this.DataDiskIds = DataDiskIds;
    }

    /**
     * Get Snapshot ID used to create an image, a system disk snapshot must be included
     * @return SnapshotIds Snapshot ID used to create an image, a system disk snapshot must be included
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set Snapshot ID used to create an image, a system disk snapshot must be included
     * @param SnapshotIds Snapshot ID used to create an image, a system disk snapshot must be included
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get Detect validity of the request, without any impact on the detected resources
     * @return DryRun Detect validity of the request, without any impact on the detected resources
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Detect validity of the request, without any impact on the detected resources
     * @param DryRun Detect validity of the request, without any impact on the detected resources
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ForcePoweroff", this.ForcePoweroff);
        this.setParamSimple(map, prefix + "Sysprep", this.Sysprep);
        this.setParamSimple(map, prefix + "Reboot", this.Reboot);
        this.setParamArraySimple(map, prefix + "DataDiskIds.", this.DataDiskIds);
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

