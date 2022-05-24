package com.computinglaboratory.resourcewatcher.watchers.interfaces;

import com.computinglaboratory.resourcewatcher.exceptions.NotImplementedException;

public interface ResourceWatcher {
    public abstract DiskWatcher getDiskWatcher();

    public abstract NetworkWatcher getNetworkWatcher();

    public abstract NvidiaCudaWatcher getNvidiaCudaWatcher() throws NotImplementedException;

    public abstract ProcessWatcher getProcessWatcher();

    public abstract RamWatcher getRamWatcher();

    public abstract SystemProcessesWatcher getSystemProcessesWatcher();
}
