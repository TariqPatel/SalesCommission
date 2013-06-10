/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salescommission;

import javax.swing.JOptionPane;

/**
 *
 * @author Tariq
 */
public class SalesCommission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int sales = getSales();
        int code = getCode();

        int commission = getComm(sales, code);
        int output = output(sales, commission);
    }

    public static int getSales() {
        String newsales = JOptionPane.showInputDialog(null, "Enter the sales amount (do not use commas or rand signs) or click Cancel to exit:");
        int newSales = Integer.parseInt(newsales);

        if (newsales.equals("")) {
            finish();
        }
        boolean answer = true;

        return newSales;
    }

    public static int getCode() {
        String newcode = JOptionPane.showInputDialog(null, "Enter the commission code:\n\n1)Telephone Sales\n2)In_Store Sales\n3)Outside Sales");

        boolean anser = true;
        int newCode = Integer.parseInt(newcode);
        int newint = Integer.parseInt(newcode);
        if (newint == 1) {
            anser = true;
        } else if (newint == 2) {
            anser = true;
        } else if (newint == 3) {
            anser = true;
        } else {
            finish();
        }
        anser = true;
        return newCode;

    }

    public static int getComm(int sales, int code) {
        int commission = 0;

        switch (code) {

            case 1:
                commission = sales * 10 / 100;
                break;
            case 2:
                commission = sales * 14 / 100;
                break;
            case 3:
                commission = sales * 18 / 100;
                break;

        }
        return commission;
    }

    public static int output(int sales, int commission) {

        int commissions = Math.round(commission);

        JOptionPane.showMessageDialog(null, "Your commission on sales of R" + sales + " is R" + commission, "Commission Totals", JOptionPane.INFORMATION_MESSAGE);

        return commissions;
    }

    private static void finish() {
        System.exit(0);
    }
}
