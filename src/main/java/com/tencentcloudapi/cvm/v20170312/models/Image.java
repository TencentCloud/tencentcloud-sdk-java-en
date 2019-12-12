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

public class Image  extends AbstractModel{

    /**
    * Image ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * Operating system of the image
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * Image type
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * Creation time of the image
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image description
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * Image size
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * Image architecture
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * Image state
    */
    @SerializedName("ImageState")
    @Expose
    private String ImageState;

    /**
    * Source platform of the image
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Image creator
    */
    @SerializedName("ImageCreator")
    @Expose
    private String ImageCreator;

    /**
    * Image source
    */
    @SerializedName("ImageSource")
    @Expose
    private String ImageSource;

    /**
    * Synchronization percentage
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SyncPercent")
    @Expose
    private Long SyncPercent;

    /**
    * Whether the image supports cloud-init
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("IsSupportCloudinit")
    @Expose
    private Boolean IsSupportCloudinit;

    /**
    * Information on the snapshots associated with the image
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SnapshotSet")
    @Expose
    private Snapshot [] SnapshotSet;

    /**
     * Get Image ID 
     * @return ImageId Image ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID
     * @param ImageId Image ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get Operating system of the image 
     * @return OsName Operating system of the image
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set Operating system of the image
     * @param OsName Operating system of the image
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get Image type 
     * @return ImageType Image type
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set Image type
     * @param ImageType Image type
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get Creation time of the image 
     * @return CreatedTime Creation time of the image
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time of the image
     * @param CreatedTime Creation time of the image
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

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
     * Get Image size 
     * @return ImageSize Image size
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set Image size
     * @param ImageSize Image size
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get Image architecture 
     * @return Architecture Image architecture
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set Image architecture
     * @param Architecture Image architecture
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get Image state 
     * @return ImageState Image state
     */
    public String getImageState() {
        return this.ImageState;
    }

    /**
     * Set Image state
     * @param ImageState Image state
     */
    public void setImageState(String ImageState) {
        this.ImageState = ImageState;
    }

    /**
     * Get Source platform of the image 
     * @return Platform Source platform of the image
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Source platform of the image
     * @param Platform Source platform of the image
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Image creator 
     * @return ImageCreator Image creator
     */
    public String getImageCreator() {
        return this.ImageCreator;
    }

    /**
     * Set Image creator
     * @param ImageCreator Image creator
     */
    public void setImageCreator(String ImageCreator) {
        this.ImageCreator = ImageCreator;
    }

    /**
     * Get Image source 
     * @return ImageSource Image source
     */
    public String getImageSource() {
        return this.ImageSource;
    }

    /**
     * Set Image source
     * @param ImageSource Image source
     */
    public void setImageSource(String ImageSource) {
        this.ImageSource = ImageSource;
    }

    /**
     * Get Synchronization percentage
Note: This field may return null, indicating that no valid value is found. 
     * @return SyncPercent Synchronization percentage
Note: This field may return null, indicating that no valid value is found.
     */
    public Long getSyncPercent() {
        return this.SyncPercent;
    }

    /**
     * Set Synchronization percentage
Note: This field may return null, indicating that no valid value is found.
     * @param SyncPercent Synchronization percentage
Note: This field may return null, indicating that no valid value is found.
     */
    public void setSyncPercent(Long SyncPercent) {
        this.SyncPercent = SyncPercent;
    }

    /**
     * Get Whether the image supports cloud-init
Note: This field may return null, indicating that no valid value is found. 
     * @return IsSupportCloudinit Whether the image supports cloud-init
Note: This field may return null, indicating that no valid value is found.
     */
    public Boolean getIsSupportCloudinit() {
        return this.IsSupportCloudinit;
    }

    /**
     * Set Whether the image supports cloud-init
Note: This field may return null, indicating that no valid value is found.
     * @param IsSupportCloudinit Whether the image supports cloud-init
Note: This field may return null, indicating that no valid value is found.
     */
    public void setIsSupportCloudinit(Boolean IsSupportCloudinit) {
        this.IsSupportCloudinit = IsSupportCloudinit;
    }

    /**
     * Get Information on the snapshots associated with the image
Note: This field may return null, indicating that no valid value is found. 
     * @return SnapshotSet Information on the snapshots associated with the image
Note: This field may return null, indicating that no valid value is found.
     */
    public Snapshot [] getSnapshotSet() {
        return this.SnapshotSet;
    }

    /**
     * Set Information on the snapshots associated with the image
Note: This field may return null, indicating that no valid value is found.
     * @param SnapshotSet Information on the snapshots associated with the image
Note: This field may return null, indicating that no valid value is found.
     */
    public void setSnapshotSet(Snapshot [] SnapshotSet) {
        this.SnapshotSet = SnapshotSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "ImageState", this.ImageState);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ImageCreator", this.ImageCreator);
        this.setParamSimple(map, prefix + "ImageSource", this.ImageSource);
        this.setParamSimple(map, prefix + "SyncPercent", this.SyncPercent);
        this.setParamSimple(map, prefix + "IsSupportCloudinit", this.IsSupportCloudinit);
        this.setParamArrayObj(map, prefix + "SnapshotSet.", this.SnapshotSet);

    }
}

