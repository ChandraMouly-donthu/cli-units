/*
 * Copyright © 2017 Frinx and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package io.frinx.cli.ios.bgp.handler;

import org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.types.rev170202.AFISAFITYPE;
import org.opendaylight.yang.gen.v1.http.openconfig.net.yang.bgp.types.rev170202.L3VPNIPV4UNICAST;

public class Vpnv4Reader {

    static final String COMMAND = "sh bgp vpnv4 unicast all summ";

    static final Class<? extends AFISAFITYPE> AFI_SAFI = L3VPNIPV4UNICAST.class;

    private Vpnv4Reader() {
    }
}
