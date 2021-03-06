package Dyrektor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DodaniePlacowki extends JPanel {
    private final JButton dodajPlacowke = new JButton("Dodaj Placówkę");
    private final JButton wroc = new JButton("Wróć");



    JLabel etykietaMiasto = new JLabel("Miasto:");
    JLabel etykietaUlica = new JLabel("Ulica:");
    JLabel etykietaNumer = new JLabel("Numer:");
    JLabel etykietaLokal = new JLabel("Lokal:");

    JTextField wpiszMiasto = new JTextField(20);
    JSplitPane miasto = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, etykietaMiasto, wpiszMiasto);
    JTextField wpiszUlica = new JTextField(20);
    JSplitPane ulica = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, etykietaUlica, wpiszUlica);
    JTextField wpiszNumer = new JTextField(20);
    JSplitPane numer = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, etykietaNumer, wpiszNumer);
    JTextField wpiszLokal = new JTextField(20);
    JSplitPane lokal = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, etykietaLokal, wpiszLokal);


    public void addActionListener(ActionListener listener) {
        wroc.addActionListener(listener);
        dodajPlacowke.addActionListener(listener);
    }

    public DodaniePlacowki() {
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(1200, 700));
        GridBagConstraints uklad = new GridBagConstraints();
        uklad.gridwidth = 1;
        uklad.weightx = 1;
        uklad.insets = new Insets(10, 10, 10, 10);
        dodajPlacowke.setActionCommand("dodajPlacowke");
        wroc.setActionCommand("wroc");

        uklad.gridx=0;//
        uklad.gridy=0;
        add(miasto,uklad);

        uklad.gridx=0;
        uklad.gridy=1;
        add(ulica,uklad);

        uklad.gridx=0;
        uklad.gridy=2;
        add(numer,uklad);

        uklad.gridx=0;
        uklad.gridy=3;
        add(lokal,uklad);

        uklad.gridheight=2;
        uklad.gridx=1;
        uklad.gridy=1;
        add(dodajPlacowke,uklad);

        uklad.gridx=1;
        uklad.gridy=3;
        add(wroc,uklad);
    }

    public String getMiasto() {
        return wpiszMiasto.getText();
    }

    public String getUlica() {
        return wpiszUlica.getText();
    }

    public int getNumer() {
        return Integer.parseInt(wpiszNumer.getText());
    }

    public int getLokal() {
        return Integer.parseInt(wpiszLokal.getText());
    }



}
