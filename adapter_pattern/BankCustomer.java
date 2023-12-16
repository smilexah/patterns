import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter bank name : ");
            setBankName(br.readLine());

            System.out.print("Enter account holder name : ");
            setAccHolderName(br.readLine());

            System.out.print("Enter account number : ");
            setAccNumber(Long.parseLong(br.readLine()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getCreditCard() {
        return getAccHolderName() + " has a " + getBankName() + " account with account number " + getAccNumber() + ".";
    }
}
