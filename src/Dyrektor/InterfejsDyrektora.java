package Dyrektor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InterfejsDyrektora extends JPanel {

    JButton pracownicy = new JButton("Pracownicy");
    JButton gry = new JButton("Gry");
    JButton placowki = new JButton("Placówki");
    JButton logiSprzedazy = new JButton("Logi Egzemplarzy");
    JButton wyloguj = new JButton("Wyloguj");

    public InterfejsDyrektora() {
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(1200, 700));
        GridBagConstraints uklad = new GridBagConstraints();
        uklad.gridwidth = 1;
        uklad.weightx = 1;
        uklad.insets = new Insets(10, 10, 10, 10);

        pracownicy.setActionCommand("dyrektorPracownicy");
        gry.setActionCommand("dyrektorGry");
        placowki.setActionCommand("dyrektorPlacowki");
        logiSprzedazy.setActionCommand("dyrektorLogiSprzedazy");
        wyloguj.setActionCommand("dyrektorWyloguj");


        uklad.gridx = 0;//
        uklad.gridy = 0;
        add(pracownicy, uklad);

        uklad.gridx = 1;
        uklad.gridy = 0;
        add(gry, uklad);

        uklad.gridx = 2;
        uklad.gridy = 0;
        add(placowki, uklad);

        uklad.gridx = 0;
        uklad.gridy = 1;
        add(logiSprzedazy, uklad);

        uklad.gridx = 2;
        uklad.gridy = 1;
        add(wyloguj, uklad);
    }

    public void addActionListener(ActionListener listener) {
        pracownicy.addActionListener(listener);
        gry.addActionListener(listener);
        placowki.addActionListener(listener);
        logiSprzedazy.addActionListener(listener);
        wyloguj.addActionListener(listener);
    }
}
