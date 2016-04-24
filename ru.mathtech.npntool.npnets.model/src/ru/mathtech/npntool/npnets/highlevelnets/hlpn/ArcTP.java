/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.hlpn;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc TP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getSource <em>Source</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getTarget <em>Target</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getInscription <em>Inscription</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getSecondTimeConstraint <em>Second Time Constraint</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getFirstTimeConstraint <em>First Time Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getArcTP()
 * @model
 * @generated
 */
public interface ArcTP extends Arc {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition#getOutArcs <em>Out Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Transition)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getArcTP_Source()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition#getOutArcs
	 * @model opposite="outArcs" required="true"
	 * @generated
	 */
	Transition getSource();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Transition value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getInArcs <em>In Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Place)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getArcTP_Target()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place#getInArcs
	 * @model opposite="inArcs" required="true"
	 * @generated
	 */
	Place getTarget();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Place value);

	/**
	 * Returns the value of the '<em><b>Inscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inscription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inscription</em>' containment reference.
	 * @see #setInscription(TokenVariadicExpression)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getArcTP_Inscription()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TokenVariadicExpression getInscription();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getInscription <em>Inscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inscription</em>' containment reference.
	 * @see #getInscription()
	 * @generated
	 */
	void setInscription(TokenVariadicExpression value);

	/**
	 * Returns the value of the '<em><b>First Time Constraint</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Time Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Time Constraint</em>' attribute.
	 * @see #setFirstTimeConstraint(int)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getArcTP_FirstTimeConstraint()
	 * @model default="0"
	 * @generated
	 */
	int getFirstTimeConstraint();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getFirstTimeConstraint <em>First Time Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Time Constraint</em>' attribute.
	 * @see #getFirstTimeConstraint()
	 * @generated
	 */
	void setFirstTimeConstraint(int value);

	/**
	 * Returns the value of the '<em><b>Second Time Constraint</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Time Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Time Constraint</em>' attribute.
	 * @see #setSecondTimeConstraint(int)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getArcTP_SecondTimeConstraint()
	 * @model default="-1"
	 * @generated
	 */
	int getSecondTimeConstraint();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP#getSecondTimeConstraint <em>Second Time Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Time Constraint</em>' attribute.
	 * @see #getSecondTimeConstraint()
	 * @generated
	 */
	void setSecondTimeConstraint(int value);

} // ArcTP
