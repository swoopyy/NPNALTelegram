/**
 */
package ru.mathtech.npntool.npnets.highlevelnets.tokentypes.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.HLPNFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesFactory;
import ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypesPackage;
import ru.mathtech.npntool.npnets.npndiagrams.NPNDiagramsFactory;

/**
 * This is the item provider adapter for a {@link ru.mathtech.npntool.npnets.highlevelnets.tokentypes.TokenTypeElementNet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenTypeElementNetItemProvider
	extends TokenTypeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTypeElementNetItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(TokenTypesPackage.Literals.TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS);
			childrenFeatures.add(TokenTypesPackage.Literals.TOKEN_TYPE_ELEMENT_NET__NET);
			childrenFeatures.add(TokenTypesPackage.Literals.TOKEN_TYPE_ELEMENT_NET__DIAGRAM);
			childrenFeatures.add(TokenTypesPackage.Literals.TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS);
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
	 * This returns TokenTypeElementNet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TokenTypeElementNet")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TokenTypeElementNet)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TokenTypeElementNet_type") : //$NON-NLS-1$
			getString("_UI_TokenTypeElementNet_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(TokenTypeElementNet.class)) {
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS:
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__NET:
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__DIAGRAM:
			case TokenTypesPackage.TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS:
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
				(TokenTypesPackage.Literals.TOKEN_TYPE_ELEMENT_NET__ELEMENT_NET_MARKEDS,
				 TokenTypesFactory.eINSTANCE.createElementNetMarked()));

		newChildDescriptors.add
			(createChildParameter
				(TokenTypesPackage.Literals.TOKEN_TYPE_ELEMENT_NET__NET,
				 HLPNFactory.eINSTANCE.createHighLevelPetriNet()));
		newChildDescriptors.add
		(createChildParameter
			(TokenTypesPackage.Literals.TOKEN_TYPE_ELEMENT_NET__DIAGRAM,
			 NPNDiagramsFactory.eINSTANCE.createNPNDiagramNetSystem()));

		newChildDescriptors.add
			(createChildParameter
				(TokenTypesPackage.Literals.TOKEN_TYPE_ELEMENT_NET__TOKEN_NETS,
				 TokenTypesFactory.eINSTANCE.createTokenNet()));
	}

}
