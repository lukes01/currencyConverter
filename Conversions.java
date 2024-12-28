import javax.swing.*;

public class Conversions {
    Object[] option = {"Try Again", "Quit"};

    public boolean check(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean keepGoing() {
        int choice = JOptionPane.showOptionDialog(null, "What do you wish to do?", 
        "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, 
        option[1]);

        return  (choice == 0);
    }

    public void dollarToNok(double Minput) {
         double nok = Minput * 8.2;
         JOptionPane.showMessageDialog(null, "Amount in Nok: "+nok+"kr");
    }

    public void dollarToJPY(double Minput) {
        double jpy = Minput * 112.7;
        JOptionPane.showMessageDialog(null, "Amount in JPY: "+jpy+"Yen");
   }

   public void dollarToEuro(double Minput) {
        double euro = Minput * 0.96;
        JOptionPane.showMessageDialog(null, "Amount in Euro: "+euro+"Euro");
    }

    public void dollarToYuan(double Minput) {
        double yuan = Minput * 0.96;
        JOptionPane.showMessageDialog(null, "Amount in Yuan: "+yuan+"Yuan");
    }
}