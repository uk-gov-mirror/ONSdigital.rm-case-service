
package uk.gov.ons.ctp.response.kirona.drs.autogeneratedcode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createOrder" type="{http://autogenerated.OTWebServiceApi.xmbrace.com/}xmbCreateOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createOrder", propOrder = {
    "createOrder"
})
public class CreateOrder {

    protected XmbCreateOrder createOrder;

    /**
     * Gets the value of the createOrder property.
     * 
     * @return
     *     possible object is
     *     {@link XmbCreateOrder }
     *     
     */
    public XmbCreateOrder getCreateOrder() {
        return createOrder;
    }

    /**
     * Sets the value of the createOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmbCreateOrder }
     *     
     */
    public void setCreateOrder(XmbCreateOrder value) {
        this.createOrder = value;
    }

}