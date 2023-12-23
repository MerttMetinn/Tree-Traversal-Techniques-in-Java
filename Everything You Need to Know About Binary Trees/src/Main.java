import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 11;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(15);
        arr.add(8);
        arr.add(12);
        arr.add(32);
        arr.add(13);
        arr.add(4);
        arr.add(39);
        arr.add(6);
        arr.add(3);
        arr.add(26);
        arr.add(11);

        BinaryTree tree = new BinaryTree();
        Node_BST root = null;

        for (int i = 0; i < n; i++) {
            root = tree.insert(root, arr.get(i));
        }

        System.out.print("""
                Binary Tree Veri Yapısı ve çeşitli işlemler:
                1 - Ağaçta eleman Arama
                2 - Ağaca eleman Ekleme
                3 - Ağaçtan eleman Silme
                4 - Ağaçtaki En büyük - En küçük elemanı bulma
                5 - Ağaçta Dolaşma Algoritmaları
                6 - Programdan çıkış
                """);

        while (true) {
            System.out.println("--------------------------------------");
            System.out.print("Yapılacak işlemi seçiniz: ");
            int chooseGeneral = sc.nextInt();
            sc.nextLine();
            System.out.println("--------------------------------------");

            if (chooseGeneral == 1) {
                System.out.println("Ağaçta eleman Arama");
                System.out.print("Ağaçta aranacak değeri girin: ");
                int aranan = sc.nextInt();

                boolean found = tree.search(root, aranan);
                if (found) {
                    System.out.println(aranan + " bulundu.");
                } else {
                    System.out.println(aranan + " bulunamadı.");
                }
            }

            else if (chooseGeneral == 2) {
                System.out.println("Ağaca eleman Ekleme");
                System.out.println("Eklemek istediğiniz eleman:");
                int new_node = sc.nextInt();
                root = tree.insert(root, new_node);
                System.out.println("Yeni eleman eklendi: " + new_node);
            }

            else if (chooseGeneral == 3) {
                System.out.println("Ağaçtan eleman Silme");
                System.out.print("Silmek istediğiniz elemanı girin: ");

                int elementToDelete = sc.nextInt();
                boolean isDeleted = tree.search(root, elementToDelete);
                root = tree.delete(root, elementToDelete);

                if (isDeleted) {
                    System.out.println("Eleman silindi: " + elementToDelete);
                } else {
                    System.out.println("Eleman bulunamadı ve silinmedi: " + elementToDelete);
                }
            }

            else if (chooseGeneral == 4) {
                System.out.println("Ağaçtaki En büyük - En küçük elemanı bulma");
                int max = tree.findMax(root);
                int min = tree.findMin(root);

                System.out.println("Max değer = " + max);
                System.out.println("Min değer = " + min);
            }

            else if (chooseGeneral == 5) {
                System.out.print(
                """
                Ağaçtaki elemanları nasıl sıralamak istersiniz?
                (1-PreOrder 2-InOrder 3-PostOrder)
                """);
                int chooseTraversal = sc.nextInt();
                if (chooseTraversal == 1) {
                    System.out.print("PreOrder Traversal: ");
                    tree.preorderTraversal(root);
                    System.out.println();
                } else if (chooseTraversal == 2) {
                    System.out.print("InOrder Traversal: ");
                    tree.inorderTraversal(root);
                    System.out.println();
                } else if (chooseTraversal == 3) {
                    System.out.print("PostOrder Traversal: ");
                    tree.postorderTraversal(root);
                    System.out.println();
                } else {
                    System.out.print("Lütfen verilen seçenekler arasından bir seçim yapın");
                }
            }

            else if (chooseGeneral == 6) {
                System.out.println("Programdan çıkılıyor...");
                exit(0);
            }

            else {
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen geçerli bir seçenek seçin.");
            }
        }
    }
}

