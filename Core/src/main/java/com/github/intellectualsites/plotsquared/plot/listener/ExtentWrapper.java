package com.github.intellectualsites.plotsquared.plot.listener;

import com.github.intellectualsites.plotsquared.plot.util.block.BlockUtil;

import com.sk89q.worldedit.extent.AbstractDelegateExtent;
import com.sk89q.worldedit.extent.Extent;

public class ExtentWrapper extends AbstractDelegateExtent {

    protected ExtentWrapper(final Extent extent) {
        super(extent);
    }

}