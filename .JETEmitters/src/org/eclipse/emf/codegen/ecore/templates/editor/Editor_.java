package org.eclipse.emf.codegen.ecore.templates.editor;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class Editor_
{
  protected static String nl;
  public static synchronized Editor_ create(String lineSeparator)
  {
    nl = lineSeparator;
    Editor_ result = new Editor_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**" + NL + "* NPNtool: Nested Petri Nets toolset." + NL + "*" + NL + "* Copyright (c) 2013 Leonid Dworzanski. All rights reserved." + NL + "*" + NL + "*/" + NL + "" + NL + "package ";
  protected final String TEXT_3 = ";" + NL + "" + NL + "" + NL + "import java.io.IOException;" + NL + "import java.io.InputStream;" + NL + "" + NL + "import java.util.ArrayList;" + NL + "import java.util.Collection;" + NL + "import java.util.Collections;" + NL + "import java.util.EventObject;" + NL + "import java.util.HashMap;" + NL + "import java.util.Iterator;" + NL + "import java.util.LinkedHashMap;" + NL + "import java.util.List;" + NL + "import java.util.Map;";
  protected final String TEXT_4 = NL + NL + "import org.eclipse.core.resources.IFile;" + NL + "import org.eclipse.core.resources.IMarker;" + NL + "import org.eclipse.core.resources.IResource;" + NL + "import org.eclipse.core.resources.IResourceChangeEvent;" + NL + "import org.eclipse.core.resources.IResourceChangeListener;" + NL + "import org.eclipse.core.resources.IResourceDelta;" + NL + "import org.eclipse.core.resources.IResourceDeltaVisitor;" + NL + "import org.eclipse.core.resources.ResourcesPlugin;";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "import org.eclipse.core.runtime.CoreException;" + NL + "import org.eclipse.core.runtime.IPath;";
  protected final String TEXT_7 = NL + "import org.eclipse.core.runtime.IProgressMonitor;" + NL + "import org.eclipse.core.runtime.NullProgressMonitor;" + NL + "" + NL + "import org.eclipse.jface.action.IMenuListener;" + NL + "import org.eclipse.jface.action.IMenuManager;" + NL + "import org.eclipse.jface.action.IStatusLineManager;" + NL + "import org.eclipse.jface.action.IToolBarManager;" + NL + "import org.eclipse.jface.action.MenuManager;" + NL + "import org.eclipse.jface.action.Separator;" + NL + "" + NL + "import org.eclipse.jface.dialogs.MessageDialog;" + NL + "import org.eclipse.jface.dialogs.ProgressMonitorDialog;" + NL;
  protected final String TEXT_8 = NL + "import org.eclipse.jface.util.LocalSelectionTransfer;" + NL;
  protected final String TEXT_9 = NL + "import org.eclipse.jface.viewers.ColumnWeightData;";
  protected final String TEXT_10 = NL + "import org.eclipse.jface.viewers.ISelection;" + NL + "import org.eclipse.jface.viewers.ISelectionChangedListener;" + NL + "import org.eclipse.jface.viewers.ISelectionProvider;" + NL + "import org.eclipse.jface.viewers.IStructuredSelection;";
  protected final String TEXT_11 = NL + "import org.eclipse.jface.viewers.ListViewer;";
  protected final String TEXT_12 = NL + "import org.eclipse.jface.viewers.SelectionChangedEvent;" + NL + "import org.eclipse.jface.viewers.StructuredSelection;" + NL + "import org.eclipse.jface.viewers.StructuredViewer;";
  protected final String TEXT_13 = NL + "import org.eclipse.jface.viewers.TableLayout;" + NL + "import org.eclipse.jface.viewers.TableViewer;";
  protected final String TEXT_14 = NL + "import org.eclipse.jface.viewers.TreeViewer;" + NL + "import org.eclipse.jface.viewers.Viewer;" + NL + "" + NL + "import org.eclipse.swt.SWT;" + NL + "" + NL + "import org.eclipse.swt.custom.CTabFolder;" + NL + "" + NL + "import org.eclipse.swt.dnd.DND;";
  protected final String TEXT_15 = NL + "import org.eclipse.swt.dnd.FileTransfer;";
  protected final String TEXT_16 = NL + "import org.eclipse.swt.dnd.Transfer;" + NL + "" + NL + "import org.eclipse.swt.events.ControlAdapter;" + NL + "import org.eclipse.swt.events.ControlEvent;" + NL + "" + NL + "import org.eclipse.swt.graphics.Point;";
  protected final String TEXT_17 = NL + NL + "import org.eclipse.swt.layout.FillLayout;";
  protected final String TEXT_18 = NL + NL + "import org.eclipse.swt.widgets.Composite;" + NL + "import org.eclipse.swt.widgets.Menu;";
  protected final String TEXT_19 = NL + "import org.eclipse.swt.widgets.Table;" + NL + "import org.eclipse.swt.widgets.TableColumn;";
  protected final String TEXT_20 = NL + "import org.eclipse.swt.widgets.Tree;";
  protected final String TEXT_21 = NL + "import org.eclipse.swt.widgets.TreeColumn;";
  protected final String TEXT_22 = NL + NL + "import org.eclipse.ui.IActionBars;" + NL + "import org.eclipse.ui.IEditorInput;" + NL + "import org.eclipse.ui.IEditorPart;" + NL + "import org.eclipse.ui.IEditorSite;";
  protected final String TEXT_23 = NL + "import org.eclipse.ui.IFileEditorInput;";
  protected final String TEXT_24 = NL + "import org.eclipse.ui.IPartListener;" + NL + "import org.eclipse.ui.IWorkbenchPart;" + NL + "import org.eclipse.ui.PartInitException;";
  protected final String TEXT_25 = NL + NL + "import org.eclipse.ui.dialogs.SaveAsDialog;" + NL + "" + NL + "import org.eclipse.ui.ide.IGotoMarker;";
  protected final String TEXT_26 = NL;
  protected final String TEXT_27 = NL + "import org.eclipse.ui.part.FileEditorInput;";
  protected final String TEXT_28 = NL + "import org.eclipse.ui.part.MultiPageEditorPart;" + NL + "" + NL + "import org.eclipse.ui.views.contentoutline.ContentOutline;" + NL + "import org.eclipse.ui.views.contentoutline.ContentOutlinePage;" + NL + "import org.eclipse.ui.views.contentoutline.IContentOutlinePage;" + NL + "" + NL + "import org.eclipse.ui.views.properties.IPropertySheetPage;" + NL + "import org.eclipse.ui.views.properties.PropertySheet;" + NL + "import org.eclipse.ui.views.properties.PropertySheetPage;" + NL + "" + NL + "import org.eclipse.emf.common.command.BasicCommandStack;" + NL + "import org.eclipse.emf.common.command.Command;" + NL + "import org.eclipse.emf.common.command.CommandStack;" + NL + "import org.eclipse.emf.common.command.CommandStackListener;" + NL + "" + NL + "import org.eclipse.emf.common.notify.AdapterFactory;" + NL + "import org.eclipse.emf.common.notify.Notification;" + NL;
  protected final String TEXT_29 = NL + "import org.eclipse.emf.common.ui.MarkerHelper;";
  protected final String TEXT_30 = NL + "import org.eclipse.emf.common.ui.ViewerPane;";
  protected final String TEXT_31 = NL + NL + "import org.eclipse.emf.common.ui.editor.ProblemEditorPart;" + NL + "" + NL + "import org.eclipse.emf.common.ui.viewer.IViewerProvider;" + NL + "" + NL + "import org.eclipse.emf.common.util.BasicDiagnostic;" + NL + "import org.eclipse.emf.common.util.Diagnostic;" + NL + "import org.eclipse.emf.common.util.URI;" + NL;
  protected final String TEXT_32 = NL + "import org.eclipse.emf.ecore.EObject;" + NL + "import org.eclipse.emf.ecore.EValidator;";
  protected final String TEXT_33 = NL + NL + "import org.eclipse.emf.ecore.resource.Resource;";
  protected final String TEXT_34 = NL + "import org.eclipse.emf.ecore.resource.ResourceSet;";
  protected final String TEXT_35 = NL + NL + "import org.eclipse.emf.ecore.util.EContentAdapter;" + NL + "import org.eclipse.emf.ecore.util.EcoreUtil;" + NL + "" + NL + "import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;" + NL + "import org.eclipse.emf.edit.domain.EditingDomain;" + NL + "import org.eclipse.emf.edit.domain.IEditingDomainProvider;" + NL + "" + NL + "import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;" + NL + "import org.eclipse.emf.edit.provider.ComposedAdapterFactory;" + NL + "import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;" + NL + "" + NL + "import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;" + NL + "" + NL + "import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;" + NL + "" + NL + "import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;" + NL + "" + NL + "import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;" + NL + "import org.eclipse.emf.edit.ui.dnd.LocalTransfer;" + NL + "import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;" + NL + "" + NL + "import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;" + NL + "import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;";
  protected final String TEXT_36 = NL + "import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;";
  protected final String TEXT_37 = NL + NL + "import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;";
  protected final String TEXT_38 = NL + "import org.eclipse.emf.edit.ui.util.EditUIUtil;";
  protected final String TEXT_39 = NL + NL + "import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;" + NL + "" + NL + "import ";
  protected final String TEXT_40 = ";" + NL;
  protected final String TEXT_41 = NL + NL + NL + "/**" + NL + " * This is an example of a ";
  protected final String TEXT_42 = " model editor." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_43 = NL + "\textends MultiPageEditorPart" + NL + "\timplements IEditingDomainProvider, ISelectionProvider, IMenuListener, IViewerProvider";
  protected final String TEXT_44 = ", IGotoMarker";
  protected final String TEXT_45 = NL + "{";
  protected final String TEXT_46 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_47 = " copyright = ";
  protected final String TEXT_48 = ";";
  protected final String TEXT_49 = NL;
  protected final String TEXT_50 = NL + "\t/**" + NL + "\t * The filters for file extensions supported by the editor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_51 = NL + "\tpublic static final ";
  protected final String TEXT_52 = " FILE_EXTENSION_FILTERS = prefixExtensions(";
  protected final String TEXT_53 = ".FILE_EXTENSIONS, \"*.\");";
  protected final String TEXT_54 = NL + "\t";
  protected final String TEXT_55 = NL + "\tpublic static final ";
  protected final String TEXT_56 = " FILE_EXTENSION_FILTERS = prefixExtensions(";
  protected final String TEXT_57 = ".asList(";
  protected final String TEXT_58 = ".INSTANCE.getString(\"_UI_";
  protected final String TEXT_59 = "FilenameExtensions\").split(\"\\\\s*,\\\\s*\")), \"*.\");";
  protected final String TEXT_60 = NL + "\t";
  protected final String TEXT_61 = NL + "\t/**" + NL + "\t * Returns a new unmodifiable list containing prefixed versions of the extensions in the given list." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static ";
  protected final String TEXT_62 = " prefixExtensions(";
  protected final String TEXT_63 = " extensions, String prefix)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_64 = " result = new ";
  protected final String TEXT_65 = "();";
  protected final String TEXT_66 = NL + "\t\tfor (String extension : extensions)" + NL + "\t\t{" + NL + "\t\t\tresult.add(prefix + extension);";
  protected final String TEXT_67 = NL + "\t\tfor (Iterator iterator = extensions.iterator() ; iterator.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\tresult.add(prefix + (String)iterator.next());";
  protected final String TEXT_68 = NL + "\t\t}" + NL + "\t\treturn Collections.unmodifiableList(result);" + NL + "\t}" + NL;
  protected final String TEXT_69 = NL + "\t/**" + NL + "\t * This keeps track of the editing domain that is used to track all changes to the model." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected AdapterFactoryEditingDomain editingDomain;" + NL + "" + NL + "\t/**" + NL + "\t * This is the one adapter factory used for providing views of the model." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ComposedAdapterFactory adapterFactory;" + NL + "" + NL + "\t/**" + NL + "\t * This is the content outline page." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IContentOutlinePage contentOutlinePage;" + NL + "" + NL + "\t/**" + NL + "\t * This is a kludge..." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IStatusLineManager contentOutlineStatusLineManager;" + NL + "" + NL + "\t/**" + NL + "\t * This is the content outline page's viewer." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected TreeViewer contentOutlineViewer;" + NL + "" + NL + "\t/**" + NL + "\t * This is the property sheet page." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_70 = " propertySheetPages = new ";
  protected final String TEXT_71 = "();" + NL + "" + NL + "\t/**" + NL + "\t * This is the viewer that shadows the selection in the content outline." + NL + "\t * The parent relation must be correctly defined for this to work." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected TreeViewer selectionViewer;";
  protected final String TEXT_72 = NL + NL + "\t/**" + NL + "\t * This inverts the roll of parent and child in the content provider and show parents as a tree." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected TreeViewer parentViewer;" + NL + "" + NL + "\t/**" + NL + "\t * This shows how a tree view works." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected TreeViewer treeViewer;" + NL + "" + NL + "\t/**" + NL + "\t * This shows how a list view works." + NL + "\t * A list viewer doesn't support icons." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ListViewer listViewer;" + NL + "" + NL + "\t/**" + NL + "\t * This shows how a table view works." + NL + "\t * A table can be used as a list with icons." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected TableViewer tableViewer;" + NL + "" + NL + "\t/**" + NL + "\t * This shows how a tree view with columns works." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected TreeViewer treeViewerWithColumns;" + NL + "" + NL + "\t/**" + NL + "\t * This keeps track of the active viewer pane, in the book." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ViewerPane currentViewerPane;";
  protected final String TEXT_73 = NL + NL + "\t/**" + NL + "\t * This keeps track of the active content viewer, which may be either one of the viewers in the pages or the content outline viewer." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Viewer currentViewer;" + NL + "" + NL + "\t/**" + NL + "\t * This listens to which ever viewer is active." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ISelectionChangedListener selectionChangedListener;" + NL + "" + NL + "\t/**" + NL + "\t * This keeps track of all the {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are listening to this editor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_74 = " selectionChangedListeners = new ";
  protected final String TEXT_75 = "();" + NL + "" + NL + "\t/**" + NL + "\t * This keeps track of the selection of the editor as a whole." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ISelection editorSelection = StructuredSelection.EMPTY;" + NL;
  protected final String TEXT_76 = NL + "\t/**" + NL + "\t * The MarkerHelper is responsible for creating workspace resource markers presented" + NL + "\t * in Eclipse's Problems View." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected MarkerHelper markerHelper = new EditUIMarkerHelper();" + NL;
  protected final String TEXT_77 = NL + "\t/**" + NL + "\t * This listens for when the outline becomes active" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IPartListener partListener =" + NL + "\t\tnew IPartListener()" + NL + "\t\t{" + NL + "\t\t\tpublic void partActivated(IWorkbenchPart p)" + NL + "\t\t\t{" + NL + "\t\t\t\tif (p instanceof ContentOutline)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tif (((ContentOutline)p).getCurrentPage() == contentOutlinePage)" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tgetActionBarContributor().setActiveEditor(";
  protected final String TEXT_78 = ".this);" + NL + "" + NL + "\t\t\t\t\t\tsetCurrentViewer(contentOutlineViewer);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t\telse if (p instanceof PropertySheet)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tif (propertySheetPages.contains(((PropertySheet)p).getCurrentPage()))" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tgetActionBarContributor().setActiveEditor(";
  protected final String TEXT_79 = ".this);" + NL + "\t\t\t\t\t\thandleActivate();" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t\telse if (p == ";
  protected final String TEXT_80 = ".this)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\thandleActivate();" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\tpublic void partBroughtToTop(IWorkbenchPart p)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Ignore." + NL + "\t\t\t}" + NL + "\t\t\tpublic void partClosed(IWorkbenchPart p)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Ignore." + NL + "\t\t\t}" + NL + "\t\t\tpublic void partDeactivated(IWorkbenchPart p)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Ignore." + NL + "\t\t\t}" + NL + "\t\t\tpublic void partOpened(IWorkbenchPart p)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Ignore." + NL + "\t\t\t}" + NL + "\t\t};" + NL + "" + NL + "\t/**" + NL + "\t * Resources that have been removed since last activation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_81 = " removedResources = new ";
  protected final String TEXT_82 = "();" + NL + "" + NL + "\t/**" + NL + "\t * Resources that have been changed since last activation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_83 = " changedResources = new ";
  protected final String TEXT_84 = "();" + NL + "" + NL + "\t/**" + NL + "\t * Resources that have been saved." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_85 = " savedResources = new ";
  protected final String TEXT_86 = "();" + NL + "" + NL + "\t/**" + NL + "\t * Map to store the diagnostic associated with a resource." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_87 = " resourceToDiagnosticMap = new ";
  protected final String TEXT_88 = "();" + NL + "" + NL + "\t/**" + NL + "\t * Controls whether the problem indication should be updated." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected boolean updateProblemIndication = true;" + NL + "" + NL + "\t/**" + NL + "\t * Adapter used to update the problem indication when resources are demanded loaded." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected EContentAdapter problemIndicationAdapter =" + NL + "\t\tnew EContentAdapter()" + NL + "\t\t{";
  protected final String TEXT_89 = NL + "\t\t\t@Override";
  protected final String TEXT_90 = NL + "\t\t\tpublic void notifyChanged(Notification notification)" + NL + "\t\t\t{" + NL + "\t\t\t\tif (notification.getNotifier() instanceof Resource)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tswitch (notification.getFeatureID(Resource.class))" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tcase Resource.RESOURCE__IS_LOADED:" + NL + "\t\t\t\t\t\tcase Resource.RESOURCE__ERRORS:" + NL + "\t\t\t\t\t\tcase Resource.RESOURCE__WARNINGS:" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tResource resource = (Resource)notification.getNotifier();" + NL + "\t\t\t\t\t\t\tDiagnostic diagnostic = analyzeResourceProblems(resource, null);" + NL + "\t\t\t\t\t\t\tif (diagnostic.getSeverity() != Diagnostic.OK)" + NL + "\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\tresourceToDiagnosticMap.put(resource, diagnostic);" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\telse" + NL + "\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\tresourceToDiagnosticMap.remove(resource);" + NL + "\t\t\t\t\t\t\t}" + NL + "" + NL + "\t\t\t\t\t\t\tif (updateProblemIndication)" + NL + "\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\tgetSite().getShell().getDisplay().asyncExec" + NL + "\t\t\t\t\t\t\t\t\t(new Runnable()" + NL + "\t\t\t\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t\t\t\t public void run()" + NL + "\t\t\t\t\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t\t\t\t\t updateProblemIndication();" + NL + "\t\t\t\t\t\t\t\t\t\t }" + NL + "\t\t\t\t\t\t\t\t\t });" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\tbreak;" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t\telse" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tsuper.notifyChanged(notification);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL;
  protected final String TEXT_91 = NL + "\t\t\t@Override";
  protected final String TEXT_92 = NL + "\t\t\tprotected void setTarget(Resource target)" + NL + "\t\t\t{" + NL + "\t\t\t\tbasicSetTarget(target);" + NL + "\t\t\t}" + NL;
  protected final String TEXT_93 = NL + "\t\t\t@Override";
  protected final String TEXT_94 = NL + "\t\t\tprotected void unsetTarget(Resource target)" + NL + "\t\t\t{" + NL + "\t\t\t\tbasicUnsetTarget(target);" + NL + "\t\t\t\tresourceToDiagnosticMap.remove(target);" + NL + "\t\t\t\tif (updateProblemIndication)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tgetSite().getShell().getDisplay().asyncExec" + NL + "\t\t\t\t\t\t(new Runnable()" + NL + "\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t public void run()" + NL + "\t\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t\t updateProblemIndication();" + NL + "\t\t\t\t\t\t\t }" + NL + "\t\t\t\t\t\t });" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t};";
  protected final String TEXT_95 = NL + NL + "\t/**" + NL + "\t * This listens for workspace changes." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IResourceChangeListener resourceChangeListener =" + NL + "\t\tnew IResourceChangeListener()" + NL + "\t\t{" + NL + "\t\t\tpublic void resourceChanged(IResourceChangeEvent event)" + NL + "\t\t\t{" + NL + "\t\t\t\tIResourceDelta delta = event.getDelta();" + NL + "\t\t\t\ttry" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tclass ResourceDeltaVisitor implements IResourceDeltaVisitor" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tprotected ResourceSet resourceSet = editingDomain.getResourceSet();" + NL + "\t\t\t\t\t\tprotected ";
  protected final String TEXT_96 = " changedResources = new ";
  protected final String TEXT_97 = "();" + NL + "\t\t\t\t\t\tprotected ";
  protected final String TEXT_98 = " removedResources = new ";
  protected final String TEXT_99 = "();" + NL + "" + NL + "\t\t\t\t\t\tpublic boolean visit(";
  protected final String TEXT_100 = "final ";
  protected final String TEXT_101 = "IResourceDelta delta)" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tif (delta.getResource().getType() == IResource.FILE)" + NL + "\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\tif (delta.getKind() == IResourceDelta.REMOVED ||" + NL + "\t\t\t\t\t\t\t\t    delta.getKind() == IResourceDelta.CHANGED";
  protected final String TEXT_102 = " && delta.getFlags() != IResourceDelta.MARKERS";
  protected final String TEXT_103 = ")" + NL + "\t\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_104 = "final ";
  protected final String TEXT_105 = "Resource resource = resourceSet.getResource(URI.createPlatformResourceURI(delta.getFullPath().toString(), true), false);" + NL + "\t\t\t\t\t\t\t\t\tif (resource != null)" + NL + "\t\t\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\t\t\tif (delta.getKind() == IResourceDelta.REMOVED)" + NL + "\t\t\t\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\t\t\t\tremovedResources.add(resource);" + NL + "\t\t\t\t\t\t\t\t\t\t}";
  protected final String TEXT_106 = NL + "\t\t\t\t\t\t\t\t\t\telse if (!savedResources.remove(resource))" + NL + "\t\t\t\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\t\t\t\tchangedResources.add(resource);" + NL + "\t\t\t\t\t\t\t\t\t\t}";
  protected final String TEXT_107 = NL + "\t\t\t\t\t\t\t\t\t\telse" + NL + "\t\t\t\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\t\t\t\tif ((delta.getFlags() & IResourceDelta.MARKERS) != 0)" + NL + "\t\t\t\t\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_108 = ".DiagnosticAdapter.update(resource, markerHelper.getMarkerDiagnostics(resource, (IFile)delta.getResource()";
  protected final String TEXT_109 = ", false";
  protected final String TEXT_110 = "));" + NL + "\t\t\t\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\t\t\t\tif ((delta.getFlags() & IResourceDelta.CONTENT) != 0)" + NL + "\t\t\t\t\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\t\t\t\t\tif (!savedResources.remove(resource))" + NL + "\t\t\t\t\t\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\t\t\t\t\t\tchangedResources.add(resource);" + NL + "\t\t\t\t\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\t\t\t}";
  protected final String TEXT_111 = NL + "\t\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\treturn false;" + NL + "\t\t\t\t\t\t\t}" + NL + "" + NL + "\t\t\t\t\t\t\treturn true;" + NL + "\t\t\t\t\t\t}" + NL + "" + NL + "\t\t\t\t\t\tpublic ";
  protected final String TEXT_112 = " getChangedResources()" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\treturn changedResources;" + NL + "\t\t\t\t\t\t}" + NL + "" + NL + "\t\t\t\t\t\tpublic ";
  protected final String TEXT_113 = " getRemovedResources()" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\treturn removedResources;" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "" + NL + "\t\t\t\t\tfinal ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();" + NL + "\t\t\t\t\tdelta.accept(visitor);" + NL + "" + NL + "\t\t\t\t\tif (!visitor.getRemovedResources().isEmpty())" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tgetSite().getShell().getDisplay().asyncExec" + NL + "\t\t\t\t\t\t\t(new Runnable()" + NL + "\t\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t\t public void run()" + NL + "\t\t\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t\t\t removedResources.addAll(visitor.getRemovedResources());" + NL + "\t\t\t\t\t\t\t\t\t if (!isDirty())" + NL + "\t\t\t\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t\t\t\t getSite().getPage().closeEditor(";
  protected final String TEXT_114 = ".this, false);" + NL + "\t\t\t\t\t\t\t\t\t }" + NL + "\t\t\t\t\t\t\t\t }" + NL + "\t\t\t\t\t\t\t });" + NL + "\t\t\t\t\t}" + NL + "" + NL + "\t\t\t\t\tif (!visitor.getChangedResources().isEmpty())" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tgetSite().getShell().getDisplay().asyncExec" + NL + "\t\t\t\t\t\t\t(new Runnable()" + NL + "\t\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t\t public void run()" + NL + "\t\t\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t\t\t changedResources.addAll(visitor.getChangedResources());" + NL + "\t\t\t\t\t\t\t\t\t if (getSite().getPage().getActiveEditor() == ";
  protected final String TEXT_115 = ".this)" + NL + "\t\t\t\t\t\t\t\t\t {" + NL + "\t\t\t\t\t\t\t\t\t\t handleActivate();" + NL + "\t\t\t\t\t\t\t\t\t }" + NL + "\t\t\t\t\t\t\t\t }" + NL + "\t\t\t\t\t\t\t });" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t\tcatch (CoreException exception)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_116 = ".INSTANCE.log(exception);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t};";
  protected final String TEXT_117 = NL + NL + "\t/**" + NL + "\t * Handles activation of the editor or it's associated views." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void handleActivate()" + NL + "\t{" + NL + "\t\t// Recompute the read only state." + NL + "\t\t//" + NL + "\t\tif (editingDomain.getResourceToReadOnlyMap() != null)" + NL + "\t\t{" + NL + "\t\t  editingDomain.getResourceToReadOnlyMap().clear();" + NL + "" + NL + "\t\t  // Refresh any actions that may become enabled or disabled." + NL + "\t\t  //" + NL + "\t\t  setSelection(getSelection());" + NL + "\t\t}" + NL + "" + NL + "\t\tif (!removedResources.isEmpty())" + NL + "\t\t{" + NL + "\t\t\tif (handleDirtyConflict())" + NL + "\t\t\t{" + NL + "\t\t\t\tgetSite().getPage().closeEditor(";
  protected final String TEXT_118 = ".this, false);" + NL + "\t\t\t}" + NL + "\t\t\telse" + NL + "\t\t\t{" + NL + "\t\t\t\tremovedResources.clear();" + NL + "\t\t\t\tchangedResources.clear();" + NL + "\t\t\t\tsavedResources.clear();" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\telse if (!changedResources.isEmpty())" + NL + "\t\t{" + NL + "\t\t\tchangedResources.removeAll(savedResources);" + NL + "\t\t\thandleChangedResources();" + NL + "\t\t\tchangedResources.clear();" + NL + "\t\t\tsavedResources.clear();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Handles what to do with changed resources on activation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void handleChangedResources()" + NL + "\t{" + NL + "\t\tif (!changedResources.isEmpty() && (!isDirty() || handleDirtyConflict()))" + NL + "\t\t{" + NL + "\t\t\tif (isDirty())" + NL + "\t\t\t{" + NL + "\t\t\t\tchangedResources.addAll(editingDomain.getResourceSet().getResources());" + NL + "\t\t\t}" + NL + "\t\t\teditingDomain.getCommandStack().flush();" + NL + "" + NL + "\t\t\tupdateProblemIndication = false;";
  protected final String TEXT_119 = NL + "\t\t\tfor (Resource resource : changedResources)";
  protected final String TEXT_120 = NL + "\t\t\tfor (Iterator i = changedResources.iterator(); i.hasNext(); )";
  protected final String TEXT_121 = NL + "\t\t\t{";
  protected final String TEXT_122 = NL + "\t\t\t\tResource resource = (Resource)i.next();";
  protected final String TEXT_123 = NL + "\t\t\t\tif (resource.isLoaded())" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tresource.unload();" + NL + "\t\t\t\t\ttry" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tresource.load(Collections.EMPTY_MAP);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tcatch (IOException exception)" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tif (!resourceToDiagnosticMap.containsKey(resource))" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tresourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL;
  protected final String TEXT_124 = NL + "\t\t\tif (AdapterFactoryEditingDomain.isStale(editorSelection))" + NL + "\t\t\t{" + NL + "\t\t\t\tsetSelection(StructuredSelection.EMPTY);" + NL + "\t\t\t}";
  protected final String TEXT_125 = NL + NL + "\t\t\tupdateProblemIndication = true;" + NL + "\t\t\tupdateProblemIndication();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Updates the problems indication with the information described in the specified diagnostic." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void updateProblemIndication()" + NL + "\t{" + NL + "\t\tif (updateProblemIndication)" + NL + "\t\t{" + NL + "\t\t\tBasicDiagnostic diagnostic =" + NL + "\t\t\t\tnew BasicDiagnostic" + NL + "\t\t\t\t\t(Diagnostic.OK," + NL + "\t\t\t\t\t \"";
  protected final String TEXT_126 = "\",";
  protected final String TEXT_127 = NL + "\t\t\t\t\t 0," + NL + "\t\t\t\t\t null," + NL + "\t\t\t\t\t new Object [] { editingDomain.getResourceSet() });";
  protected final String TEXT_128 = NL + "\t\t\tfor (Diagnostic childDiagnostic : resourceToDiagnosticMap.values())";
  protected final String TEXT_129 = NL + "\t\t\tfor (Iterator i = resourceToDiagnosticMap.values().iterator(); i.hasNext(); )";
  protected final String TEXT_130 = NL + "\t\t\t{";
  protected final String TEXT_131 = NL + "\t\t\t\tDiagnostic childDiagnostic = (Diagnostic)i.next();";
  protected final String TEXT_132 = NL + "\t\t\t\tif (childDiagnostic.getSeverity() != Diagnostic.OK)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tdiagnostic.add(childDiagnostic);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tint lastEditorPage = getPageCount() - 1;" + NL + "\t\t\tif (lastEditorPage >= 0 && getEditor(lastEditorPage) instanceof ProblemEditorPart)" + NL + "\t\t\t{" + NL + "\t\t\t\t((ProblemEditorPart)getEditor(lastEditorPage)).setDiagnostic(diagnostic);" + NL + "\t\t\t\tif (diagnostic.getSeverity() != Diagnostic.OK)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tsetActivePage(lastEditorPage);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\telse if (diagnostic.getSeverity() != Diagnostic.OK)" + NL + "\t\t\t{" + NL + "\t\t\t\tProblemEditorPart problemEditorPart = new ProblemEditorPart();" + NL + "\t\t\t\tproblemEditorPart.setDiagnostic(diagnostic);";
  protected final String TEXT_133 = NL + "\t\t\t\tproblemEditorPart.setMarkerHelper(markerHelper);";
  protected final String TEXT_134 = NL + "\t\t\t\ttry" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\taddPage(++lastEditorPage, problemEditorPart, getEditorInput());" + NL + "\t\t\t\t\tsetPageText(lastEditorPage, problemEditorPart.getPartName());" + NL + "\t\t\t\t\tsetActivePage(lastEditorPage);" + NL + "\t\t\t\t\tshowTabs();" + NL + "\t\t\t\t}" + NL + "\t\t\t\tcatch (PartInitException exception)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_135 = ".INSTANCE.log(exception);" + NL + "\t\t\t\t}" + NL + "\t\t\t}";
  protected final String TEXT_136 = NL + NL + "\t\t\tif (markerHelper.hasMarkers(editingDomain.getResourceSet()))" + NL + "\t\t\t{" + NL + "\t\t\t\tmarkerHelper.deleteMarkers(editingDomain.getResourceSet());" + NL + "\t\t\t\tif (diagnostic.getSeverity() != Diagnostic.OK)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\ttry" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tmarkerHelper.createMarkers(diagnostic);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tcatch (CoreException exception)" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_137 = ".INSTANCE.log(exception);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t}";
  protected final String TEXT_138 = NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Shows a dialog that asks if conflicting changes should be discarded." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected boolean handleDirtyConflict()" + NL + "\t{" + NL + "\t\treturn" + NL + "\t\t\tMessageDialog.openQuestion" + NL + "\t\t\t\t(getSite().getShell()," + NL + "\t\t\t\t getString(\"_UI_FileConflict_label\"),";
  protected final String TEXT_139 = NL + "\t\t\t\t getString(\"_WARN_FileConflict\"));";
  protected final String TEXT_140 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This creates a model editor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_141 = "()" + NL + "\t{" + NL + "\t\tsuper();" + NL + "\t\tinitializeEditingDomain();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This sets up the editing domain for the model editor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void initializeEditingDomain()" + NL + "\t{" + NL + "\t\t// Create an adapter factory that yields item providers." + NL + "\t\t//" + NL + "\t\tadapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);" + NL + "" + NL + "\t\tadapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());";
  protected final String TEXT_142 = NL + "\t\tadapterFactory.addAdapterFactory(new ";
  protected final String TEXT_143 = "());";
  protected final String TEXT_144 = NL + "\t\tadapterFactory.addAdapterFactory(new ";
  protected final String TEXT_145 = "());";
  protected final String TEXT_146 = NL + "\t\tadapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());" + NL + "" + NL + "\t\t// Create the command stack that will notify this editor as commands are executed." + NL + "\t\t//" + NL + "\t\tBasicCommandStack commandStack = new BasicCommandStack();" + NL + "" + NL + "\t\t// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus." + NL + "\t\t//" + NL + "\t\tcommandStack.addCommandStackListener" + NL + "\t\t\t(new CommandStackListener()" + NL + "\t\t\t {" + NL + "\t\t\t\t public void commandStackChanged(final EventObject event)" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t getContainer().getDisplay().asyncExec" + NL + "\t\t\t\t\t\t (new Runnable()" + NL + "\t\t\t\t\t\t  {" + NL + "\t\t\t\t\t\t\t  public void run()" + NL + "\t\t\t\t\t\t\t  {" + NL + "\t\t\t\t\t\t\t\t  firePropertyChange(IEditorPart.PROP_DIRTY);" + NL + "" + NL + "\t\t\t\t\t\t\t\t  // Try to select the affected objects." + NL + "\t\t\t\t\t\t\t\t  //" + NL + "\t\t\t\t\t\t\t\t  Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();" + NL + "\t\t\t\t\t\t\t\t  if (mostRecentCommand != null)" + NL + "\t\t\t\t\t\t\t\t  {" + NL + "\t\t\t\t\t\t\t\t\t  setSelectionToViewer(mostRecentCommand.getAffectedObjects());" + NL + "\t\t\t\t\t\t\t\t  }" + NL + "\t\t\t\t\t\t\t\t  for (Iterator";
  protected final String TEXT_147 = "<PropertySheetPage>";
  protected final String TEXT_148 = " i = propertySheetPages.iterator(); i.hasNext(); )" + NL + "\t\t\t\t\t\t\t\t  {" + NL + "\t\t\t\t\t\t\t\t\t  PropertySheetPage propertySheetPage = ";
  protected final String TEXT_149 = "(PropertySheetPage)";
  protected final String TEXT_150 = "i.next();" + NL + "\t\t\t\t\t\t\t\t\t  if (propertySheetPage.getControl().isDisposed())" + NL + "\t\t\t\t\t\t\t\t\t  {" + NL + "\t\t\t\t\t\t\t\t\t\t  i.remove();" + NL + "\t\t\t\t\t\t\t\t\t  }" + NL + "\t\t\t\t\t\t\t\t\t  else" + NL + "\t\t\t\t\t\t\t\t\t  {" + NL + "\t\t\t\t\t\t\t\t\t\t  propertySheetPage.refresh();" + NL + "\t\t\t\t\t\t\t\t\t  }" + NL + "\t\t\t\t\t\t\t\t  }" + NL + "\t\t\t\t\t\t\t  }" + NL + "\t\t\t\t\t\t  });" + NL + "\t\t\t\t }" + NL + "\t\t\t });" + NL + "" + NL + "\t\t// Create the editing domain with a special command stack." + NL + "\t\t//" + NL + "\t\teditingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new ";
  protected final String TEXT_151 = "());" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This is here for the listener to be able to call it." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_152 = NL + "\t\t\t@Override";
  protected final String TEXT_153 = NL + "\tprotected void firePropertyChange(int action)" + NL + "\t{" + NL + "\t\tsuper.firePropertyChange(action);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This sets the selection into whichever viewer is active." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setSelectionToViewer(";
  protected final String TEXT_154 = " collection)" + NL + "\t{" + NL + "\t\tfinal ";
  protected final String TEXT_155 = " theSelection = collection;" + NL + "\t\t// Make sure it's okay." + NL + "\t\t//" + NL + "\t\tif (theSelection != null && !theSelection.isEmpty())" + NL + "\t\t{" + NL + "\t\t\tRunnable runnable =" + NL + "\t\t\t\tnew Runnable()" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tpublic void run()" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\t// Try to select the items in the current content viewer of the editor." + NL + "\t\t\t\t\t\t//" + NL + "\t\t\t\t\t\tif (currentViewer != null)" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tcurrentViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t};" + NL + "\t\t\tgetSite().getShell().getDisplay().asyncExec(runnable);" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This returns the editing domain as required by the {@link IEditingDomainProvider} interface." + NL + "\t * This is important for implementing the static methods of {@link AdapterFactoryEditingDomain}" + NL + "\t * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic EditingDomain getEditingDomain()" + NL + "\t{" + NL + "\t\treturn editingDomain;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic class ReverseAdapterFactoryContentProvider extends AdapterFactoryContentProvider" + NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic ReverseAdapterFactoryContentProvider(AdapterFactory adapterFactory)" + NL + "\t\t{" + NL + "\t\t\tsuper(adapterFactory);" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */";
  protected final String TEXT_156 = NL + "\t\t@Override";
  protected final String TEXT_157 = NL + "\t\tpublic Object [] getElements(Object object)" + NL + "\t\t{" + NL + "\t\t\tObject parent = super.getParent(object);" + NL + "\t\t\treturn (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */";
  protected final String TEXT_158 = NL + "\t\t@Override";
  protected final String TEXT_159 = NL + "\t\tpublic Object [] getChildren(Object object)" + NL + "\t\t{" + NL + "\t\t\tObject parent = super.getParent(object);" + NL + "\t\t\treturn (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */";
  protected final String TEXT_160 = NL + "\t\t@Override";
  protected final String TEXT_161 = NL + "\t\tpublic boolean hasChildren(Object object)" + NL + "\t\t{" + NL + "\t\t\tObject parent = super.getParent(object);" + NL + "\t\t\treturn parent != null;" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */";
  protected final String TEXT_162 = NL + "\t\t@Override";
  protected final String TEXT_163 = NL + "\t\tpublic Object getParent(Object object)" + NL + "\t\t{" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_164 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setCurrentViewerPane(ViewerPane viewerPane)" + NL + "\t{" + NL + "\t\tif (currentViewerPane != viewerPane)" + NL + "\t\t{" + NL + "\t\t\tif (currentViewerPane != null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcurrentViewerPane.showFocus(false);" + NL + "\t\t\t}" + NL + "\t\t\tcurrentViewerPane = viewerPane;" + NL + "\t\t}" + NL + "\t\tsetCurrentViewer(currentViewerPane.getViewer());" + NL + "\t}";
  protected final String TEXT_165 = NL + NL + "\t/**" + NL + "\t * This makes sure that one content viewer, either for the current page or the outline view, if it has focus," + NL + "\t * is the current one." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setCurrentViewer(Viewer viewer)" + NL + "\t{" + NL + "\t\t// If it is changing..." + NL + "\t\t//" + NL + "\t\tif (currentViewer != viewer)" + NL + "\t\t{" + NL + "\t\t\tif (selectionChangedListener == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t// Create the listener on demand." + NL + "\t\t\t\t//" + NL + "\t\t\t\tselectionChangedListener =" + NL + "\t\t\t\t\tnew ISelectionChangedListener()" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\t// This just notifies those things that are affected by the section." + NL + "\t\t\t\t\t\t//" + NL + "\t\t\t\t\t\tpublic void selectionChanged(SelectionChangedEvent selectionChangedEvent)" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tsetSelection(selectionChangedEvent.getSelection());" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t};" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\t// Stop listening to the old one." + NL + "\t\t\t//" + NL + "\t\t\tif (currentViewer != null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcurrentViewer.removeSelectionChangedListener(selectionChangedListener);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\t// Start listening to the new one." + NL + "\t\t\t//" + NL + "\t\t\tif (viewer != null)" + NL + "\t\t\t{" + NL + "\t\t\t\tviewer.addSelectionChangedListener(selectionChangedListener);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\t// Remember it." + NL + "\t\t\t//" + NL + "\t\t\tcurrentViewer = viewer;" + NL + "" + NL + "\t\t\t// Set the editors selection based on the current viewer's selection." + NL + "\t\t\t//" + NL + "\t\t\tsetSelection(currentViewer == null ? StructuredSelection.EMPTY : currentViewer.getSelection());" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This returns the viewer as required by the {@link IViewerProvider} interface." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Viewer getViewer()" + NL + "\t{" + NL + "\t\treturn currentViewer;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This creates a context menu for the viewer and adds a listener as well registering the menu for extension." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void createContextMenuFor(StructuredViewer viewer)" + NL + "\t{" + NL + "\t\tMenuManager contextMenu = new MenuManager(\"#PopUp\");";
  protected final String TEXT_166 = NL + "\t\tcontextMenu.add(new Separator(\"additions\"));";
  protected final String TEXT_167 = NL + "\t\tcontextMenu.setRemoveAllWhenShown(true);" + NL + "\t\tcontextMenu.addMenuListener(this);" + NL + "\t\tMenu menu= contextMenu.createContextMenu(viewer.getControl());" + NL + "\t\tviewer.getControl().setMenu(menu);";
  protected final String TEXT_168 = NL + "\t\tgetSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));";
  protected final String TEXT_169 = NL + "\t\tgetSite().registerContextMenu(contextMenu, viewer);";
  protected final String TEXT_170 = NL + NL + "\t\tint dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;" + NL + "\t\tTransfer[] transfers = new Transfer[] { LocalTransfer.getInstance()";
  protected final String TEXT_171 = ", LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance()";
  protected final String TEXT_172 = " };" + NL + "\t\tviewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));" + NL + "\t\tviewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer));" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This is the method called to load a resource into the editing domain's resource set based on the editor's input." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void createModel()" + NL + "\t{";
  protected final String TEXT_173 = NL + "\t\tURI resourceURI = EditUIUtil.getURI(getEditorInput(), editingDomain.getResourceSet().getURIConverter());";
  protected final String TEXT_174 = NL + "\t\tURI resourceURI = EditUIUtil.getURI(getEditorInput());";
  protected final String TEXT_175 = NL + "\t\tURI resourceURI = URI.createURI(getEditorInput().getName());";
  protected final String TEXT_176 = NL + "\t\t// Assumes that the input is a file object." + NL + "\t\t//" + NL + "\t\tIFileEditorInput modelFile = (IFileEditorInput)getEditorInput();" + NL + "\t\tURI resourceURI = URI.createPlatformResourceURI(modelFile.getFile().getFullPath().toString(), true);";
  protected final String TEXT_177 = NL + "\t\tException exception = null;" + NL + "\t\tResource resource = null;" + NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\t// Load the resource through the editing domain." + NL + "\t\t\t//" + NL + "\t\t\tresource = editingDomain.getResourceSet().getResource(resourceURI, true);" + NL + "\t\t}" + NL + "\t\tcatch (Exception e)" + NL + "\t\t{" + NL + "\t\t\texception = e;" + NL + "\t\t\tresource = editingDomain.getResourceSet().getResource(resourceURI, false);" + NL + "\t\t}" + NL + "" + NL + "\t\tDiagnostic diagnostic = analyzeResourceProblems(resource, exception);" + NL + "\t\tif (diagnostic.getSeverity() != Diagnostic.OK)" + NL + "\t\t{" + NL + "\t\t\tresourceToDiagnosticMap.put(resource,  analyzeResourceProblems(resource, exception));" + NL + "\t\t}" + NL + "\t\teditingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns a diagnostic describing the errors and warnings listed in the resource" + NL + "\t * and the specified exception (if any)." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic Diagnostic analyzeResourceProblems(Resource resource, Exception exception)" + NL + "\t{" + NL + "\t\tboolean hasErrors = !resource.getErrors().isEmpty();" + NL + "\t\tif (hasErrors || !resource.getWarnings().isEmpty())" + NL + "\t\t{" + NL + "\t\t\tBasicDiagnostic basicDiagnostic =" + NL + "\t\t\t\tnew BasicDiagnostic" + NL + "\t\t\t\t\t(hasErrors ? Diagnostic.ERROR : Diagnostic.WARNING," + NL + "\t\t\t\t\t \"";
  protected final String TEXT_178 = "\",";
  protected final String TEXT_179 = NL + "\t\t\t\t\t 0," + NL + "\t\t\t\t\t getString(\"_UI_CreateModelError_message\", resource.getURI()),";
  protected final String TEXT_180 = NL + "\t\t\t\t\t new Object [] { exception == null ? (Object)resource : exception });" + NL + "\t\t\tbasicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));" + NL + "\t\t\treturn basicDiagnostic;" + NL + "\t\t}" + NL + "\t\telse if (exception != null)" + NL + "\t\t{" + NL + "\t\t\treturn" + NL + "\t\t\t\tnew BasicDiagnostic" + NL + "\t\t\t\t\t(Diagnostic.ERROR," + NL + "\t\t\t\t\t \"";
  protected final String TEXT_181 = "\",";
  protected final String TEXT_182 = NL + "\t\t\t\t\t 0," + NL + "\t\t\t\t\t getString(\"_UI_CreateModelError_message\", resource.getURI()),";
  protected final String TEXT_183 = NL + "\t\t\t\t\t new Object[] { exception });" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{" + NL + "\t\t\treturn Diagnostic.OK_INSTANCE;" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This is the method used by the framework to install your own controls." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_184 = NL + "\t@Override";
  protected final String TEXT_185 = NL + "\tpublic void createPages()" + NL + "\t{" + NL + "\t\t// Creates the model from the editor input" + NL + "\t\t//" + NL + "\t\tcreateModel();" + NL + "" + NL + "\t\t// Only creates the other pages if there is something that can be edited" + NL + "\t\t//" + NL + "\t\tif (!getEditingDomain().getResourceSet().getResources().isEmpty())" + NL + "\t\t{" + NL + "\t\t\t// Create a page for the selection tree view." + NL + "\t\t\t//";
  protected final String TEXT_186 = NL + "\t\t\t{" + NL + "\t\t\t\tViewerPane viewerPane =" + NL + "\t\t\t\t\tnew ViewerPane(getSite().getPage(), ";
  protected final String TEXT_187 = ".this)" + NL + "\t\t\t\t\t{";
  protected final String TEXT_188 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_189 = NL + "\t\t\t\t\t\tpublic Viewer createViewer(Composite composite)" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tTree tree = new Tree(composite, SWT.MULTI);" + NL + "\t\t\t\t\t\t\tTreeViewer newTreeViewer = new TreeViewer(tree);" + NL + "\t\t\t\t\t\t\treturn newTreeViewer;" + NL + "\t\t\t\t\t\t}";
  protected final String TEXT_190 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_191 = NL + "\t\t\t\t\t\tpublic void requestActivation()" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tsuper.requestActivation();" + NL + "\t\t\t\t\t\t\tsetCurrentViewerPane(this);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t};" + NL + "\t\t\t\tviewerPane.createControl(getContainer());" + NL + "" + NL + "\t\t\t\tselectionViewer = (TreeViewer)viewerPane.getViewer();" + NL + "\t\t\t\tselectionViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));" + NL + "" + NL + "\t\t\t\tselectionViewer.setLabelProvider(";
  protected final String TEXT_192 = "new ";
  protected final String TEXT_193 = "(";
  protected final String TEXT_194 = "new ";
  protected final String TEXT_195 = "(";
  protected final String TEXT_196 = "new ";
  protected final String TEXT_197 = "(adapterFactory";
  protected final String TEXT_198 = ", selectionViewer";
  protected final String TEXT_199 = ")";
  protected final String TEXT_200 = ", new ";
  protected final String TEXT_201 = "(editingDomain";
  protected final String TEXT_202 = ".getResourceSet()";
  protected final String TEXT_203 = ", selectionViewer";
  protected final String TEXT_204 = ", ";
  protected final String TEXT_205 = ".getPlugin().getDialogSettings()";
  protected final String TEXT_206 = "))";
  protected final String TEXT_207 = ")";
  protected final String TEXT_208 = ");" + NL + "\t\t\t\tselectionViewer.setInput(editingDomain.getResourceSet());" + NL + "\t\t\t\tselectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);" + NL + "\t\t\t\tviewerPane.setTitle(editingDomain.getResourceSet());" + NL + "" + NL + "\t\t\t\tnew AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);";
  protected final String TEXT_209 = NL + "\t\t\t\tnew ";
  protected final String TEXT_210 = "(selectionViewer, new ";
  protected final String TEXT_211 = ".EditingDomainLocationListener(editingDomain, selectionViewer));";
  protected final String TEXT_212 = NL + NL + "\t\t\t\tcreateContextMenuFor(selectionViewer);" + NL + "\t\t\t\tint pageIndex = addPage(viewerPane.getControl());" + NL + "\t\t\t\tsetPageText(pageIndex, getString(\"_UI_SelectionPage_label\"));";
  protected final String TEXT_213 = NL + "\t\t\t}" + NL + "" + NL + "\t\t\t// Create a page for the parent tree view." + NL + "\t\t\t//" + NL + "\t\t\t{" + NL + "\t\t\t\tViewerPane viewerPane =" + NL + "\t\t\t\t\tnew ViewerPane(getSite().getPage(), ";
  protected final String TEXT_214 = ".this)" + NL + "\t\t\t\t\t{";
  protected final String TEXT_215 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_216 = NL + "\t\t\t\t\t\tpublic Viewer createViewer(Composite composite)" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tTree tree = new Tree(composite, SWT.MULTI);" + NL + "\t\t\t\t\t\t\tTreeViewer newTreeViewer = new TreeViewer(tree);" + NL + "\t\t\t\t\t\t\treturn newTreeViewer;" + NL + "\t\t\t\t\t\t}";
  protected final String TEXT_217 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_218 = NL + "\t\t\t\t\t\tpublic void requestActivation()" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tsuper.requestActivation();" + NL + "\t\t\t\t\t\t\tsetCurrentViewerPane(this);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t};" + NL + "\t\t\t\tviewerPane.createControl(getContainer());" + NL + "" + NL + "\t\t\t\tparentViewer = (TreeViewer)viewerPane.getViewer();" + NL + "\t\t\t\tparentViewer.setAutoExpandLevel(30);" + NL + "\t\t\t\tparentViewer.setContentProvider(new ReverseAdapterFactoryContentProvider(adapterFactory));" + NL + "\t\t\t\tparentViewer.setLabelProvider(";
  protected final String TEXT_219 = "new ";
  protected final String TEXT_220 = "(";
  protected final String TEXT_221 = "new ";
  protected final String TEXT_222 = "(adapterFactory";
  protected final String TEXT_223 = ", parentViewer";
  protected final String TEXT_224 = ")";
  protected final String TEXT_225 = ")";
  protected final String TEXT_226 = ");" + NL + "" + NL + "\t\t\t\tcreateContextMenuFor(parentViewer);" + NL + "\t\t\t\tint pageIndex = addPage(viewerPane.getControl());" + NL + "\t\t\t\tsetPageText(pageIndex, getString(\"_UI_ParentPage_label\"));";
  protected final String TEXT_227 = NL + "\t\t\t}" + NL + "" + NL + "\t\t\t// This is the page for the list viewer" + NL + "\t\t\t//" + NL + "\t\t\t{" + NL + "\t\t\t\tViewerPane viewerPane =" + NL + "\t\t\t\t\tnew ViewerPane(getSite().getPage(), ";
  protected final String TEXT_228 = ".this)" + NL + "\t\t\t\t\t{";
  protected final String TEXT_229 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_230 = NL + "\t\t\t\t\t\tpublic Viewer createViewer(Composite composite)" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\treturn new ListViewer(composite);" + NL + "\t\t\t\t\t\t}";
  protected final String TEXT_231 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_232 = NL + "\t\t\t\t\t\tpublic void requestActivation()" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tsuper.requestActivation();" + NL + "\t\t\t\t\t\t\tsetCurrentViewerPane(this);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t};" + NL + "\t\t\t\tviewerPane.createControl(getContainer());" + NL + "\t\t\t\tlistViewer = (ListViewer)viewerPane.getViewer();" + NL + "\t\t\t\tlistViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));" + NL + "\t\t\t\tlistViewer.setLabelProvider(";
  protected final String TEXT_233 = "new ";
  protected final String TEXT_234 = "(";
  protected final String TEXT_235 = "new ";
  protected final String TEXT_236 = "(adapterFactory";
  protected final String TEXT_237 = ", listViewer";
  protected final String TEXT_238 = ")";
  protected final String TEXT_239 = ")";
  protected final String TEXT_240 = ");" + NL + "" + NL + "\t\t\t\tcreateContextMenuFor(listViewer);" + NL + "\t\t\t\tint pageIndex = addPage(viewerPane.getControl());" + NL + "\t\t\t\tsetPageText(pageIndex, getString(\"_UI_ListPage_label\"));";
  protected final String TEXT_241 = NL + "\t\t\t}" + NL + "" + NL + "\t\t\t// This is the page for the tree viewer" + NL + "\t\t\t//" + NL + "\t\t\t{" + NL + "\t\t\t\tViewerPane viewerPane =" + NL + "\t\t\t\t\tnew ViewerPane(getSite().getPage(), ";
  protected final String TEXT_242 = ".this)" + NL + "\t\t\t\t\t{";
  protected final String TEXT_243 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_244 = NL + "\t\t\t\t\t\tpublic Viewer createViewer(Composite composite)" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\treturn new TreeViewer(composite);" + NL + "\t\t\t\t\t\t}";
  protected final String TEXT_245 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_246 = NL + "\t\t\t\t\t\tpublic void requestActivation()" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tsuper.requestActivation();" + NL + "\t\t\t\t\t\t\tsetCurrentViewerPane(this);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t};" + NL + "\t\t\t\tviewerPane.createControl(getContainer());" + NL + "\t\t\t\ttreeViewer = (TreeViewer)viewerPane.getViewer();" + NL + "\t\t\t\ttreeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));" + NL + "\t\t\t\ttreeViewer.setLabelProvider(";
  protected final String TEXT_247 = "new ";
  protected final String TEXT_248 = "(";
  protected final String TEXT_249 = "new ";
  protected final String TEXT_250 = "(";
  protected final String TEXT_251 = "new ";
  protected final String TEXT_252 = "(adapterFactory";
  protected final String TEXT_253 = ", treeViewer";
  protected final String TEXT_254 = ")";
  protected final String TEXT_255 = ", new ";
  protected final String TEXT_256 = "(editingDomain";
  protected final String TEXT_257 = ".getResourceSet()";
  protected final String TEXT_258 = ", treeViewer))";
  protected final String TEXT_259 = ")";
  protected final String TEXT_260 = ");" + NL + "" + NL + "\t\t\t\tnew AdapterFactoryTreeEditor(treeViewer.getTree(), adapterFactory);";
  protected final String TEXT_261 = NL + "\t\t\t\tnew ";
  protected final String TEXT_262 = "(treeViewer, new ";
  protected final String TEXT_263 = ".EditingDomainLocationListener(editingDomain, treeViewer));";
  protected final String TEXT_264 = NL + NL + "\t\t\t\tcreateContextMenuFor(treeViewer);" + NL + "\t\t\t\tint pageIndex = addPage(viewerPane.getControl());" + NL + "\t\t\t\tsetPageText(pageIndex, getString(\"_UI_TreePage_label\"));";
  protected final String TEXT_265 = NL + "\t\t\t}" + NL + "" + NL + "\t\t\t// This is the page for the table viewer." + NL + "\t\t\t//" + NL + "\t\t\t{" + NL + "\t\t\t\tViewerPane viewerPane =" + NL + "\t\t\t\t\tnew ViewerPane(getSite().getPage(), ";
  protected final String TEXT_266 = ".this)" + NL + "\t\t\t\t\t{";
  protected final String TEXT_267 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_268 = NL + "\t\t\t\t\t\tpublic Viewer createViewer(Composite composite)" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\treturn new TableViewer(composite);" + NL + "\t\t\t\t\t\t}";
  protected final String TEXT_269 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_270 = NL + "\t\t\t\t\t\tpublic void requestActivation()" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tsuper.requestActivation();" + NL + "\t\t\t\t\t\t\tsetCurrentViewerPane(this);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t};" + NL + "\t\t\t\tviewerPane.createControl(getContainer());" + NL + "\t\t\t\ttableViewer = (TableViewer)viewerPane.getViewer();" + NL + "" + NL + "\t\t\t\tTable table = tableViewer.getTable();" + NL + "\t\t\t\tTableLayout layout = new TableLayout();" + NL + "\t\t\t\ttable.setLayout(layout);" + NL + "\t\t\t\ttable.setHeaderVisible(true);" + NL + "\t\t\t\ttable.setLinesVisible(true);" + NL + "" + NL + "\t\t\t\tTableColumn objectColumn = new TableColumn(table, SWT.NONE);" + NL + "\t\t\t\tlayout.addColumnData(new ColumnWeightData(3, 100, true));" + NL + "\t\t\t\tobjectColumn.setText(getString(\"_UI_ObjectColumn_label\"));";
  protected final String TEXT_271 = NL + "\t\t\t\tobjectColumn.setResizable(true);" + NL + "" + NL + "\t\t\t\tTableColumn selfColumn = new TableColumn(table, SWT.NONE);" + NL + "\t\t\t\tlayout.addColumnData(new ColumnWeightData(2, 100, true));" + NL + "\t\t\t\tselfColumn.setText(getString(\"_UI_SelfColumn_label\"));";
  protected final String TEXT_272 = NL + "\t\t\t\tselfColumn.setResizable(true);" + NL + "" + NL + "\t\t\t\ttableViewer.setColumnProperties(new String [] {\"a\", \"b\"});";
  protected final String TEXT_273 = NL + "\t\t\t\ttableViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));" + NL + "\t\t\t\ttableViewer.setLabelProvider(";
  protected final String TEXT_274 = "new ";
  protected final String TEXT_275 = "(";
  protected final String TEXT_276 = "new ";
  protected final String TEXT_277 = "(";
  protected final String TEXT_278 = "new ";
  protected final String TEXT_279 = "(adapterFactory";
  protected final String TEXT_280 = ", tableViewer";
  protected final String TEXT_281 = ")";
  protected final String TEXT_282 = ", new ";
  protected final String TEXT_283 = "(editingDomain";
  protected final String TEXT_284 = ".getResourceSet()";
  protected final String TEXT_285 = ", tableViewer";
  protected final String TEXT_286 = ", ";
  protected final String TEXT_287 = ".getPlugin().getDialogSettings()";
  protected final String TEXT_288 = "))";
  protected final String TEXT_289 = ")";
  protected final String TEXT_290 = ");" + NL;
  protected final String TEXT_291 = NL + "\t\t\t\tnew ";
  protected final String TEXT_292 = "(tableViewer, new ";
  protected final String TEXT_293 = ".EditingDomainLocationListener(editingDomain, tableViewer));" + NL;
  protected final String TEXT_294 = NL + "\t\t\t\tcreateContextMenuFor(tableViewer);" + NL + "\t\t\t\tint pageIndex = addPage(viewerPane.getControl());" + NL + "\t\t\t\tsetPageText(pageIndex, getString(\"_UI_TablePage_label\"));";
  protected final String TEXT_295 = NL + "\t\t\t}" + NL + "" + NL + "\t\t\t// This is the page for the table tree viewer." + NL + "\t\t\t//" + NL + "\t\t\t{" + NL + "\t\t\t\tViewerPane viewerPane =" + NL + "\t\t\t\t\tnew ViewerPane(getSite().getPage(), ";
  protected final String TEXT_296 = ".this)" + NL + "\t\t\t\t\t{";
  protected final String TEXT_297 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_298 = NL + "\t\t\t\t\t\tpublic Viewer createViewer(Composite composite)" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\treturn new TreeViewer(composite);" + NL + "\t\t\t\t\t\t}";
  protected final String TEXT_299 = NL + "\t\t\t\t\t\t@Override";
  protected final String TEXT_300 = NL + "\t\t\t\t\t\tpublic void requestActivation()" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\tsuper.requestActivation();" + NL + "\t\t\t\t\t\t\tsetCurrentViewerPane(this);" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t};" + NL + "\t\t\t\tviewerPane.createControl(getContainer());" + NL + "" + NL + "\t\t\t\ttreeViewerWithColumns = (TreeViewer)viewerPane.getViewer();" + NL + "" + NL + "\t\t\t\tTree tree = treeViewerWithColumns.getTree();" + NL + "\t\t\t\ttree.setLayoutData(new FillLayout());" + NL + "\t\t\t\ttree.setHeaderVisible(true);" + NL + "\t\t\t\ttree.setLinesVisible(true);" + NL + "" + NL + "\t\t\t\tTreeColumn objectColumn = new TreeColumn(tree, SWT.NONE);" + NL + "\t\t\t\tobjectColumn.setText(getString(\"_UI_ObjectColumn_label\"));";
  protected final String TEXT_301 = NL + "\t\t\t\tobjectColumn.setResizable(true);" + NL + "\t\t\t\tobjectColumn.setWidth(250);" + NL + "" + NL + "\t\t\t\tTreeColumn selfColumn = new TreeColumn(tree, SWT.NONE);" + NL + "\t\t\t\tselfColumn.setText(getString(\"_UI_SelfColumn_label\"));";
  protected final String TEXT_302 = NL + "\t\t\t\tselfColumn.setResizable(true);" + NL + "\t\t\t\tselfColumn.setWidth(200);" + NL + "" + NL + "\t\t\t\ttreeViewerWithColumns.setColumnProperties(new String [] {\"a\", \"b\"});";
  protected final String TEXT_303 = NL + "\t\t\t\ttreeViewerWithColumns.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));" + NL + "\t\t\t\ttreeViewerWithColumns.setLabelProvider(";
  protected final String TEXT_304 = "new ";
  protected final String TEXT_305 = "(";
  protected final String TEXT_306 = "new ";
  protected final String TEXT_307 = "(";
  protected final String TEXT_308 = "new ";
  protected final String TEXT_309 = "(adapterFactory";
  protected final String TEXT_310 = ", treeViewerWithColumns";
  protected final String TEXT_311 = ")";
  protected final String TEXT_312 = ", new ";
  protected final String TEXT_313 = "(editingDomain";
  protected final String TEXT_314 = ".getResourceSet()";
  protected final String TEXT_315 = ", treeViewerWithColumns";
  protected final String TEXT_316 = ", ";
  protected final String TEXT_317 = ".getPlugin().getDialogSettings()";
  protected final String TEXT_318 = "))";
  protected final String TEXT_319 = ")";
  protected final String TEXT_320 = ");" + NL;
  protected final String TEXT_321 = NL + "\t\t\t\tnew ";
  protected final String TEXT_322 = "(treeViewerWithColumns, new ";
  protected final String TEXT_323 = ".EditingDomainLocationListener(editingDomain, treeViewerWithColumns));" + NL;
  protected final String TEXT_324 = NL + "\t\t\t\tcreateContextMenuFor(treeViewerWithColumns);" + NL + "\t\t\t\tint pageIndex = addPage(viewerPane.getControl());" + NL + "\t\t\t\tsetPageText(pageIndex, getString(\"_UI_TreeWithColumnsPage_label\"));";
  protected final String TEXT_325 = NL + "\t\t\t}";
  protected final String TEXT_326 = NL + "\t\t\tTree tree = new Tree(getContainer(), SWT.MULTI);" + NL + "\t\t\tselectionViewer = new TreeViewer(tree);" + NL + "\t\t\tsetCurrentViewer(selectionViewer);" + NL + "" + NL + "\t\t\tselectionViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));" + NL + "\t\t\tselectionViewer.setLabelProvider(";
  protected final String TEXT_327 = "new ";
  protected final String TEXT_328 = "(";
  protected final String TEXT_329 = "new ";
  protected final String TEXT_330 = "(";
  protected final String TEXT_331 = "new ";
  protected final String TEXT_332 = "(adapterFactory";
  protected final String TEXT_333 = ", selectionViewer";
  protected final String TEXT_334 = ")";
  protected final String TEXT_335 = ", new ";
  protected final String TEXT_336 = "(editingDomain";
  protected final String TEXT_337 = ".getResourceSet()";
  protected final String TEXT_338 = ", selectionViewer";
  protected final String TEXT_339 = ", ";
  protected final String TEXT_340 = ".getPlugin().getDialogSettings()";
  protected final String TEXT_341 = "))";
  protected final String TEXT_342 = ")";
  protected final String TEXT_343 = ");" + NL + "\t\t\tselectionViewer.setInput(editingDomain.getResourceSet());" + NL + "\t\t\tselectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);" + NL + "" + NL + "\t\t\tnew AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);";
  protected final String TEXT_344 = NL + "\t\t\tnew ";
  protected final String TEXT_345 = "(selectionViewer, new ";
  protected final String TEXT_346 = ".EditingDomainLocationListener(editingDomain, selectionViewer));";
  protected final String TEXT_347 = NL + NL + "\t\t\tcreateContextMenuFor(selectionViewer);" + NL + "\t\t\tint pageIndex = addPage(tree);" + NL + "\t\t\tsetPageText(pageIndex, getString(\"_UI_SelectionPage_label\"));";
  protected final String TEXT_348 = NL + NL + "\t\t\tgetSite().getShell().getDisplay().asyncExec" + NL + "\t\t\t\t(new Runnable()" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t public void run()" + NL + "\t\t\t\t\t {" + NL + "\t\t\t\t\t\t setActivePage(0);" + NL + "\t\t\t\t\t }" + NL + "\t\t\t\t });" + NL + "\t\t}" + NL + "" + NL + "\t\t// Ensures that this editor will only display the page's tab" + NL + "\t\t// area if there are more than one page" + NL + "\t\t//" + NL + "\t\tgetContainer().addControlListener" + NL + "\t\t\t(new ControlAdapter()" + NL + "\t\t\t {" + NL + "\t\t\t\tboolean guard = false;";
  protected final String TEXT_349 = NL + "\t\t\t\t@Override";
  protected final String TEXT_350 = NL + "\t\t\t\tpublic void controlResized(ControlEvent event)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tif (!guard)" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tguard = true;" + NL + "\t\t\t\t\t\thideTabs();" + NL + "\t\t\t\t\t\tguard = false;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t });" + NL + "" + NL + "\t\tgetSite().getShell().getDisplay().asyncExec" + NL + "\t\t\t(new Runnable()" + NL + "\t\t\t {" + NL + "\t\t\t\t public void run()" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t updateProblemIndication();" + NL + "\t\t\t\t }" + NL + "\t\t\t });" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * If there is just one page in the multi-page editor part," + NL + "\t * this hides the single tab at the bottom." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void hideTabs()" + NL + "\t{" + NL + "\t\tif (getPageCount() <= 1)" + NL + "\t\t{" + NL + "\t\t\tsetPageText(0, \"\");";
  protected final String TEXT_351 = NL + "\t\t\tif (getContainer() instanceof CTabFolder)" + NL + "\t\t\t{" + NL + "\t\t\t\t((CTabFolder)getContainer()).setTabHeight(1);" + NL + "\t\t\t\tPoint point = getContainer().getSize();" + NL + "\t\t\t\tgetContainer().setSize(point.x, point.y + 6);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * If there is more than one page in the multi-page editor part," + NL + "\t * this shows the tabs at the bottom." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void showTabs()" + NL + "\t{" + NL + "\t\tif (getPageCount() > 1)" + NL + "\t\t{" + NL + "\t\t\tsetPageText(0, getString(\"_UI_SelectionPage_label\"));";
  protected final String TEXT_352 = NL + "\t\t\tif (getContainer() instanceof CTabFolder)" + NL + "\t\t\t{" + NL + "\t\t\t\t((CTabFolder)getContainer()).setTabHeight(SWT.DEFAULT);" + NL + "\t\t\t\tPoint point = getContainer().getSize();" + NL + "\t\t\t\tgetContainer().setSize(point.x, point.y - 6);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This is used to track the active viewer." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_353 = NL + "\t@Override";
  protected final String TEXT_354 = NL + "\tprotected void pageChange(int pageIndex)" + NL + "\t{" + NL + "\t\tsuper.pageChange(pageIndex);" + NL + "" + NL + "\t\tif (contentOutlinePage != null)" + NL + "\t\t{" + NL + "\t\t\thandleContentOutlineSelection(contentOutlinePage.getSelection());" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This is how the framework determines which interfaces we implement." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_355 = NL + "\t@SuppressWarnings(\"";
  protected final String TEXT_356 = "rawtypes";
  protected final String TEXT_357 = "unchecked";
  protected final String TEXT_358 = "\")";
  protected final String TEXT_359 = NL + "\t@Override";
  protected final String TEXT_360 = NL + "\tpublic Object getAdapter(Class key)" + NL + "\t{" + NL + "\t\tif (key.equals(IContentOutlinePage.class))" + NL + "\t\t{" + NL + "\t\t\treturn showOutlineView() ? getContentOutlinePage() : null;" + NL + "\t\t}" + NL + "\t\telse if (key.equals(IPropertySheetPage.class))" + NL + "\t\t{" + NL + "\t\t\treturn getPropertySheetPage();" + NL + "\t\t}";
  protected final String TEXT_361 = NL + "\t\telse if (key.equals(IGotoMarker.class))" + NL + "\t\t{" + NL + "\t\t\treturn this;" + NL + "\t\t}";
  protected final String TEXT_362 = NL + "\t\telse" + NL + "\t\t{" + NL + "\t\t\treturn super.getAdapter(key);" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This accesses a cached version of the content outliner." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic IContentOutlinePage getContentOutlinePage()" + NL + "\t{" + NL + "\t\tif (contentOutlinePage == null)" + NL + "\t\t{" + NL + "\t\t\t// The content outline is just a tree." + NL + "\t\t\t//" + NL + "\t\t\tclass MyContentOutlinePage extends ContentOutlinePage" + NL + "\t\t\t{";
  protected final String TEXT_363 = NL + "\t\t\t\t@Override";
  protected final String TEXT_364 = NL + "\t\t\t\tpublic void createControl(Composite parent)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tsuper.createControl(parent);" + NL + "\t\t\t\t\tcontentOutlineViewer = getTreeViewer();" + NL + "\t\t\t\t\tcontentOutlineViewer.addSelectionChangedListener(this);" + NL + "" + NL + "\t\t\t\t\t// Set up the tree viewer." + NL + "\t\t\t\t\t//" + NL + "\t\t\t\t\tcontentOutlineViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));" + NL + "\t\t\t\t\tcontentOutlineViewer.setLabelProvider(";
  protected final String TEXT_365 = "new ";
  protected final String TEXT_366 = "(";
  protected final String TEXT_367 = "new ";
  protected final String TEXT_368 = "(";
  protected final String TEXT_369 = "new ";
  protected final String TEXT_370 = "(adapterFactory";
  protected final String TEXT_371 = ", contentOutlineViewer";
  protected final String TEXT_372 = ")";
  protected final String TEXT_373 = ", new ";
  protected final String TEXT_374 = "(editingDomain";
  protected final String TEXT_375 = ".getResourceSet()";
  protected final String TEXT_376 = ", contentOutlineViewer";
  protected final String TEXT_377 = ", ";
  protected final String TEXT_378 = ".getPlugin().getDialogSettings()";
  protected final String TEXT_379 = "))";
  protected final String TEXT_380 = ")";
  protected final String TEXT_381 = ");" + NL + "\t\t\t\t\tcontentOutlineViewer.setInput(editingDomain.getResourceSet());" + NL;
  protected final String TEXT_382 = NL + "\t\t\t\t\tnew ";
  protected final String TEXT_383 = "(contentOutlineViewer, new ";
  protected final String TEXT_384 = ".EditingDomainLocationListener(editingDomain, contentOutlineViewer));" + NL;
  protected final String TEXT_385 = NL + "\t\t\t\t\t// Make sure our popups work." + NL + "\t\t\t\t\t//" + NL + "\t\t\t\t\tcreateContextMenuFor(contentOutlineViewer);" + NL + "" + NL + "\t\t\t\t\tif (!editingDomain.getResourceSet().getResources().isEmpty())" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t  // Select the root object in the view." + NL + "\t\t\t\t\t  //" + NL + "\t\t\t\t\t  contentOutlineViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL;
  protected final String TEXT_386 = NL + "\t\t\t\t@Override";
  protected final String TEXT_387 = NL + "\t\t\t\tpublic void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tsuper.makeContributions(menuManager, toolBarManager, statusLineManager);" + NL + "\t\t\t\t\tcontentOutlineStatusLineManager = statusLineManager;" + NL + "\t\t\t\t}" + NL;
  protected final String TEXT_388 = NL + "\t\t\t\t@Override";
  protected final String TEXT_389 = NL + "\t\t\t\tpublic void setActionBars(IActionBars actionBars)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tsuper.setActionBars(actionBars);" + NL + "\t\t\t\t\tgetActionBarContributor().shareGlobalActions(this, actionBars);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "" + NL + "\t\t\tcontentOutlinePage = new MyContentOutlinePage();" + NL + "" + NL + "\t\t\t// Listen to selection so that we can handle it is a special way." + NL + "\t\t\t//" + NL + "\t\t\tcontentOutlinePage.addSelectionChangedListener" + NL + "\t\t\t\t(new ISelectionChangedListener()" + NL + "\t\t\t\t {" + NL + "\t\t\t\t\t // This ensures that we handle selections correctly." + NL + "\t\t\t\t\t //" + NL + "\t\t\t\t\t public void selectionChanged(SelectionChangedEvent event)" + NL + "\t\t\t\t\t {" + NL + "\t\t\t\t\t\t handleContentOutlineSelection(event.getSelection());" + NL + "\t\t\t\t\t }" + NL + "\t\t\t\t });" + NL + "\t\t}" + NL + "" + NL + "\t\treturn contentOutlinePage;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This accesses a cached version of the property sheet." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic IPropertySheetPage getPropertySheetPage()" + NL + "\t{" + NL + "\t\tPropertySheetPage propertySheetPage =" + NL + "\t\t\tnew ExtendedPropertySheetPage(editingDomain";
  protected final String TEXT_390 = ", ExtendedPropertySheetPage.Decoration.MANUAL";
  protected final String TEXT_391 = ", ExtendedPropertySheetPage.Decoration.LIVE, ";
  protected final String TEXT_392 = ".getPlugin().getDialogSettings()";
  protected final String TEXT_393 = ")" + NL + "\t\t\t{";
  protected final String TEXT_394 = NL + "\t\t\t\t@Override";
  protected final String TEXT_395 = NL + "\t\t\t\tpublic void setSelectionToViewer(";
  protected final String TEXT_396 = " selection)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_397 = ".this.setSelectionToViewer(selection);" + NL + "\t\t\t\t\t";
  protected final String TEXT_398 = ".this.setFocus();" + NL + "\t\t\t\t}" + NL;
  protected final String TEXT_399 = NL + "\t\t\t\t@Override";
  protected final String TEXT_400 = NL + "\t\t\t\tpublic void setActionBars(IActionBars actionBars)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tsuper.setActionBars(actionBars);" + NL + "\t\t\t\t\tgetActionBarContributor().shareGlobalActions(this, actionBars);" + NL + "\t\t\t\t}" + NL + "\t\t\t};" + NL + "\t\tpropertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));" + NL + "\t\tpropertySheetPages.add(propertySheetPage);" + NL + "" + NL + "\t\treturn propertySheetPage;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This deals with how we want selection in the outliner to affect the other views." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void handleContentOutlineSelection(ISelection selection)" + NL + "\t{";
  protected final String TEXT_401 = NL + "\t\tif (currentViewerPane != null && !selection.isEmpty() && selection instanceof IStructuredSelection)";
  protected final String TEXT_402 = NL + "\t\tif (selectionViewer != null && !selection.isEmpty() && selection instanceof IStructuredSelection)";
  protected final String TEXT_403 = NL + "\t\t{" + NL + "\t\t\tIterator";
  protected final String TEXT_404 = "<?>";
  protected final String TEXT_405 = " selectedElements = ((IStructuredSelection)selection).iterator();" + NL + "\t\t\tif (selectedElements.hasNext())" + NL + "\t\t\t{" + NL + "\t\t\t\t// Get the first selected element." + NL + "\t\t\t\t//" + NL + "\t\t\t\tObject selectedElement = selectedElements.next();" + NL;
  protected final String TEXT_406 = NL + "\t\t\t\t// If it's the selection viewer, then we want it to select the same selection as this selection." + NL + "\t\t\t\t//" + NL + "\t\t\t\tif (currentViewerPane.getViewer() == selectionViewer)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_407 = " selectionList = new ";
  protected final String TEXT_408 = "();" + NL + "\t\t\t\t\tselectionList.add(selectedElement);" + NL + "\t\t\t\t\twhile (selectedElements.hasNext())" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tselectionList.add(selectedElements.next());" + NL + "\t\t\t\t\t}" + NL + "" + NL + "\t\t\t\t\t// Set the selection to the widget." + NL + "\t\t\t\t\t//" + NL + "\t\t\t\t\tselectionViewer.setSelection(new StructuredSelection(selectionList));" + NL + "\t\t\t\t}" + NL + "\t\t\t\telse" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t// Set the input to the widget." + NL + "\t\t\t\t\t//" + NL + "\t\t\t\t\tif (currentViewerPane.getViewer().getInput() != selectedElement)" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tcurrentViewerPane.getViewer().setInput(selectedElement);" + NL + "\t\t\t\t\t\tcurrentViewerPane.setTitle(selectedElement);" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}";
  protected final String TEXT_409 = NL + "\t\t\t\t";
  protected final String TEXT_410 = " selectionList = new ";
  protected final String TEXT_411 = "();" + NL + "\t\t\t\tselectionList.add(selectedElement);" + NL + "\t\t\t\twhile (selectedElements.hasNext())" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tselectionList.add(selectedElements.next());" + NL + "\t\t\t\t}" + NL + "" + NL + "\t\t\t\t// Set the selection to the widget." + NL + "\t\t\t\t//" + NL + "\t\t\t\tselectionViewer.setSelection(new StructuredSelection(selectionList));";
  protected final String TEXT_412 = NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This is for implementing {@link IEditorPart} and simply tests the command stack." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_413 = NL + "\t@Override";
  protected final String TEXT_414 = NL + "\tpublic boolean isDirty()" + NL + "\t{" + NL + "\t\treturn ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This is for implementing {@link IEditorPart} and simply saves the model file." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_415 = NL + "\t@Override";
  protected final String TEXT_416 = NL + "\tpublic void doSave(IProgressMonitor progressMonitor)" + NL + "\t{" + NL + "\t\t// Save only resources that have actually changed." + NL + "\t\t//" + NL + "\t\tfinal ";
  protected final String TEXT_417 = " saveOptions = new ";
  protected final String TEXT_418 = "();";
  protected final String TEXT_419 = NL + "\t\tsaveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);";
  protected final String TEXT_420 = NL + "\t\tsaveOptions.put(Resource.OPTION_LINE_DELIMITER, Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);";
  protected final String TEXT_421 = NL + NL + "\t\t// Do the work within an operation because this is a long running activity that modifies the workbench." + NL + "\t\t//" + NL + "\t\t";
  protected final String TEXT_422 = " operation =" + NL + "\t\t\tnew ";
  protected final String TEXT_423 = "()" + NL + "\t\t\t{" + NL + "\t\t\t\t// This is the method that gets invoked when the operation runs." + NL + "\t\t\t\t//";
  protected final String TEXT_424 = NL + "\t\t\t\t@Override";
  protected final String TEXT_425 = NL + "\t\t\t\tpublic void ";
  protected final String TEXT_426 = "(IProgressMonitor monitor)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t// Save the resources to the file system." + NL + "\t\t\t\t\t//" + NL + "\t\t\t\t\tboolean first = true;";
  protected final String TEXT_427 = NL + "\t\t\t\t\tfor (Resource resource : editingDomain.getResourceSet().getResources())";
  protected final String TEXT_428 = NL + "\t\t\t\t\tfor (Iterator i = editingDomain.getResourceSet().getResources().iterator(); i.hasNext(); )";
  protected final String TEXT_429 = NL + "\t\t\t\t\t{";
  protected final String TEXT_430 = NL + "\t\t\t\t\t\tResource resource = (Resource)i.next();";
  protected final String TEXT_431 = NL + "\t\t\t\t\t\tif ((first || !resource.getContents().isEmpty() || isPersisted(resource)) && !editingDomain.isReadOnly(resource))" + NL + "\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\ttry" + NL + "\t\t\t\t\t\t\t{";
  protected final String TEXT_432 = NL + "\t\t\t\t\t\t\t\tlong timeStamp = resource.getTimeStamp();" + NL + "\t\t\t\t\t\t\t\tresource.save(saveOptions);" + NL + "\t\t\t\t\t\t\t\tif (resource.getTimeStamp() != timeStamp)" + NL + "\t\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\t\tsavedResources.add(resource);" + NL + "\t\t\t\t\t\t\t\t}";
  protected final String TEXT_433 = NL + "\t\t\t\t\t\t\t\tresource.save(saveOptions);" + NL + "\t\t\t\t\t\t\t\tsavedResources.add(resource);";
  protected final String TEXT_434 = NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\tcatch (Exception exception)" + NL + "\t\t\t\t\t\t\t{" + NL + "\t\t\t\t\t\t\t\tresourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));" + NL + "\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\tfirst = false;" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t};" + NL + "" + NL + "\t\tupdateProblemIndication = false;" + NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\t// This runs the options, and shows progress." + NL + "\t\t\t//" + NL + "\t\t\tnew ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);" + NL + "" + NL + "\t\t\t// Refresh the necessary state." + NL + "\t\t\t//" + NL + "\t\t\t((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();" + NL + "\t\t\tfirePropertyChange(IEditorPart.PROP_DIRTY);" + NL + "\t\t}" + NL + "\t\tcatch (Exception exception)" + NL + "\t\t{" + NL + "\t\t\t// Something went wrong that shouldn't." + NL + "\t\t\t//" + NL + "\t\t\t";
  protected final String TEXT_435 = ".INSTANCE.log(exception);" + NL + "\t\t}" + NL + "\t\tupdateProblemIndication = true;" + NL + "\t\tupdateProblemIndication();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This returns whether something has been persisted to the URI of the specified resource." + NL + "\t * The implementation uses the URI converter from the editor's resource set to try to open an input stream." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected boolean isPersisted(Resource resource)" + NL + "\t{" + NL + "\t\tboolean result = false;" + NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\tInputStream stream = editingDomain.getResourceSet().getURIConverter().createInputStream(resource.getURI());" + NL + "\t\t\tif (stream != null)" + NL + "\t\t\t{" + NL + "\t\t\t\tresult = true;" + NL + "\t\t\t\tstream.close();" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (IOException e)" + NL + "\t\t{" + NL + "\t\t\t// Ignore" + NL + "\t\t}" + NL + "\t\treturn result;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This always returns true because it is not currently supported." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_436 = NL + "\t@Override";
  protected final String TEXT_437 = NL + "\tpublic boolean isSaveAsAllowed()" + NL + "\t{" + NL + "\t\treturn true;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This also changes the editor's input." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_438 = NL + "\t@Override";
  protected final String TEXT_439 = NL + "\tpublic void doSaveAs()" + NL + "\t{";
  protected final String TEXT_440 = NL + "\t\tnew ";
  protected final String TEXT_441 = "(getSite().getShell(), null, SWT.NONE)" + NL + "\t\t\t{";
  protected final String TEXT_442 = NL + "\t\t\t\t@Override";
  protected final String TEXT_443 = NL + "\t\t\t\tprotected boolean isSave()" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\treturn true;" + NL + "\t\t\t\t}" + NL;
  protected final String TEXT_444 = NL + "\t\t\t\t@Override";
  protected final String TEXT_445 = NL + "\t\t\t\tprotected boolean processResources()" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_446 = " uris = getURIs();" + NL + "\t\t\t\t\tif (uris.size() > 0)" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tURI uri = ";
  protected final String TEXT_447 = "uris.get(0);" + NL + "\t\t\t\t\t\tdoSaveAs(uri, new ";
  protected final String TEXT_448 = "(uri));" + NL + "\t\t\t\t\t\treturn true;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\telse" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\treturn false;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t}.open();";
  protected final String TEXT_449 = NL + "\t\tString[] filters = ";
  protected final String TEXT_450 = "(String[])";
  protected final String TEXT_451 = "FILE_EXTENSION_FILTERS.toArray(new String[FILE_EXTENSION_FILTERS.size()]);" + NL + "\t\tString[] files = ";
  protected final String TEXT_452 = ".openFilePathDialog(getSite().getShell(), ";
  protected final String TEXT_453 = ".SAVE, filters);" + NL + "\t\tif (files.length > 0)" + NL + "\t\t{" + NL + "\t\t\tURI uri = URI.createFileURI(files[0]);" + NL + "\t\t\tdoSaveAs(uri, new ";
  protected final String TEXT_454 = "(uri));" + NL + "\t\t}";
  protected final String TEXT_455 = NL + "\t\tSaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());" + NL + "\t\tsaveAsDialog.open();" + NL + "\t\tIPath path = saveAsDialog.getResult();" + NL + "\t\tif (path != null)" + NL + "\t\t{" + NL + "\t\t\tIFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);" + NL + "\t\t\tif (file != null)" + NL + "\t\t\t{" + NL + "\t\t\t\tdoSaveAs(URI.createPlatformResourceURI(file.getFullPath().toString(), true), new FileEditorInput(file));" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_456 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void doSaveAs(URI uri, IEditorInput editorInput)" + NL + "\t{" + NL + "\t\t(";
  protected final String TEXT_457 = "(Resource)";
  protected final String TEXT_458 = "editingDomain.getResourceSet().getResources().get(0)).setURI(uri);" + NL + "\t\tsetInputWithNotify(editorInput);" + NL + "\t\tsetPartName(editorInput.getName());" + NL + "\t\tIProgressMonitor progressMonitor =" + NL + "\t\t\tgetActionBars().getStatusLineManager() != null ?" + NL + "\t\t\t\tgetActionBars().getStatusLineManager().getProgressMonitor() :" + NL + "\t\t\t\tnew ";
  protected final String TEXT_459 = "();" + NL + "\t\tdoSave(progressMonitor);" + NL + "\t}";
  protected final String TEXT_460 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void gotoMarker(IMarker marker)" + NL + "\t{";
  protected final String TEXT_461 = NL + "\t\t";
  protected final String TEXT_462 = " targetObjects = markerHelper.getTargetObjects(editingDomain, marker);" + NL + "\t\tif (!targetObjects.isEmpty())" + NL + "\t\t{" + NL + "\t\t\tsetSelectionToViewer(targetObjects);" + NL + "\t\t}";
  protected final String TEXT_463 = NL + "\t\ttry" + NL + "\t\t{" + NL + "\t\t\tif (marker.isSubtypeOf(EValidator.MARKER))" + NL + "\t\t\t{" + NL + "\t\t\t\tString uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);" + NL + "\t\t\t\tif (uriAttribute != null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tURI uri = URI.createURI(uriAttribute);" + NL + "\t\t\t\t\tEObject eObject = editingDomain.getResourceSet().getEObject(uri, true);" + NL + "\t\t\t\t\tif (eObject != null)" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t  setSelectionToViewer(Collections.singleton(editingDomain.getWrapper(eObject)));" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tcatch (CoreException exception)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_464 = ".INSTANCE.log(exception);" + NL + "\t\t}";
  protected final String TEXT_465 = NL + "\t}";
  protected final String TEXT_466 = NL + NL + "\t/**" + NL + "\t * This is called during startup." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_467 = NL + "\t@Override";
  protected final String TEXT_468 = NL + "\tpublic void init(IEditorSite site, IEditorInput editorInput)" + NL + "\t{" + NL + "\t\tsetSite(site);" + NL + "\t\tsetInputWithNotify(editorInput);" + NL + "\t\tsetPartName(editorInput.getName());" + NL + "\t\tsite.setSelectionProvider(this);" + NL + "\t\tsite.getPage().addPartListener(partListener);";
  protected final String TEXT_469 = NL + "\t\tResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);";
  protected final String TEXT_470 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_471 = NL + "\t@Override";
  protected final String TEXT_472 = NL + "\tpublic void setFocus()" + NL + "\t{";
  protected final String TEXT_473 = NL + "\t\tif (currentViewerPane != null)" + NL + "\t\t{" + NL + "\t\t\tcurrentViewerPane.setFocus();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{" + NL + "\t\t\tgetControl(getActivePage()).setFocus();" + NL + "\t\t}";
  protected final String TEXT_474 = NL + "\t\tgetControl(getActivePage()).setFocus();";
  protected final String TEXT_475 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void addSelectionChangedListener(ISelectionChangedListener listener)" + NL + "\t{" + NL + "\t\tselectionChangedListeners.add(listener);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void removeSelectionChangedListener(ISelectionChangedListener listener)" + NL + "\t{" + NL + "\t\tselectionChangedListeners.remove(listener);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to return this editor's overall selection." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ISelection getSelection()" + NL + "\t{" + NL + "\t\treturn editorSelection;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to set this editor's overall selection." + NL + "\t * Calling this result will notify the listeners." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setSelection(ISelection selection)" + NL + "\t{" + NL + "\t\teditorSelection = selection;" + NL;
  protected final String TEXT_476 = NL + "\t\tfor (ISelectionChangedListener listener : selectionChangedListeners)";
  protected final String TEXT_477 = NL + "\t\tfor (Iterator listeners = selectionChangedListeners.iterator(); listeners.hasNext(); )";
  protected final String TEXT_478 = NL + "\t\t{";
  protected final String TEXT_479 = NL + "\t\t\tISelectionChangedListener listener = (ISelectionChangedListener)listeners.next();";
  protected final String TEXT_480 = NL + "\t\t\tlistener.selectionChanged(new SelectionChangedEvent(this, selection));" + NL + "\t\t}" + NL + "\t\tsetStatusLineManager(selection);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setStatusLineManager(ISelection selection)" + NL + "\t{" + NL + "\t\tIStatusLineManager statusLineManager = currentViewer != null && currentViewer == contentOutlineViewer ?" + NL + "\t\t\tcontentOutlineStatusLineManager : getActionBars().getStatusLineManager();" + NL + "" + NL + "\t\tif (statusLineManager != null)" + NL + "\t\t{" + NL + "\t\t\tif (selection instanceof IStructuredSelection)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_481 = " collection = ((IStructuredSelection)selection).toList();" + NL + "\t\t\t\tswitch (collection.size())" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tcase 0:" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tstatusLineManager.setMessage(getString(\"_UI_NoObjectSelected\"));";
  protected final String TEXT_482 = NL + "\t\t\t\t\t\tbreak;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tcase 1:" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tString text = new AdapterFactoryItemDelegator(adapterFactory).getText(collection.iterator().next());" + NL + "\t\t\t\t\t\tstatusLineManager.setMessage(getString(\"_UI_SingleObjectSelected\", text));";
  protected final String TEXT_483 = NL + "\t\t\t\t\t\tbreak;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tdefault:" + NL + "\t\t\t\t\t{" + NL + "\t\t\t\t\t\tstatusLineManager.setMessage(getString(\"_UI_MultiObjectSelected\", Integer.toString(collection.size())));";
  protected final String TEXT_484 = NL + "\t\t\t\t\t\tbreak;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\telse" + NL + "\t\t\t{" + NL + "\t\t\t\tstatusLineManager.setMessage(\"\");";
  protected final String TEXT_485 = NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This looks up a string in the plugin's plugin.properties file." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static String getString(String key)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_486 = ".INSTANCE.getString(key);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This looks up a string in plugin.properties, making a substitution." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static String getString(String key, Object s1)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_487 = ".INSTANCE.getString(key, new Object [] { s1 });" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void menuAboutToShow(IMenuManager menuManager)" + NL + "\t{" + NL + "\t\t((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic EditingDomainActionBarContributor getActionBarContributor()" + NL + "\t{" + NL + "\t\treturn (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic IActionBars getActionBars()" + NL + "\t{" + NL + "\t\treturn getActionBarContributor().getActionBars();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic AdapterFactory getAdapterFactory()" + NL + "\t{" + NL + "\t\treturn adapterFactory;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_488 = NL + "\t@Override";
  protected final String TEXT_489 = NL + "\tpublic void dispose()" + NL + "\t{" + NL + "\t\tupdateProblemIndication = false;" + NL;
  protected final String TEXT_490 = NL + "\t\tResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);" + NL;
  protected final String TEXT_491 = NL + "\t\tgetSite().getPage().removePartListener(partListener);" + NL + "" + NL + "\t\tadapterFactory.dispose();" + NL + "" + NL + "\t\tif (getActionBarContributor().getActiveEditor() == this)" + NL + "\t\t{" + NL + "\t\t\tgetActionBarContributor().setActiveEditor(null);" + NL + "\t\t}" + NL;
  protected final String TEXT_492 = NL + "\t\tfor (PropertySheetPage propertySheetPage : propertySheetPages)";
  protected final String TEXT_493 = NL + "\t\tfor (Iterator i = propertySheetPages.iterator(); i.hasNext(); )";
  protected final String TEXT_494 = NL + "\t\t{";
  protected final String TEXT_495 = NL + "\t\t\tPropertySheetPage propertySheetPage = (PropertySheetPage)i.next();";
  protected final String TEXT_496 = NL + "\t\t\tpropertySheetPage.dispose();" + NL + "\t\t}" + NL + "" + NL + "\t\tif (contentOutlinePage != null)" + NL + "\t\t{" + NL + "\t\t\tcontentOutlinePage.dispose();" + NL + "\t\t}" + NL + "" + NL + "\t\tsuper.dispose();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Returns whether the outline view should be presented to the user." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected boolean showOutlineView()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_497 = ";" + NL + "\t}" + NL + "}";
  protected final String TEXT_498 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * Copyright (c) 2002-2010 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */

    GenPackage genPackage = (GenPackage)argument; GenModel genModel=genPackage.getGenModel(); /* Trick to import java.util.* without warnings */Iterator.class.getName(); 
    String importedOperationClassName = genModel.getImportedName(genModel.isRichClientPlatform() ? "org.eclipse.jface.operation.IRunnableWithProgress" : "org.eclipse.ui.actions.WorkspaceModifyOperation");
    String operationMethodName = genModel.isRichClientPlatform() ? "run" : "execute";
    String _ArrayListOfObject = "ArrayList" + (genModel.useGenerics() ? "<Object>" : "");
    String _ArrayListOfSelectionChangedListener = "ArrayList" + (genModel.useGenerics() ? "<ISelectionChangedListener>" : "");
    String _CollectionOfSelectionChangedListener = "Collection" + (genModel.useGenerics() ? "<ISelectionChangedListener>" : "");
    String _ArrayListOfResource = "ArrayList" + (genModel.useGenerics() ? "<Resource>" : "");
    String _CollectionOfResource = "Collection" + (genModel.useGenerics() ? "<Resource>" : "");
    String _MapOfResourceToDiagnostic = "Map" + (genModel.useGenerics() ? "<Resource, Diagnostic>" : "");
    String _HashMapOfResourceToBoolean = "HashMap" + (genModel.useGenerics() ? "<Resource, Boolean>" : "");
    String _MapOfObjectToObject = "Map" + (genModel.useGenerics() ? "<Object, Object>" : "");
    String _HashMapOfObjectToObject = "HashMap" + (genModel.useGenerics() ? "<Object, Object>" : "");
    String _LinkedHashMapOfResourceToDiagnostic = "LinkedHashMap" + (genModel.useGenerics() ? "<Resource, Diagnostic>" : "");
    String _CollectionOfAnything = "Collection" + (genModel.useGenerics() ? "<?>" : "");
    String _ListOfAnything = "List" + (genModel.useGenerics() ? "<?>" : "");
    boolean useExtendedLabelProvider = genModel.isStyleProviders() || genModel.isFontProviders() || genModel.isColorProviders();
    boolean useStyledLabelProvider = genModel.isStyleProviders();
    String _AdapterFactoryLabelProvider = (useStyledLabelProvider ? "AdapterFactoryLabelProvider.StyledLabelProvider" : "AdapterFactoryLabelProvider" + (genModel.isFontProviders() && genModel.isColorProviders() ? ".FontAndColorProvider" : genModel.isFontProviders() ? ".FontProvider" : genModel.isColorProviders() ? ".ColorProvider" : ""));
    String _DelegatingAdapterFactoryLabelProvider = useStyledLabelProvider ? genModel.getImportedName("org.eclipse.emf.edit.ui.provider.DelegatingStyledCellLabelProvider") + (genModel.isFontProviders() && genModel.isColorProviders() ? ".FontAndColorProvider" : genModel.isFontProviders() ? ".FontProvider" : genModel.isColorProviders() ? ".ColorProvider" : "") : "";
    String _DecoratingColumLabelProvider = genModel.getDecoration() != GenDecoration.NONE ? genModel.getImportedName("org.eclipse.emf.edit.ui.provider.DecoratingColumLabelProvider") + (useStyledLabelProvider ? ".StyledLabelProvider" : "") : "";
    String _DiagnosticDecorator = genModel.getDecoration() != GenDecoration.NONE ? genModel.getImportedName("org.eclipse.emf.edit.ui.provider.DiagnosticDecorator") + (useStyledLabelProvider ? ".Styled" : "") : "";
    String _ArrayListOfString = "ArrayList" + (genModel.useGenerics() ? "<String>" : "");
    String _ListOfString = "List" + (genModel.useGenerics() ? "<String>" : "");
    String _ListOfPropertySheetPage = "List" + (genModel.useGenerics() ? "<PropertySheetPage>" : "");
    String _ArrayListOfPropertySheetPage = "ArrayList" + (genModel.useGenerics() ? "<PropertySheetPage>" : "");
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(genPackage.getPresentationPackageName());
    stringBuffer.append(TEXT_3);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF29_VALUE) {
    stringBuffer.append(TEXT_8);
    }
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_9);
    }
    stringBuffer.append(TEXT_10);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_13);
    }
    stringBuffer.append(TEXT_14);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF29_VALUE) {
    stringBuffer.append(TEXT_15);
    }
    stringBuffer.append(TEXT_16);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_20);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_22);
    if (!genModel.isRichClientPlatform() && genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_25);
    }
    stringBuffer.append(TEXT_26);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_27);
    }
    stringBuffer.append(TEXT_28);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_29);
    }
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
    if (!genModel.isRichClientPlatform() && genModel.getRuntimeVersion().getValue() < GenRuntimeVersion.EMF23_VALUE) {
    stringBuffer.append(TEXT_32);
    }
    stringBuffer.append(TEXT_33);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_34);
    }
    stringBuffer.append(TEXT_35);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF23_VALUE) {
    stringBuffer.append(TEXT_36);
    }
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_37);
    }
    if (genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genPackage.getQualifiedItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_40);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_43);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_45);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_49);
    }
    if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_50);
    if (genPackage.isGenerateModelWizard()) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(_ListOfString);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genPackage.getImportedModelWizardClassName());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_54);
    } else {
    stringBuffer.append(TEXT_55);
    stringBuffer.append(_ListOfString);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genModel.getImportedName("java.util.Arrays"));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    stringBuffer.append(TEXT_60);
    }
    stringBuffer.append(TEXT_61);
    stringBuffer.append(_ListOfString);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(_ListOfString);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(_ListOfString);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(_ArrayListOfString);
    stringBuffer.append(TEXT_65);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_66);
    } else {
    stringBuffer.append(TEXT_67);
    }
    stringBuffer.append(TEXT_68);
    }
    stringBuffer.append(TEXT_69);
    stringBuffer.append(_ListOfPropertySheetPage);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(_ArrayListOfPropertySheetPage);
    stringBuffer.append(TEXT_71);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_72);
    }
    stringBuffer.append(TEXT_73);
    stringBuffer.append(_CollectionOfSelectionChangedListener);
    stringBuffer.append(TEXT_74);
    stringBuffer.append(_ArrayListOfSelectionChangedListener);
    stringBuffer.append(TEXT_75);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_76);
    }
    stringBuffer.append(TEXT_77);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_78);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(_CollectionOfResource);
    stringBuffer.append(TEXT_81);
    stringBuffer.append(_ArrayListOfResource);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(_CollectionOfResource);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(_ArrayListOfResource);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(_CollectionOfResource);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(_ArrayListOfResource);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(_MapOfResourceToDiagnostic);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(_LinkedHashMapOfResourceToDiagnostic);
    stringBuffer.append(TEXT_88);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_89);
    }
    stringBuffer.append(TEXT_90);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_91);
    }
    stringBuffer.append(TEXT_92);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_93);
    }
    stringBuffer.append(TEXT_94);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_95);
    stringBuffer.append(_CollectionOfResource);
    stringBuffer.append(TEXT_96);
    stringBuffer.append(_ArrayListOfResource);
    stringBuffer.append(TEXT_97);
    stringBuffer.append(_CollectionOfResource);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(_ArrayListOfResource);
    stringBuffer.append(TEXT_99);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_100);
    }
    stringBuffer.append(TEXT_101);
    if (genModel.getDecoration() == GenDecoration.NONE) {
    stringBuffer.append(TEXT_102);
    }
    stringBuffer.append(TEXT_103);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_104);
    }
    stringBuffer.append(TEXT_105);
    if (genModel.getDecoration() == GenDecoration.NONE) {
    stringBuffer.append(TEXT_106);
    } else {
    stringBuffer.append(TEXT_107);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_108);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF211_VALUE) {
    stringBuffer.append(TEXT_109);
    }
    stringBuffer.append(TEXT_110);
    }
    stringBuffer.append(TEXT_111);
    stringBuffer.append(_CollectionOfResource);
    stringBuffer.append(TEXT_112);
    stringBuffer.append(_CollectionOfResource);
    stringBuffer.append(TEXT_113);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_116);
    }
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_118);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_119);
    } else {
    stringBuffer.append(TEXT_120);
    }
    stringBuffer.append(TEXT_121);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_122);
    }
    stringBuffer.append(TEXT_123);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF24_VALUE) {
    stringBuffer.append(TEXT_124);
    }
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genPackage.getGenModel().getEditorPluginID());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_127);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_128);
    } else {
    stringBuffer.append(TEXT_129);
    }
    stringBuffer.append(TEXT_130);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_131);
    }
    stringBuffer.append(TEXT_132);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_133);
    }
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_135);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_137);
    }
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_139);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_141);
    for (GenPackage aGenPackage : genModel.getAllGenPackagesWithClassifiers()) {
    if (!aGenPackage.getGenClasses().isEmpty() && aGenPackage.getGenModel().hasEditSupport()) {
    stringBuffer.append(TEXT_142);
    stringBuffer.append(aGenPackage.getImportedItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_143);
    }
    }
    for (GenPackage aGenPackage : genModel.getAllUsedGenPackagesWithClassifiers()) {
    if (!aGenPackage.getGenClasses().isEmpty() && aGenPackage.getGenModel().hasEditSupport()) {
    stringBuffer.append(TEXT_144);
    stringBuffer.append(aGenPackage.getImportedItemProviderAdapterFactoryClassName());
    stringBuffer.append(TEXT_145);
    }
    }
    //Editor/addItemproviderFactories.override.javajetinc"
    stringBuffer.append(TEXT_146);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_147);
    }
    stringBuffer.append(TEXT_148);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_149);
    }
    stringBuffer.append(TEXT_150);
    stringBuffer.append(_HashMapOfResourceToBoolean);
    stringBuffer.append(TEXT_151);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_152);
    }
    stringBuffer.append(TEXT_153);
    stringBuffer.append(_CollectionOfAnything);
    stringBuffer.append(TEXT_154);
    stringBuffer.append(_CollectionOfAnything);
    stringBuffer.append(TEXT_155);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_156);
    }
    stringBuffer.append(TEXT_157);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_158);
    }
    stringBuffer.append(TEXT_159);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_160);
    }
    stringBuffer.append(TEXT_161);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_162);
    }
    stringBuffer.append(TEXT_163);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_164);
    }
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_166);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_167);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF23_VALUE) {
    stringBuffer.append(TEXT_168);
    } else {
    stringBuffer.append(TEXT_169);
    }
    stringBuffer.append(TEXT_170);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF29_VALUE) {
    stringBuffer.append(TEXT_171);
    }
    stringBuffer.append(TEXT_172);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF211_VALUE) {
    stringBuffer.append(TEXT_173);
    } else if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF23_VALUE) {
    stringBuffer.append(TEXT_174);
    } else if (genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_175);
    } else {
    stringBuffer.append(TEXT_176);
    }
    stringBuffer.append(TEXT_177);
    stringBuffer.append(genPackage.getGenModel().getEditorPluginID());
    stringBuffer.append(TEXT_178);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genPackage.getGenModel().getEditorPluginID());
    stringBuffer.append(TEXT_181);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_183);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_184);
    }
    stringBuffer.append(TEXT_185);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_187);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_188);
    }
    stringBuffer.append(TEXT_189);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_190);
    }
    stringBuffer.append(TEXT_191);
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(_DelegatingAdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_193);
    }
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_194);
    stringBuffer.append(_DecoratingColumLabelProvider);
    stringBuffer.append(TEXT_195);
    }
    stringBuffer.append(TEXT_196);
    stringBuffer.append(_AdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_197);
    if (useExtendedLabelProvider) {
    stringBuffer.append(TEXT_198);
    }
    stringBuffer.append(TEXT_199);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_201);
    if (genModel.getDecoration() == GenDecoration.MANUAL) {
    stringBuffer.append(TEXT_202);
    }
    stringBuffer.append(TEXT_203);
    if (genModel.getDecoration() == GenDecoration.LIVE) {
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_205);
    }
    stringBuffer.append(TEXT_206);
    }
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_207);
    }
    stringBuffer.append(TEXT_208);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_209);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport"));
    stringBuffer.append(TEXT_210);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_211);
    }
    stringBuffer.append(TEXT_212);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_213);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_214);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_215);
    }
    stringBuffer.append(TEXT_216);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_217);
    }
    stringBuffer.append(TEXT_218);
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_219);
    stringBuffer.append(_DelegatingAdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_220);
    }
    stringBuffer.append(TEXT_221);
    stringBuffer.append(_AdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_222);
    if (useExtendedLabelProvider) {
    stringBuffer.append(TEXT_223);
    }
    stringBuffer.append(TEXT_224);
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_225);
    }
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_228);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_229);
    }
    stringBuffer.append(TEXT_230);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_231);
    }
    stringBuffer.append(TEXT_232);
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_233);
    stringBuffer.append(_DelegatingAdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_234);
    }
    stringBuffer.append(TEXT_235);
    stringBuffer.append(_AdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_236);
    if (useExtendedLabelProvider) {
    stringBuffer.append(TEXT_237);
    }
    stringBuffer.append(TEXT_238);
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_239);
    }
    stringBuffer.append(TEXT_240);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_242);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_243);
    }
    stringBuffer.append(TEXT_244);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_245);
    }
    stringBuffer.append(TEXT_246);
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_247);
    stringBuffer.append(_DelegatingAdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_248);
    }
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_249);
    stringBuffer.append(_DecoratingColumLabelProvider);
    stringBuffer.append(TEXT_250);
    }
    stringBuffer.append(TEXT_251);
    stringBuffer.append(_AdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_252);
    if (useExtendedLabelProvider) {
    stringBuffer.append(TEXT_253);
    }
    stringBuffer.append(TEXT_254);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_255);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_256);
    if (genModel.getDecoration() == GenDecoration.MANUAL) {
    stringBuffer.append(TEXT_257);
    }
    stringBuffer.append(TEXT_258);
    }
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_259);
    }
    stringBuffer.append(TEXT_260);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_261);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport"));
    stringBuffer.append(TEXT_262);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_263);
    }
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_265);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_266);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_267);
    }
    stringBuffer.append(TEXT_268);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_269);
    }
    stringBuffer.append(TEXT_270);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_271);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_273);
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_274);
    stringBuffer.append(_DelegatingAdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_275);
    }
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_276);
    stringBuffer.append(_DecoratingColumLabelProvider);
    stringBuffer.append(TEXT_277);
    }
    stringBuffer.append(TEXT_278);
    stringBuffer.append(_AdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_279);
    if (useExtendedLabelProvider) {
    stringBuffer.append(TEXT_280);
    }
    stringBuffer.append(TEXT_281);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_282);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_283);
    if (genModel.getDecoration() == GenDecoration.MANUAL) {
    stringBuffer.append(TEXT_284);
    }
    stringBuffer.append(TEXT_285);
    if (genModel.getDecoration() == GenDecoration.LIVE) {
    stringBuffer.append(TEXT_286);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_287);
    }
    stringBuffer.append(TEXT_288);
    }
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_289);
    }
    stringBuffer.append(TEXT_290);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport"));
    stringBuffer.append(TEXT_292);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_293);
    }
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_295);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_296);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_297);
    }
    stringBuffer.append(TEXT_298);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_299);
    }
    stringBuffer.append(TEXT_300);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_303);
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_304);
    stringBuffer.append(_DelegatingAdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_305);
    }
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_306);
    stringBuffer.append(_DecoratingColumLabelProvider);
    stringBuffer.append(TEXT_307);
    }
    stringBuffer.append(TEXT_308);
    stringBuffer.append(_AdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_309);
    if (useExtendedLabelProvider) {
    stringBuffer.append(TEXT_310);
    }
    stringBuffer.append(TEXT_311);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_312);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_313);
    if (genModel.getDecoration() == GenDecoration.MANUAL) {
    stringBuffer.append(TEXT_314);
    }
    stringBuffer.append(TEXT_315);
    if (genModel.getDecoration() == GenDecoration.LIVE) {
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_317);
    }
    stringBuffer.append(TEXT_318);
    }
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_319);
    }
    stringBuffer.append(TEXT_320);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_321);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport"));
    stringBuffer.append(TEXT_322);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_323);
    }
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_325);
    } else {
    stringBuffer.append(TEXT_326);
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(_DelegatingAdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_328);
    }
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_329);
    stringBuffer.append(_DecoratingColumLabelProvider);
    stringBuffer.append(TEXT_330);
    }
    stringBuffer.append(TEXT_331);
    stringBuffer.append(_AdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_332);
    if (useExtendedLabelProvider) {
    stringBuffer.append(TEXT_333);
    }
    stringBuffer.append(TEXT_334);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_336);
    if (genModel.getDecoration() == GenDecoration.MANUAL) {
    stringBuffer.append(TEXT_337);
    }
    stringBuffer.append(TEXT_338);
    if (genModel.getDecoration() == GenDecoration.LIVE) {
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_340);
    }
    stringBuffer.append(TEXT_341);
    }
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_342);
    }
    stringBuffer.append(TEXT_343);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_344);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport"));
    stringBuffer.append(TEXT_345);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_346);
    }
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genModel.getNonNLS());
    }
    stringBuffer.append(TEXT_348);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_349);
    }
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_351);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_352);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_353);
    }
    stringBuffer.append(TEXT_354);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_355);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF26_VALUE) {
    stringBuffer.append(TEXT_356);
    } else {
    stringBuffer.append(TEXT_357);
    }
    stringBuffer.append(TEXT_358);
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_359);
    }
    stringBuffer.append(TEXT_360);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_361);
    }
    stringBuffer.append(TEXT_362);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_363);
    }
    stringBuffer.append(TEXT_364);
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_365);
    stringBuffer.append(_DelegatingAdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_366);
    }
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_367);
    stringBuffer.append(_DecoratingColumLabelProvider);
    stringBuffer.append(TEXT_368);
    }
    stringBuffer.append(TEXT_369);
    stringBuffer.append(_AdapterFactoryLabelProvider);
    stringBuffer.append(TEXT_370);
    if (useExtendedLabelProvider) {
    stringBuffer.append(TEXT_371);
    }
    stringBuffer.append(TEXT_372);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_373);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_374);
    if (genModel.getDecoration() == GenDecoration.MANUAL) {
    stringBuffer.append(TEXT_375);
    }
    stringBuffer.append(TEXT_376);
    if (genModel.getDecoration() == GenDecoration.LIVE) {
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_378);
    }
    stringBuffer.append(TEXT_379);
    }
    if (useStyledLabelProvider) {
    stringBuffer.append(TEXT_380);
    }
    stringBuffer.append(TEXT_381);
    if (genModel.getDecoration() != GenDecoration.NONE) {
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.viewer.ColumnViewerInformationControlToolTipSupport"));
    stringBuffer.append(TEXT_383);
    stringBuffer.append(_DiagnosticDecorator);
    stringBuffer.append(TEXT_384);
    }
    stringBuffer.append(TEXT_385);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_386);
    }
    stringBuffer.append(TEXT_387);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_388);
    }
    stringBuffer.append(TEXT_389);
    if (genModel.getDecoration() == GenDecoration.MANUAL) {
    stringBuffer.append(TEXT_390);
    } else if (genModel.getDecoration() == GenDecoration.LIVE) {
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_392);
    }
    stringBuffer.append(TEXT_393);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_394);
    }
    stringBuffer.append(TEXT_395);
    stringBuffer.append(_ListOfAnything);
    stringBuffer.append(TEXT_396);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_397);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_398);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_399);
    }
    stringBuffer.append(TEXT_400);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_401);
    } else {
    stringBuffer.append(TEXT_402);
    }
    stringBuffer.append(TEXT_403);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_404);
    }
    stringBuffer.append(TEXT_405);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_406);
    stringBuffer.append(_ArrayListOfObject);
    stringBuffer.append(TEXT_407);
    stringBuffer.append(_ArrayListOfObject);
    stringBuffer.append(TEXT_408);
    } else {
    stringBuffer.append(TEXT_409);
    stringBuffer.append(_ArrayListOfObject);
    stringBuffer.append(TEXT_410);
    stringBuffer.append(_ArrayListOfObject);
    stringBuffer.append(TEXT_411);
    }
    stringBuffer.append(TEXT_412);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_413);
    }
    stringBuffer.append(TEXT_414);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_415);
    }
    stringBuffer.append(TEXT_416);
    stringBuffer.append(_MapOfObjectToObject);
    stringBuffer.append(TEXT_417);
    stringBuffer.append(_HashMapOfObjectToObject);
    stringBuffer.append(TEXT_418);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF23_VALUE) {
    stringBuffer.append(TEXT_419);
    }
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF29_VALUE) {
    stringBuffer.append(TEXT_420);
    }
    stringBuffer.append(TEXT_421);
    stringBuffer.append(importedOperationClassName);
    stringBuffer.append(TEXT_422);
    stringBuffer.append(importedOperationClassName);
    stringBuffer.append(TEXT_423);
    if (!genModel.isRichClientPlatform() && genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_424);
    }
    stringBuffer.append(TEXT_425);
    stringBuffer.append(operationMethodName);
    stringBuffer.append(TEXT_426);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_427);
    } else {
    stringBuffer.append(TEXT_428);
    }
    stringBuffer.append(TEXT_429);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_430);
    }
    stringBuffer.append(TEXT_431);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF24_VALUE) {
    stringBuffer.append(TEXT_432);
    } else {
    stringBuffer.append(TEXT_433);
    }
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_435);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_436);
    }
    stringBuffer.append(TEXT_437);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_438);
    }
    stringBuffer.append(TEXT_439);
    if (genModel.isRichClientPlatform()) {
    if (genModel.isRichAjaxPlatform()) {
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.dialogs.ResourceDialog"));
    stringBuffer.append(TEXT_441);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_442);
    }
    stringBuffer.append(TEXT_443);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_444);
    }
    stringBuffer.append(TEXT_445);
    stringBuffer.append("List" + (genModel.useGenerics() ? "<URI>" : ""));
    stringBuffer.append(TEXT_446);
    stringBuffer.append(genModel.useGenerics() ? "": "(URI)");
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.URIEditorInput"));
    stringBuffer.append(TEXT_448);
    } else {
    stringBuffer.append(TEXT_449);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_450);
    }
    stringBuffer.append(TEXT_451);
    stringBuffer.append(genModel.getImportedName(genModel.getQualifiedEditorAdvisorClassName()));
    stringBuffer.append(TEXT_452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.swt.SWT"));
    stringBuffer.append(TEXT_453);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.ui.URIEditorInput"));
    stringBuffer.append(TEXT_454);
    }
    } else {
    stringBuffer.append(TEXT_455);
    }
    stringBuffer.append(TEXT_456);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_457);
    }
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genModel.getImportedName("org.eclipse.core.runtime.NullProgressMonitor"));
    stringBuffer.append(TEXT_459);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_460);
    if (genModel.getRuntimeVersion().getValue() >= GenRuntimeVersion.EMF23_VALUE) {
    stringBuffer.append(TEXT_461);
    stringBuffer.append(_ListOfAnything);
    stringBuffer.append(TEXT_462);
    } else {
    stringBuffer.append(TEXT_463);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_464);
    }
    stringBuffer.append(TEXT_465);
    }
    stringBuffer.append(TEXT_466);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_467);
    }
    stringBuffer.append(TEXT_468);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_469);
    }
    stringBuffer.append(TEXT_470);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_471);
    }
    stringBuffer.append(TEXT_472);
    if (genPackage.isMultipleEditorPages()) {
    stringBuffer.append(TEXT_473);
    } else {
    stringBuffer.append(TEXT_474);
    }
    stringBuffer.append(TEXT_475);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_476);
    } else {
    stringBuffer.append(TEXT_477);
    }
    stringBuffer.append(TEXT_478);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_479);
    }
    stringBuffer.append(TEXT_480);
    stringBuffer.append(_CollectionOfAnything);
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_482);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_483);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_485);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genPackage.getImportedEditorPluginClassName());
    stringBuffer.append(TEXT_487);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_488);
    }
    stringBuffer.append(TEXT_489);
    if (!genModel.isRichClientPlatform()) {
    stringBuffer.append(TEXT_490);
    }
    stringBuffer.append(TEXT_491);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_492);
    } else {
    stringBuffer.append(TEXT_493);
    }
    stringBuffer.append(TEXT_494);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_495);
    }
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genPackage.isMultipleEditorPages());
    stringBuffer.append(TEXT_497);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_498);
    return stringBuffer.toString();
  }
}
