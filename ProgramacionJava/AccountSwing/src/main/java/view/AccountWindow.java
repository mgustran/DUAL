package view;

/**
 * Created by master on 01/06/16.
 */
import controller.AccountController;
import model.AccountListener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class AccountWindow extends JFrame implements AccountListener,
        ActionListener {
    private JTextField funds, add;
    private JButton addButton;
    private AccountController controller;
    public AccountWindow() {
        this.setSize(400, 120);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        funds = new JTextField(30);
        funds.setEditable(false);
        add = new JTextField(30);
        addButton = new JButton("Afegir diners");
        addButton.addActionListener(this);
        this.add(funds);
        this.add(add);
        this.add(addButton);
    }
    @Override
    public void notifyFundsChanged(double newAmount) {
        this.funds.setText("El teu compte: "+newAmount);
        this.add.setText("");
    }
    public void registerController(AccountController controller) {
        this.controller = controller;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        controller.notifyAddFunds(Double.parseDouble(add.getText()));
    }
}