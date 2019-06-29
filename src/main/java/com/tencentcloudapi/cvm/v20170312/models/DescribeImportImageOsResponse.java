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

public class DescribeImportImageOsResponse  extends AbstractModel{

    /**
    * Supported operating system types of imported images 
    */
    @SerializedName("ImportImageOsListSupported")
    @Expose
    private ImageOsList ImportImageOsListSupported;

    /**
    * Supported operating system versions of imported images 
    */
    @SerializedName("ImportImageOsVersionSet")
    @Expose
    private OsVersion [] ImportImageOsVersionSet;

    /**
    * The unique ID of a request, which is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain supported operating system types of imported images 
     * @return ImportImageOsListSupported Supported operating system types of imported images |
     */
    public ImageOsList getImportImageOsListSupported() {
        return this.ImportImageOsListSupported;
    }

    /**
     * Set Supported operating system types of imported images 
     * @param ImportImageOsListSupported Supported operating system types of imported images |
     */
    public void setImportImageOsListSupported(ImageOsList ImportImageOsListSupported) {
        this.ImportImageOsListSupported = ImportImageOsListSupported;
    }

    /**
     * Obtain supported operating system versions of imported images 
     * @return ImportImageOsVersionSet Supported operating system versions of imported images 
     */
    public OsVersion [] getImportImageOsVersionSet() {
        return this.ImportImageOsVersionSet;
    }

    /**
     * Set supported operating system versions of imported images 
     * @param ImportImageOsVersionSet Supported operating system versions of imported images 
     */
    public void setImportImageOsVersionSet(OsVersion [] ImportImageOsVersionSet) {
        this.ImportImageOsVersionSet = ImportImageOsVersionSet;
    }

    /**
     * Obtain the unique ID of a request, which is required for each troubleshooting case.
     * @return RequestId The unique ID of a request, which is required for each troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configure the unique ID of a request, which is required for each troubleshooting case.
     * @param RequestId The unique ID of a request, which is required for each troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     *  Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImportImageOsListSupported.", this.ImportImageOsListSupported);
        this.setParamArrayObj(map, prefix + "ImportImageOsVersionSet.", this.ImportImageOsVersionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

