package projekt1;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import static projekt1.Pliki.wczytajPlik;

public class GUIPlik extends JPanel implements ActionListener {

    JButton dodajPlikButton;
    JTextArea log;
    JFileChooser fc;

    public GUIPlik() {
        super(new BorderLayout());

        log = new JTextArea(5, 20);
        log.setMargin(new Insets(5, 5, 5, 5));
        log.setEditable(false);
        JScrollPane logScrollPane = new JScrollPane(log);

        fc = new JFileChooser(".\\src\\Teksty");

        dodajPlikButton = new JButton("Wybierz plik");
        dodajPlikButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(dodajPlikButton);

        add(buttonPanel, BorderLayout.PAGE_START);
        add(logScrollPane, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int pom = fc.showOpenDialog(GUIPlik.this);
        if (pom == JFileChooser.APPROVE_OPTION) {
            File plik = fc.getSelectedFile();
            log.append("Otwieranie pliku: " + plik.getName() + ".\n");
            wczytajPlik(plik);
            log.append("Dodano do bazy.\n");
        }
        log.setCaretPosition(log.getDocument().getLength());
    }

    private static void initOknoPlik() {
        JFrame frame = new JFrame("Dodaj plik");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(new GUIPlik());
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void OknoPlikStart() {
        SwingUtilities.invokeLater(() -> {
            UIManager.put("swing.boldMetal", Boolean.FALSE);
            initOknoPlik();
        });
    }
}
