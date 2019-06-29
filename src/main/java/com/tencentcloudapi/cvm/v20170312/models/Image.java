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
    * Image's operating system
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
    * Creation time of image
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
    private Integer ImageSize;

    /**
    * Image architecture
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * Image status
    */
    @SerializedName("ImageState")
    @Expose
    private String ImageState;

    /**
    * Image source platform
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
    * Image sync percentageNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("SyncPercent")
    @Expose
    private Integer SyncPercent;

    /**
    * Whether image support cloud-initNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("IsSupportCloudinit")
    @Expose
    private Boolean IsSupportCloudinit;

    /**
    * Details of snapshot(s) associated with imageNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("SnapshotSet")
    @Expose
    private Snapshot [] SnapshotSet;

    /**
     * Get image ID
     * @return ImageId Image ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set image ID
     * @param ImageId Image ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get image’s operating system
     * @return OsName Image's operating system
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set image’s operating system
     * @param OsName Image's operating system
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get image type
     * @return ImageType Image type
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set image type
     * @param ImageType Image type
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get creation time of image
     * @return CreatedTime Creation time of image
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set creation time of image
     * @param CreatedTime Creation time of image
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get image name
     * @return ImageName Image Name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set image name
     * @param ImageName Image Name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get image description
     * @return ImageDescription Image description
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set image description
     * @param ImageDescription Image description
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get image Size
     * @return ImageSize Image size
     */
    public Integer getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set image size
     * @param ImageSize Image size
     */
    public void setImageSize(Integer ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get image architecture
     * @return Architecture Image architecture
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set image architecture
     * @param Architecture Image architecture
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get image status
     * @return ImageState Image status
     */
    public String getImageState() {
        return this.ImageState;
    }

    /**
     * Set image status
     * @param ImageState Image status
     */
    public void setImageState(String ImageState) {
        this.ImageState = ImageState;
    }

    /**
     * Get image source platform
     * @return Platform Image source platform
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set image source platform
     * @param Platform Image source Platform
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get image creator
     * @return ImageCreator Image creator
     */
    public String getImageCreator() {
        return this.ImageCreator;
    }

    /**
     * Set image creator
     * @param ImageCreator Image creator
     */
    public void setImageCreator(String ImageCreator) {
        this.ImageCreator = ImageCreator;
    }

    /**
     * Get image source
     * @return ImageSource Image source
     */
    public String getImageSource() {
        return this.ImageSource;
    }

    /**
     * Set image source
     * @param ImageSource Image source
     */
    public void setImageSource(String ImageSource) {
        this.ImageSource = ImageSource;
    }

    /**
     * Get image sync percentageNote: This field may return null, indicating that no valid value was found.
     * @return SyncPercent Image sync percentageNote: This field may return null, indicating that no valid value was found.
     */
    public Integer getSyncPercent() {
        return this.SyncPercent;
    }

    /**
     * Set image sync percentageNote: This field may return null, indicating that no valid value was found.
     * @param SyncPercent Image sync percentageNote: This field may return null, indicating that no valid value was found.
     */
    public void setSyncPercent(Integer SyncPercent) {
        this.SyncPercent = SyncPercent;
    }

    /**
     * Get whether image support cloud-initNote: This field may return null, indicating that no valid value was found.
     * @return IsSupportCloudinit Whether image support cloud-initNote: This field may return null, indicating that no valid value was found.
     */
    public Boolean getIsSupportCloudinit() {
        return this.IsSupportCloudinit;
    }

    /**
     * Set whether image support cloud-initNote: This field may return null, indicating that no valid value was found.
     * @param IsSupportCloudinit Whether image support cloud-initNote: This field may return null, indicating that no valid value was found.
     */
    public void setIsSupportCloudinit(Boolean IsSupportCloudinit) {
        this.IsSupportCloudinit = IsSupportCloudinit;
    }

    /**
     * Get details of snapshot(s) associated with imageNote: This field may return null, indicating that no valid value was found.
     * @return SnapshotSet Details of snapshot(s) associated with imageNote: This field may return null, indicating that no valid value was found.
     */
    public Snapshot [] getSnapshotSet() {
        return this.SnapshotSet;
    }

    /**
     * Set details of snapshot(s) associated with imageNote: This field may return null, indicating that no valid value was found.
     * @param SnapshotSet Details of snapshot(s) associated with imageNote: This field may return null, indicating that no valid value was found.
     */
    public void setSnapshotSet(Snapshot [] SnapshotSet) {
        this.SnapshotSet = SnapshotSet;
    }

    /**
     * For internal use only.
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

