/*
This program is to create a window with some functions
1. adding buttons;
2. adding labels
3. adding text fields and text areas
4. adding item selectors(checkbox, combobox, list)
5. adding radio buttons, more components(JSlider/JProgressBar/JMenuBar)are available in javax.swing
*/


import javax.swing.*;
import java.time.LocalDateTime;

public class Window extends JFrame {
    JPanel pnl = new JPanel();

    //1. adding buttons
    //for JAR(single Java archive)
    ClassLoader ldr = this.getClass().getClassLoader();
    java.net.URL tickURL = ldr.getResource("checked.png");
    java.net.URL crossURL = ldr.getResource("cross1.png");
    ImageIcon tick = new ImageIcon(tickURL);
    ImageIcon cross = new ImageIcon(crossURL);
    //ImageIcon tick = new ImageIcon("tick.png");
    //ImageIcon cross = new ImageIcon("cross.png");

    JButton btn1 = new JButton("Click Me");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton("STOP", cross);

    //2.adding labels
    ImageIcon duke = new ImageIcon(ldr.getResource("check1.png"));
    //ImageIcon duke = new ImageIcon("check1.png");
    JLabel lbl1 = new JLabel(duke);
    JLabel lbl2 = new JLabel("Duke is the friendly mascot of Java technology");
    JLabel lbl3 = new JLabel("Duke",duke,JLabel.CENTER);

    //3. adding text fields and text areas
    JTextField txt1 = new JTextField(48);
    JTextField txt2 = new JTextField("Default Text",48);
    JTextArea txtArea = new JTextArea(5,47);
    JScrollPane pane = new JScrollPane(txtArea);

    //4. adding item selectors(checkbox, combobox, list)
    String[] toppings = { "Pepperoni", "Mushroom","Ham","Tomato" } ;

    JCheckBox chk1 = new JCheckBox( toppings[0] ) ;
    JCheckBox chk2 = new JCheckBox( toppings[1], true) ;
    JCheckBox chk3 = new JCheckBox( toppings[2] ) ;
    JCheckBox chk4 = new JCheckBox( toppings[3] ) ;

    String[] styles = { "Deep Dish", "Gourmet Style", "Thin & Crispy" } ;

    JComboBox<String> box1 = new JComboBox<String>( styles ) ;

    JList<String> lst1 = new JList<String>( toppings ) ;

    //5. adding radio buttons, more components(JSlider/JProgressBar/JMenuBar)
    // are available in javax.swing
    JRadioButton rad1 = new JRadioButton( "Red", true ) ;
    JRadioButton rad2 = new JRadioButton( "Rose" ) ;
    JRadioButton rad3 = new JRadioButton( "White" ) ;

    ButtonGroup wines = new ButtonGroup() ;

    public Window(){
        super("Swing Window");
        setSize(500,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);

        //1.2 adding buttons
        pnl.add(btn1);
        pnl.add(tickBtn);
        pnl.add(crossBtn);

        //2.2 styling and adding labels
        lbl1.setToolTipText("Duke - the java Mascot");
        lbl3.setHorizontalTextPosition(JLabel.CENTER);
        lbl3.setVerticalTextPosition(JLabel.BOTTOM);
        pnl.add( lbl1 ) ;
        pnl.add( lbl2 ) ;
        pnl.add( lbl3 ) ;

        //3.2 styling and adding text field and text area
        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pnl.add(txt1);
        pnl.add(txt2);
        pnl.add(pane);

        //4.2 adding item selectors(checkbox, combobox, list)
        pnl.add(chk1);
        pnl.add(chk2);
        pnl.add(chk3);
        pnl.add(chk4);

        box1.setSelectedIndex(1);
        pnl.add(box1);

        pnl.add(lst1);

        //5.2 adding radio buttons
        wines.add(rad1);
        wines.add(rad2);
        wines.add(rad3);
        pnl.add( rad1 ) ;
        pnl.add( rad2 ) ;
        pnl.add( rad3 ) ;

        setVisible(true);
    }

    public static void main(String[] args) {
        Window gui = new Window();
    }
}
