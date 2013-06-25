package GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.custom;

import java.util.List;


 
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.tools.AbstractTool.Input;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;

import GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.InputPortEditPart;
import GraphicalProcessEditor.graphicalprocesseditormodel.diagram.edit.parts.OutputPortEditPart;

public class OperatorCompartmentFigureListener implements FigureListener{
	
	private ListCompartmentEditPart compartmentEditPart = null;
	private RoundedRectangle roundedRectangle = null;
 
	public static final double MARGIN = 20; // The margin to apply before drawing our operator
	public static final double R = 50; // The base length
	public static final double REF_W = 2 * MARGIN + R * 6; // Reference width
	public static final double REF_H = 2 * MARGIN + R * 5; // Reference height
 
	public OperatorCompartmentFigureListener(ListCompartmentEditPart compartmentEditPart, RoundedRectangle roundedRectangle) {
		this.compartmentEditPart = compartmentEditPart;
		this.roundedRectangle = roundedRectangle;
	}
 
	@Override
	public void figureMoved(IFigure f) {
		ResizableCompartmentFigure figure = (ResizableCompartmentFigure) f;
		if (figure.getSize().width != 0) {
			IFigure contentPane = figure.getContentPane();
			Insets is = figure.getInsets();
			// Determine the scale to apply
			double xScale = ((double) figure.getSize().width - is.left - is.right) / REF_W;
			double yScale = ((double) figure.getSize().height - is.top - is.bottom) / REF_H;
 
			// Set the constraints (bounds) for the rounded rectangle
			List<AbstractEditPart> childs = compartmentEditPart.getChildren();
			int factor;
			
			if(childs.size()>6)
			{
				factor = childs.size()-6;
				
			}
			else
			{
				factor =0;
				
			}
				
			Rectangle constraint = new Rectangle(
					(int) ((MARGIN + R) * xScale),
					(int) ((MARGIN) * yScale), 
					(int) (R * 4 * xScale),
					(int) (R *( 5 + factor )* yScale));
			contentPane.setConstraint(roundedRectangle, constraint);
 
			// Set the constraints for the input and output nodes
			
			int OutputsProcessed = 0;
			for (AbstractEditPart child : childs) {
				if (child instanceof AbstractGraphicalEditPart) {
					AbstractGraphicalEditPart gEditPart = (AbstractGraphicalEditPart) child;
					// Operator output ?
					if (gEditPart instanceof InputPortEditPart) {
						constraint = new Rectangle(
								(int) (MARGIN  * xScale),
								(int) ((REF_H - R) / 2 * yScale),
								(int) (R * xScale), 
								(int) (R * yScale));
						contentPane.setConstraint(gEditPart.getFigure(), constraint);
						
					}
					// Operator input ?
					else if (gEditPart instanceof OutputPortEditPart) {
						int num =0;
						OutputsProcessed++;
						if(OutputsProcessed == 3)
						{
							num = (int) ((MARGIN) * yScale);
						}
						else if(OutputsProcessed == 2)
						{
							num = (int) ((MARGIN + R * 4) * yScale);
						}
						else if(OutputsProcessed ==4)
						{
							num = (int) ((MARGIN + R * 1) * yScale);
						}
						else if(OutputsProcessed ==5)
						{
							num = (int) ((MARGIN + R * 3) * yScale);
						}
						else if(OutputsProcessed > 5)
						{
							num = (int) ((MARGIN + R * OutputsProcessed) * yScale);
						}
						else
						{
							num = (int) ((MARGIN + R * 2) * yScale);
						}
						constraint = new Rectangle(
								(int) ((REF_W - MARGIN - R)* xScale),
								num,
								(int) (R * xScale), 
								(int) (R * yScale));
						contentPane.setConstraint(gEditPart.getFigure(), constraint);
						//OutputsProcessed--; // This boolean heps to know if we process the first or the seconde operator input
					}
				}
			}
		}
	}
	
	
	
}
