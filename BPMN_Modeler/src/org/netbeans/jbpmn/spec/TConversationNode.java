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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.netbeans.jbpmn.spec.extend.TCollaborationNode;


/**
 * <p>Java class for tConversationNode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType name="tConversationNode">
 *   <complexContent>
 *     <extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tBaseElement">
 *       <sequence>
 *         <element name="participantRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="messageFlowRef" type="{http://www.w3.org/2001/XMLSchema}QName" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://www.omg.org/spec/BPMN/20100524/MODEL}correlationKey" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       <anyAttribute processContents='lax' namespace='##other'/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tConversationNode", propOrder = {
    "participantRef",
    "messageFlowRef",
    "correlationKey"
})
@XmlSeeAlso({
    TConversation.class,
    TCallConversation.class,
    TSubConversation.class
})
public abstract class TConversationNode
    extends  TCollaborationNode
{

    protected List<QName> participantRef;
    protected List<QName> messageFlowRef;
    protected List<TCorrelationKey> correlationKey;
    @XmlAttribute
    protected String name;

    /**
     * Gets the value of the participantRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getParticipantRef() {
        if (participantRef == null) {
            participantRef = new ArrayList<QName>();
        }
        return this.participantRef;
    }

    /**
     * Gets the value of the messageFlowRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageFlowRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageFlowRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QName }
     * 
     * 
     */
    public List<QName> getMessageFlowRef() {
        if (messageFlowRef == null) {
            messageFlowRef = new ArrayList<QName>();
        }
        return this.messageFlowRef;
    }

    /**
     * Gets the value of the correlationKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correlationKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrelationKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCorrelationKey }
     * 
     * 
     */
    public List<TCorrelationKey> getCorrelationKey() {
        if (correlationKey == null) {
            correlationKey = new ArrayList<TCorrelationKey>();
        }
        return this.correlationKey;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
