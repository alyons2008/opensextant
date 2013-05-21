/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mitre.opensextant.desktop.ui.forms;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author GBLACK
 */
@SuppressWarnings("serial")
public class ConfigFrame extends javax.swing.JFrame {

    private static Logger log = LoggerFactory.getLogger(ConfigFrame.class);

	/**
	 * Creates new form LoadForm
	 */
	public ConfigFrame() {

		initComponents();
		java.net.URL imgURL = ConfigFrame.class.getResource("/org/mitre/opensextant/desktop/icons/logo.png");
		if (imgURL != null) {
			this.setIconImage(new ImageIcon(imgURL, "Icon").getImage());
		}

	}


	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox3 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        doneButton = new javax.swing.JButton();
        browseOutButton = new javax.swing.JButton();
        outputText = new javax.swing.JTextField();
        outputLabel = new javax.swing.JLabel();
        pathLabel = new javax.swing.JLabel();
        formatLabel = new javax.swing.JLabel();
        csvCheck = new javax.swing.JCheckBox();
        jsonCheck = new javax.swing.JCheckBox();
        kmlCheck = new javax.swing.JCheckBox();
        wktCheck = new javax.swing.JCheckBox();
        shapefileCheck = new javax.swing.JCheckBox();
        threadsLabel = new javax.swing.JLabel();
        threadCount = new javax.swing.JSpinner();

        jCheckBox3.setText("JSON");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuration");
        setResizable(false);

        doneButton.setText("Done");

        browseOutButton.setText("Browse...");
        browseOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseOutButtonActionPerformed(evt);
            }
        });

        outputText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputTextActionPerformed(evt);
            }
        });

        outputLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputLabel.setText("Output");

        pathLabel.setText("Path:");

        formatLabel.setText("Format:");

        csvCheck.setText("CSV");
        csvCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvCheckActionPerformed(evt);
            }
        });

        jsonCheck.setText("JSON");
        jsonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsonCheckActionPerformed(evt);
            }
        });

        kmlCheck.setText("KML");
        kmlCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmlCheckActionPerformed(evt);
            }
        });

        wktCheck.setText("WKT");
        wktCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wktCheckActionPerformed(evt);
            }
        });

        shapefileCheck.setText("Shapefile");
        shapefileCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapefileCheckActionPerformed(evt);
            }
        });

        threadsLabel.setText("Threads:");

        threadCount.setModel(new javax.swing.SpinnerNumberModel(1, 1, 25, 1));
        threadCount.setToolTipText("the number of threads to use during processing");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outputLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formatLabel)
                            .addComponent(pathLabel)
                            .addComponent(threadsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(csvCheck)
                                    .addComponent(jsonCheck)
                                    .addComponent(kmlCheck))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(shapefileCheck)
                                    .addComponent(wktCheck))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(outputText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(browseOutButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(threadCount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseOutButton)
                    .addComponent(pathLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formatLabel)
                    .addComponent(csvCheck)
                    .addComponent(wktCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsonCheck)
                    .addComponent(shapefileCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kmlCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(threadsLabel)
                    .addComponent(threadCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(doneButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void outputTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_outputTextActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_outputTextActionPerformed

	private void jsonCheckActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jsonCheckActionPerformed
		// TODO: Kludgey, should be rewriten when we can output multiple formats
		csvCheck.setSelected(false);
		kmlCheck.setSelected(false);
		wktCheck.setSelected(false);
		shapefileCheck.setSelected(false);
		// jsonCheck.setSelected(false);
	}// GEN-LAST:event_jsonCheckActionPerformed

	private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox3ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jCheckBox3ActionPerformed

	private void kmlCheckActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kmlCheckActionPerformed
		// TODO: Kludgey, should be rewriten when we can output multiple formats
		csvCheck.setSelected(false);
		// kmlCheck.setSelected(false);
		wktCheck.setSelected(false);
		shapefileCheck.setSelected(false);
		jsonCheck.setSelected(false);
	}// GEN-LAST:event_kmlCheckActionPerformed

	private void wktCheckActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_wktCheckActionPerformed
		// TODO: Kludgey, should be rewriten when we can output multiple formats
		csvCheck.setSelected(false);
		kmlCheck.setSelected(false);
		// wktCheck.setSelected(false);
		shapefileCheck.setSelected(false);
		jsonCheck.setSelected(false);
	}// GEN-LAST:event_wktCheckActionPerformed

	private void shapefileCheckActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_shapefileCheckActionPerformed
		// TODO: Kludgey, should be rewriten when we can output multiple formats
		csvCheck.setSelected(false);
		kmlCheck.setSelected(false);
		wktCheck.setSelected(false);
		// shapefileCheck.setSelected(false);
		jsonCheck.setSelected(false);
	}// GEN-LAST:event_shapefileCheckActionPerformed

	private void browseOutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_browseOutButtonActionPerformed
		JFileChooser chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setCurrentDirectory(new File(outputText.getText()));
		int returnVal = chooser.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION)
			outputText.setText(chooser.getSelectedFile().toString());
	}// GEN-LAST:event_browseOutButtonActionPerformed

	private void csvCheckActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_csvCheckActionPerformed
		// TODO: Kludgey, should be rewriten when we can output multiple formats
		// csvCheck.setSelected(false);
		kmlCheck.setSelected(false);
		wktCheck.setSelected(false);
		shapefileCheck.setSelected(false);
		jsonCheck.setSelected(false);
	}// GEN-LAST:event_csvCheckActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			log.error(ex.getMessage());
		} catch (InstantiationException ex) {
			log.error(ex.getMessage());
		} catch (IllegalAccessException ex) {
			log.error(ex.getMessage());
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			log.error(ex.getMessage());
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ConfigFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseOutButton;
    protected javax.swing.JCheckBox csvCheck;
    protected javax.swing.JButton doneButton;
    private javax.swing.JLabel formatLabel;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JCheckBox jsonCheck;
    protected javax.swing.JCheckBox kmlCheck;
    private javax.swing.JLabel outputLabel;
    protected javax.swing.JTextField outputText;
    private javax.swing.JLabel pathLabel;
    protected javax.swing.JCheckBox shapefileCheck;
    protected javax.swing.JSpinner threadCount;
    private javax.swing.JLabel threadsLabel;
    protected javax.swing.JCheckBox wktCheck;
    // End of variables declaration//GEN-END:variables

}
