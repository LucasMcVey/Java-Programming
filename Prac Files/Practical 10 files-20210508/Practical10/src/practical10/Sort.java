// Sorting Application
// Author: Carl Mooney
package practical10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Sort extends JFrame implements ActionListener {

    private final int pauseInterval = 100; // ms larger number slower animation
    private String[] values = new String[6];



    private void bubbleSort() {
        for (int i = 0; i < items.length; i++) {
            values[i] = items[i].getText();
        }
        int count = 0;
        showStatus("Sorting ...");
        boolean swap = true;
        int length = items.length-1;
        while (swap) {
            swap=false;
            for (int i = 0; i < length; i++) {
                if (greaterThan(items[i+1],items[i])) {
                    swapItems(items[i+1],items[i]);
                    swap=true;
                    count++;
                }
            } //for
            length--;
        } // while
        showStatus("Sorting complete, number of swaps = "+count);

    } // bubbleSort
    /**
     * Method that handles the button presses.
     *
     * @param e The ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Clear":
                for (TextField item : items) {
                    item.setText("");
                }
                break;
            case "Sort":
                bubbleSort();
                break;
            case "Reset":
                for (int i = 0; i < items.length; i++) {
                    items[i].setText((values[i]));
                }
                break;

            default:
                showStatus("Unrecognised button: " + e.toString());
        }

    }


    /////////////////////////////////////////////////////////////
    ///////////  Please do not alter the code below /////////////
    /////////////////////////////////////////////////////////////
    private final TextField[] items = new TextField[6];
    private JButton btnSort, btnClear, btnReset;

    private TextField tmp;
    private Label status;
    private Font font;

    public static void main(String[] args) {
        new Sort().setVisible(true);
    }

    public Sort() {
        init();
    }

    private void init() {

        font = new Font("Dialog", Font.PLAIN, 18);
        setTitle("Sorting Algorithms");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setResizable(false);
        setLocation(800, 300);
        JPanel jp = new JPanel(new BorderLayout());
        jp.setPreferredSize(new Dimension(400, 400));
        jp.setBackground(Color.white);

        JPanel itemPanel = new JPanel();
        itemPanel.setBackground(Color.white);
        for (int i = 0; i < items.length; i++) {
            items[i] = new TextField(3);
            items[i].setPreferredSize(new Dimension(30, 40));
            itemPanel.add(items[i]);
        }
        initItems();
        itemPanel.add(new Label("Temp:")).setFont(font);
        tmp = new TextField(4);
        tmp.setPreferredSize(new Dimension(30, 40));
        tmp.setFont(font);
        tmp.setEditable(false);
        itemPanel.add(tmp);
        itemPanel.add(new Label(""))
                .setPreferredSize(new Dimension(380, 65));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.white);
        btnSort = new JButton("Sort");
        btnReset = new JButton("Reset");
        btnClear = new JButton("Clear");
        btnSort.addActionListener(this);
        btnClear.addActionListener(this);
        btnReset.addActionListener(this);
        buttonPanel.add(btnSort);
        buttonPanel.add(btnClear);
        buttonPanel.add(btnReset);

        status = new Label("Wating ... ");
        status.setPreferredSize(new Dimension(380, 40));
        status.setFont(font);
        JPanel statusPanel = new JPanel();
        statusPanel.setBackground(Color.white);
        statusPanel.add(status);

        jp.add(itemPanel, BorderLayout.NORTH);
        jp.add(buttonPanel, BorderLayout.CENTER);
        jp.add(statusPanel, BorderLayout.SOUTH);

        getContentPane().add(jp);
    }

    private void initItems() {
        for (TextField item : items) {
            item.setFont(font);
            item.setText(String.valueOf((int) (Math.random() * 100)));

        }
    }


    private void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            showStatus(e.toString());
        }
    }

    private void assign(TextField to, TextField from) {
        Color tobg = to.getBackground();
        to.setBackground(Color.green);
        pause(pauseInterval);
        to.setText(from.getText());
        pause(pauseInterval);
        to.setBackground(tobg);
    }

    private void swapItems(TextField t1, TextField t2) {
        assign(tmp, t1);
        assign(t1, t2);
        assign(t2, tmp);
    }

    private boolean greaterThan(TextField t1, TextField t2) {
        boolean greater;
        Color t1bg = t1.getBackground();
        Color t2bg = t2.getBackground();
        t1.setBackground(Color.cyan);
        t2.setBackground(Color.cyan);
        pause(pauseInterval);
        greater = Integer.parseInt(t1.getText())
                > Integer.parseInt(t2.getText());
        pause(pauseInterval);
        t1.setBackground(t1bg);
        t2.setBackground(t2bg);
        return greater;
    }

    private void showStatus(String s) {
        status.setText(s);
    }

}
