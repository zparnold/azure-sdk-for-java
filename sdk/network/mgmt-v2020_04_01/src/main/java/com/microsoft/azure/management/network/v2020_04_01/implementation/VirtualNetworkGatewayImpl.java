/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_04_01.VirtualNetworkGateway;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2020_04_01.VirtualNetworkGatewayIPConfiguration;
import com.microsoft.azure.management.network.v2020_04_01.VirtualNetworkGatewayType;
import com.microsoft.azure.management.network.v2020_04_01.VpnType;
import com.microsoft.azure.management.network.v2020_04_01.VpnGatewayGeneration;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_04_01.VirtualNetworkGatewaySku;
import com.microsoft.azure.management.network.v2020_04_01.VpnClientConfiguration;
import com.microsoft.azure.management.network.v2020_04_01.BgpSettings;
import com.microsoft.azure.management.network.v2020_04_01.AddressSpace;
import com.microsoft.azure.management.network.v2020_04_01.ProvisioningState;

class VirtualNetworkGatewayImpl extends GroupableResourceCoreImpl<VirtualNetworkGateway, VirtualNetworkGatewayInner, VirtualNetworkGatewayImpl, NetworkManager> implements VirtualNetworkGateway, VirtualNetworkGateway.Definition, VirtualNetworkGateway.Update {
    VirtualNetworkGatewayImpl(String name, VirtualNetworkGatewayInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<VirtualNetworkGateway> createResourceAsync() {
        VirtualNetworkGatewaysInner client = this.manager().inner().virtualNetworkGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualNetworkGateway> updateResourceAsync() {
        VirtualNetworkGatewaysInner client = this.manager().inner().virtualNetworkGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VirtualNetworkGatewayInner> getInnerAsync() {
        VirtualNetworkGatewaysInner client = this.manager().inner().virtualNetworkGateways();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Boolean activeActive() {
        return this.inner().activeActive();
    }

    @Override
    public BgpSettings bgpSettings() {
        return this.inner().bgpSettings();
    }

    @Override
    public AddressSpace customRoutes() {
        return this.inner().customRoutes();
    }

    @Override
    public Boolean enableBgp() {
        return this.inner().enableBgp();
    }

    @Override
    public Boolean enableDnsForwarding() {
        return this.inner().enableDnsForwarding();
    }

    @Override
    public Boolean enablePrivateIpAddress() {
        return this.inner().enablePrivateIpAddress();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public SubResource gatewayDefaultSite() {
        return this.inner().gatewayDefaultSite();
    }

    @Override
    public VirtualNetworkGatewayType gatewayType() {
        return this.inner().gatewayType();
    }

    @Override
    public String inboundDnsForwardingEndpoint() {
        return this.inner().inboundDnsForwardingEndpoint();
    }

    @Override
    public List<VirtualNetworkGatewayIPConfiguration> ipConfigurations() {
        return this.inner().ipConfigurations();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public VirtualNetworkGatewaySku sku() {
        return this.inner().sku();
    }

    @Override
    public VpnClientConfiguration vpnClientConfiguration() {
        return this.inner().vpnClientConfiguration();
    }

    @Override
    public VpnGatewayGeneration vpnGatewayGeneration() {
        return this.inner().vpnGatewayGeneration();
    }

    @Override
    public VpnType vpnType() {
        return this.inner().vpnType();
    }

    @Override
    public VirtualNetworkGatewayImpl withActiveActive(Boolean activeActive) {
        this.inner().withActiveActive(activeActive);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withBgpSettings(BgpSettings bgpSettings) {
        this.inner().withBgpSettings(bgpSettings);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withCustomRoutes(AddressSpace customRoutes) {
        this.inner().withCustomRoutes(customRoutes);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withEnableBgp(Boolean enableBgp) {
        this.inner().withEnableBgp(enableBgp);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withEnableDnsForwarding(Boolean enableDnsForwarding) {
        this.inner().withEnableDnsForwarding(enableDnsForwarding);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withEnablePrivateIpAddress(Boolean enablePrivateIpAddress) {
        this.inner().withEnablePrivateIpAddress(enablePrivateIpAddress);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withGatewayDefaultSite(SubResource gatewayDefaultSite) {
        this.inner().withGatewayDefaultSite(gatewayDefaultSite);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withGatewayType(VirtualNetworkGatewayType gatewayType) {
        this.inner().withGatewayType(gatewayType);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withIpConfigurations(List<VirtualNetworkGatewayIPConfiguration> ipConfigurations) {
        this.inner().withIpConfigurations(ipConfigurations);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withSku(VirtualNetworkGatewaySku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration) {
        this.inner().withVpnClientConfiguration(vpnClientConfiguration);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withVpnGatewayGeneration(VpnGatewayGeneration vpnGatewayGeneration) {
        this.inner().withVpnGatewayGeneration(vpnGatewayGeneration);
        return this;
    }

    @Override
    public VirtualNetworkGatewayImpl withVpnType(VpnType vpnType) {
        this.inner().withVpnType(vpnType);
        return this;
    }

}
