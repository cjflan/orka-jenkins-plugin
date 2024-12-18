package io.jenkins.plugins.orka;

import java.io.Serializable;

import hudson.Extension;
import hudson.model.Describable;
import hudson.model.Descriptor;
import jenkins.model.Jenkins;

import org.kohsuke.stapler.DataBoundConstructor;

public class PortMapper implements Describable<PortMapper>, Serializable {
    private static final long serialVersionUID = 1L;

    private int from;
    private int to;

    @DataBoundConstructor
    public PortMapper(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return this.from;
    }

    public int getTo() {
        return this.to;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public void setTo(int to) {
        this.to = to;
    }

    @Override
    public Descriptor<PortMapper> getDescriptor() {
        return Jenkins.get().getDescriptor(getClass());
    }

    @Extension
    public static final class DescriptorImpl extends Descriptor<PortMapper> {
    }
} 
