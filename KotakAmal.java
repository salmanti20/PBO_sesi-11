import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD AZMI FAUZAN
 */
public class KotakAmal {
  private int maxAmount = 0;
  private int currentIndex = 0;
  private String[] items = new String[1];

  void setMaxItemAmount(int maxAmount) {
    this.maxAmount = maxAmount;
    this.items = new String[this.maxAmount];
  }

  void addItem(String item) throws ArrayIndexOutOfBoundsException {
    this.items[this.currentIndex] = item;
    this.currentIndex++;
  }

  String[] getItems() {
    return this.items;
  }
    public static void main(String[] args) {
    KotakAmal kotakAmal = new KotakAmal();
    Scanner jumlahItemHandler = new Scanner(System.in);
    Scanner productInput = new Scanner(System.in);
    Scanner statusInput = new Scanner(System.in);
    boolean addingProduct = true;

    System.out.print("Mau sedeksh berapa kali gan ? : ");
    int jumlahMaksimalProduk = jumlahItemHandler.nextInt();
    kotakAmal.setMaxItemAmount(jumlahMaksimalProduk);
    System.out.println(jumlahMaksimalProduk);

    try {
      while(addingProduct) {
        System.out.println();
        System.out.println("=======================");
        System.out.println("[1] Tambah sedekah ");
        System.out.println("[2] sudah ");
        System.out.println("=======================");
        System.out.println();

        System.out.print("Pilih : ");
        int decision = statusInput.nextInt();

        if (decision == 1) {
          System.out.print("Masukan nama jenis sedekah      : ");
          String produk = productInput.nextLine();
          kotakAmal.addItem(produk);

          System.out.println("PRODUK DITAMBAHKAN");
        }

        if (decision == 2) {
          addingProduct = false;
        }
      }

    } catch (ArrayIndexOutOfBoundsException err) {
      System.out.println("amal anda anda sudah penuh");
    } finally {
      System.out.println("Isi kotak amal anda : " + Arrays.deepToString(kotakAmal.getItems()));
        }
    
    }
}