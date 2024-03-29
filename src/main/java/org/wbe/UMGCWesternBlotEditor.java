package org.wbe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.im4java.core.*;

public class UMGCWesternBlotEditor extends JFrame implements ActionListener {
    /*public void path(){
        originalImage = imagePath;
        File imgFile = new File(imagePath);
        BufferedImage img;
        try {
            img = ImageIO.read(imgFile);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        ImageIcon icon = new ImageIcon(img);
        JLabel image = new JLabel(icon);
        l_c.remove(imageScrollPane);
        imageScrollPane = new JScrollPane(image);
        l_c.add(imageScrollPane);
        l_c.revalidate();
    }*/
    private final JButton buttonResize;
    private final JButton buttonEdge;
    private final JButton buttonMonochrome;
    private final JButton buttonInvert;
    private final JButton buttonBrightnessContrast;
    private final JButton buttonSC;
    private final JButton buttonReset;
    private final JButton buttonLastImage;

    // test jbutton

    private final JButton exportHistory;
    private final JMenuItem fileOpen;
    private final JMenuItem fileSaveAs;
    private final JMenuItem editReset;
    private final JMenuItem toolsEdge;
    private final JMenuItem toolsBC;
    private final JMenuItem toolsSC;
    private final JMenuItem toolsResize;
    private final JMenuItem toolsMonochrome;
    private final JMenuItem toolsInvert;
    private final JMenuItem historyShowHistory;

    private final JMenuItem ScriptGen;
    private JScrollPane imageScrollPane;
    private final Container l_c;
    private String imagePath;
    private final String imageDirectory;
    private final String imageName;
    private String originalImage;
    private String LastImage;
    private int opCount = 0;
    List<String> historyList = new ArrayList<>(List.of());

    List<String> script = new ArrayList<>(List.of());
    //IMOperation opf = new IMOperation();

    private String extension;

    public UMGCWesternBlotEditor() throws IOException {
        super("UMGC Western Blot Editor");
        // Create Graphical Interface
        // Buttons and Listeners
        buttonResize = new JButton("Resize");
        buttonResize.addActionListener(this);

        buttonInvert = new JButton("Invert");
        buttonInvert.addActionListener(this);

        buttonEdge = new JButton("Edge");
        buttonEdge.addActionListener(this);

        JButton buttonScriptEdge = new JButton("Edge");
        buttonScriptEdge.addActionListener(this);

        buttonMonochrome = new JButton("Monochrome");
        buttonMonochrome.addActionListener(this);

        buttonBrightnessContrast = new JButton("Bright/Contrast");
        buttonBrightnessContrast.addActionListener(this);

        buttonSC = new JButton("Sigmoidal Contrast");
        buttonSC.addActionListener(this);

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(this);

        buttonLastImage = new JButton("Get Last Image");
        buttonLastImage.addActionListener(this);

        JButton generateScript = new JButton("Output script");
        generateScript.addActionListener(this);

        /* ********************************************** Create menu items **********************************************/
        fileOpen = new JMenuItem("Open");
        fileOpen.addActionListener(this);
        fileSaveAs = new JMenuItem("Save As");
        fileSaveAs.addActionListener(this);
        editReset = new JMenuItem("Reset");
        editReset.addActionListener(this);
        toolsEdge = new JMenuItem("Edge");
        toolsEdge.addActionListener(this);
        toolsBC = new JMenuItem("Brightness/Contrast");
        toolsBC.addActionListener(this);
        toolsSC = new JMenuItem("Sigmoidal Contrast");
        toolsSC.addActionListener(this);
        toolsResize = new JMenuItem("Resize");
        toolsResize.addActionListener(this);
        toolsMonochrome = new JMenuItem("Monochrome");
        toolsMonochrome.addActionListener(this);
        toolsInvert = new JMenuItem("Invert");
        toolsInvert.addActionListener(this);
        JMenuItem scriptEdge = new JMenuItem("Edge Detection Bash Script");
        scriptEdge.addActionListener(this);
        historyShowHistory = new JMenuItem("Show History");
        historyShowHistory.addActionListener(this);
        exportHistory = new JButton("Export History");
        exportHistory.addActionListener(this);
        JButton outScript = new JButton("Generate Script");
        outScript.addActionListener(this);
        ScriptGen = new JMenuItem("Generate Script");
        ScriptGen.addActionListener(this);



        /* ********************************************** Create Menu and Add Menu Items **********************************************/

        /*
        TODO:
          Adjust the quick keystrokes so that the event is stored under a singe if statement using the getModifiedEx()
          function.
         */
        //FILE MENU


        JMenu file = new JMenu("File");
        file.setMnemonic('F'); // Alt -F will access files
        //BUTTONS UNDER FILE MENU//
        //quick keystrokes -> Open = Ctrl-O
        file.add(fileOpen);
        fileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        // quick key strokes ->  Save As = Ctrl-A
        file.add(fileSaveAs);
        fileSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));

        ///EDIT MENU
        JMenu edit = new JMenu("Edit");
        edit.setMnemonic('E'); // Alt -E will access Edits
        //BUTTONS UNDER EDIT MENU
        //quick keystrokes -> Reset Image = Ctrl- R
        edit.add(editReset);
        editReset.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));

        JMenu tools = new JMenu("Tools");
        tools.setMnemonic('T'); // Alt -T will access Tools

        JMenu history = new JMenu("History");
        history.setMnemonic('H'); // Alt -H will access History
        history.add(historyShowHistory);

        JMenu scriptOut = new JMenu("Script Output");
        scriptOut.setMnemonic('S'); // Alt -S
        scriptOut.add(ScriptGen);

        // will need a help button not shown on menu bar just yet-- need to finalize program//
        JMenu help = new JMenu("Help");
        help.setMnemonic('P'); // Alt -P will access Help


        tools.add(new JLabel("Detect Lines"));
        tools.add(toolsEdge);
        tools.add(new JLabel("Detect edge and Straighten bands (Unix/Linux)"));
        tools.add(scriptEdge);
        tools.add(new JSeparator());
        tools.add(new JLabel("Transform"));
        tools.add(toolsResize);
        tools.add(new JSeparator());
        tools.add(new JLabel("Image Color"));
        tools.add(toolsBC);
        tools.add(toolsSC);
        tools.add(toolsMonochrome);
        tools.add(toolsInvert);
        // Create Menu Bar
        JMenuBar mb = new JMenuBar();
        mb.add(file);
        mb.add(edit);
        mb.add(tools);
        mb.add(history);
        mb.add(scriptOut);
        // Add Top Menu Bar
        JPanel menuBar = new JPanel();
        menuBar.setLayout(new BorderLayout());
        menuBar.add(mb);
        // Add Buttons
        JPanel panelButtonEdge = new JPanel();
        panelButtonEdge.add(new JLabel("Detect Lines"));
        panelButtonEdge.add(new JSeparator());
        panelButtonEdge.add(buttonEdge);
        panelButtonEdge.add(new JLabel("Detect Lines (Unix/Linux)"));
        panelButtonEdge.add(new JSeparator());
        panelButtonEdge.add(buttonScriptEdge);
        JPanel panelButtonTransform = new JPanel();
        panelButtonTransform.add(new JLabel("Transform"));
        panelButtonTransform.add(new JSeparator());
        panelButtonTransform.add(buttonResize);
        JPanel panelButtonColor = new JPanel();
        panelButtonColor.add(new JLabel("Color"));
        panelButtonColor.add(new JSeparator());
        panelButtonColor.add(buttonMonochrome);
        panelButtonColor.add(buttonBrightnessContrast);
        panelButtonColor.add(buttonSC);
        panelButtonColor.add(buttonInvert);
        panelButtonColor.add(buttonLastImage);
        panelButtonColor.add(buttonReset);

        // Load Initial Image ** FIND A BETTER WAY TO DO THIS!! ***
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG, TIFF, PNG, HEIC Images", "jpg", "tiff", "png", "heic", "txt", "sh", "exe");
        chooser.setFileFilter(filter);
        JTextField textFieldImagePath = new JTextField(100);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            textFieldImagePath.setText(chooser.getSelectedFile().getAbsolutePath());
        }


        imagePath = textFieldImagePath.getText();

        if (imagePath.contains(".jpg"))
            extension = ".jpg";
        else if (imagePath.contains(".tiff"))
            extension = ".tiff";
        else if (imagePath.contains(".png"))
            extension = ".png";
        else if (imagePath.contains(".heic"))
            extension = ".heic";
        originalImage = imagePath;
        File imgFile = new File(textFieldImagePath.getText());
        imageDirectory = imgFile.getParent();
        imageName = imgFile.getName();
        BufferedImage img = ImageIO.read(imgFile);
        ImageIcon icon = new ImageIcon(img);
        JLabel image = new JLabel(icon);
        imageScrollPane = new JScrollPane(image);
        buttonLastImage.setEnabled(false);

        // Load Content Pane and add components
        l_c = getContentPane();
        l_c.setLayout(new BorderLayout());
        l_c.add(menuBar, BorderLayout.NORTH);
        l_c.add(panelButtonColor, BorderLayout.SOUTH);
        l_c.add(panelButtonEdge, BorderLayout.EAST);
        l_c.add(panelButtonTransform, BorderLayout.WEST);
        l_c.add(imageScrollPane, BorderLayout.CENTER);
        pack();
        setVisible(true);

        /*try {
            FileReader istream;
            istream = new FileReader("output.sh");
            BufferedReader reader;
            reader = new BufferedReader(istream);

            FileWriter ostream;
            ostream = new FileWriter("output.sh", true);
            BufferedWriter writer;
            writer = new BufferedWriter(ostream);
            writer.write("cd " + this.imageDirectory);
            reader.close();
            writer.close();
            System.out.println("Script Executed Successfully");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }*/
    }

   /* public static void main(String[] args) throws IOException {
        UMGCWesternBlotEditor t = new UMGCWesternBlotEditor();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new File("output.sh").createNewFile();

    }*/

    // action listeners
    public void actionPerformed(ActionEvent e) {
        //String myPath="../src/main/scripts/ImageMagick-7.0.10/bin";



        String newImage;
        if (e.getSource() == fileOpen) {
            opCount = 0;
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "JPG, TIFF, PNG, HEIC Images", "jpg", "tiff", "png", "heic");
            chooser.setFileFilter(filter);
            JTextField textFieldImagePath = new JTextField(100);
            int returnVal = chooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                textFieldImagePath.setText(chooser.getSelectedFile().getAbsolutePath());
            }
            if (returnVal == JFileChooser.CANCEL_OPTION) {
                textFieldImagePath.setText(imagePath);
            }

            imagePath = textFieldImagePath.getText();
            if (imagePath.contains(".jpg"))
                extension = ".jpg";
            else if (imagePath.contains(".tiff"))
                extension = ".tiff";
            else if (imagePath.contains(".png"))
                extension = ".png";
            else if (imagePath.contains(".heic"))
                extension = ".heic";
            // Set original path to use with reset
            //path();
            imagePath = originalImage;
            File imgFile = new File(imagePath);
            BufferedImage img;
            try {
                img = ImageIO.read(imgFile);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            ImageIcon icon = new ImageIcon(img);
            JLabel image = new JLabel(icon);
            l_c.remove(imageScrollPane);
            imageScrollPane = new JScrollPane(image);
            l_c.add(imageScrollPane);
            l_c.revalidate();
            historyList.clear();
            buttonLastImage.setEnabled(false);
        }
        else if (e.getSource() == fileSaveAs) {
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "JPG, TIFF, PNG, HEIC Images", "jpg", "tiff", "png", "heic");
            fileChooser.setFileFilter(filter);
            fileChooser.setDialogTitle("Specify a file to save");
            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                ConvertCmd cmd = new ConvertCmd();
                IMOperation op = new IMOperation();
                op.addImage(imagePath);
                op.addImage(fileChooser.getSelectedFile().getAbsolutePath());
                try {
                    cmd.run(op);
                } catch (IOException | InterruptedException | IM4JavaException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        else if (e.getSource() == historyShowHistory) {
            JTextArea textArea = new JTextArea();
            JScrollPane textScrollPane = new JScrollPane(textArea);
            textArea.setEditable(false);
            for (int i = 0; i < historyList.size(); i++) {
                textArea.append(i + 1 + ". " + historyList.get(i) + "\n");
            }
            JPanel historyPanel = new JPanel();
            historyPanel.setLayout(new BorderLayout());
            historyPanel.add(textScrollPane, BorderLayout.CENTER);
            historyPanel.setSize(700, 500);
            historyPanel.add(exportHistory, BorderLayout.SOUTH);
            JFrame historyFrame = new JFrame();

            historyFrame.add(historyPanel);
            historyFrame.pack();
            historyFrame.setVisible(true);
            historyFrame.setTitle("Operations History");
        }
        else if (e.getSource() == buttonReset | e.getSource() == editReset) {
            opCount = 0;
            //path();
            imagePath = originalImage;
            File imgFile = new File(imagePath);
            BufferedImage img;
            try {
                img = ImageIO.read(imgFile);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            ImageIcon icon = new ImageIcon(img);
            JLabel image = new JLabel(icon);
            l_c.remove(imageScrollPane);
            imageScrollPane = new JScrollPane(image);
            l_c.add(imageScrollPane);
            l_c.revalidate();
            historyList.clear();
            LastImage = null;
            buttonLastImage.setEnabled(false);
            /*File file1 = new File("./refresh_output.sh");
            file1.setExecutable(true);
            try {
                ProcessBuilder pb = new ProcessBuilder("./refresh_output.sh");
                Process p = pb.start();
                p.waitFor();
                System.out.println("Script executed successfully");
            } catch (IOException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }*/

        }
        else if (e.getSource() == buttonEdge | e.getSource() == toolsEdge) {
            opCount++;
            JTextField thickness = new JTextField();
            JPanel edgePanel = new JPanel();
            edgePanel.setLayout(new GridLayout(2, 2));
            edgePanel.add(new JLabel("Thickness: "));
            edgePanel.add(thickness);
            JOptionPane.showConfirmDialog(null, edgePanel,
                    "Edge Thickness", JOptionPane.OK_CANCEL_OPTION);

            // ImageMagick Call
            ConvertCmd cmd = new ConvertCmd();

            // create the operation, add images and operators/options
            IMOperation op = new IMOperation();
            IMOperation opshell = new IMOperation();

            opshell.addImage(imageName);
            op.addImage(imagePath);

            op.edge(Double.parseDouble(thickness.getText()));
            opshell.edge(Double.parseDouble(thickness.getText()));


            newImage = imagePath.replace(extension, "_" + opCount + extension);
            String newImageshell = imageName.replace(extension, "_" + opCount + extension);

            opshell.addImage(newImageshell);
            op.addImage(newImage);

            historyList.add("edge: " + thickness.getText());

            // execute the operation
            try {

                cmd.run(op);
            } catch (IOException | InterruptedException | IM4JavaException ex) {
                throw new RuntimeException(ex);
            }

            script.add("magick " + opshell.getCmdArgs()+"\n");

            LastImage = imagePath;
            imagePath = newImage;


            File imgFile = new File(imagePath);
           // File imgFileshell = new File(newImageshell);
            BufferedImage img;
            //BufferedImage imgshell;
            try {
                img = ImageIO.read(imgFile);
              //  imgshell = ImageIO.read(imgFileshell);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            ImageIcon icon = new ImageIcon(img);
            JLabel image = new JLabel(icon);
            l_c.remove(imageScrollPane);
            imageScrollPane = new JScrollPane(image);
            l_c.add(imageScrollPane);
            l_c.revalidate();
            buttonLastImage.setEnabled(true);
        }
        /* FIXME
            else if (e.getSource() == buttonScriptEdge | e.getSource() == scriptEdge) {
            opCount++;
            JTextField Radius = new JTextField();
            JTextField LowerLimit = new JTextField();
            JTextField UpperLimit = new JTextField();
            JTextField HoughThreshold = new JTextField();
            JPanel CannyThreshold = new JPanel();
            CannyThreshold.setLayout(new GridLayout(4, 4));
            CannyThreshold.add(new JLabel("Radius (MxN): "));
            CannyThreshold.add(Radius);
            CannyThreshold.add(new JLabel("Lower Percent: "));
            CannyThreshold.add(LowerLimit);
            CannyThreshold.add(new JLabel("Upper Percent: "));
            CannyThreshold.add(UpperLimit);
            CannyThreshold.add(new JLabel("Hough-line threshold: "));
            CannyThreshold.add(HoughThreshold);
            JOptionPane.showConfirmDialog(null, CannyThreshold,
                    "Canny Edge Detection Parameter", JOptionPane.OK_CANCEL_OPTION);
            //start() will be in try catch
            File file1 = new File("./band_detection_real.sh");
            file1.setExecutable(true);
            try {
                BufferedImage imgDim = ImageIO.read(new File(imagePath));
                int width = imgDim.getWidth();
                int height = imgDim.getHeight();
                String imgDimensions = width + "x" + height;
                String threshold = Radius.getText() + "+" + LowerLimit.getText() + "%+" + UpperLimit.getText() + "%";
                String houghThreshold = "+" + HoughThreshold.getText();
                Path pathtoFolder = Path.of(imageDirectory);
                Path pathtoFile = pathtoFolder.resolve("composite.png");
                LastImage = imagePath;
                imagePath = String.valueOf(pathtoFile);
                Path last_path = Paths.get(this.LastImage);
                Path new_path = Paths.get(this.imagePath);
                String input_file_name = String.valueOf(last_path.getFileName());
                String output_file_name = String.valueOf(new_path.getFileName());
                String var1 = "\"$VAR1\"";
                String var2 = "\"$VAR2\"";
                String var3 = "\"$VAR3\"";
                String var4 = "'$VAR4'";
                String var5 = "\"$VAR5\"";
                String currentLine;
                ProcessBuilder pb = new ProcessBuilder("./band_detection_real.sh");
                Map<String, String> env = pb.environment();
                //env.put("VAR1", this.imageDirectory);
                env.put("VAR2", input_file_name);
                env.put("VAR3", threshold);
                env.put("VAR4", imgDimensions);
                env.put("VAR5", houghThreshold);
                Process p = pb.start();
                FileReader istream;
                istream = new FileReader("./band_detection_real.sh");
                BufferedReader reader;
                reader = new BufferedReader(istream);
                FileWriter ostream;
                ostream = new FileWriter("output.sh", true);
                BufferedWriter writer;
                writer = new BufferedWriter(ostream);
                while ((currentLine = reader.readLine()) != null) {
                    // currentLine = currentLine.replace(var1, input_file_name);
                    currentLine = currentLine.replace(var2, input_file_name);
                    currentLine = currentLine.replace(var3, threshold);
                    currentLine = currentLine.replace(var4, imgDimensions);
                    currentLine = currentLine.replace(var5, houghThreshold);
                    writer.write(currentLine + "\n");
                }
                reader.close();
                writer.close();
                p.waitFor();
                System.out.println("Script executed successfully");
                historyList.add("Edge Script(OS/Linux): radius: " + Radius.getText() + " lower limit: " + LowerLimit.getText() + " upper limit: " + UpperLimit.getText() + " Hough-line threshold: " + HoughThreshold.getText());
            } catch (IOException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            File imgFile = new File(imagePath);
            BufferedImage img;
            try {
                img = ImageIO.read(imgFile);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            ImageIcon icon = new ImageIcon(img);
            JLabel image = new JLabel(icon);
            l_c.remove(imageScrollPane);
            imageScrollPane = new JScrollPane(image);
            l_c.add(imageScrollPane);
            l_c.revalidate();
            buttonLastImage.setEnabled(true);
            System.out.println("Script executed successfully");
             } */
        else if (e.getSource() == buttonBrightnessContrast | e.getSource() == toolsBC) {
            opCount++;
            // Pop up window for brightness contrast params
            //Change the JTextfield for brightness/contrast so that user can use slider to adjust value or type in the value.

            JPanel bcPanel = new JPanel();
            bcPanel.setLayout(new GridLayout(2, 1));
            JOptionPane optionBPane = new JOptionPane();
            JTextField brightness = new JTextField(3);
            JSlider sliderB = new JSlider(-100, 100, 0);
            sliderB.setMajorTickSpacing(25);
            sliderB.setPaintTicks(true);
            sliderB.setPaintLabels(true);
            ChangeListener changeListener = changeEvent -> {
                JSlider theSlider = (JSlider) changeEvent.getSource();
                if (!theSlider.getValueIsAdjusting()) {
                    brightness.setText(String.valueOf(theSlider.getValue()));
                }
            };
            sliderB.addChangeListener(changeListener);
            brightness.setEditable(false);
            optionBPane.setMessage(new Object[]{"Select a Brightness: ", brightness, sliderB});
            JOptionPane optionCPane = new JOptionPane();
            JTextField contrast = new JTextField(3);
            JSlider sliderC = new JSlider(-100, 100, 0);
            sliderC.setMajorTickSpacing(25);
            sliderC.setPaintTicks(true);
            sliderC.setPaintLabels(true);
            ChangeListener changeListenerC = changeEvent -> {
                JSlider theSliderC = (JSlider) changeEvent.getSource();
                if (!theSliderC.getValueIsAdjusting()) {
                    contrast.setText(String.valueOf(theSliderC.getValue()));
                }
            };
            sliderC.addChangeListener(changeListenerC);
            contrast.setEditable(false);
            optionCPane.setMessage(new Object[]{"Select a Contrast: ", contrast, sliderC});
            bcPanel.add(optionBPane);
            bcPanel.add(optionCPane);
            JOptionPane.showConfirmDialog(null, bcPanel,
                    "Brightness / Contrast", JOptionPane.OK_CANCEL_OPTION);

            // ImageMagick Call

            ConvertCmd cmd = new ConvertCmd();

            IMOperation opshell = new IMOperation();
            IMOperation op = new IMOperation();

            opshell.addImage(imageName);
            op.addImage(imagePath);

            opshell.brightnessContrast((double) sliderB.getValue(), (double) sliderC.getValue());
            op.brightnessContrast((double) sliderB.getValue(), (double) sliderC.getValue());

            // Label new image with update

            String newImageshell = imageName.replace(extension, "_" + opCount + extension);
            newImage = imagePath.replace(extension, "_" + opCount + extension);

            // ImageMagick write newImage

            opshell.addImage(newImageshell);
            op.addImage(newImage);

            try {
                cmd.run(op);
            } catch (IOException | IM4JavaException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            historyList.add("brightness: " + sliderB.getValue() + " contrast: " + sliderC.getValue());
            // Update image path and reload image in JScrollPane
            LastImage = imagePath;
            imagePath = newImage;

            script.add("magick " + opshell.getCmdArgs()+"\n");

            File imgFile = new File(imagePath);
            BufferedImage img;
            try {
                img = ImageIO.read(imgFile);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            //Update permissions for bash script

            /*File file1 = new File("./brightness_contrast.sh");
            file1.setExecutable(true);

            // Process builder calls bash script
            try {
                ProcessBuilder pb = new ProcessBuilder("./brightness_contrast.sh");
                Map<String, String> env = pb.environment();
                // call Path class allows the use of .getFileName() which is needed to pass the file name
                // rather than the absolute path to the bash script
                Path last_path = Paths.get(this.LastImage);
                //System.out.println(last_path);
                Path new_path = Paths.get(this.imagePath);
                String input_file_name = String.valueOf(last_path.getFileName());
                String output_file_name = String.valueOf(new_path.getFileName());

                env.put("VAR1", input_file_name);
                env.put("VAR2", String.valueOf(sliderB.getValue()));
                env.put("VAR3", String.valueOf(sliderC.getValue()));
                env.put("VAR4", output_file_name);
                Process p = pb.start();
                p.waitFor();
                System.out.println("Script executed successfully");
            } catch (InterruptedException | IOException var33) {
                throw new RuntimeException(var33);
            }*/

            ImageIcon icon = new ImageIcon(img);
            JLabel image = new JLabel(icon);
            l_c.remove(imageScrollPane);
            imageScrollPane = new JScrollPane(image);
            l_c.add(imageScrollPane);
            l_c.revalidate();
            buttonLastImage.setEnabled(true);
        }
        else if (e.getSource() == buttonResize | e.getSource() == toolsResize) {
            //try {
            opCount++;
            // resize popup
            JTextField width = new JTextField(5);
            JTextField height = new JTextField(5);
            JPanel resizePanel = new JPanel();
            resizePanel.setLayout(new GridLayout(2, 2));
            resizePanel.add(new JLabel("Width: "));
            resizePanel.add(width);
            resizePanel.add(new JLabel("Height: "));
            resizePanel.add(height);
            JOptionPane.showConfirmDialog(null, resizePanel,
                    "Resize Dimensions", JOptionPane.OK_CANCEL_OPTION);

            // ImageMagick Call

            ConvertCmd cmd = new ConvertCmd();

            // create the operation, add images and operators/options

            IMOperation opshell = new IMOperation();
            IMOperation op = new IMOperation();

            opshell.addImage(imageName);
            op.addImage(imagePath);

            opshell.resize(Integer.parseInt(width.getText()), Integer.parseInt(height.getText()));
            op.resize(Integer.parseInt(width.getText()), Integer.parseInt(height.getText()));

            String newImageshell = imageName.replace(extension, "_" + opCount + extension);
            newImage = imagePath.replace(extension, "_" + opCount + extension);

            opshell.addImage(newImageshell);
            op.addImage(newImage);
            
            // execute the operation
            try {
               // cmd.setSearchPath(myPath);
                cmd.run(op);
            } catch (IOException | InterruptedException | IM4JavaException ex) {
                throw new RuntimeException(ex);
            }
            historyList.add("resize: " + Integer.parseInt(width.getText()) + "x" + Integer.parseInt(height.getText()));
            
            LastImage = imagePath;
            imagePath = newImage;
            File imgFile = new File(imagePath);
            BufferedImage img;
            try {
                img = ImageIO.read(imgFile);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            script.add("magick " + opshell.getCmdArgs()+"\n");

                ImageIcon icon = new ImageIcon(img);
                JLabel image = new JLabel(icon);
                l_c.remove(imageScrollPane);
                imageScrollPane = new JScrollPane(image);
                l_c.add(imageScrollPane);
                l_c.revalidate();
                buttonLastImage.setEnabled(true);
        }
        else if (e.getSource() == buttonMonochrome | e.getSource() == toolsMonochrome) {
            opCount++;

            // ImageMagick Call
            ConvertCmd cmd = new ConvertCmd();

            // create the operation, add images and operators/options

            IMOperation opshell = new IMOperation();
            IMOperation op = new IMOperation();

            opshell.addImage(imageName);
            op.addImage(imagePath);

            opshell.monochrome();
            op.monochrome();

            String newImageshell = imageName.replace(extension, "_" + opCount + extension);
            newImage = imagePath.replace(extension, "_" + opCount + extension);

            opshell.addImage(newImageshell);
            op.addImage(newImage);

            // execute the operation

            try {
                cmd.run(op);

            } catch (IOException | InterruptedException | IM4JavaException ex) {
                throw new RuntimeException(ex);
            }
            historyList.add("monochrome");


            LastImage = imagePath;
            imagePath = newImage;
            File imgFile = new File(imagePath);
            BufferedImage img;
            try {
                img = ImageIO.read(imgFile);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            script.add("magick " + opshell.getCmdArgs()+"\n");

            ImageIcon icon = new ImageIcon(img);
            JLabel image = new JLabel(icon);
            l_c.remove(imageScrollPane);
            imageScrollPane = new JScrollPane(image);
            l_c.add(imageScrollPane);
            l_c.revalidate();
            buttonLastImage.setEnabled(true);
        }
        else if (e.getSource() == buttonInvert | e.getSource() == toolsInvert) {
            opCount++;
            // ImageMagick Call

            ConvertCmd cmd = new ConvertCmd();

            // create the operation, add images and operators/options
            IMOperation opshell = new IMOperation();
            IMOperation op = new IMOperation();

            op.addImage(imagePath);
            opshell.addImage(imageName);

            opshell.negate();
            op.negate();

            newImage = imagePath.replace(extension, "_" + opCount + extension);
            String newImageshell = imageName.replace(extension, "_" + opCount + extension);

            opshell.addImage(newImageshell);
            op.addImage(newImage);

            // execute the operation

            try {
                cmd.run(op);
            } catch (IOException | InterruptedException | IM4JavaException ex) {
                throw new RuntimeException(ex);
            }
            historyList.add("invert/negate");

            script.add("magick " + opshell.getCmdArgs()+"\n");

            LastImage = imagePath;
            imagePath = newImage;
            File imgFile = new File(imagePath);

            BufferedImage img;
            try {
                img = ImageIO.read(imgFile);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


            ImageIcon icon = new ImageIcon(img);
            JLabel image = new JLabel(icon);
            l_c.remove(imageScrollPane);
            imageScrollPane = new JScrollPane(image);
            l_c.add(imageScrollPane);
            l_c.revalidate();
            buttonLastImage.setEnabled(true);
        }
        else if (e.getSource() == buttonSC | e.getSource() == toolsSC) {
            opCount++;
            JTextField midpoint = new JTextField(5);
            JTextField contrast = new JTextField(5);
            JPanel CSPanel = new JPanel();
            CSPanel.setLayout(new GridLayout(2, 2));
            CSPanel.add(new JLabel("Midpoint: "));
            CSPanel.add(midpoint);
            CSPanel.add(new JLabel("Contrast: "));
            CSPanel.add(contrast);
            JOptionPane.showConfirmDialog(null, CSPanel,
                    "Sigmoidal Contrasting", JOptionPane.OK_CANCEL_OPTION);

            // ImageMagick Call

            ConvertCmd cmd = new ConvertCmd();

            // create the operation, add images and operators/options

            IMOperation opshell = new IMOperation();
            IMOperation op = new IMOperation();

            opshell.addImage(imageName);
            op.addImage(imagePath);

            opshell.sigmoidalContrast(Double.parseDouble(contrast.getText()), Double.parseDouble(midpoint.getText()));
            op.sigmoidalContrast(Double.parseDouble(contrast.getText()), Double.parseDouble(midpoint.getText()));

            String newImageshell = imageName.replace(extension, "_" + opCount + extension);
            newImage = imagePath.replace(extension, "_" + opCount + extension);

            historyList.add("sigmoidal contrast: midpoint= " + midpoint.getText() + " contrast= " + midpoint.getText());

            opshell.addImage(newImageshell);
            op.addImage(newImage);

            // execute the operation

            try {
                cmd.run(op);
            } catch (IOException | InterruptedException | IM4JavaException ex) {
                throw new RuntimeException(ex);
            }

            script.add("magick " + opshell.getCmdArgs()+"\n");

            LastImage = imagePath;
            imagePath = newImage;
            File imgFile = new File(imagePath);
            BufferedImage img;
            try {
                img = ImageIO.read(imgFile);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            //Update permissions for bash script

          /*  File file1 = new File("./sigmoidal.sh");
            file1.setExecutable(true);

            // Process builder calls bash script
            try {
                ProcessBuilder pb = new ProcessBuilder("./sigmoidal.sh");
                Map<String, String> env = pb.environment();
                // call Path class allows the use of .getFileName() which is needed to pass the file name
                // rather than the absolute path to the bash script
                //Path last_path = Paths.get(this.LastImage);
                //Path new_path = Paths.get(this.imagePath);
                //String input_file_name = String.valueOf(last_path.getFileName());
                //String output_file_name = String.valueOf(new_path.getFileName());

                env.put("VAR1", this.LastImage);
                env.put("VAR2", String.valueOf(midpoint.getText()));
                env.put("VAR3", String.valueOf(contrast.getText()));
                env.put("VAR4", this.imagePath);
                Process p = pb.start();
                p.waitFor();
                System.out.println("Script executed successfully");
            } catch (InterruptedException | IOException var21) {
                throw new RuntimeException(var21);
            }*/

            ImageIcon icon = new ImageIcon(img);
            JLabel image = new JLabel(icon);
            l_c.remove(imageScrollPane);
            imageScrollPane = new JScrollPane(image);
            l_c.add(imageScrollPane);
            l_c.revalidate();
            buttonLastImage.setEnabled(true);
        }
        else if (e.getSource() == exportHistory) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a (.txt)file to save");
            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                PrintWriter output;
                try {
                    output = new PrintWriter(fileChooser.getSelectedFile());
                    output.write("Order of Operations on Image " + originalImage + "\n");
                    for (int i = 0; i < historyList.size(); i++) {
                        output.write(i + 1 + ". " + historyList.get(i) + "\n");
                    }
                    output.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        else if (e.getSource() == buttonLastImage) {
            opCount--;
            imagePath = LastImage;
            File imgFile = new File(imagePath);
            BufferedImage img;
            try {
                img = ImageIO.read(imgFile);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            //Update permissions for bash script

         /*   File file1 = new File("./remove_last.sh");
            file1.setExecutable(true);

            // Process builder calls bash script
            try {
                ProcessBuilder pb = new ProcessBuilder("./remove_last.sh");
                Process p = pb.start();
                p.waitFor();
                System.out.println("Script executed successfully");
            } catch (InterruptedException | IOException var18) {
                throw new RuntimeException(var18);
            }*/

            ImageIcon icon = new ImageIcon(img);
            JLabel image = new JLabel(icon);
            l_c.remove(imageScrollPane);
            imageScrollPane = new JScrollPane(image);
            l_c.add(imageScrollPane);
            l_c.revalidate();
            int lastItemIndex = historyList.size() - 1;
            historyList.remove(lastItemIndex);

            script.remove(String.valueOf(lastItemIndex));

            buttonLastImage.setEnabled(false);
        }
        else if (e.getSource() == ScriptGen) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Specify a (.sh/.exe)file to save");
            int userSelection = fileChooser.showSaveDialog(null);
            if (userSelection == JFileChooser.APPROVE_OPTION) {
                try {
                    PrintWriter output = new PrintWriter(fileChooser.getSelectedFile());
                    output.write("cd "+ imageDirectory+"\n");
                    output.append(script.toString().replace("[","").replace("]","").replace(",","").strip());
                    output.close();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }
    }
}




/*
fixme
    if there is more than one operation being performed, starting from the second operation, the last image is not
    used as the initial image in the operation, and instead uses the very first image see ex below
    op 1: magick 1.jpg -negate 1_1.jpg
    op 2: magick 1.jpg -resize 500x250 1_2.jpg
    op 3: magick 1.jpg -monochrome 1_3.jpg
*/