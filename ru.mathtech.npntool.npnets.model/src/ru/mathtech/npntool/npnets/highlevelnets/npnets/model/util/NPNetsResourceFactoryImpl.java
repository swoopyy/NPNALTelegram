/**
* NPNtool: Nested Petri Nets toolset.
*
* Copyright (c) 2013 Leonid Dworzanski. All rights reserved.
*
*/

package ru.mathtech.npntool.npnets.highlevelnets.npnets.model.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see ru.mathtech.npntool.npnets.highlevelnets.npnets.model.util.NPNetsResourceImpl
 * @generated
 */
public class NPNetsResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPNetsResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new NPNetsResourceImpl(uri);
		return result;
	}

} //NPNetsResourceFactoryImpl
