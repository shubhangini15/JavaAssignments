package jdbctest;


public interface BankTransaction {
	boolean transfer(int sourceNo, int destinationNo);
	void DBConnection();

}
