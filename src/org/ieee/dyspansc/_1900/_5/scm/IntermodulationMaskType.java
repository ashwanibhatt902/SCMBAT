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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntermodulationMaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntermodulationMaskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="intermediateFrequency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="highSideInjection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="imCombiningMask" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}SCMMaskType"/>
 *         &lt;element name="imAmplificationMask" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}SCMMaskType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntermodulationMaskType", propOrder = {
    "order",
    "intermediateFrequency",
    "highSideInjection",
    "imCombiningMask",
    "imAmplificationMask"
})
public class IntermodulationMaskType {

    @XmlElement(required = true)
    protected String order;
    protected Double intermediateFrequency;
    protected Boolean highSideInjection;
    @XmlElement(required = true)
    protected SCMMaskType imCombiningMask;
    protected SCMMaskType imAmplificationMask;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the intermediateFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIntermediateFrequency() {
        return intermediateFrequency;
    }

    /**
     * Sets the value of the intermediateFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIntermediateFrequency(Double value) {
        this.intermediateFrequency = value;
    }

    /**
     * Gets the value of the highSideInjection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHighSideInjection() {
        return highSideInjection;
    }

    /**
     * Sets the value of the highSideInjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighSideInjection(Boolean value) {
        this.highSideInjection = value;
    }

    /**
     * Gets the value of the imCombiningMask property.
     * 
     * @return
     *     possible object is
     *     {@link SCMMaskType }
     *     
     */
    public SCMMaskType getImCombiningMask() {
        return imCombiningMask;
    }

    /**
     * Sets the value of the imCombiningMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCMMaskType }
     *     
     */
    public void setImCombiningMask(SCMMaskType value) {
        this.imCombiningMask = value;
    }

    /**
     * Gets the value of the imAmplificationMask property.
     * 
     * @return
     *     possible object is
     *     {@link SCMMaskType }
     *     
     */
    public SCMMaskType getImAmplificationMask() {
        return imAmplificationMask;
    }

    /**
     * Sets the value of the imAmplificationMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCMMaskType }
     *     
     */
    public void setImAmplificationMask(SCMMaskType value) {
        this.imAmplificationMask = value;
    }

}
