/*
Copyright (C) 2016 Syracuse University

This file is part of the Spectrum Consumption Model Builder and
Analysis Tool

This program is free software; you can redistribute it and/or modify it
under the terms of the GNU General Public License as published by the
Free Software Foundation; either version 3 of the License, or (at your
option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License
along with program.  If not, see <http://www.gnu.org/licenses/>.

*/


package org.ieee.dyspansc._1900._5.scm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UberModel", propOrder = {
    "txModel",
    "rxModel"
})
public class UberModel {

    @XmlElement(nillable = true)
    protected List<TxModel> txModel;
    @XmlElement(nillable = true)
    protected List<RxModel> rxModel;

    /**
     * Gets the value of the txModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxModel }
     * 
     * 
     */
    public List<TxModel> getTxModel() {
        if (txModel == null) {
            txModel = new ArrayList<TxModel>();
        }
        return this.txModel;
    }

    /**
     * Gets the value of the rxModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rxModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRxModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RxModel }
     * 
     * 
     */
    public List<RxModel> getRxModel() {
        if (rxModel == null) {
            rxModel = new ArrayList<RxModel>();
        }
        return this.rxModel;
    }

}
