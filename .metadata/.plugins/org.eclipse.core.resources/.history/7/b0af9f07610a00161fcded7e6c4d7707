/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl;

import ru.mathtech.npntool.npnets.highlevelnets.common.impl.INetElementImpl;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.NodeImpl#getNet <em>Net</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.NodeImpl#getFirstTimeConstraint <em>First Time Constraint</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.NodeImpl#getSecondTimeConstraint <em>Second Time Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NodeImpl extends INetElementImpl implements Node {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getFirstTimeConstraint() <em>First Time Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTimeConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_TIME_CONSTRAINT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFirstTimeConstraint() <em>First Time Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstTimeConstraint()
	 * @generated
	 * @ordered
	 */
	protected int firstTimeConstraint = FIRST_TIME_CONSTRAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondTimeConstraint() <em>Second Time Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTimeConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_TIME_CONSTRAINT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSecondTimeConstraint() <em>Second Time Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTimeConstraint()
	 * @generated
	 * @ordered
	 */
	protected int secondTimeConstraint = SECOND_TIME_CONSTRAINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HLPNPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelPetriNet getNet() {
		if (eContainerFeatureID() != HLPNPackage.NODE__NET) return null;
		return (HighLevelPetriNet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(HighLevelPetriNet newNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNet, HLPNPackage.NODE__NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(HighLevelPetriNet newNet) {
		if (newNet != eInternalContainer() || (eContainerFeatureID() != HLPNPackage.NODE__NET && newNet != null)) {
			if (EcoreUtil.isAncestor(this, newNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, HLPNPackage.HIGH_LEVEL_PETRI_NET__NODES, HighLevelPetriNet.class, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.NODE__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFirstTimeConstraint() {
		return firstTimeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTimeConstraint(int newFirstTimeConstraint) {
		int oldFirstTimeConstraint = firstTimeConstraint;
		firstTimeConstraint = newFirstTimeConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.NODE__FIRST_TIME_CONSTRAINT, oldFirstTimeConstraint, firstTimeConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondTimeConstraint() {
		return secondTimeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondTimeConstraint(int newSecondTimeConstraint) {
		int oldSecondTimeConstraint = secondTimeConstraint;
		secondTimeConstraint = newSecondTimeConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.NODE__SECOND_TIME_CONSTRAINT, oldSecondTimeConstraint, secondTimeConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HLPNPackage.NODE__NET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNet((HighLevelPetriNet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HLPNPackage.NODE__NET:
				return basicSetNet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case HLPNPackage.NODE__NET:
				return eInternalContainer().eInverseRemove(this, HLPNPackage.HIGH_LEVEL_PETRI_NET__NODES, HighLevelPetriNet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HLPNPackage.NODE__NET:
				return getNet();
			case HLPNPackage.NODE__FIRST_TIME_CONSTRAINT:
				return getFirstTimeConstraint();
			case HLPNPackage.NODE__SECOND_TIME_CONSTRAINT:
				return getSecondTimeConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HLPNPackage.NODE__NET:
				setNet((HighLevelPetriNet)newValue);
				return;
			case HLPNPackage.NODE__FIRST_TIME_CONSTRAINT:
				setFirstTimeConstraint((Integer)newValue);
				return;
			case HLPNPackage.NODE__SECOND_TIME_CONSTRAINT:
				setSecondTimeConstraint((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HLPNPackage.NODE__NET:
				setNet((HighLevelPetriNet)null);
				return;
			case HLPNPackage.NODE__FIRST_TIME_CONSTRAINT:
				setFirstTimeConstraint(FIRST_TIME_CONSTRAINT_EDEFAULT);
				return;
			case HLPNPackage.NODE__SECOND_TIME_CONSTRAINT:
				setSecondTimeConstraint(SECOND_TIME_CONSTRAINT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HLPNPackage.NODE__NET:
				return getNet() != null;
			case HLPNPackage.NODE__FIRST_TIME_CONSTRAINT:
				return firstTimeConstraint != FIRST_TIME_CONSTRAINT_EDEFAULT;
			case HLPNPackage.NODE__SECOND_TIME_CONSTRAINT:
				return secondTimeConstraint != SECOND_TIME_CONSTRAINT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstTimeConstraint: ");
		result.append(firstTimeConstraint);
		result.append(", secondTimeConstraint: ");
		result.append(secondTimeConstraint);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
