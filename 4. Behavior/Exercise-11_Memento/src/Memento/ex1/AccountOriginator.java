package Memento.ex1;
import java.time.LocalDate;
public class AccountOriginator
{
	
	   
	    private LocalDate openDate;
	    private String openAtBranch;
	    private int balance;
	    private String type;

	  /*********************** Complete here***********************/

	  


	    public int withdraw(int num) {
	        if (balance >= num) {
	            balance = balance - num;
	        }

	        return balance;
	    }

	    public int deposit(int num) {
	        balance = balance + num;

	        return balance;
	    }
		  /*********************** Complete the function***********************/

	    public AccountMemento save() {
	    	
		   /*Complete function*/
		  return new AccountMemento(type, openDate, balance);
	    }

	    public void revert(AccountMemento account) {
	        type = account.getType();
	        openDate = account.getOpenDate();
	        balance = account.getBalance();
	    }
	    @Override
	    public String toString() {
	        return "Account{" +
	            "type='" + type + '\'' +
	            ", openDate=" + openDate +
	            ", openAtBranch='" + openAtBranch + '\'' +
	            ", balance=" + balance +
	            '}';
	    }

		public void setType(String string) {
			type = string;
		}

		public void setBalance(int i) {
			balance = i;
		}

		public void setOpenAtBranch(String string) {
			openAtBranch = string;
		}

		public void setOpenDate(LocalDate now) {
			openDate = now;
		}
	}


