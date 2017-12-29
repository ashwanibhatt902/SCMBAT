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


/**
 * <p>Java class for TxModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="systemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purpose">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AUTHORIZATION"/>
 *               &lt;enumeration value="CONSTRAINT"/>
 *               &lt;enumeration value="CONSUMPTION"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="confidence" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}ConfidenceType" minOccurs="0"/>
 *         &lt;element name="referencePower" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}ReferencePowerType" maxOccurs="unbounded"/>
 *         &lt;element name="spectrumMask" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}SpectrumMaskType" maxOccurs="unbounded"/>
 *         &lt;element name="underlayMask" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}UnderlayMaskType" minOccurs="0"/>
 *         &lt;element name="scmPowerMap" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}SCMPowerMapType" maxOccurs="unbounded"/>
 *         &lt;element name="scmPropagationMap" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}SCMPropagationMapType" maxOccurs="unbounded"/>
 *         &lt;element name="intermodulationMask" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}IntermodulationMaskType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scmPlatform" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}SCMPlatformType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scmLocation" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}SCMLocationType" maxOccurs="unbounded"/>
 *         &lt;element name="scmSchedule" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}SCMScheduleType" maxOccurs="unbounded"/>
 *         &lt;element name="minimumPowerSpecralFluxDensity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="scmPolicyOrProtocol" type="{http://www.ieee.org/DyspanSC/1900/5/SCM}SCMPolicyOrProtocolType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxModelType", propOrder = {
    "systemID",
    "purpose",
    "confidence",
    "referencePower",
    "spectrumMask",
    "underlayMask",
    "scmPowerMap",
    "scmPropagationMap",
    "intermodulationMask",
    "scmPlatform",
    "scmLocation",
    "scmSchedule",
    "minimumPowerSpecralFluxDensity",
    "scmPolicyOrProtocol"
})
public class TxModelType {

    protected String systemID;
    @XmlElement(required = true)
    protected String purpose;
    protected ConfidenceType confidence;
    @XmlElement(required = true)
    protected List<ReferencePowerType> referencePower;
    @XmlElement(required = true)
    protected List<SpectrumMaskType> spectrumMask;
    protected UnderlayMaskType underlayMask;
    @XmlElement(required = true)
    protected List<SCMPowerMapType> scmPowerMap;
    @XmlElement(required = true)
    protected List<SCMPropagationMapType> scmPropagationMap;
    protected List<IntermodulationMaskType> intermodulationMask;
    protected List<SCMPlatformType> scmPlatform;
    @XmlElement(required = true)
    protected List<SCMLocationType> scmLocation;
    @XmlElement(required = true)
    protected List<SCMScheduleType> scmSchedule;
    protected Double minimumPowerSpecralFluxDensity;
    protected SCMPolicyOrProtocolType scmPolicyOrProtocol;

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
     *     {@link ConfidenceType }
     *     
     */
    public ConfidenceType getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfidenceType }
     *     
     */
    public void setConfidence(ConfidenceType value) {
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
     * {@link ReferencePowerType }
     * 
     * 
     */
    public List<ReferencePowerType> getReferencePower() {
        if (referencePower == null) {
            referencePower = new ArrayList<ReferencePowerType>();
        }
        return this.referencePower;
    }

    /**
     * Gets the value of the spectrumMask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spectrumMask property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpectrumMask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpectrumMaskType }
     * 
     * 
     */
    public List<SpectrumMaskType> getSpectrumMask() {
        if (spectrumMask == null) {
            spectrumMask = new ArrayList<SpectrumMaskType>();
        }
        return this.spectrumMask;
    }

    /**
     * Gets the value of the underlayMask property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlayMaskType }
     *     
     */
    public UnderlayMaskType getUnderlayMask() {
        return underlayMask;
    }

    /**
     * Sets the value of the underlayMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlayMaskType }
     *     
     */
    public void setUnderlayMask(UnderlayMaskType value) {
        this.underlayMask = value;
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
     * {@link SCMPowerMapType }
     * 
     * 
     */
    public List<SCMPowerMapType> getScmPowerMap() {
        if (scmPowerMap == null) {
            scmPowerMap = new ArrayList<SCMPowerMapType>();
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
     * {@link SCMPropagationMapType }
     * 
     * 
     */
    public List<SCMPropagationMapType> getScmPropagationMap() {
        if (scmPropagationMap == null) {
            scmPropagationMap = new ArrayList<SCMPropagationMapType>();
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
     * {@link IntermodulationMaskType }
     * 
     * 
     */
    public List<IntermodulationMaskType> getIntermodulationMask() {
        if (intermodulationMask == null) {
            intermodulationMask = new ArrayList<IntermodulationMaskType>();
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
     * {@link SCMPlatformType }
     * 
     * 
     */
    public List<SCMPlatformType> getScmPlatform() {
        if (scmPlatform == null) {
            scmPlatform = new ArrayList<SCMPlatformType>();
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
     * {@link SCMLocationType }
     * 
     * 
     */
    public List<SCMLocationType> getScmLocation() {
        if (scmLocation == null) {
            scmLocation = new ArrayList<SCMLocationType>();
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
     * {@link SCMScheduleType }
     * 
     * 
     */
    public List<SCMScheduleType> getScmSchedule() {
        if (scmSchedule == null) {
            scmSchedule = new ArrayList<SCMScheduleType>();
        }
        return this.scmSchedule;
    }

    /**
     * Gets the value of the minimumPowerSpecralFluxDensity property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumPowerSpecralFluxDensity() {
        return minimumPowerSpecralFluxDensity;
    }

    /**
     * Sets the value of the minimumPowerSpecralFluxDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumPowerSpecralFluxDensity(Double value) {
        this.minimumPowerSpecralFluxDensity = value;
    }

    /**
     * Gets the value of the scmPolicyOrProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link SCMPolicyOrProtocolType }
     *     
     */
    public SCMPolicyOrProtocolType getScmPolicyOrProtocol() {
        return scmPolicyOrProtocol;
    }

    /**
     * Sets the value of the scmPolicyOrProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCMPolicyOrProtocolType }
     *     
     */
    public void setScmPolicyOrProtocol(SCMPolicyOrProtocolType value) {
        this.scmPolicyOrProtocol = value;
    }

}
