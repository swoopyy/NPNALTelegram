/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.hlpn;

import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node#getNet <em>Net</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends INetElement {

/* eperzhand */

	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(HighLevelPetriNet)
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage#getNode_Net()
	 * @see ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	HighLevelPetriNet getNet();

	/**
	 * Sets the value of the '{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(HighLevelPetriNet value);
	
} // Node
