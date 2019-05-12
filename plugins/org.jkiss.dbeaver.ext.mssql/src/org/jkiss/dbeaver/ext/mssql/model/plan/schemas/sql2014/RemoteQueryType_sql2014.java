
package org.jkiss.dbeaver.ext.mssql.model.plan.schemas.sql2014;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RemoteQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteQueryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/sqlserver/2004/07/showplan}RemoteType">
 *       &lt;attribute name="RemoteQuery" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteQueryType", namespace = "http://schemas.microsoft.com/sqlserver/2004/07/showplan")
public class RemoteQueryType_sql2014
    extends RemoteType_sql2014
{

    @XmlAttribute(name = "RemoteQuery")
    protected String remoteQuery;

    /**
     * Gets the value of the remoteQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteQuery() {
        return remoteQuery;
    }

    /**
     * Sets the value of the remoteQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteQuery(String value) {
        this.remoteQuery = value;
    }

}
