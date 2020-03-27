import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ControlPanel  extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    //create all buttons (Load, Reset, Exit)
    JButton loadBtn = new JButton("Load");
    JButton  resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        //change the default layout manager (just for fun)
        setLayout(new GridLayout(1, 4));
        //add all buttons ...TODO
        //configure listeners for all buttons
        add(saveBtn);
        add(loadBtn);
        add(resetBtn);
        add(exitBtn);

        loadBtn.addActionListener(this::load);
        resetBtn.addActionListener(this::reset);
        exitBtn.addActionListener(this::exit);
        saveBtn.addActionListener(this::save);

    }
    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "JPG", new File("C:/Users/Teodora/Desktop/poza1.jpg"));
        } catch (IOException ex)
        { System.err.println(ex); }
    }
    // ...TODO
    private void load(ActionEvent e) {
        try {
            JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            File selFile = null;
            add(chooser);
            int returnValue = chooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                selFile = chooser.getSelectedFile();
                BufferedImage image = ImageIO.read(new File(selFile.getAbsolutePath()));
                frame.canvas.graphics.drawImage(image, 0, 0, null);
                frame.canvas.repaint();
            }
        } catch (IOException ex)
        { System.err.println(ex); }

    }
    private void exit(ActionEvent e) {
        System.exit(0);
    }
    private void reset(ActionEvent e) {
        frame.canvas.graphics.setColor(Color.WHITE);
        frame.canvas.graphics.fillRect(0, 0, 800, 600);
        frame.canvas.repaint();
    }

}
