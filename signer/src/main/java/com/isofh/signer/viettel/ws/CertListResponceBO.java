
package com.isofh.signer.viettel.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certListResponceBO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="certListResponceBO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.viettel.com/}responceWsBO">
 *       &lt;sequence>
 *         &lt;element name="certList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certListResponceBO", propOrder = {
    "certList"
})
public class CertListResponceBO
    extends ResponceWsBO
{

    @XmlElement(nillable = true)
    protected List<String> certList;

    /**
     * Gets the value of the certList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCertList() {
        if (certList == null) {
            certList = new ArrayList<String>();
        }
        return this.certList;
    }

}
