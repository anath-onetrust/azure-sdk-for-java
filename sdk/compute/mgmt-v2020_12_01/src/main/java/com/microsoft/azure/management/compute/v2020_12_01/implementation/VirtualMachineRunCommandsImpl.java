/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_12_01.VirtualMachineRunCommands;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.compute.v2020_12_01.LocationVirtualMachineRunCommand;
import com.microsoft.azure.Page;
import rx.Completable;

class VirtualMachineRunCommandsImpl extends WrapperImpl<VirtualMachineRunCommandsInner> implements VirtualMachineRunCommands {
    private final ComputeManager manager;

    VirtualMachineRunCommandsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineRunCommands());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public LocationVirtualMachineRunCommandImpl defineRunCommand(String name) {
        return wrapRunCommandModel(name);
    }

    private LocationVirtualMachineRunCommandImpl wrapRunCommandModel(String name) {
        return new LocationVirtualMachineRunCommandImpl(name, this.manager());
    }

    @Override
    public Observable<RunCommandDocumentInner> getAsync(String location, String commandId) {
        VirtualMachineRunCommandsInner client = this.inner();
        return client.getAsync(location, commandId);
    }

    @Override
    public Observable<RunCommandDocumentBaseInner> listAsync(final String location) {
        VirtualMachineRunCommandsInner client = this.inner();
        return client.listAsync(location)
        .flatMapIterable(new Func1<Page<RunCommandDocumentBaseInner>, Iterable<RunCommandDocumentBaseInner>>() {
            @Override
            public Iterable<RunCommandDocumentBaseInner> call(Page<RunCommandDocumentBaseInner> page) {
                return page.items();
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String vmName, String runCommandName) {
        VirtualMachineRunCommandsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, vmName, runCommandName).toCompletable();
    }

    @Override
    public Observable<LocationVirtualMachineRunCommand> getByVirtualMachineAsync(String resourceGroupName, String vmName, String runCommandName) {
        VirtualMachineRunCommandsInner client = this.inner();
        return client.getByVirtualMachineAsync(resourceGroupName, vmName, runCommandName)
        .map(new Func1<VirtualMachineRunCommandInner, LocationVirtualMachineRunCommand>() {
            @Override
            public LocationVirtualMachineRunCommand call(VirtualMachineRunCommandInner inner) {
                return new LocationVirtualMachineRunCommandImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<LocationVirtualMachineRunCommand> listByVirtualMachineAsync(final String resourceGroupName, final String vmName) {
        VirtualMachineRunCommandsInner client = this.inner();
        return client.listByVirtualMachineAsync(resourceGroupName, vmName)
        .flatMapIterable(new Func1<Page<VirtualMachineRunCommandInner>, Iterable<VirtualMachineRunCommandInner>>() {
            @Override
            public Iterable<VirtualMachineRunCommandInner> call(Page<VirtualMachineRunCommandInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualMachineRunCommandInner, LocationVirtualMachineRunCommand>() {
            @Override
            public LocationVirtualMachineRunCommand call(VirtualMachineRunCommandInner inner) {
                return new LocationVirtualMachineRunCommandImpl(inner, manager());
            }
        });
    }

}