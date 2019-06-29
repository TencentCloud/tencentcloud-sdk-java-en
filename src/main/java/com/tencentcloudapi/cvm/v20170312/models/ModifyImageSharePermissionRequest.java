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

public class ModifyImageSharePermissionRequest  extends AbstractModel{

    /**
    * Image ID like `img-gvbnzy6f` that can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>The specified image ID must identify an image with a status of `NORMAL`.For more information on image statuses, please see [Image Data Sheet](https://intl.cloud.tencent.com/document/api/213/9452#image_state).
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * List of account IDs receiving shared image. For the format of array parameters, please see [API Introduction](/document/api/213/568). The account ID is different from the QQ number. To query the account ID, please see the Account ID column in [Account Information](https://console.cloud.tencent.com/developer). 
    */
    @SerializedName("AccountIds")
    @Expose
    private String [] AccountIds;

    /**
    * Operations including `SHARE` and `CANCEL`. `SHARE` means sharing, and `CANCEL` means canceling sharing. 
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
     * Obtain image ID list like `img-gvbnzy6f`. Image ID can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>The specified image ID must identify an image with a status of `NORMAL`. For more information on image statuses, please see [Image Data Sheet](https://intl.cloud.tencent.com/document/api/213/9452#image_state).
     * @return ImageIds Image ID like `img-gvbnzy6f` that can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>The specified image ID must identify an image with a status of `NORMAL`. For more information on image statuses, please see [Image Data Sheet](https://intl.cloud.tencent.com/document/api/213/9452#image_state).
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set up image ID like `img-gvbnzy6f` that can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>The specified image ID must identify an image with a status of `NORMAL`. For more information on image statuses, please see [Image Data Sheet](https://intl.cloud.tencent.com/document/api/213/9452#image_state).
     * @param ImageIds Image ID like `img-gvbnzy6f` that can be obtained by either of the following ways:<br><li>Obtain field `ImageId` in the returned result by calling API [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715).<br><li>Obtain by logging in to the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>The specified image ID must identify an image with a status of `NORMAL`. For more information on image statuses, please see [Image Data Sheet](https://intl.cloud.tencent.com/document/api/213/9452#image_state).
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get list of account IDs receiving shared image. For the format of array parameters, please see [API Introduction](/document/api/213/568). The account ID is different from the QQ number. To query the account ID, please see the Account ID column in [Account Information](https://console.cloud.tencent.com/developer). 
     * @return AccountIds List of account IDs receiving shared image. For the format of array parameters, please see [API Introduction](/document/api/213/568). The account ID is different from the QQ number. To query the account ID, please see the Account ID column in [Account Information](https://console.cloud.tencent.com/developer). 
     */
    public String [] getAccountIds() {
        return this.AccountIds;
    }

    /**
     * Set list of account IDs receiving shared image. For the format of array parameters, please see [API Introduction](/document/api/213/568). The account ID is different from the QQ number. To query the account ID, please see the Account ID column in [Account Information](https://console.cloud.tencent.com/developer). |
     * @param AccountIds List of account IDs receiving shared image. For the format of array parameters, please see [API Introduction](/document/api/213/568). The account ID is different from the QQ number. To query the account ID, please see the Account ID column in [Account Information](https://console.cloud.tencent.com/developer). |
     */
    public void setAccountIds(String [] AccountIds) {
        this.AccountIds = AccountIds;
    }

    /**
     * Get operations including `SHARE` and `CANCEL`. `SHARE` means sharing, and `CANCEL` means canceling sharing. 
     * @return Permission operations including `SHARE` and `CANCEL`. `SHARE` means sharing, and `CANCEL` means canceling sharing. 
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set operations including `SHARE` and `CANCEL`. `SHARE` means sharing, and `CANCEL` means canceling sharing. 
     * @param Permission operations including `SHARE` and `CANCEL`. `SHARE` means sharing, and `CANCEL` means canceling sharing. 
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamArraySimple(map, prefix + "AccountIds.", this.AccountIds);
        this.setParamSimple(map, prefix + "Permission", this.Permission);

    }
}

