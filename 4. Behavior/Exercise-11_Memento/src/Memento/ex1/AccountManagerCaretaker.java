package Memento.ex1;
import java.util.Stack;
public class AccountManagerCaretaker {
	

	// caretaker
	
	    private Stack<AccountMemento> accountHistory = new Stack<>();

	    public void save(AccountMemento account) {
		  /*Complete here*/
		  accountHistory.push(account);
	    }

	    public void revert(AccountOriginator account) {
	        if (accountHistory.empty()) return;
	        account.revert(accountHistory.pop());
	    }
	}
