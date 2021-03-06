/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the DescribeDeliveryChannelStatus action.
 * </p>
 */
public class DescribeDeliveryChannelStatusResult implements Serializable {

    /**
     * A list that contains the status of a specified delivery channel.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannelStatus> deliveryChannelsStatus;

    /**
     * A list that contains the status of a specified delivery channel.
     *
     * @return A list that contains the status of a specified delivery channel.
     */
    public java.util.List<DeliveryChannelStatus> getDeliveryChannelsStatus() {
        if (deliveryChannelsStatus == null) {
              deliveryChannelsStatus = new com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannelStatus>();
              deliveryChannelsStatus.setAutoConstruct(true);
        }
        return deliveryChannelsStatus;
    }
    
    /**
     * A list that contains the status of a specified delivery channel.
     *
     * @param deliveryChannelsStatus A list that contains the status of a specified delivery channel.
     */
    public void setDeliveryChannelsStatus(java.util.Collection<DeliveryChannelStatus> deliveryChannelsStatus) {
        if (deliveryChannelsStatus == null) {
            this.deliveryChannelsStatus = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannelStatus> deliveryChannelsStatusCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannelStatus>(deliveryChannelsStatus.size());
        deliveryChannelsStatusCopy.addAll(deliveryChannelsStatus);
        this.deliveryChannelsStatus = deliveryChannelsStatusCopy;
    }
    
    /**
     * A list that contains the status of a specified delivery channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliveryChannelsStatus A list that contains the status of a specified delivery channel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDeliveryChannelStatusResult withDeliveryChannelsStatus(DeliveryChannelStatus... deliveryChannelsStatus) {
        if (getDeliveryChannelsStatus() == null) setDeliveryChannelsStatus(new java.util.ArrayList<DeliveryChannelStatus>(deliveryChannelsStatus.length));
        for (DeliveryChannelStatus value : deliveryChannelsStatus) {
            getDeliveryChannelsStatus().add(value);
        }
        return this;
    }
    
    /**
     * A list that contains the status of a specified delivery channel.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliveryChannelsStatus A list that contains the status of a specified delivery channel.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDeliveryChannelStatusResult withDeliveryChannelsStatus(java.util.Collection<DeliveryChannelStatus> deliveryChannelsStatus) {
        if (deliveryChannelsStatus == null) {
            this.deliveryChannelsStatus = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannelStatus> deliveryChannelsStatusCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DeliveryChannelStatus>(deliveryChannelsStatus.size());
            deliveryChannelsStatusCopy.addAll(deliveryChannelsStatus);
            this.deliveryChannelsStatus = deliveryChannelsStatusCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeliveryChannelsStatus() != null) sb.append("DeliveryChannelsStatus: " + getDeliveryChannelsStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDeliveryChannelsStatus() == null) ? 0 : getDeliveryChannelsStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDeliveryChannelStatusResult == false) return false;
        DescribeDeliveryChannelStatusResult other = (DescribeDeliveryChannelStatusResult)obj;
        
        if (other.getDeliveryChannelsStatus() == null ^ this.getDeliveryChannelsStatus() == null) return false;
        if (other.getDeliveryChannelsStatus() != null && other.getDeliveryChannelsStatus().equals(this.getDeliveryChannelsStatus()) == false) return false; 
        return true;
    }
    
}
    