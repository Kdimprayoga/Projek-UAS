//Program anrian bank
package com.mycompany.projekuas;
        
import java.util.Scanner;
public class ProjekUAS  {

    public static void main(String[] args) {

        int menu;
        Scanner input=new Scanner(System.in);
        LinkedList LL=new LinkedList();

        System.out.println("\n\t\t=======================================================================================");
        System.out.println("\t\t\t\t\t Selamat datang di Bank Danamon");
        System.out.println("\t\t\t\t\tMemberikan pelayanan yang terbaik");
        System.out.println("\t\t=======================================================================================");

        do{
            System.out.println("\n\n");
            System.out.println("\t\t\t\t\tPilih menu : ");
            System.out.println("\t\t\t\t1. Pengambilan nomor antri");
            System.out.println("\t\t\t\t2. Pemanggilan nomor antri");
            System.out.println("\t\t\t\t3. Lihat data antrian");
            System.out.println("\t\t\t\t4. Keluar");
            System.out.print("\t\t\t\t     Pilihan Anda : ");
            menu=input.nextInt();
            switch (menu) {
                case 1:
                    LL.enqueue();
                    break;
                case 2:
                    LL.dequeue();
                    break;
                case 3:
                    LL.view();
                    break;
                case 4:
                    System.out.println("\n\t\t\t\tTerimakasih!!!!");
                    break;
                default:
                    System.out.println("\n\t\t\t\tPerhatikan data yang Anda inputkan!!!!");
                    break;
            }
        }while(menu!=4);
    }
}