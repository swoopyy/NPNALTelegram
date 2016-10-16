/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.ArcTP;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Place;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;

import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenVariadicExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc TP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl#getInscription <em>Inscription</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl#getFirstTimeConstraint <em>First Time Constraint</em>}</li>
 *   <li>{@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.ArcTPImpl#getSecondTimeConstraint <em>Second Time Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcTPImpl extends ArcImpl implements ArcTP {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Transition source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Place target;

	/**
	 * The cached value of the '{@link #getInscription() <em>Inscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInscription()
	 * @generated
	 * @ordered
	 */
	protected TokenVariadicExpression inscription;

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
	protected ArcTPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HLPNPackage.Literals.ARC_TP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Transition)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLPNPackage.ARC_TP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Transition newSource, NotificationChain msgs) {
		Transition oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Transition newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, HLPNPackage.TRANSITION__OUT_ARCS, Transition.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, HLPNPackage.TRANSITION__OUT_ARCS, Transition.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Place)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLPNPackage.ARC_TP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Place newTarget, NotificationChain msgs) {
		Place oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Place newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, HLPNPackage.PLACE__IN_ARCS, Place.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, HLPNPackage.PLACE__IN_ARCS, Place.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenVariadicExpression getInscription() {
		return inscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInscription(TokenVariadicExpression newInscription, NotificationChain msgs) {
		TokenVariadicExpression oldInscription = inscription;
		inscription = newInscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__INSCRIPTION, oldInscription, newInscription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInscription(TokenVariadicExpression newInscription) {
		if (newInscription != inscription) {
			NotificationChain msgs = null;
			if (inscription != null)
				msgs = ((InternalEObject)inscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HLPNPackage.ARC_TP__INSCRIPTION, null, msgs);
			if (newInscription != null)
				msgs = ((InternalEObject)newInscription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HLPNPackage.ARC_TP__INSCRIPTION, null, msgs);
			msgs = basicSetInscription(newInscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__INSCRIPTION, newInscription, newInscription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__FIRST_TIME_CONSTRAINT, oldFirstTimeConstraint, firstTimeConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HLPNPackage.ARC_TP__SECOND_TIME_CONSTRAINT, oldSecondTimeConstraint, secondTimeConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HLPNPackage.ARC_TP__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, HLPNPackage.TRANSITION__OUT_ARCS, Transition.class, msgs);
				return basicSetSource((Transition)otherEnd, msgs);
			case HLPNPackage.ARC_TP__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, HLPNPackage.PLACE__IN_ARCS, Place.class, msgs);
				return basicSetTarget((Place)otherEnd, msgs);
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
			case HLPNPackage.ARC_TP__SOURCE:
				return basicSetSource(null, msgs);
			case HLPNPackage.ARC_TP__TARGET:
				return basicSetTarget(null, msgs);
			case HLPNPackage.ARC_TP__INSCRIPTION:
				return basicSetInscription(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HLPNPackage.ARC_TP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case HLPNPackage.ARC_TP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case HLPNPackage.ARC_TP__INSCRIPTION:
				return getInscription();
			case HLPNPackage.ARC_TP__FIRST_TIME_CONSTRAINT:
				return getFirstTimeConstraint();
			case HLPNPackage.ARC_TP__SECOND_TIME_CONSTRAINT:
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
			case HLPNPackage.ARC_TP__SOURCE:
				setSource((Transition)newValue);
				return;
			case HLPNPackage.ARC_TP__TARGET:
				setTarget((Place)newValue);
				return;
			case HLPNPackage.ARC_TP__INSCRIPTION:
				setInscription((TokenVariadicExpression)newValue);
				return;
			case HLPNPackage.ARC_TP__FIRST_TIME_CONSTRAINT:
				setFirstTimeConstraint((Integer)newValue);
				return;
			case HLPNPackage.ARC_TP__SECOND_TIME_CONSTRAINT:
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
			case HLPNPackage.ARC_TP__SOURCE:
				setSource((Transition)null);
				return;
			case HLPNPackage.ARC_TP__TARGET:
				setTarget((Place)null);
				return;
			case HLPNPackage.ARC_TP__INSCRIPTION:
				setInscription((TokenVariadicExpression)null);
				return;
			case HLPNPackage.ARC_TP__FIRST_TIME_CONSTRAINT:
				setFirstTimeConstraint(FIRST_TIME_CONSTRAINT_EDEFAULT);
				return;
			case HLPNPackage.ARC_TP__SECOND_TIME_CONSTRAINT:
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
			case HLPNPackage.ARC_TP__SOURCE:
				return source != null;
			case HLPNPackage.ARC_TP__TARGET:
				return target != null;
			case HLPNPackage.ARC_TP__INSCRIPTION:
				return inscription != null;
			case HLPNPackage.ARC_TP__FIRST_TIME_CONSTRAINT:
				return firstTimeConstraint != FIRST_TIME_CONSTRAINT_EDEFAULT;
			case HLPNPackage.ARC_TP__SECOND_TIME_CONSTRAINT:
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

} //ArcTPImpl
