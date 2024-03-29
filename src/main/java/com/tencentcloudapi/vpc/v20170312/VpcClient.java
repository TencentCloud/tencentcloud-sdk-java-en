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
package com.tencentcloudapi.vpc.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vpc.v20170312.models.*;

public class VpcClient extends AbstractClient{
    private static String endpoint = "vpc.tencentcloudapi.com";
    private static String version = "2017-03-12";

    public VpcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VpcClient(Credential credential, String region, ClientProfile profile) {
        super(VpcClient.endpoint, VpcClient.version, credential, region, profile);
    }

    /**
     *本接口（AcceptAttachCcnInstances）用于跨账号关联实例时，云联网所有者接受并同意关联操作。
     * @param req AcceptAttachCcnInstancesRequest
     * @return AcceptAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AcceptAttachCcnInstancesResponse AcceptAttachCcnInstances(AcceptAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AcceptAttachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AcceptAttachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AcceptAttachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to apply for one or more [Elastic IP Addresses](https://cloud.tencent.com/document/product/213/1941) (EIPs for short).
* An EIP is a static IP address that is dedicated for dynamic cloud computing. You can quickly re-map an EIP to another instance under your account to protect against instance failures.
* Your EIP is associated with your Tencent Cloud account rather than an instance. It remains associated with your Tencent Cloud account until you choose to explicitly release it or your account is in arrears for more than 24 hours.
* The maximum number of EIPs that can be applied for a Tencent Cloud account in each region is restricted. For more information, see [EIP Product Introduction](https://cloud.tencent.com/document/product/213/5733). You can get the quota information through the DescribeAddressQuota API.
     * @param req AllocateAddressesRequest
     * @return AllocateAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AllocateAddressesResponse AllocateAddresses(AllocateAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AllocateAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AllocateAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssignIpv6Addresses）用于弹性网卡申请`IPv6`地址。<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口。
* 一个弹性网卡支持绑定的IP地址是有限制的，更多资源限制信息详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。
* 可以指定`IPv6`地址申请，地址类型不能为主`IP`，`IPv6`地址暂时只支持作为辅助`IP`。
* 地址必须要在弹性网卡所在子网内，而且不能被占用。
* 在弹性网卡上申请一个到多个辅助`IPv6`地址，接口会在弹性网卡所在子网段内返回指定数量的辅助`IPv6`地址。
     * @param req AssignIpv6AddressesRequest
     * @return AssignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6AddressesResponse AssignIpv6Addresses(AssignIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6AddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6AddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssignIpv6Addresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to assign IPv6 ranges.
* To use this API, you must already have a VPC instance. If you do not have a VPC instance yet, use the <a href="https://cloud.tencent.com/document/api/215/15774" title="CreateVpc" target="_blank">CreateVpc</a> API to create one.
* Each VPC can apply for only one IPv6 range.
     * @param req AssignIpv6CidrBlockRequest
     * @return AssignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6CidrBlockResponse AssignIpv6CidrBlock(AssignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6CidrBlockResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6CidrBlockResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssignIpv6CidrBlock"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AssignIpv6SubnetCidrBlock）用于分配IPv6子网段。
* 给子网分配 `IPv6` 网段，要求子网所属 `VPC` 已获得 `IPv6` 网段。如果尚未分配，请先通过接口 `AssignIpv6CidrBlock` 给子网所属 `VPC` 分配一个 `IPv6` 网段。否则无法分配 `IPv6` 子网段。
* 每个子网只能分配一个IPv6网段。
     * @param req AssignIpv6SubnetCidrBlockRequest
     * @return AssignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6SubnetCidrBlockResponse AssignIpv6SubnetCidrBlock(AssignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6SubnetCidrBlockResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssignIpv6SubnetCidrBlockResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssignIpv6SubnetCidrBlock"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (AssociateAddress) 用于将[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）绑定到实例或弹性网卡的指定内网 IP 上。
* 将 EIP 绑定到实例（CVM）上，其本质是将 EIP 绑定到实例上主网卡的主内网 IP 上。
* 将 EIP 绑定到主网卡的主内网IP上，绑定过程会把其上绑定的普通公网 IP 自动解绑并释放。
* 将 EIP 绑定到指定网卡的内网 IP上（非主网卡的主内网IP），则必须先解绑该 EIP，才能再绑定新的。
* 将 EIP 绑定到NAT网关，请使用接口[EipBindNatGateway](https://cloud.tencent.com/document/product/215/4093)
* EIP 如果欠费或被封堵，则不能被绑定。
* 只有状态为 UNBIND 的 EIP 才能够被绑定。
     * @param req AssociateAddressRequest
     * @return AssociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateAddressResponse AssociateAddress(AssociateAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssociateAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AttachCcnInstances）用于将网络实例加载到云联网实例中，网络实例包括VPC和专线网关。<br />
每个云联网能够关联的网络实例个数是有限的，详请参考产品文档。如果需要扩充请联系在线客服。
     * @param req AttachCcnInstancesRequest
     * @return AttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnInstancesResponse AttachCcnInstances(AttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(AttachClassicLinkVpc)用于创建私有网络和基础网络设备互通。
* 私有网络和基础网络设备必须在同一个地域。
* 私有网络和基础网络的区别详见vpc产品文档-<a href="https://cloud.tencent.com/document/product/215/535#2.-.E7.A7.81.E6.9C.89.E7.BD.91.E7.BB.9C.E4.B8.8E.E5.9F.BA.E7.A1.80.E7.BD.91.E7.BB.9C">私有网络与基础网络</a>。
     * @param req AttachClassicLinkVpcRequest
     * @return AttachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public AttachClassicLinkVpcResponse AttachClassicLinkVpc(AttachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachClassicLinkVpcResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachClassicLinkVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachClassicLinkVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（AttachNetworkInterface）用于弹性网卡绑定云主机。
* 一个云主机可以绑定多个弹性网卡，但只能绑定一个主网卡。更多限制信息详见<a href="https://cloud.tencent.com/document/product/215/6513">弹性网卡使用限制</a>。
* 一个弹性网卡只能同时绑定一个云主机。
* 只有运行中或者已关机状态的云主机才能绑定弹性网卡，查看云主机状态详见<a href="https://cloud.tencent.com/document/api/213/9452#instance_state">腾讯云主机信息</a>。
* 弹性网卡绑定的云主机必须是私有网络的，而且云主机所在可用区必须和弹性网卡子网的可用区相同。
     * @param req AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public AttachNetworkInterfaceResponse AttachNetworkInterface(AttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachNetworkInterfaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachNetworkInterfaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachNetworkInterface"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to verify the network detection status.
     * @param req CheckNetDetectStateRequest
     * @return CheckNetDetectStateResponse
     * @throws TencentCloudSDKException
     */
    public CheckNetDetectStateResponse CheckNetDetectState(CheckNetDetectStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckNetDetectStateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckNetDetectStateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckNetDetectState"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAddressTemplate）用于创建IP地址模版
     * @param req CreateAddressTemplateRequest
     * @return CreateAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateResponse CreateAddressTemplate(CreateAddressTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAddressTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAddressTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAddressTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateAddressTemplateGroup）用于创建IP地址模版集合
     * @param req CreateAddressTemplateGroupRequest
     * @return CreateAddressTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateGroupResponse CreateAddressTemplateGroup(CreateAddressTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAddressTemplateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAddressTemplateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAddressTemplateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateCcn）用于创建云联网（CCN）。<br />
每个账号能创建的云联网实例个数是有限的，详请参考产品文档。如果需要扩充请联系在线客服。
     * @param req CreateCcnRequest
     * @return CreateCcnResponse
     * @throws TencentCloudSDKException
     */
    public CreateCcnResponse CreateCcn(CreateCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCcnResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCcnResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCcn"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a default VPC.

The default VPC is suitable for getting started with and launching public instances, and it can be used like any other VPCs. To create a standard VPC, for which you need to specify a VPC name, VPC IP range, subnet IP range, and subnet availability zone, use the regular CreateVpc API.

Under normal circumstances, this API may not create a default VPC. It depends on the network attributes (DescribeAccountAttributes) of your account.
* If both basic network and VPC are supported, the returned VpcId is 0.
* If only VPC is supported, the default VPC information is returned.

You can also use the Force parameter to forcibly return a default VPC.
     * @param req CreateDefaultVpcRequest
     * @return CreateDefaultVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultVpcResponse CreateDefaultVpc(CreateDefaultVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDefaultVpcResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDefaultVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDefaultVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateDirectConnectGatewayCcnRoutes）用于创建专线网关的云联网路由（IDC网段）
     * @param req CreateDirectConnectGatewayCcnRoutesRequest
     * @return CreateDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectGatewayCcnRoutesResponse CreateDirectConnectGatewayCcnRoutes(CreateDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDirectConnectGatewayCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDirectConnectGatewayCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateHaVip）用于创建高可用虚拟IP（HAVIP）
     * @param req CreateHaVipRequest
     * @return CreateHaVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateHaVipResponse CreateHaVip(CreateHaVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHaVipResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHaVipResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateHaVip"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateNatGateway)用于创建NAT网关。
     * @param req CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewayResponse CreateNatGateway(CreateNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNatGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateNatGatewayDestinationIpPortTranslationNatRule)用于创建NAT网关端口转发规则。
     * @param req CreateNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return CreateNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewayDestinationIpPortTranslationNatRuleResponse CreateNatGatewayDestinationIpPortTranslationNatRule(CreateNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNatGatewayDestinationIpPortTranslationNatRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a network detection instance.
     * @param req CreateNetDetectRequest
     * @return CreateNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetDetectResponse CreateNetDetect(CreateNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetDetectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetDetectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNetDetect"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create one or more ENIs.
* You can specify private IP addresses and a primary IP when creating an ENI. The specified private IP must be in the same subnet as the ENI and is not occupied.
* When creating an ENI, you can specify the number of private IP addresses that you want to apply for. The system will randomly generate private IP addresses.
* An ENI can only be bound with a limited number of IP addresses. For more information about resource limits, see <a href="/document/product/576/18527">ENI Use Limits</a>.
* You can bind an existing security group when creating an ENI.
* You can bind a tag when creating an ENI. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkInterfaceResponse CreateNetworkInterface(CreateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkInterfaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetworkInterfaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNetworkInterface"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateRouteTable)用于创建路由表。
* 创建了VPC后，系统会创建一个默认路由表，所有新建的子网都会关联到默认路由表。默认情况下您可以直接使用默认路由表来管理您的路由策略。当您的路由策略较多时，您可以调用创建路由表接口创建更多路由表管理您的路由策略。
     * @param req CreateRouteTableRequest
     * @return CreateRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateRouteTableResponse CreateRouteTable(CreateRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRouteTableResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRouteTableResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRouteTable"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateRoutes)用于创建路由策略。
* 向指定路由表批量新增路由策略。
     * @param req CreateRoutesRequest
     * @return CreateRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoutesResponse CreateRoutes(CreateRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateSecurityGroup）用于创建新的安全组（SecurityGroup）。
* 每个账户下每个地域的每个项目的<a href="https://cloud.tencent.com/document/product/213/500#2.-.E5.AE.89.E5.85.A8.E7.BB.84.E7.9A.84.E9.99.90.E5.88.B6">安全组数量限制</a>。
* 新建的安全组的入站和出站规则默认都是全部拒绝，在创建后通常您需要再调用CreateSecurityGroupPolicies将安全组的规则设置为需要的规则。
     * @param req CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupResponse CreateSecurityGroup(CreateSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSecurityGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create security group policies (SecurityGroupPolicy).

* The `Version` field indicates the version number of a security group policy, which will automatically increment by 1 every time you update the security policy, to prevent the expiration of the updated routing policies. If this field is left empty, any conflicts will be ignored.
* The value of the `Protocol` field can be TCP, UDP, ICMP, ICMPV6, GRE, or ALL.
* The `CidrBlock` field allows you to enter any string that conforms to the CIDR format. (More details) In a basic network, if a CidrBlock contains private IP addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* The `Ipv6CidrBlock` field allows you to enter any string that conforms to the IPv6 CIDR format. (More details) In a basic network, if an Ipv6CidrBlock contains private IPv6 addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* The SecurityGroupId field allows you to enter the IDs of security groups that are in the same project as the security group to be modified, including the ID of the security group itself, to represent private IP addresses of all CVMs under the security group. If this field is used, the policy will change without manual modification according to the CVM associated with the policy ID while being used to match network messages.
* The Port field allows you to enter a single port number, or two port numbers separated by a minus sign to represent a port range, such as 80 or 8000-8010. The Port field is accepted only if the value of the Protocol field is TCP or UDP. In other words, if the value of the Protocol field is not TCP or UDP, Protocol and Port are exclusive and cannot be entered at the same time, otherwise an error will occur with the API.
* The Action field only allows you to enter ACCEPT or DROP.
* CidrBlock, Ipv6CidrBlock, SecurityGroupId, and AddressTemplate are exclusive and cannot be entered at the same time. Protocol + Port and ServiceTemplate are mutually exclusive and cannot be entered at the same time.
* Only policies in one direction can be created in each request. If you need to specify the PolicyIndex parameter, the indexes of policies must be consistent.
     * @param req CreateSecurityGroupPoliciesRequest
     * @return CreateSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupPoliciesResponse CreateSecurityGroupPolicies(CreateSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSecurityGroupPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateServiceTemplate）用于创建协议端口模板
     * @param req CreateServiceTemplateRequest
     * @return CreateServiceTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceTemplateResponse CreateServiceTemplate(CreateServiceTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateServiceTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateServiceTemplateGroup）用于创建协议端口模板集合
     * @param req CreateServiceTemplateGroupRequest
     * @return CreateServiceTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceTemplateGroupResponse CreateServiceTemplateGroup(CreateServiceTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceTemplateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceTemplateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateServiceTemplateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateSubnet) is used to create subnets.
* You must create a VPC before creating a subnet.
* After the subnet is successfully created, its IP address range cannot be modified. The subnet IP address range must fall within the VPC IP address range. They can be the same if the VPC has only one subnet. We recommend that you keep the subnet IP address range within the VPC IP address range to reserve IP address ranges for other subnets.
* The subnet mask of the smallest IP address range that can be created is 28 (16 IP addresses), and that of the largest IP address range is 16 (65,536 IP addresses).
* IP address ranges of different subnets cannot overlap with each other within the same VPC.
* A subnet is automatically associated with the default route table once created.
     * @param req CreateSubnetRequest
     * @return CreateSubnetResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubnetResponse CreateSubnet(CreateSubnetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubnetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubnetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSubnet"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateSubnets) is used to create subnets in batches.
* You must create a VPC before creating a subnet.
* After the subnet is successfully created, its IP address range cannot be modified. The subnet IP address range must fall within the VPC IP address range. They can be the same if the VPC has only one subnet. We recommend that you keep the subnet IP address range within the VPC IP address range to reserve IP address ranges for other subnets.
* The subnet mask of the smallest IP address range that can be created is 28 (16 IP addresses), and that of the largest IP address range is 16 (65,536 IP addresses).
* IP address ranges of different subnets cannot overlap with each other within the same VPC.
* A subnet is automatically associated with the default route table once created.
     * @param req CreateSubnetsRequest
     * @return CreateSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubnetsResponse CreateSubnets(CreateSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubnetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubnetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSubnets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateVpc)用于创建私有网络(VPC)。
* 用户可以创建的最小网段子网掩码为28（有16个IP地址），最大网段子网掩码为16（65,536个IP地址）,如果规划VPC网段请参见VPC网段规划说明。
* 同一个地域能创建的VPC资源个数也是有限制的，详见 <a href="https://cloud.tencent.com/doc/product/215/537" title="VPC使用限制">VPC使用限制</a>,如果需要扩充请联系在线客服。
     * @param req CreateVpcRequest
     * @return CreateVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcResponse CreateVpc(CreateVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpcResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateVpnConnection）用于创建VPN通道。
     * @param req CreateVpnConnectionRequest
     * @return CreateVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnConnectionResponse CreateVpnConnection(CreateVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpnConnectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpnConnectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateVpnConnection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateVpnGateway）用于创建VPN网关。
     * @param req CreateVpnGatewayRequest
     * @return CreateVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnGatewayResponse CreateVpnGateway(CreateVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpnGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVpnGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateVpnGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAddressTemplate）用于删除IP地址模板
     * @param req DeleteAddressTemplateRequest
     * @return DeleteAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateResponse DeleteAddressTemplate(DeleteAddressTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAddressTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAddressTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAddressTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteAddressTemplateGroup）用于删除IP地址模板集合
     * @param req DeleteAddressTemplateGroupRequest
     * @return DeleteAddressTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateGroupResponse DeleteAddressTemplateGroup(DeleteAddressTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAddressTemplateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAddressTemplateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAddressTemplateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteCcn）用于删除云联网。
* 删除后，云联网关联的所有实例间路由将被删除，网络将会中断，请务必确认
* 删除云联网是不可逆的操作，请谨慎处理。

     * @param req DeleteCcnRequest
     * @return DeleteCcnResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCcnResponse DeleteCcn(DeleteCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCcnResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCcnResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCcn"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteDirectConnectGatewayCcnRoutes）用于删除专线网关的云联网路由（IDC网段）
     * @param req DeleteDirectConnectGatewayCcnRoutesRequest
     * @return DeleteDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectGatewayCcnRoutesResponse DeleteDirectConnectGatewayCcnRoutes(DeleteDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDirectConnectGatewayCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDirectConnectGatewayCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteHaVip）用于删除高可用虚拟IP（HAVIP）<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口
     * @param req DeleteHaVipRequest
     * @return DeleteHaVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHaVipResponse DeleteHaVip(DeleteHaVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteHaVipResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteHaVipResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteHaVip"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteNatGateway）用于删除NAT网关。
删除 NAT 网关后，系统会自动删除路由表中包含此 NAT 网关的路由项，同时也会解绑弹性公网IP（EIP）。
     * @param req DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewayResponse DeleteNatGateway(DeleteNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNatGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNatGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNatGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteNatGatewayDestinationIpPortTranslationNatRule）用于删除NAT网关端口转发规则。
     * @param req DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse DeleteNatGatewayDestinationIpPortTranslationNatRule(DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNatGatewayDestinationIpPortTranslationNatRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteNetDetect) is used to delete a network detection instance.
     * @param req DeleteNetDetectRequest
     * @return DeleteNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetDetectResponse DeleteNetDetect(DeleteNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetDetectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetDetectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNetDetect"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteNetworkInterface) is used to delete ENIs.
* An ENI that has been bound to a CVM cannot be deleted.
* An ENI can be deleted only after being unbound from the server. After the deletion, all private IP addresses associated with the ENI will be released.
     * @param req DeleteNetworkInterfaceRequest
     * @return DeleteNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkInterfaceResponse DeleteNetworkInterface(DeleteNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetworkInterfaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNetworkInterfaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNetworkInterface"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除路由表
     * @param req DeleteRouteTableRequest
     * @return DeleteRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteTableResponse DeleteRouteTable(DeleteRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRouteTableResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRouteTableResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRouteTable"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteRoutes)用于对某个路由表批量删除路由策略（Route）。
     * @param req DeleteRoutesRequest
     * @return DeleteRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoutesResponse DeleteRoutes(DeleteRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteSecurityGroup）用于删除安全组（SecurityGroup）。
* 只有当前账号下的安全组允许被删除。
* 安全组实例ID如果在其他安全组的规则中被引用，则无法直接删除。这种情况下，需要先进行规则修改，再删除安全组。
* 删除的安全组无法再找回，请谨慎调用。
     * @param req DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupResponse DeleteSecurityGroup(DeleteSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSecurityGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteSecurityGroupPolicies）用于用于删除安全组规则（SecurityGroupPolicy）。
* SecurityGroupPolicySet.Version 用于指定要操作的安全组的版本。传入 Version 版本号若不等于当前安全组的最新版本，将返回失败；若不传 Version 则直接删除指定PolicyIndex的规则。
     * @param req DeleteSecurityGroupPoliciesRequest
     * @return DeleteSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupPoliciesResponse DeleteSecurityGroupPolicies(DeleteSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSecurityGroupPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteServiceTemplate）用于删除协议端口模板
     * @param req DeleteServiceTemplateRequest
     * @return DeleteServiceTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceTemplateResponse DeleteServiceTemplate(DeleteServiceTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteServiceTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteServiceTemplateGroup）用于删除协议端口模板集合
     * @param req DeleteServiceTemplateGroupRequest
     * @return DeleteServiceTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceTemplateGroupResponse DeleteServiceTemplateGroup(DeleteServiceTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceTemplateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceTemplateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteServiceTemplateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteSubnet) is used to delete subnets.
Before deleting a subnet, you need to remove all resources in the subnet, including CVMs, load balancers, cloud data, NoSQL databases, and ENIs.
     * @param req DeleteSubnetRequest
     * @return DeleteSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubnetResponse DeleteSubnet(DeleteSubnetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSubnetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSubnetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSubnet"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteVpc) is used to delete VPCs.
* Before deleting a VPC, ensure that the VPC contains no resources, including CVMs, cloud databases, NoSQL databases, VPN gateways, direct connect gateways, load balancers, peering connections, and basic network devices that are linked to the VPC.
* The deletion of VPCs is irreversible. Proceed with caution.
     * @param req DeleteVpcRequest
     * @return DeleteVpcResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcResponse DeleteVpc(DeleteVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpcResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteVpnConnection)用于删除VPN通道。
     * @param req DeleteVpnConnectionRequest
     * @return DeleteVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnConnectionResponse DeleteVpnConnection(DeleteVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpnConnectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpnConnectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteVpnConnection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteVpnGateway）用于删除VPN网关。目前只支持删除运行中的按量计费的IPSEC网关实例。
     * @param req DeleteVpnGatewayRequest
     * @return DeleteVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnGatewayResponse DeleteVpnGateway(DeleteVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpnGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpnGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteVpnGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAccountAttributes）用于查询用户账号私有属性。
     * @param req DescribeAccountAttributesRequest
     * @return DescribeAccountAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountAttributesResponse DescribeAccountAttributes(DescribeAccountAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccountAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeAddressQuota) 用于查询您账户的[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）在当前地域的配额信息。配额详情可参见 [EIP 产品简介](https://cloud.tencent.com/document/product/213/5733)。
     * @param req DescribeAddressQuotaRequest
     * @return DescribeAddressQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressQuotaResponse DescribeAddressQuota(DescribeAddressQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressQuotaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressQuotaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAddressQuota"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAddressTemplateGroups）用于查询IP地址模板集合
     * @param req DescribeAddressTemplateGroupsRequest
     * @return DescribeAddressTemplateGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplateGroupsResponse DescribeAddressTemplateGroups(DescribeAddressTemplateGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressTemplateGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressTemplateGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAddressTemplateGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeAddressTemplates）用于查询IP地址模板
     * @param req DescribeAddressTemplatesRequest
     * @return DescribeAddressTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplatesResponse DescribeAddressTemplates(DescribeAddressTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAddressTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeAddresses) 用于查询一个或多个[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）的详细信息。
* 如果参数为空，返回当前用户一定数量（Limit所指定的数量，默认为20）的 EIP。
     * @param req DescribeAddressesRequest
     * @return DescribeAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressesResponse DescribeAddresses(DescribeAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCcnAttachedInstances）用于查询云联网实例下已关联的网络实例。
     * @param req DescribeCcnAttachedInstancesRequest
     * @return DescribeCcnAttachedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnAttachedInstancesResponse DescribeCcnAttachedInstances(DescribeCcnAttachedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnAttachedInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnAttachedInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCcnAttachedInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCcnRoutes）用于查询已加入云联网（CCN）的路由
     * @param req DescribeCcnRoutesRequest
     * @return DescribeCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnRoutesResponse DescribeCcnRoutes(DescribeCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCcns）用于查询云联网（CCN）列表。
     * @param req DescribeCcnsRequest
     * @return DescribeCcnsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnsResponse DescribeCcns(DescribeCcnsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCcnsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCcns"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeClassicLinkInstances)用于查询私有网络和基础网络设备互通列表。
     * @param req DescribeClassicLinkInstancesRequest
     * @return DescribeClassicLinkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicLinkInstancesResponse DescribeClassicLinkInstances(DescribeClassicLinkInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassicLinkInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClassicLinkInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClassicLinkInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDirectConnectGatewayCcnRoutes）用于查询专线网关的云联网路由（IDC网段）
     * @param req DescribeDirectConnectGatewayCcnRoutesRequest
     * @return DescribeDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectGatewayCcnRoutesResponse DescribeDirectConnectGatewayCcnRoutes(DescribeDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDirectConnectGatewayCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDirectConnectGatewayCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeGatewayFlowMonitorDetail）用于查询网关流量监控明细。
* 只支持单个网关实例查询。即入参 `VpnId` `DirectConnectGatewayId` `PeeringConnectionId` `NatId` 最多只支持传一个，且必须传一个。
* 如果网关有流量，但调用本接口没有返回数据，请在控制台对应网关详情页确认是否开启网关流量监控。
     * @param req DescribeGatewayFlowMonitorDetailRequest
     * @return DescribeGatewayFlowMonitorDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayFlowMonitorDetailResponse DescribeGatewayFlowMonitorDetail(DescribeGatewayFlowMonitorDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayFlowMonitorDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayFlowMonitorDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeGatewayFlowMonitorDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeHaVips）用于查询高可用虚拟IP（HAVIP）列表。
     * @param req DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHaVipsResponse DescribeHaVips(DescribeHaVipsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHaVipsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHaVipsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHaVips"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNatGatewayDestinationIpPortTranslationNatRules）用于查询NAT网关端口转发规则对象数组。
     * @param req DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest
     * @return DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse DescribeNatGatewayDestinationIpPortTranslationNatRules(DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNatGatewayDestinationIpPortTranslationNatRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeNatGateways）用于查询 NAT 网关。
     * @param req DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewaysResponse DescribeNatGateways(DescribeNatGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatGatewaysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatGatewaysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNatGateways"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeNetDetectStates) is used to query the list of network detection verification results.
     * @param req DescribeNetDetectStatesRequest
     * @return DescribeNetDetectStatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDetectStatesResponse DescribeNetDetectStates(DescribeNetDetectStatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetDetectStatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetDetectStatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNetDetectStates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeNetDetects) is used to query the list of network detection instances.
     * @param req DescribeNetDetectsRequest
     * @return DescribeNetDetectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDetectsResponse DescribeNetDetects(DescribeNetDetectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetDetectsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetDetectsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNetDetects"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeNetworkInterfaceLimit) is used to query the ENI quota based on the CVM instance ID. It returns the ENI quota to which the CVM instance can be bound and the IP address quota that can be allocated to each ENI.
     * @param req DescribeNetworkInterfaceLimitRequest
     * @return DescribeNetworkInterfaceLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfaceLimitResponse DescribeNetworkInterfaceLimit(DescribeNetworkInterfaceLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkInterfaceLimitResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNetworkInterfaceLimitResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNetworkInterfaceLimit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSecurityGroupAssociationStatistics）用于查询安全组关联的实例统计。
     * @param req DescribeSecurityGroupAssociationStatisticsRequest
     * @return DescribeSecurityGroupAssociationStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupAssociationStatisticsResponse DescribeSecurityGroupAssociationStatistics(DescribeSecurityGroupAssociationStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupAssociationStatisticsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupAssociationStatisticsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityGroupAssociationStatistics"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSecurityGroupPolicies）用于查询安全组规则。
     * @param req DescribeSecurityGroupPoliciesRequest
     * @return DescribeSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupPoliciesResponse DescribeSecurityGroupPolicies(DescribeSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityGroupPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSecurityGroups）用于查询安全组。
     * @param req DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupsResponse DescribeSecurityGroups(DescribeSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecurityGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceTemplateGroups）用于查询协议端口模板集合
     * @param req DescribeServiceTemplateGroupsRequest
     * @return DescribeServiceTemplateGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceTemplateGroupsResponse DescribeServiceTemplateGroups(DescribeServiceTemplateGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceTemplateGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceTemplateGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceTemplateGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeServiceTemplates）用于查询协议端口模板
     * @param req DescribeServiceTemplatesRequest
     * @return DescribeServiceTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceTemplatesResponse DescribeServiceTemplates(DescribeServiceTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSubnets）用于查询子网列表。
     * @param req DescribeSubnetsRequest
     * @return DescribeSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetsResponse DescribeSubnets(DescribeSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubnetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubnetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSubnets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询EIP异步任务执行结果
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpcIpv6Addresses）用于查询 `VPC` `IPv6` 信息。
只能查询已使用的`IPv6`信息，当查询未使用的IP时，本接口不会报错，但不会出现在返回结果里。
     * @param req DescribeVpcIpv6AddressesRequest
     * @return DescribeVpcIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcIpv6AddressesResponse DescribeVpcIpv6Addresses(DescribeVpcIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcIpv6AddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcIpv6AddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpcIpv6Addresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpcPrivateIpAddresses）用于查询VPC内网IP信息。<br />
只能查询已使用的IP信息，当查询未使用的IP时，本接口不会报错，但不会出现在返回结果里。
     * @param req DescribeVpcPrivateIpAddressesRequest
     * @return DescribeVpcPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcPrivateIpAddressesResponse DescribeVpcPrivateIpAddresses(DescribeVpcPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcPrivateIpAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcPrivateIpAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpcPrivateIpAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpcs）用于查询私有网络列表。
     * @param req DescribeVpcsRequest
     * @return DescribeVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcsResponse DescribeVpcs(DescribeVpcsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpcs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 本接口（DescribeVpnConnections）查询VPN通道列表。
     * @param req DescribeVpnConnectionsRequest
     * @return DescribeVpnConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnConnectionsResponse DescribeVpnConnections(DescribeVpnConnectionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnConnectionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnConnectionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpnConnections"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeVpnGateways）用于查询VPN网关列表。
     * @param req DescribeVpnGatewaysRequest
     * @return DescribeVpnGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewaysResponse DescribeVpnGateways(DescribeVpnGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnGatewaysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpnGatewaysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVpnGateways"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachCcnInstances）用于从云联网实例中解关联指定的网络实例。<br />
解关联网络实例后，相应的路由策略会一并删除。
     * @param req DetachCcnInstancesRequest
     * @return DetachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnInstancesResponse DetachCcnInstances(DetachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DetachClassicLinkVpc)用于删除私有网络和基础网络设备互通。
     * @param req DetachClassicLinkVpcRequest
     * @return DetachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public DetachClassicLinkVpcResponse DetachClassicLinkVpc(DetachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachClassicLinkVpcResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachClassicLinkVpcResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachClassicLinkVpc"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DetachNetworkInterface）用于弹性网卡解绑云主机。
     * @param req DetachNetworkInterfaceRequest
     * @return DetachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DetachNetworkInterfaceResponse DetachNetworkInterface(DetachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachNetworkInterfaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachNetworkInterfaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachNetworkInterface"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisableCcnRoutes）用于禁用已经启用的云联网（CCN）路由
     * @param req DisableCcnRoutesRequest
     * @return DisableCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DisableCcnRoutesResponse DisableCcnRoutes(DisableCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DisassociateAddress) 用于解绑[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）。
* 支持CVM实例，弹性网卡上的EIP解绑
* 不支持NAT上的EIP解绑。NAT上的EIP解绑请参考[EipUnBindNatGateway](https://cloud.tencent.com/document/product/215/4092)
* 只有状态为 BIND 和 BIND_ENI 的 EIP 才能进行解绑定操作。
* EIP 如果被封堵，则不能进行解绑定操作。
     * @param req DisassociateAddressRequest
     * @return DisassociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAddressResponse DisassociateAddress(DisassociateAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DisassociateNatGatewayAddress）用于NAT网关解绑弹性IP。
     * @param req DisassociateNatGatewayAddressRequest
     * @return DisassociateNatGatewayAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNatGatewayAddressResponse DisassociateNatGatewayAddress(DisassociateNatGatewayAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateNatGatewayAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateNatGatewayAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisassociateNatGatewayAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DownloadCustomerGatewayConfiguration)用于下载VPN通道配置。
     * @param req DownloadCustomerGatewayConfigurationRequest
     * @return DownloadCustomerGatewayConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DownloadCustomerGatewayConfigurationResponse DownloadCustomerGatewayConfiguration(DownloadCustomerGatewayConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadCustomerGatewayConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadCustomerGatewayConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadCustomerGatewayConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（EnableCcnRoutes）用于启用已经加入云联网（CCN）的路由。<br />
本接口会校验启用后，是否与已有路由冲突，如果冲突，则无法启用，失败处理。路由冲突时，需要先禁用与之冲突的路由，才能启用该路由。
     * @param req EnableCcnRoutesRequest
     * @return EnableCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public EnableCcnRoutesResponse EnableCcnRoutes(EnableCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（HaVipAssociateAddressIp）用于高可用虚拟IP（HAVIP）绑定弹性公网IP（EIP）<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口
     * @param req HaVipAssociateAddressIpRequest
     * @return HaVipAssociateAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public HaVipAssociateAddressIpResponse HaVipAssociateAddressIp(HaVipAssociateAddressIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HaVipAssociateAddressIpResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<HaVipAssociateAddressIpResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "HaVipAssociateAddressIp"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（HaVipDisassociateAddressIp）用于将高可用虚拟IP（HAVIP）已绑定的弹性公网IP（EIP）解除绑定<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口
     * @param req HaVipDisassociateAddressIpRequest
     * @return HaVipDisassociateAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public HaVipDisassociateAddressIpResponse HaVipDisassociateAddressIp(HaVipDisassociateAddressIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HaVipDisassociateAddressIpResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<HaVipDisassociateAddressIpResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "HaVipDisassociateAddressIp"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（InquiryPriceCreateVpnGateway）用于创建VPN网关询价。
     * @param req InquiryPriceCreateVpnGatewayRequest
     * @return InquiryPriceCreateVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceCreateVpnGatewayResponse InquiryPriceCreateVpnGateway(InquiryPriceCreateVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceCreateVpnGatewayResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InquiryPriceCreateVpnGatewayResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InquiryPriceCreateVpnGateway"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（MigrateNetworkInterface）用于弹性网卡迁移。
     * @param req MigrateNetworkInterfaceRequest
     * @return MigrateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public MigrateNetworkInterfaceResponse MigrateNetworkInterface(MigrateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MigrateNetworkInterfaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MigrateNetworkInterfaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MigrateNetworkInterface"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 本接口（MigratePrivateIpAddress）用于弹性网卡内网IP迁移。

* 该接口用于将一个内网IP从一个弹性网卡上迁移到另外一个弹性网卡，主IP地址不支持迁移。
* 迁移前后的弹性网卡必须在同一个子网内。
     * @param req MigratePrivateIpAddressRequest
     * @return MigratePrivateIpAddressResponse
     * @throws TencentCloudSDKException
     */
    public MigratePrivateIpAddressResponse MigratePrivateIpAddress(MigratePrivateIpAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MigratePrivateIpAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MigratePrivateIpAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MigratePrivateIpAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyAddressAttribute) 用于修改[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）的名称。
     * @param req ModifyAddressAttributeRequest
     * @return ModifyAddressAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressAttributeResponse ModifyAddressAttribute(ModifyAddressAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAddressAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAddressTemplateAttribute）用于修改IP地址模板
     * @param req ModifyAddressTemplateAttributeRequest
     * @return ModifyAddressTemplateAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateAttributeResponse ModifyAddressTemplateAttribute(ModifyAddressTemplateAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressTemplateAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressTemplateAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAddressTemplateAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAddressTemplateGroupAttribute）用于修改IP地址模板集合
     * @param req ModifyAddressTemplateGroupAttributeRequest
     * @return ModifyAddressTemplateGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateGroupAttributeResponse ModifyAddressTemplateGroupAttribute(ModifyAddressTemplateGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressTemplateGroupAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressTemplateGroupAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAddressTemplateGroupAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyAddressesBandwidth）用于调整[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)(简称EIP)带宽，包括后付费EIP, 预付费EIP和带宽包EIP
     * @param req ModifyAddressesBandwidthRequest
     * @return ModifyAddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressesBandwidthResponse ModifyAddressesBandwidth(ModifyAddressesBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressesBandwidthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAddressesBandwidthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAddressesBandwidth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyCcnAttribute）用于修改云联网（CCN）的相关属性。
     * @param req ModifyCcnAttributeRequest
     * @return ModifyCcnAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnAttributeResponse ModifyCcnAttribute(ModifyCcnAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCcnAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCcnAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCcnAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyHaVipAttribute）用于修改高可用虚拟IP（HAVIP）属性
     * @param req ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHaVipAttributeResponse ModifyHaVipAttribute(ModifyHaVipAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHaVipAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHaVipAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyHaVipAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyIpv6AddressesAttribute）用于修改弹性网卡内网IPv6地址属性。
     * @param req ModifyIpv6AddressesAttributeRequest
     * @return ModifyIpv6AddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpv6AddressesAttributeResponse ModifyIpv6AddressesAttribute(ModifyIpv6AddressesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIpv6AddressesAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIpv6AddressesAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyIpv6AddressesAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyNatGatewayAttribute）用于修改NAT网关的属性。
     * @param req ModifyNatGatewayAttributeRequest
     * @return ModifyNatGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewayAttributeResponse ModifyNatGatewayAttribute(ModifyNatGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatGatewayAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatGatewayAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNatGatewayAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyNatGatewayDestinationIpPortTranslationNatRule）用于修改NAT网关端口转发规则。
     * @param req ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse ModifyNatGatewayDestinationIpPortTranslationNatRule(ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNatGatewayDestinationIpPortTranslationNatRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyNetDetect) is used to modify network detection parameters.
     * @param req ModifyNetDetectRequest
     * @return ModifyNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetDetectResponse ModifyNetDetect(ModifyNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetDetectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetDetectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNetDetect"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyNetworkInterfaceAttribute）用于修改弹性网卡属性。
     * @param req ModifyNetworkInterfaceAttributeRequest
     * @return ModifyNetworkInterfaceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkInterfaceAttributeResponse ModifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkInterfaceAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetworkInterfaceAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNetworkInterfaceAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyPrivateIpAddressesAttribute）用于修改弹性网卡内网IP属性。
     * @param req ModifyPrivateIpAddressesAttributeRequest
     * @return ModifyPrivateIpAddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateIpAddressesAttributeResponse ModifyPrivateIpAddressesAttribute(ModifyPrivateIpAddressesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrivateIpAddressesAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrivateIpAddressesAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPrivateIpAddressesAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyRouteTableAttribute）用于修改路由表（RouteTable）属性。
     * @param req ModifyRouteTableAttributeRequest
     * @return ModifyRouteTableAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRouteTableAttributeResponse ModifyRouteTableAttribute(ModifyRouteTableAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRouteTableAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRouteTableAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyRouteTableAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifySecurityGroupAttribute）用于修改安全组（SecurityGroupPolicy）属性。
     * @param req ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupAttributeResponse ModifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySecurityGroupAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifySecurityGroupPolicies) is used to reset the egress and ingress policies (SecurityGroupPolicy) of a security group.

* This API deletes all the current egress and ingress policies, and then adds new Egress and Ingress policies. It does not support custom PolicyIndex indexes.
* If SecurityGroupPolicySet.Version is set to 0, all policies will be cleared, and Egress and Ingress will be ignored.
* The value of the Protocol field can be TCP, UDP, ICMP, ICMPV6, GRE, or ALL.
* The CidrBlock field allows you to enter any string that conforms to the CIDR format. (More details) In a basic network, if a CidrBlock contains private IP addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* The Ipv6CidrBlock field allows you to enter any string that conforms to the IPv6 CIDR format. (More details) In a basic network, if an Ipv6CidrBlock contains private IPv6 addresses on Tencent Cloud for devices under your account other than CVMs, it does not mean this policy allows you to access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.
* The SecurityGroupId field allows you to enter the IDs of security groups that are in the same project as the security group to be modified, including the ID of the security group itself, to represent private IP addresses of all CVMs under the security group. If this field is used, this policy will change without manual modification according to the CVM associated with the policy ID while being used to match network messages.
* The Port field allows you to enter a single port number, or two port numbers separated by a minus sign to represent a port range, such as 80 or 8000-8010. The Port field can be used only when the value of the Protocol field is TCP or UDP.
* The Action field only allows you to enter ACCEPT or DROP.
* CidrBlock, Ipv6CidrBlock, SecurityGroupId, and AddressTemplate are exclusive and cannot be entered at the same time. Protocol + Port and ServiceTemplate are mutually exclusive and cannot be entered at the same time.
     * @param req ModifySecurityGroupPoliciesRequest
     * @return ModifySecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupPoliciesResponse ModifySecurityGroupPolicies(ModifySecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySecurityGroupPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyServiceTemplateAttribute）用于修改协议端口模板
     * @param req ModifyServiceTemplateAttributeRequest
     * @return ModifyServiceTemplateAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceTemplateAttributeResponse ModifyServiceTemplateAttribute(ModifyServiceTemplateAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceTemplateAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceTemplateAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyServiceTemplateAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyServiceTemplateGroupAttribute）用于修改协议端口模板集合。
     * @param req ModifyServiceTemplateGroupAttributeRequest
     * @return ModifyServiceTemplateGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceTemplateGroupAttributeResponse ModifyServiceTemplateGroupAttribute(ModifyServiceTemplateGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceTemplateGroupAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceTemplateGroupAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyServiceTemplateGroupAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifySubnetAttribute）用于修改子网属性。
     * @param req ModifySubnetAttributeRequest
     * @return ModifySubnetAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubnetAttributeResponse ModifySubnetAttribute(ModifySubnetAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubnetAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubnetAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySubnetAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyVpcAttribute）用于修改私有网络（VPC）的相关属性。
     * @param req ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcAttributeResponse ModifyVpcAttribute(ModifyVpcAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpcAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpcAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyVpcAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyVpnConnectionAttribute）用于修改VPN通道。
     * @param req ModifyVpnConnectionAttributeRequest
     * @return ModifyVpnConnectionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnConnectionAttributeResponse ModifyVpnConnectionAttribute(ModifyVpnConnectionAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnConnectionAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnConnectionAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyVpnConnectionAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ModifyVpnGatewayAttribute）用于修改VPN网关属性。
     * @param req ModifyVpnGatewayAttributeRequest
     * @return ModifyVpnGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayAttributeResponse ModifyVpnGatewayAttribute(ModifyVpnGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnGatewayAttributeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVpnGatewayAttributeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyVpnGatewayAttribute"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RejectAttachCcnInstances）用于跨账号关联实例时，云联网所有者拒绝关联操作。

     * @param req RejectAttachCcnInstancesRequest
     * @return RejectAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RejectAttachCcnInstancesResponse RejectAttachCcnInstances(RejectAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RejectAttachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RejectAttachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RejectAttachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ReleaseAddresses) 用于释放一个或多个[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）。
* 该操作不可逆，释放后 EIP 关联的 IP 地址将不再属于您的名下。
* 只有状态为 UNBIND 的 EIP 才能进行释放操作。
     * @param req ReleaseAddressesRequest
     * @return ReleaseAddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseAddressesResponse ReleaseAddresses(ReleaseAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReleaseAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReplaceDirectConnectGatewayCcnRoutes）根据路由ID（RouteId）修改指定的路由（Route），支持批量修改。
     * @param req ReplaceDirectConnectGatewayCcnRoutesRequest
     * @return ReplaceDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceDirectConnectGatewayCcnRoutesResponse ReplaceDirectConnectGatewayCcnRoutes(ReplaceDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceDirectConnectGatewayCcnRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceDirectConnectGatewayCcnRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceDirectConnectGatewayCcnRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReplaceRouteTableAssociation)用于修改子网（Subnet）关联的路由表（RouteTable）。
* 一个子网只能关联一个路由表。
     * @param req ReplaceRouteTableAssociationRequest
     * @return ReplaceRouteTableAssociationResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRouteTableAssociationResponse ReplaceRouteTableAssociation(ReplaceRouteTableAssociationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceRouteTableAssociationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceRouteTableAssociationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceRouteTableAssociation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReplaceRoutes）根据路由策略ID（RouteId）修改指定的路由策略（Route），支持批量修改。
     * @param req ReplaceRoutesRequest
     * @return ReplaceRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRoutesResponse ReplaceRoutes(ReplaceRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReplaceSecurityGroupPolicy）用于替换单条安全组规则（SecurityGroupPolicy）。
单个请求中只能替换单个方向的一条规则, 必须要指定索引（PolicyIndex）。
     * @param req ReplaceSecurityGroupPolicyRequest
     * @return ReplaceSecurityGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceSecurityGroupPolicyResponse ReplaceSecurityGroupPolicy(ReplaceSecurityGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceSecurityGroupPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceSecurityGroupPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceSecurityGroupPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetAttachCcnInstances）用于跨账号关联实例申请过期时，重新申请关联操作。
     * @param req ResetAttachCcnInstancesRequest
     * @return ResetAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ResetAttachCcnInstancesResponse ResetAttachCcnInstances(ResetAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetAttachCcnInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetAttachCcnInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetAttachCcnInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetNatGatewayConnection）用来NAT网关并发连接上限。
     * @param req ResetNatGatewayConnectionRequest
     * @return ResetNatGatewayConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ResetNatGatewayConnectionResponse ResetNatGatewayConnection(ResetNatGatewayConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetNatGatewayConnectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetNatGatewayConnectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetNatGatewayConnection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetRoutes）用于对某个路由表名称和所有路由策略（Route）进行重新设置。<br />
注意: 调用本接口是先删除当前路由表中所有路由策略, 再保存新提交的路由策略内容, 会引起网络中断。
     * @param req ResetRoutesRequest
     * @return ResetRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ResetRoutesResponse ResetRoutes(ResetRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetRoutesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetRoutesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetRoutes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ResetVpnConnection)用于重置VPN通道。
     * @param req ResetVpnConnectionRequest
     * @return ResetVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ResetVpnConnectionResponse ResetVpnConnection(ResetVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetVpnConnectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetVpnConnectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetVpnConnection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ResetVpnGatewayInternetMaxBandwidth）调整VPN网关带宽上限。目前支持升级配置，如果是包年包月VPN网关需要在有效期内。
     * @param req ResetVpnGatewayInternetMaxBandwidthRequest
     * @return ResetVpnGatewayInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ResetVpnGatewayInternetMaxBandwidthResponse ResetVpnGatewayInternetMaxBandwidth(ResetVpnGatewayInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetVpnGatewayInternetMaxBandwidthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetVpnGatewayInternetMaxBandwidthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetVpnGatewayInternetMaxBandwidth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（SetCcnRegionBandwidthLimits）用于设置云联网（CCN）各地域出带宽上限，该接口只能设置已关联网络实例包含的地域的出带宽上限
     * @param req SetCcnRegionBandwidthLimitsRequest
     * @return SetCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public SetCcnRegionBandwidthLimitsResponse SetCcnRegionBandwidthLimits(SetCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetCcnRegionBandwidthLimitsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetCcnRegionBandwidthLimitsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetCcnRegionBandwidthLimits"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (TransformAddress) 用于将实例的普通公网 IP 转换为[弹性公网IP](https://cloud.tencent.com/document/product/213/1941)（简称 EIP）。
* 平台对用户每地域每日解绑 EIP 重新分配普通公网 IP 次数有所限制（可参见 [EIP 产品简介](/document/product/213/1941)）。上述配额可通过 [DescribeAddressQuota](https://cloud.tencent.com/document/api/213/1378) 接口获取。
     * @param req TransformAddressRequest
     * @return TransformAddressResponse
     * @throws TencentCloudSDKException
     */
    public TransformAddressResponse TransformAddress(TransformAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransformAddressResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TransformAddressResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TransformAddress"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnassignIpv6Addresses）用于释放弹性网卡`IPv6`地址。<br />
本接口是异步完成，如需查询异步任务执行结果，请使用本接口返回的`RequestId`轮询`QueryTask`接口。
     * @param req UnassignIpv6AddressesRequest
     * @return UnassignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6AddressesResponse UnassignIpv6Addresses(UnassignIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6AddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6AddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnassignIpv6Addresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnassignIpv6CidrBlock）用于释放IPv6网段。<br />
网段如果还有IP占用且未回收，则网段无法释放。
     * @param req UnassignIpv6CidrBlockRequest
     * @return UnassignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6CidrBlockResponse UnassignIpv6CidrBlock(UnassignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6CidrBlockResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6CidrBlockResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnassignIpv6CidrBlock"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnassignIpv6SubnetCidrBlock）用于释放IPv6子网段。<br />
子网段如果还有IP占用且未回收，则子网段无法释放。
     * @param req UnassignIpv6SubnetCidrBlockRequest
     * @return UnassignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6SubnetCidrBlockResponse UnassignIpv6SubnetCidrBlock(UnassignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6SubnetCidrBlockResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignIpv6SubnetCidrBlockResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnassignIpv6SubnetCidrBlock"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UnassignPrivateIpAddresses）用于弹性网卡退还内网 IP。
* 退还弹性网卡上的辅助内网IP，接口自动解关联弹性公网 IP。不能退还弹性网卡的主内网IP。
     * @param req UnassignPrivateIpAddressesRequest
     * @return UnassignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public UnassignPrivateIpAddressesResponse UnassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignPrivateIpAddressesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UnassignPrivateIpAddressesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UnassignPrivateIpAddresses"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
