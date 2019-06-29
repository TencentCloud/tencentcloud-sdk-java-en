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

public class ImageOsList  extends AbstractModel{

    /**
    * Supported Windows operating systems. Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Windows")
    @Expose
    private String [] Windows;

    /**
    * Supported Linux operating systems.Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Linux")
    @Expose
    private String [] Linux;

    /**
     * Get supported Windows operating systems. Note: This field may return null, indicating that no valid value was found.
     * @return Windows Supported Windows operating systems. Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getWindows() {
        return this.Windows;
    }

    /**
     * Set supported Windows operating systems. Note: This field may return null, indicating that no valid value was found.
     * @param Windows Supported Windows operating systems. Note: This field may return null, indicating that no valid value was found.
     */
    public void setWindows(String [] Windows) {
        this.Windows = Windows;
    }

    /**
     * Get supported Linux operating systemsNote: This field may return null, indicating that no valid value was found.
     * @return Linux supported Windows operating systemsNote: This field may return null, indicating that no valid value was found.
     */
    public String [] getLinux() {
        return this.Linux;
    }

    /**
     * Set supported Linux operating systemsNote: This field may return null, indicating that no valid value was found.
     * @param Linux Supported Linux operating systemsNote: This field may return null, indicating that no valid value was found.
     */
    public void setLinux(String [] Linux) {
        this.Linux = Linux;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Windows.", this.Windows);
        this.setParamArraySimple(map, prefix + "Linux.", this.Linux);

    }
}

