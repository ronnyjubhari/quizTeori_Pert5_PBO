import java.util.Scanner;

public class quizTeori{
	public static void main(String[] args)
	{
		String nama;
		int tRumah, jPemakaian;
		long bBeban = 0;
		long bayar, totHarga, kembalian;
		boolean loop = true;

		Scanner input = new Scanner(System.in);		
		
		System.out.println("Tipe Rumah        Biaya Beban");
		System.out.println("    31  	    Rp. 100.000");
		System.out.println("    32 		    Rp. 125.000");
		System.out.println("    33 		    Rp. 450.000");
		System.out.println("    34  	    Rp. 480.000");
		System.out.println("    35 		    Rp. 500.000");
		System.out.println("    40 		    Rp. 550.000");
		
		System.out.println("");
		System.out.print("Masukkan Nama : ");
		nama= input.nextLine();
		
		while(loop)
    	{
    		System.out.print("Masukkan Tipe Rumah : ");
			tRumah= input.nextInt();
    		switch(tRumah)
	    	{
	    		case 31 :
	    			bBeban = 100000;
	    			loop = false;
	    			break;
	    		case 32 :
	    			bBeban = 125000;
	    			loop = false;
	    			break;
	    		case 33 :
	    			bBeban = 450000;
	    			loop = false;
	    			break;
	    		case 34 :
	    			bBeban = 480000;
	    			loop = false;
	    			break;
	    		case 35 :
	    			bBeban = 500000;
	    			loop = false;
	    			break;
	    		case 40 :
	    			bBeban = 550000;
	    			loop = false;
	    			break;
	    		default :
	    			System.out.println("Tidak ada dalam pilihan. Silahkan Pilih Ulang");
	    			System.out.println("");
	    	}
    	}
    	
		System.out.print("Jumlah Meteran Pemakaian : ");
		jPemakaian= input.nextInt();
		
		totHarga = jPemakaian * bBeban;
		System.out.println("Total Harga : Rp. " + totHarga);
		
		System.out.print("Uang Pembayaran : Rp. ");
		bayar = input.nextLong();
		kembalian = bayar - totHarga; 
		
		System.out.print("\n\n"); 	   	
    	System.out.println("-------------STRUK-------------");    	
		System.out.println("Nama 		: " + nama);
		System.out.println("Total Harga     : Rp. " + totHarga);
		System.out.println("Bayar 		: Rp. " + bayar);
		System.out.println("Kembalian 	: Rp. " + kembalian);		
	}
}