//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 05:58:11 PM CET 
//

package allow.simulator.collective.adaptation.ensemble;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ServiceActionType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="receiveGoal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="goal" type="{http://das.fbk.eu/Annotation}GoalType"/>
 *         &lt;/choice>
 *         &lt;element name="precondition" type="{http://das.fbk.eu/Annotation}PreconditionType" minOccurs="0"/>
 *         &lt;element name="effect" type="{http://das.fbk.eu/Annotation}EffectType" minOccurs="0"/>
 *         &lt;element name="compensation" type="{http://das.fbk.eu/Annotation}CompensationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceActionType", namespace = "http://das.fbk.eu/Fragment", propOrder = { "receiveGoal", "goal",
	"precondition", "effect", "compensation" })
@XmlSeeAlso({ allow.simulator.collective.adaptation.ensemble.Fragment.State.class,
	allow.simulator.collective.adaptation.ensemble.Fragment.Action.class,
	allow.simulator.collective.adaptation.ensemble.Fragment.Transition.Action.class })
public class ServiceActionType {

    protected String receiveGoal;
    protected GoalType goal;
    protected PreconditionType precondition;
    protected EffectType effect;
    protected CompensationType compensation;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the receiveGoal property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReceiveGoal() {
	return receiveGoal;
    }

    /**
     * Sets the value of the receiveGoal property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setReceiveGoal(String value) {
	this.receiveGoal = value;
    }

    /**
     * Gets the value of the goal property.
     * 
     * @return possible object is {@link GoalType }
     * 
     */
    public GoalType getGoal() {
	return goal;
    }

    /**
     * Sets the value of the goal property.
     * 
     * @param value
     *            allowed object is {@link GoalType }
     * 
     */
    public void setGoal(GoalType value) {
	this.goal = value;
    }

    /**
     * Gets the value of the precondition property.
     * 
     * @return possible object is {@link PreconditionType }
     * 
     */
    public PreconditionType getPrecondition() {
	return precondition;
    }

    /**
     * Sets the value of the precondition property.
     * 
     * @param value
     *            allowed object is {@link PreconditionType }
     * 
     */
    public void setPrecondition(PreconditionType value) {
	this.precondition = value;
    }

    /**
     * Gets the value of the effect property.
     * 
     * @return possible object is {@link EffectType }
     * 
     */
    public EffectType getEffect() {
	return effect;
    }

    /**
     * Sets the value of the effect property.
     * 
     * @param value
     *            allowed object is {@link EffectType }
     * 
     */
    public void setEffect(EffectType value) {
	this.effect = value;
    }

    /**
     * Gets the value of the compensation property.
     * 
     * @return possible object is {@link CompensationType }
     * 
     */
    public CompensationType getCompensation() {
	return compensation;
    }

    /**
     * Sets the value of the compensation property.
     * 
     * @param value
     *            allowed object is {@link CompensationType }
     * 
     */
    public void setCompensation(CompensationType value) {
	this.compensation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
	return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setName(String value) {
	this.name = value;
    }

}
