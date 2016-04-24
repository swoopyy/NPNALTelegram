/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.hlpn;

import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;



public interface Node extends INetElement {

	HighLevelPetriNet getNet();


	void setNet(HighLevelPetriNet value);


	int getFirstTimeConstraint();


	void setFirstTimeConstraint(int value);


	int getSecondTimeConstraint();


	void setSecondTimeConstraint(int value);

} // Node
