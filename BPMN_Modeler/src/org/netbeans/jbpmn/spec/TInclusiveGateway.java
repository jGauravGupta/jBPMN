/** Copyright [2014] Gaurav Gupta
   *
   *Licensed under the Apache License, Version 2.0 (the "License");
   *you may not use this file except in compliance with the License.
   *You may obtain a copy of the License at
   *
   *    http://www.apache.org/licenses/LICENSE-2.0
   *
   *Unless required by applicable law or agreed to in writing, software
   *distributed under the License is distributed on an "AS IS" BASIS,
   *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   *See the License for the specific language governing permissions and
   *limitations under the License.
   */
 package org.netbeans.jbpmn.spec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tInclusiveGateway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="tInclusiveGateway">
 *   <complexContent>
 *     <extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tGateway">
 *       <attribute name="default" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name = "inclusiveGateway") // JBPMN
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tInclusiveGateway")
public class TInclusiveGateway
    extends TGateway
{

    @XmlAttribute(name = "default")
//    @XmlIDREF
//    @XmlSchemaType(name = "IDREF")
    protected String _default;

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

}
