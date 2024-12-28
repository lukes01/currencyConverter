import javax.swing.*;

public class currConvert {
    public static void main(String[] args) {
        Conversions c = new Conversions();
        Object[] option1 = {"NOK", "YEN", "EURO", "Quit"};

        while (true) { 
            String input = JOptionPane.showInputDialog(null, "Enter value: ");
            System.out.println(input);

            if(c.check(input)) {
                double Minput = Double.parseDouble(input);
                int choice1 = JOptionPane.showOptionDialog(null, "Choose Which Currency You Wish to Convert", 
                "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, option1[2]);

                switch (choice1) {
                    case 0:
                        c.dollarToNok(Minput);
                        if(c.keepGoing()) {
                        } else {
                            break;
                        }
                    case 1:
                        c.dollarToJPY(Minput);
                        if(c.keepGoing()) {
                        } else {
                            break;
                        }
                    case 2:
                        c.dollarToEuro(Minput);
                        if(c.keepGoing()) {
                        } else {
                            break;
                        }
                    default:
                        break;
                } 
            } else {
                if (c.keepGoing()) {

                } else { break; }
            }
        }
    }
}