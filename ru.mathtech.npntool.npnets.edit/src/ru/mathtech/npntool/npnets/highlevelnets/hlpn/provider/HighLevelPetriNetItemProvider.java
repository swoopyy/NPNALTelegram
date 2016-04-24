/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.hlpn.provider;


import ru.mathtech.npntool.npnets.edit.npnetsEditPlugin;
import ru.mathtech.npntool.npnets.highlevelnets.common.provider.INetElementItemProvider;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNPackage;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.NPNetsFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokenexpressions.TokenExpressionsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.hlpn.HighLevelPetriNet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HighLevelPetriNetItemProvider
	extends INetElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighLevelPetriNetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(HLPNPackage.Literals.CONTEXT_VARIABLE__VARIABLES);
			childrenFeatures.add(HLPNPackage.Literals.HIGH_LEVEL_PETRI_NET__NODES);
			childrenFeatures.add(HLPNPackage.Literals.HIGH_LEVEL_PETRI_NET__ARCS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns HighLevelPetriNet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HighLevelPetriNet")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HighLevelPetriNet)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HighLevelPetriNet_type") : //$NON-NLS-1$
			getString("_UI_HighLevelPetriNet_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(HighLevelPetriNet.class)) {
			case HLPNPackage.HIGH_LEVEL_PETRI_NET__VARIABLES:
			case HLPNPackage.HIGH_LEVEL_PETRI_NET__NODES:
			case HLPNPackage.HIGH_LEVEL_PETRI_NET__ARCS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(HLPNPackage.Literals.CONTEXT_VARIABLE__VARIABLES,
				 TokenExpressionsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(HLPNPackage.Literals.HIGH_LEVEL_PETRI_NET__NODES,
				 HLPNFactory.eINSTANCE.createPlace()));

		newChildDescriptors.add
			(createChildParameter
				(HLPNPackage.Literals.HIGH_LEVEL_PETRI_NET__NODES,
				 HLPNFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(HLPNPackage.Literals.HIGH_LEVEL_PETRI_NET__NODES,
				 NPNetsFactory.eINSTANCE.createTransitionSynchronized()));

		newChildDescriptors.add
			(createChildParameter
				(HLPNPackage.Literals.HIGH_LEVEL_PETRI_NET__ARCS,
				 HLPNFactory.eINSTANCE.createArcPT()));

		newChildDescriptors.add
			(createChildParameter
				(HLPNPackage.Literals.HIGH_LEVEL_PETRI_NET__ARCS,
				 HLPNFactory.eINSTANCE.createArcTP()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return npnetsEditPlugin.INSTANCE;
	}

}
