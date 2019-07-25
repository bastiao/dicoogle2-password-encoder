import pt.ua.dicoogle.server.users.HashService;


public class DicooglePasswordGenerator{


	public static void main(String [] args){

		String username = args[0];
        	boolean admin = true;
        	String passPlainText = args[1];
	        String passHash = HashService.getSHA1Hash(passPlainText);             //password Hash
	        String hash = HashService.getSHA1Hash(username + admin + passHash);
	        System.out.println("username="+args[0]);
	        System.out.println("password="+args[1]);
	        System.out.println("hash=" + passHash);

	}
}
