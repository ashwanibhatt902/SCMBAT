/*
Copyright (C) 2016 Syracuse University

This file is part of the Spectrum Consumption Model Builder and
Analysis Tool

This program is free software; you can redistribute it and/or modify it
under the terms of the GNU General Public License as published by the
Free Software Foundation; either version 3 of the License, or (at your
option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License
along with program.  If not, see <http://www.gnu.org/licenses/>.

*/

/**
* ExecuteBWRated.java
* Creates a report window to display compatibility results 
* for Bandwidth rated underlay masks
*/

package Execute;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import org.apache.log4j.Logger;

import SCM_home.Home;
import SCM_home.Open;
import dk.ange.octave.OctaveEngine;
import dk.ange.octave.OctaveEngineFactory;
import dk.ange.octave.type.OctaveDouble;

public class ExecuteBWRated {

	String plotPath = "Octave/BWRatedAnalysis.png";
	JFrame frame;
	JLabel picLabel;
	JLabel statusLabel=new JLabel();
	
	DefaultListModel<String> ListModel1 = new DefaultListModel<>();
	JScrollPane allCompatPane = new JScrollPane();
	JList<String> allCompatList = new JList<String>(ListModel1);

	DefaultListModel<String> ListModel2 = new DefaultListModel<>();
	JScrollPane nonCompatPane = new JScrollPane();
	JList<String> nonCompatList = new JList<String>(ListModel2);
	
	DefaultListModel<String> ListModel3 = new DefaultListModel<>();
	JScrollPane compatPane = new JScrollPane();
	JList<String> compatList = new JList<String>(ListModel3);
	
	JButton CombButton = new JButton("Combinational Compatibility");
    
	final Logger logger = Logger.getLogger(ExecuteBWRated.class);
	
	public JFrame getFrame(final ArrayList<OctaveDouble> bW, 
			final ArrayList<OctaveDouble> pSD, 
			final ArrayList<Integer> indexList){
		logger.addAppender(Home.appender);
		frame = new JFrame("Compatibility Analysis Report");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		
        final Insets insets = frame.getInsets();
        frame.setSize((2*550) + insets.left + insets.right,
                      (700) + insets.top + insets.bottom);
        frame.setVisible(true);
		
        BufferedImage img = null;
        try{
        	img = ImageIO.read(new File(plotPath));
        	
        }catch(Exception e){
        	e.printStackTrace();
        }
        int w = img.getWidth();
        int h = img.getHeight();
        
        BufferedImage NewImg = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
        AffineTransform at = new AffineTransform();
        at.scale(0.5, 0.5);
        
        AffineTransformOp scaleOp = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
        NewImg = scaleOp.filter(img,NewImg);
        
        picLabel = new JLabel(new ImageIcon(NewImg));
        
       // Graphics g = img.getGraphics();
       
        Dimension picSize = picLabel.getPreferredSize();
        picLabel.setBounds(25, 50, picSize.width, picSize.height);        
        frame.add(picLabel);
        
        JLabel resultLabel = new JLabel("Graphical result");
        Dimension resultLabelSize = resultLabel.getPreferredSize();
        resultLabel.setBounds(25,30,resultLabelSize.width,resultLabelSize.height);
        frame.add(resultLabel);
        
        JLabel nonCompatLabel = new JLabel("Not Compatible");
        Dimension labelSize = nonCompatLabel.getPreferredSize();
        nonCompatLabel.setBounds(700,50, labelSize.width, labelSize.height);
        frame.add(nonCompatLabel);
        
        Dimension listSize = nonCompatList.getPreferredSize();
        nonCompatPane.setBounds(700,80,listSize.width+200,listSize.height+100);
        nonCompatPane.setViewportView(nonCompatList);
        frame.add(nonCompatPane);
        
        JLabel allCompatLabel = new JLabel("Compatible with all");
        allCompatLabel.setBounds(700,230, labelSize.width + 200, labelSize.height);
        frame.add(allCompatLabel);
        
        allCompatPane.setBounds(700,260,listSize.width+200,listSize.height+100);
        allCompatPane.setViewportView(allCompatList);
        frame.add(allCompatPane);
        
        JLabel compatLabel = new JLabel("Compatible with specific masks");
        compatLabel.setBounds(700,410, labelSize.width + 200, labelSize.height);
        frame.add(compatLabel);
        
        compatPane.setBounds(700,440,listSize.width+200,listSize.height+100);
        compatPane.setViewportView(compatList);
        frame.add(compatPane);
        
        Dimension CombButtonSize = CombButton.getPreferredSize();
        CombButton.setBounds(700, 565, CombButtonSize.width, CombButtonSize.height);
        frame.add(CombButton);
        
        
// Defining operations for a combination of Bandwidth Rated Masks.
        
        CombButton.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				
				String status = "none";
				
				File workingDir = new File("Octave");

				OctaveEngineFactory octaveFactory = new OctaveEngineFactory();
				octaveFactory.setWorkingDir(workingDir);
				OctaveEngine octave = octaveFactory.getScriptEngine();
				
				int[] selectedIndices = compatList.getSelectedIndices();
				
				double[] bwListDouble = new double[selectedIndices.length];
				double[] mpsdListDouble = new double[selectedIndices.length];
				
				for(int i=0; i<selectedIndices.length; i++){
					
					int index = indexList.get(selectedIndices[i]);
							
					bwListDouble[i]=bW.get(index).getData()[0];
					mpsdListDouble[i]=pSD.get(index).getData()[0];
					
					System.out.println(bwListDouble[i]);
					System.out.println(mpsdListDouble[i]);
					System.out.println("");
					
					
					
					  logger.info(bwListDouble[i]);
					  logger.info(mpsdListDouble[i]);
					  logger.info("");
					//Adding the logs
				//	Home.LOGGER.log(Level.INFO, "Bandwidth Mask list item "+bwListDouble[i]+" "+ mpsdListDouble[i]);
					
				}
				
				OctaveDouble bwList = new OctaveDouble(bwListDouble,1,selectedIndices.length);
				OctaveDouble MPSDList = new OctaveDouble(mpsdListDouble,1,selectedIndices.length);
				
				octave.put("bwList", bwList);
				octave.put("MPSDList", MPSDList);
				octave.eval("[epsd,compatBWMask_List] = BWRatedCompliance (bwList, MPSDList);");
				double[] compatBWList = octave.get(OctaveDouble.class, "compatBWMask_List").getData();
				
				ArrayList<String> compatBWStringList = new ArrayList<String>();
				
				for(int i=0; i<compatBWList.length; i++){				
					compatBWStringList.add(String.valueOf(compatBWList[i])+ " ");
					System.out.println(compatBWList[i]);
					
					  logger.info(compatBWList[i]);
				}
				
				status = compatBWStringList.toString();
				frame.remove(statusLabel);
				statusLabel.setText("Compatible with " + status + "MHz Rated Masks");
				Dimension statusLabelSize = statusLabel.getPreferredSize();
				statusLabel.setBounds(700, 600, statusLabelSize.width, statusLabelSize.height);
				frame.add(statusLabel);
				frame.revalidate();
				frame.repaint();
			}
			
        });
        
		return frame;
		
	}


	JFrame showStatusFrame(){
		
		JFrame frame = new JFrame("Compatibility Status");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel label = new JLabel("The selected combination in compatible with the following Bandwidth Rated Underlay Masks");
		Dimension labelSize = label.getPreferredSize();
		label.setBounds(25,10,labelSize.width,labelSize.height);
		frame.add(label);
		
		return frame;
	}
	
	void buildAllCompatList(ArrayList<String> allCompatModelList){
		DefaultListModel<String> listModel = (DefaultListModel<String>) allCompatList.getModel();
		for(int i=0;i<allCompatModelList.size();i++){
        	listModel.addElement(allCompatModelList.get(i));
        }
	};
	
	void buildNonCompatList(ArrayList<String> nonCompatModelList){
		DefaultListModel<String> listModel = (DefaultListModel<String>) nonCompatList.getModel();
		for(int i=0;i<nonCompatModelList.size();i++){
        	listModel.addElement(nonCompatModelList.get(i));
        }
	};
	
	void buildCompatList(ArrayList<String> compatModelList){
		DefaultListModel<String> listModel = (DefaultListModel<String>) compatList.getModel();
        for(int i=0;i<compatModelList.size();i++){
        	listModel.addElement(compatModelList.get(i));
        }		
	};

}


