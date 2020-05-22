//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.04.30 at 05:48:38 PM BST
//

package uk.gov.ons.ctp.response.lib.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for CaseCreation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CaseCreation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="collectionExerciseId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="collectionInstrumentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleUnitRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sampleUnitType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionPlanId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "CaseCreation",
    namespace = "http://ons.gov.uk/ctp/response/casesvc/definition",
    propOrder = {
      "partyId",
      "collectionExerciseId",
      "collectionInstrumentId",
      "sampleUnitRef",
      "sampleUnitType",
      "actionPlanId"
    })
public class CaseCreation {

  @XmlElement(required = true)
  protected String partyId;

  @XmlElement(required = true)
  protected String collectionExerciseId;

  @XmlElement(required = true)
  protected String collectionInstrumentId;

  @XmlElement(required = true)
  protected String sampleUnitRef;

  @XmlElement(required = true)
  protected String sampleUnitType;

  @XmlElement(required = true)
  protected String actionPlanId;

  /**
   * Gets the value of the partyId property.
   *
   * @return possible object is {@link String }
   */
  public String getPartyId() {
    return partyId;
  }

  /**
   * Sets the value of the partyId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setPartyId(String value) {
    this.partyId = value;
  }

  /**
   * Gets the value of the collectionExerciseId property.
   *
   * @return possible object is {@link String }
   */
  public String getCollectionExerciseId() {
    return collectionExerciseId;
  }

  /**
   * Sets the value of the collectionExerciseId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCollectionExerciseId(String value) {
    this.collectionExerciseId = value;
  }

  /**
   * Gets the value of the collectionInstrumentId property.
   *
   * @return possible object is {@link String }
   */
  public String getCollectionInstrumentId() {
    return collectionInstrumentId;
  }

  /**
   * Sets the value of the collectionInstrumentId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setCollectionInstrumentId(String value) {
    this.collectionInstrumentId = value;
  }

  /**
   * Gets the value of the sampleUnitRef property.
   *
   * @return possible object is {@link String }
   */
  public String getSampleUnitRef() {
    return sampleUnitRef;
  }

  /**
   * Sets the value of the sampleUnitRef property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSampleUnitRef(String value) {
    this.sampleUnitRef = value;
  }

  /**
   * Gets the value of the sampleUnitType property.
   *
   * @return possible object is {@link String }
   */
  public String getSampleUnitType() {
    return sampleUnitType;
  }

  /**
   * Sets the value of the sampleUnitType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSampleUnitType(String value) {
    this.sampleUnitType = value;
  }

  /**
   * Gets the value of the actionPlanId property.
   *
   * @return possible object is {@link String }
   */
  public String getActionPlanId() {
    return actionPlanId;
  }

  /**
   * Sets the value of the actionPlanId property.
   *
   * @param value allowed object is {@link String }
   */
  public void setActionPlanId(String value) {
    this.actionPlanId = value;
  }
}