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

public class ImportImageRequest  extends AbstractModel{

    /**
    * The operating system architecture of the imported image, `x86_64` or `i386`
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * The operating system type of the imported image, which can be obtained via `DescribeImportImageOs`
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * The operating system version of the imported image, which can be obtained via `DescribeImportImageOs`
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
    * The image address on COS where the imported image is stored
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

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
    * Perform dry-run
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Indicates whether to perform the forced image import. For more information, please see [Forcibly Import Image](https://intl.cloud.tencent.com/document/product/213/12849)
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get the operating system architecture of the imported image, `x86_64` or `i386`
     * @return Architecture The operating system architecture of the imported image, `x86_64` or `i386`
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set the operating system architecture of the imported image, `x86_64` or `i386`
     * @param Architecture The operating system architecture of the imported image, `x86_64` or `i386`
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get the operating system type of the imported image, which can be obtained via `DescribeImportImageOs`
     * @return OsType The operating system type of the imported image, which can be obtained via `DescribeImportImageOs`
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set the operating system type of the imported image, which can be obtained via `DescribeImportImageOs`
     * @param OsType The operating system type of the imported image, which can be obtained via `DescribeImportImageOs`
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get the operating system version of the imported image, which can be obtained via `DescribeImportImageOs`
     * @return OsVersion The operating system version of the imported image, which can be obtained via `DescribeImportImageOs`
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set the operating system version of the imported image, which can be obtained via `DescribeImportImageOs`
     * @param OsVersion The operating system version of the imported image, which can be obtained via `DescribeImportImageOs`
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    /**
     * Get the image address on COS where the imported image is stored
     * @return ImageUrl The image address on COS where the imported image is stored
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set the image address on COS where the imported image is stored
     * @param ImageUrl The image address on COS where the imported image is stored
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get image name
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set image name
     * @param ImageName Image name
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
     * Get perform dry-run
     * @return DryRun Perform dry-run
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set perform dry-run
     * @param DryRun Perform dry-run
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get indicates whether to perform the forced image import. For more information, please see [Forcibly Import Image](https://intl.cloud.tencent.com/document/product/213/12849)
     * @return Force Indicates whether to perform the forced image import. For more information, please see [Forcibly Import Image](https://intl.cloud.tencent.com/document/product/213/12849)
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set indicates whether to perform the forced image import. For more information, please see [Forcibly Import Image](https://intl.cloud.tencent.com/document/product/213/12849)
     * @param Force Indicates whether to perform the forced image import. For more information, please see [Forcibly Import Image](https://intl.cloud.tencent.com/document/product/213/12849)
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

