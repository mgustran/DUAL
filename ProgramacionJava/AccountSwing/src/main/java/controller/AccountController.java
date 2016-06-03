package controller;

/**
 * Created by master on 01/06/16.
 */
import model.Account;
import view.AccountWindow;

import javax.swing.JFrame;
public class AccountController {
    private Account model;
    public AccountController(Account model, AccountWindow view) {
        this.model = model;
    }
    public static void main(String args[]) {
        Account myAccount = new Account("Miquel Gustran", 500);
        AccountWindow myView = new AccountWindow();
        AccountController controller = new AccountController(myAccount, myView);
// Register controller and view
// (This can also be done in controller constructor)
        myView.registerController(controller);
        myAccount.addAccountListener(myView);
        myView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myView.setVisible(true);
    }
    public void notifyAddFunds(double amount) {
        model.addFunds(amount);
    }
}