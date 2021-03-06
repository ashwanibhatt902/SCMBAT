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
@XmlType(name = "RxModel", propOrder = {
    "systemID",
    "purpose",
    "confidence",
    "referencePower",
    "underlayMask",
    "scmPowerMap",
    "scmPropagationMap",
    "intermodulationMask",
    "scmPlatform",
    "scmLocation",
    "scmSchedule",
    "scmPolicyOrProtocol"
})
public class RxModel {

    protected String systemID;
    @XmlElement(required = true)
    protected String purpose;
    protected Confidence confidence;
    @XmlElement(required = true)
    protected List<ReferencePower> referencePower;
    @XmlElement(required = true)
    protected List<UnderlayMask> underlayMask;
    @XmlElement(required = true)
    protected List<SCMPowerMap> scmPowerMap;
    @XmlElement(required = true)
    protected List<SCMPropagationMap> scmPropagationMap;
    @XmlElement(nillable = true)
    protected List<IntermodulationMask> intermodulationMask;
    @XmlElement(nillable = true)
    protected List<SCMPlatform> scmPlatform;
    @XmlElement(required = true)
    protected List<SCMLocation> scmLocation;
    @XmlElement(required = true)
    protected List<SCMSchedule> scmSchedule;
    @XmlElement(nillable = true)
    protected List<SCMPolicyOrProtocol> scmPolicyOrProtocol;

    /**
     * Gets the value of the systemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemID(String value) {
        this.systemID = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link Confidence }
     *     
     */
    public Confidence getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confidence }
     *     
     */
    public void setConfidence(Confidence value) {
        this.confidence = value;
    }

    /**
     * Gets the value of the referencePower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencePower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencePower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencePower }
     * 
     * 
     */
    public List<ReferencePower> getReferencePower() {
        if (referencePower == null) {
            referencePower = new ArrayList<ReferencePower>();
        }
        return this.referencePower;
    }

    /**
     * Gets the value of the underlayMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the underlayMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnderlayMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlayMask }
     * 
     * 
     */
    public List<UnderlayMask> getUnderlayMask() {
        if (underlayMask == null) {
            underlayMask = new ArrayList<UnderlayMask>();
        }
        return this.underlayMask;
    }

    /**
     * Gets the value of the scmPowerMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scmPowerMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScmPowerMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCMPowerMap }
     * 
     * 
     */
    public List<SCMPowerMap> getScmPowerMap() {
        if (scmPowerMap == null) {
            scmPowerMap = new ArrayList<SCMPowerMap>();
        }
        return this.scmPowerMap;
    }

    /**
     * Gets the value of the scmPropagationMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scmPropagationMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScmPropagationMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCMPropagationMap }
     * 
     * 
     */
    public List<SCMPropagationMap> getScmPropagationMap() {
        if (scmPropagationMap == null) {
            scmPropagationMap = new ArrayList<SCMPropagationMap>();
        }
        return this.scmPropagationMap;
    }

    /**
     * Gets the value of the intermodulationMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intermodulationMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntermodulationMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntermodulationMask }
     * 
     * 
     */
    public List<IntermodulationMask> getIntermodulationMask() {
        if (intermodulationMask == null) {
            intermodulationMask = new ArrayList<IntermodulationMask>();
        }
        return this.intermodulationMask;
    }

    /**
     * Gets the value of the scmPlatform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scmPlatform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScmPlatform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCMPlatform }
     * 
     * 
     */
    public List<SCMPlatform> getScmPlatform() {
        if (scmPlatform == null) {
            scmPlatform = new ArrayList<SCMPlatform>();
        }
        return this.scmPlatform;
    }

    /**
     * Gets the value of the scmLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scmLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScmLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCMLocation }
     * 
     * 
     */
    public List<SCMLocation> getScmLocation() {
        if (scmLocation == null) {
            scmLocation = new ArrayList<SCMLocation>();
        }
        return this.scmLocation;
    }

    /**
     * Gets the value of the scmSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scmSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScmSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCMSchedule }
     * 
     * 
     */
    public List<SCMSchedule> getScmSchedule() {
        if (scmSchedule == null) {
            scmSchedule = new ArrayList<SCMSchedule>();
        }
        return this.scmSchedule;
    }

    /**
     * Gets the value of the scmPolicyOrProtocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scmPolicyOrProtocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScmPolicyOrProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCMPolicyOrProtocol }
     * 
     * 
     */
    public List<SCMPolicyOrProtocol> getScmPolicyOrProtocol() {
        if (scmPolicyOrProtocol == null) {
            scmPolicyOrProtocol = new ArrayList<SCMPolicyOrProtocol>();
        }
        return this.scmPolicyOrProtocol;
    }

}
