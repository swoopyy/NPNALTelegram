/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl;

import ru.mathtech.npntool.npnets.highlevelnets.common.CommonPackage;
import ru.mathtech.npntool.npnets.highlevelnets.common.INetElement;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcPT;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Node;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl#getNet <em>Net</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl#getFirstTimeConstraint <em>First Time Constraint</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl#getSecondTimeConstraint <em>Second Time Constraint</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.TransitionImpl#getOutArcs <em>Out Arcs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends ContextVariableImpl implements Transition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

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
	 * The cached value of the '{@link #getInArcs() <em>In Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<ArcPT> inArcs;

	/**
	 * The cached value of the '{@link #getOutArcs() <em>Out Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<ArcTP> outArcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HLPNPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.TRANSITION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelPetriNet getNet() {
		if (eContainerFeatureID() != HLPNPackage.TRANSITION__NET) return null;
		return (HighLevelPetriNet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(HighLevelPetriNet newNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNet, HLPNPackage.TRANSITION__NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(HighLevelPetriNet newNet) {
		if (newNet != eInternalContainer() || (eContainerFeatureID() != HLPNPackage.TRANSITION__NET && newNet != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.TRANSITION__NET, newNet, newNet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.TRANSITION__FIRST_TIME_CONSTRAINT, oldFirstTimeConstraint, firstTimeConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.TRANSITION__SECOND_TIME_CONSTRAINT, oldSecondTimeConstraint, secondTimeConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArcPT> getInArcs() {
		if (inArcs == null) {
			inArcs = new EObjectWithInverseResolvingEList<ArcPT>(ArcPT.class, this, HLPNPackage.TRANSITION__IN_ARCS, HLPNPackage.ARC_PT__TARGET);
		}
		return inArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArcTP> getOutArcs() {
		if (outArcs == null) {
			outArcs = new EObjectWithInverseResolvingEList<ArcTP>(ArcTP.class, this, HLPNPackage.TRANSITION__OUT_ARCS, HLPNPackage.ARC_TP__SOURCE);
		}
		return outArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HLPNPackage.TRANSITION__NET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNet((HighLevelPetriNet)otherEnd, msgs);
			case HLPNPackage.TRANSITION__IN_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInArcs()).basicAdd(otherEnd, msgs);
			case HLPNPackage.TRANSITION__OUT_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutArcs()).basicAdd(otherEnd, msgs);
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
			case HLPNPackage.TRANSITION__NET:
				return basicSetNet(null, msgs);
			case HLPNPackage.TRANSITION__IN_ARCS:
				return ((InternalEList<?>)getInArcs()).basicRemove(otherEnd, msgs);
			case HLPNPackage.TRANSITION__OUT_ARCS:
				return ((InternalEList<?>)getOutArcs()).basicRemove(otherEnd, msgs);
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
			case HLPNPackage.TRANSITION__NET:
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
			case HLPNPackage.TRANSITION__NAME:
				return getName();
			case HLPNPackage.TRANSITION__COMMENT:
				return getComment();
			case HLPNPackage.TRANSITION__NET:
				return getNet();
			case HLPNPackage.TRANSITION__FIRST_TIME_CONSTRAINT:
				return getFirstTimeConstraint();
			case HLPNPackage.TRANSITION__SECOND_TIME_CONSTRAINT:
				return getSecondTimeConstraint();
			case HLPNPackage.TRANSITION__IN_ARCS:
				return getInArcs();
			case HLPNPackage.TRANSITION__OUT_ARCS:
				return getOutArcs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HLPNPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case HLPNPackage.TRANSITION__COMMENT:
				setComment((String)newValue);
				return;
			case HLPNPackage.TRANSITION__NET:
				setNet((HighLevelPetriNet)newValue);
				return;
			case HLPNPackage.TRANSITION__FIRST_TIME_CONSTRAINT:
				setFirstTimeConstraint((Integer)newValue);
				return;
			case HLPNPackage.TRANSITION__SECOND_TIME_CONSTRAINT:
				setSecondTimeConstraint((Integer)newValue);
				return;
			case HLPNPackage.TRANSITION__IN_ARCS:
				getInArcs().clear();
				getInArcs().addAll((Collection<? extends ArcPT>)newValue);
				return;
			case HLPNPackage.TRANSITION__OUT_ARCS:
				getOutArcs().clear();
				getOutArcs().addAll((Collection<? extends ArcTP>)newValue);
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
			case HLPNPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HLPNPackage.TRANSITION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case HLPNPackage.TRANSITION__NET:
				setNet((HighLevelPetriNet)null);
				return;
			case HLPNPackage.TRANSITION__FIRST_TIME_CONSTRAINT:
				setFirstTimeConstraint(FIRST_TIME_CONSTRAINT_EDEFAULT);
				return;
			case HLPNPackage.TRANSITION__SECOND_TIME_CONSTRAINT:
				setSecondTimeConstraint(SECOND_TIME_CONSTRAINT_EDEFAULT);
				return;
			case HLPNPackage.TRANSITION__IN_ARCS:
				getInArcs().clear();
				return;
			case HLPNPackage.TRANSITION__OUT_ARCS:
				getOutArcs().clear();
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
			case HLPNPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HLPNPackage.TRANSITION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case HLPNPackage.TRANSITION__NET:
				return getNet() != null;
			case HLPNPackage.TRANSITION__FIRST_TIME_CONSTRAINT:
				return firstTimeConstraint != FIRST_TIME_CONSTRAINT_EDEFAULT;
			case HLPNPackage.TRANSITION__SECOND_TIME_CONSTRAINT:
				return secondTimeConstraint != SECOND_TIME_CONSTRAINT_EDEFAULT;
			case HLPNPackage.TRANSITION__IN_ARCS:
				return inArcs != null && !inArcs.isEmpty();
			case HLPNPackage.TRANSITION__OUT_ARCS:
				return outArcs != null && !outArcs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == INetElement.class) {
			switch (derivedFeatureID) {
				case HLPNPackage.TRANSITION__NAME: return CommonPackage.INET_ELEMENT__NAME;
				case HLPNPackage.TRANSITION__COMMENT: return CommonPackage.INET_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case HLPNPackage.TRANSITION__NET: return HLPNPackage.NODE__NET;
				case HLPNPackage.TRANSITION__FIRST_TIME_CONSTRAINT: return HLPNPackage.NODE__FIRST_TIME_CONSTRAINT;
				case HLPNPackage.TRANSITION__SECOND_TIME_CONSTRAINT: return HLPNPackage.NODE__SECOND_TIME_CONSTRAINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == INetElement.class) {
			switch (baseFeatureID) {
				case CommonPackage.INET_ELEMENT__NAME: return HLPNPackage.TRANSITION__NAME;
				case CommonPackage.INET_ELEMENT__COMMENT: return HLPNPackage.TRANSITION__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case HLPNPackage.NODE__NET: return HLPNPackage.TRANSITION__NET;
				case HLPNPackage.NODE__FIRST_TIME_CONSTRAINT: return HLPNPackage.TRANSITION__FIRST_TIME_CONSTRAINT;
				case HLPNPackage.NODE__SECOND_TIME_CONSTRAINT: return HLPNPackage.TRANSITION__SECOND_TIME_CONSTRAINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", comment: ");
		result.append(comment);
		result.append(", firstTimeConstraint: ");
		result.append(firstTimeConstraint);
		result.append(", secondTimeConstraint: ");
		result.append(secondTimeConstraint);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
