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
 * <p>Java class for CircularSurfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CircularSurfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="point" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}PointType"/>
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="perimeterAttenuation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="antennaHeight" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}AntennaHeight"/>
 *         &lt;element name="transmitterDensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CircularSurfaceType", propOrder = {
    "point",
    "radius",
    "perimeterAttenuation",
    "antennaHeight",
    "transmitterDensity"
})
public class CircularSurfaceType {

    @XmlElement(required = true)
    protected PointType point;
    protected double radius;
    @XmlElement(defaultValue = "0")
    protected Double perimeterAttenuation;
    @XmlElement(required = true)
    protected AntennaHeight antennaHeight;
    protected Double transmitterDensity;

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link PointType }
     *     
     */
    public PointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointType }
     *     
     */
    public void setPoint(PointType value) {
        this.point = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     */
    public void setRadius(double value) {
        this.radius = value;
    }

    /**
     * Gets the value of the perimeterAttenuation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPerimeterAttenuation() {
        return perimeterAttenuation;
    }

    /**
     * Sets the value of the perimeterAttenuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPerimeterAttenuation(Double value) {
        this.perimeterAttenuation = value;
    }

    /**
     * Gets the value of the antennaHeight property.
     * 
     * @return
     *     possible object is
     *     {@link AntennaHeight }
     *     
     */
    public AntennaHeight getAntennaHeight() {
        return antennaHeight;
    }

    /**
     * Sets the value of the antennaHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntennaHeight }
     *     
     */
    public void setAntennaHeight(AntennaHeight value) {
        this.antennaHeight = value;
    }

    /**
     * Gets the value of the transmitterDensity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransmitterDensity() {
        return transmitterDensity;
    }

    /**
     * Sets the value of the transmitterDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransmitterDensity(Double value) {
        this.transmitterDensity = value;
    }

}
