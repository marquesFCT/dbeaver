
package org.jkiss.dbeaver.ext.mssql.model.plan.schemas.sql2016sp1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}RelOpBaseType">
 *       &lt;attribute name="RemoteDestination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RemoteSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RemoteObject" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteType", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan")
@XmlSeeAlso({
    RemoteModifyType_sql2016sp1 .class,
    RemoteRangeType_sql2016sp1 .class,
    RemoteFetchType_sql2016sp1 .class,
    RemoteQueryType_sql2016sp1 .class
})
public class RemoteType_sql2016sp1
    extends RelOpBaseType_sql2016sp1
{

    @XmlAttribute(name = "RemoteDestination")
    protected String remoteDestination;
    @XmlAttribute(name = "RemoteSource")
    protected String remoteSource;
    @XmlAttribute(name = "RemoteObject")
    protected String remoteObject;

    /**
     * Gets the value of the remoteDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteDestination() {
        return remoteDestination;
    }

    /**
     * Sets the value of the remoteDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteDestination(String value) {
        this.remoteDestination = value;
    }

    /**
     * Gets the value of the remoteSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSource() {
        return remoteSource;
    }

    /**
     * Sets the value of the remoteSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSource(String value) {
        this.remoteSource = value;
    }

    /**
     * Gets the value of the remoteObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteObject() {
        return remoteObject;
    }

    /**
     * Sets the value of the remoteObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteObject(String value) {
        this.remoteObject = value;
    }

}
