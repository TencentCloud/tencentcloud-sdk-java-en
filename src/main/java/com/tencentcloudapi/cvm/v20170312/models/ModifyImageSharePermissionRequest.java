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

public class ModifyImageSharePermissionRequest extends AbstractModel{

    /**
    * Image ID such as `img-gvbnzy6f`. You can obtain the image IDs in two ways: <br><li>Call [DescribeImages](https://cloud.tencent.com/document/api/213/15715) and look for `ImageId` in the response. <br><li>Look for the information in the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>You can only specify an image in the `NORMAL` state. For more information on image states, see [here](/document/api/213/9452#image_state).
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * List of account IDs with which an image is shared. For the format of array-type parameters, see [API Introduction](/document/api/213/568). The account ID is different from the QQ number. You can find the account ID in [Account Information](https://console.cloud.tencent.com/developer). 
    */
    @SerializedName("AccountIds")
    @Expose
    private String [] AccountIds;

    /**
    * Operations. Valid values: `SHARE`, sharing an image; `CANCEL`, cancelling an image sharing. 
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
     * Get Image ID such as `img-gvbnzy6f`. You can obtain the image IDs in two ways: <br><li>Call [DescribeImages](https://cloud.tencent.com/document/api/213/15715) and look for `ImageId` in the response. <br><li>Look for the information in the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>You can only specify an image in the `NORMAL` state. For more information on image states, see [here](/document/api/213/9452#image_state). 
     * @return ImageId Image ID such as `img-gvbnzy6f`. You can obtain the image IDs in two ways: <br><li>Call [DescribeImages](https://cloud.tencent.com/document/api/213/15715) and look for `ImageId` in the response. <br><li>Look for the information in the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>You can only specify an image in the `NORMAL` state. For more information on image states, see [here](/document/api/213/9452#image_state).
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set Image ID such as `img-gvbnzy6f`. You can obtain the image IDs in two ways: <br><li>Call [DescribeImages](https://cloud.tencent.com/document/api/213/15715) and look for `ImageId` in the response. <br><li>Look for the information in the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>You can only specify an image in the `NORMAL` state. For more information on image states, see [here](/document/api/213/9452#image_state).
     * @param ImageId Image ID such as `img-gvbnzy6f`. You can obtain the image IDs in two ways: <br><li>Call [DescribeImages](https://cloud.tencent.com/document/api/213/15715) and look for `ImageId` in the response. <br><li>Look for the information in the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>You can only specify an image in the `NORMAL` state. For more information on image states, see [here](/document/api/213/9452#image_state).
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get List of account IDs with which an image is shared. For the format of array-type parameters, see [API Introduction](/document/api/213/568). The account ID is different from the QQ number. You can find the account ID in [Account Information](https://console.cloud.tencent.com/developer).  
     * @return AccountIds List of account IDs with which an image is shared. For the format of array-type parameters, see [API Introduction](/document/api/213/568). The account ID is different from the QQ number. You can find the account ID in [Account Information](https://console.cloud.tencent.com/developer). 
     */
    public String [] getAccountIds() {
        return this.AccountIds;
    }

    /**
     * Set List of account IDs with which an image is shared. For the format of array-type parameters, see [API Introduction](/document/api/213/568). The account ID is different from the QQ number. You can find the account ID in [Account Information](https://console.cloud.tencent.com/developer). 
     * @param AccountIds List of account IDs with which an image is shared. For the format of array-type parameters, see [API Introduction](/document/api/213/568). The account ID is different from the QQ number. You can find the account ID in [Account Information](https://console.cloud.tencent.com/developer). 
     */
    public void setAccountIds(String [] AccountIds) {
        this.AccountIds = AccountIds;
    }

    /**
     * Get Operations. Valid values: `SHARE`, sharing an image; `CANCEL`, cancelling an image sharing.  
     * @return Permission Operations. Valid values: `SHARE`, sharing an image; `CANCEL`, cancelling an image sharing. 
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set Operations. Valid values: `SHARE`, sharing an image; `CANCEL`, cancelling an image sharing. 
     * @param Permission Operations. Valid values: `SHARE`, sharing an image; `CANCEL`, cancelling an image sharing. 
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamArraySimple(map, prefix + "AccountIds.", this.AccountIds);
        this.setParamSimple(map, prefix + "Permission", this.Permission);

    }
}

