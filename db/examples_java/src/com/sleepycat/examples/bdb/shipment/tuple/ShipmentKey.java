/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 2002-2003
 *	Sleepycat Software.  All rights reserved.
 *
 * $Id: ShipmentKey.java,v 1.2 2004/03/30 01:23:25 jtownsen Exp $
 */

package com.sleepycat.examples.bdb.shipment.tuple;

/**
 * A ShipmentKey serves as the key in the key/value pair for a shipment entity.
 *
 * <p> In this sample, ShipmentKey is bound to the key's tuple storage data
 * using a TupleBinding.  Because it is not used directly as storage data, it
 * does not need to be Serializable. </p>
 *
 * @author Mark Hayes
 */
public class ShipmentKey {

    private String partNumber;
    private String supplierNumber;

    public ShipmentKey(String partNumber, String supplierNumber) {

        this.partNumber = partNumber;
        this.supplierNumber = supplierNumber;
    }

    public final String getPartNumber() {

        return partNumber;
    }

    public final String getSupplierNumber() {

        return supplierNumber;
    }

    public String toString() {

        return "[ShipmentKey: supplier=" + supplierNumber +
                " part=" + partNumber + ']';
    }
}
