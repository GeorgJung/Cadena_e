package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class GraphicalProcessEditorModelElementTypes {

	/**
	 * @generated
	 */
	private GraphicalProcessEditorModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Graph_1000 = getElementType("GraphicalProcessEditor.diagram.Graph_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Process_2001 = getElementType("GraphicalProcessEditor.diagram.Process_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Join_2002 = getElementType("GraphicalProcessEditor.diagram.Join_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputPort_3001 = getElementType("GraphicalProcessEditor.diagram.InputPort_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputPort_3002 = getElementType("GraphicalProcessEditor.diagram.OutputPort_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputPort_4001 = getElementType("GraphicalProcessEditor.diagram.InputPort_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType OutputPort_4002 = getElementType("GraphicalProcessEditor.diagram.OutputPort_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transaction_4003 = getElementType("GraphicalProcessEditor.diagram.Transaction_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return GraphicalProcessEditor.graphicalprocesseditormodel.diagram.part.GraphicalProcessEditorModelDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(
					Graph_1000,
					GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
							.getGraph());

			elements.put(
					Process_2001,
					GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
							.getProcess());

			elements.put(
					Join_2002,
					GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
							.getJoin());

			elements.put(
					InputPort_3001,
					GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
							.getInputPort());

			elements.put(
					OutputPort_3002,
					GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
							.getOutputPort());

			elements.put(
					InputPort_4001,
					GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
							.getInputPort());

			elements.put(
					OutputPort_4002,
					GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
							.getOutputPort());

			elements.put(
					Transaction_4003,
					GraphicalProcessEditor.graphicalprocesseditormodel.GraphicalprocesseditormodelPackage.eINSTANCE
							.getTransaction());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Graph_1000);
			KNOWN_ELEMENT_TYPES.add(Process_2001);
			KNOWN_ELEMENT_TYPES.add(Join_2002);
			KNOWN_ELEMENT_TYPES.add(InputPort_3001);
			KNOWN_ELEMENT_TYPES.add(OutputPort_3002);
			KNOWN_ELEMENT_TYPES.add(InputPort_4001);
			KNOWN_ELEMENT_TYPES.add(OutputPort_4002);
			KNOWN_ELEMENT_TYPES.add(Transaction_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.GraphEditPart.VISUAL_ID:
			return Graph_1000;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.ProcessEditPart.VISUAL_ID:
			return Process_2001;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return Join_2002;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
			return InputPort_3001;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
			return OutputPort_3002;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPort2EditPart.VISUAL_ID:
			return InputPort_4001;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPort2EditPart.VISUAL_ID:
			return OutputPort_4002;
		case GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.TransactionEditPart.VISUAL_ID:
			return Transaction_4003;
		}
		return null;
	}

}
