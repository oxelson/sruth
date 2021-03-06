/**
 * Copyright 2010 University Corporation for Atmospheric Research.  All rights
 * reserved.  See file LICENSE.txt in the top-level directory for licensing
 * information.
 */
package edu.ucar.unidata.sruth;

import java.io.IOException;

/**
 * Processes data using a peer.
 * 
 * @author Steven R. Emmerson
 */
interface PieceSpecProcessor {
    /**
     * Processes a specification of a piece of data.
     * 
     * @param pieceSpec
     *            The specification of the piece of data.
     * @throws IOException
     *             if an I/O error occurs.
     * @throws InterruptedException
     *             if the current thread is interrupted.
     */
    void process(final PieceSpec pieceSpec) throws InterruptedException,
            IOException;
}
