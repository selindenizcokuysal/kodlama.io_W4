public class Main {

    public static void main(String[] args) {
	    Logger[] loggers ={new SmsLogger(), new EmailLogger()};
    	CustomerManager customerManager = new CustomerManager(loggers);
	    Customer deniz = new Customer(1,"Deniz","Cokuysal");

	    customerManager.add(deniz);

    }
}
